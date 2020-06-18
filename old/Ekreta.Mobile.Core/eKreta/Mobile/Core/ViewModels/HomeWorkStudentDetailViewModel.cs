// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.HomeWorkStudentDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Acr.UserDialogs;
using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Commands;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class HomeWorkStudentDetailViewModel : HomeWorkDetailViewModel
  {
    private readonly IStudentHomeWorkDbDataService _studentHomeWorkDataService;
    private MvxAsyncCommand _refreshCommand;
    private bool _isHomeWorkLoading;
    private bool _isHomeWorkView;
    private List<StudentHomeWorkRealm> _homeworks;
    private MvxAsyncCommand _addHomeWorkCommand;
    private MvxAsyncCommand<StudentHomeWorkRealm> _deleteHomeWorkCommand;

    public HomeWorkStudentDetailViewModel()
    {
      this._studentHomeWorkDataService = (IStudentHomeWorkDbDataService) Mvx.get_IoCProvider().Resolve<IStudentHomeWorkDbDataService>();
    }

    public bool IsHomeWorkLoading
    {
      get
      {
        return this._isHomeWorkLoading;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isHomeWorkLoading, (M0) (value ? 1 : 0), nameof (IsHomeWorkLoading));
      }
    }

    public bool IsHomeWorkView
    {
      get
      {
        return this._isHomeWorkView;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isHomeWorkView, (M0) (value ? 1 : 0), nameof (IsHomeWorkView));
      }
    }

    public List<StudentHomeWorkRealm> Homeworks
    {
      get
      {
        return this._homeworks;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<StudentHomeWorkRealm>>((M0&) ref this._homeworks, (M0) value, nameof (Homeworks));
      }
    }

    public bool CanAddHomeWork
    {
      get
      {
        return this.Lesson.State.Equals("Missed") || this.ActiveProfile.IsTutelary;
      }
    }

    public MvxAsyncCommand AddHomeWorkCommand
    {
      get
      {
        return this._addHomeWorkCommand ?? (this._addHomeWorkCommand = new MvxAsyncCommand(new Func<Task>(this.AddHomework), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand RefreshCommand
    {
      get
      {
        return this._refreshCommand ?? (this._refreshCommand = new MvxAsyncCommand(new Func<Task>(this.Refresh), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand<StudentHomeWorkRealm> DeleteHomeWorkCommand
    {
      get
      {
        return this._deleteHomeWorkCommand ?? (this._deleteHomeWorkCommand = new MvxAsyncCommand<StudentHomeWorkRealm>(new Func<StudentHomeWorkRealm, Task>(this.ExecuteDeleteHomeWorkCommand), (Func<StudentHomeWorkRealm, bool>) null, false));
      }
    }

    public override Task Initialize()
    {
      this.InitStudentHomeWorks(this.Lesson).ConfigureAwait(false);
      return base.Initialize();
    }

    private async Task RefreshLesson(int newStudentHomeWorkId)
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel1 = this;
      try
      {
        HomeWorkStudentDetailViewModel studentDetailViewModel = studentDetailViewModel1;
        studentDetailViewModel1.Busy();
        // ISSUE: reference to a compiler-generated method
        LessonRealm currentLesson = (await studentDetailViewModel1._lessonDataService.FetchLessonsAsync(studentDetailViewModel1.ActiveProfile, new DateTime?(studentDetailViewModel1.Lesson.Date.DateTime), new DateTime?(studentDetailViewModel1.Lesson.Date.DateTime.AddDays(1.0)), true)).FirstOrDefault<LessonRealm>(new Func<LessonRealm, bool>(studentDetailViewModel1.\u003CRefreshLesson\u003Eb__26_0));
        if (currentLesson != null)
        {
          ((MvxMainThreadDispatchingObject) studentDetailViewModel1).InvokeOnMainThread((Action) (() =>
          {
            studentDetailViewModel.Lesson = currentLesson;
            ((MvxNotifyPropertyChanged) studentDetailViewModel).RaisePropertyChanged("Lesson");
            studentDetailViewModel._messenger.Publish<LessonChangedMessage>((M0) new LessonChangedMessage((object) studentDetailViewModel, currentLesson));
          }), true);
          await studentDetailViewModel1.UpdateStudentHomeWorkListWithNewHomeWork(newStudentHomeWorkId, currentLesson);
        }
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        studentDetailViewModel1.NotBusy();
      }
    }

    private async Task UpdateStudentHomeWorkListWithNewHomeWork(
      int newStudentHomeWorkId,
      LessonRealm currentLesson)
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel = this;
      int num;
      if (num == 0 || currentLesson.TeacherHomeWorkId.HasValue)
      {
        try
        {
          studentDetailViewModel.IsHomeWorkLoading = true;
          studentDetailViewModel.IsOffline = false;
          if (!studentDetailViewModel._connectivity.get_IsConnected())
            throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkStudentDetailViewModel.cs", 117);
          StudentHomeWorkRealm studentHomeWork = await studentDetailViewModel._studentHomeWorkDataService.FetchStudentHomeworkAsync(studentDetailViewModel.ActiveProfileRealm, newStudentHomeWorkId);
          studentDetailViewModel._studentHomeWorkDataService.AddOrUpdate(studentDetailViewModel.ActiveProfileRealm.RolelessId, currentLesson.TeacherHomeWorkId.Value, studentHomeWork);
          IEnumerable<StudentHomeWorkRealm> studentHomeworks = studentDetailViewModel._studentHomeWorkDataService.GetStudentHomeworks(studentDetailViewModel.ActiveProfileRealm.RolelessId, currentLesson.TeacherHomeWorkId.Value);
          studentDetailViewModel.Homeworks = studentDetailViewModel.UpdateHomeWorksList(studentHomeworks);
        }
        catch (Exception ex)
        {
          ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkStudentDetailViewModel.cs", (int) sbyte.MaxValue);
          switch (ex)
          {
            case NoInternetConnectionException _:
            case ServerUnreachableException _:
              studentDetailViewModel.IsOffline = true;
              studentDetailViewModel.ReloadHomeWorksFromDatabase();
              break;
          }
        }
        finally
        {
          // ISSUE: reference to a compiler-generated method
          ((MvxMainThreadDispatchingObject) studentDetailViewModel).InvokeOnMainThread(new Action(studentDetailViewModel.\u003CUpdateStudentHomeWorkListWithNewHomeWork\u003Eb__27_0), true);
        }
      }
      else
        studentDetailViewModel.Homeworks = new List<StudentHomeWorkRealm>();
    }

    private void ReloadHomeWorksFromDatabase()
    {
      this.TeacherHomeWork = this._teacherHomeWorkDbDataService.GetTeacherHomeWork(this.Lesson);
      this.Homeworks = this.UpdateHomeWorksList(this._studentHomeWorkDataService.GetStudentHomeworks(this.ActiveProfileRealm.RolelessId, this.Lesson.TeacherHomeWorkId.Value));
    }

    private async Task InitStudentHomeWorks(LessonRealm lesson)
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel = this;
      LessonRealm lessonRealm = lesson;
      int? teacherHomeWorkId1;
      int num;
      if (lessonRealm == null)
      {
        num = 0;
      }
      else
      {
        teacherHomeWorkId1 = lessonRealm.TeacherHomeWorkId;
        num = teacherHomeWorkId1.HasValue ? 1 : 0;
      }
      if (num != 0)
      {
        try
        {
          studentDetailViewModel.IsHomeWorkLoading = true;
          studentDetailViewModel.IsOffline = false;
          if (!studentDetailViewModel._connectivity.get_IsConnected())
            throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkStudentDetailViewModel.cs", 166);
          IStudentHomeWorkDbDataService homeWorkDataService1 = studentDetailViewModel._studentHomeWorkDataService;
          ProfileRealm activeProfileRealm = studentDetailViewModel.ActiveProfileRealm;
          teacherHomeWorkId1 = lesson.TeacherHomeWorkId;
          int teacherHomeWorkId2 = teacherHomeWorkId1.Value;
          IEnumerable<StudentHomeWorkRealm> homeWork = await homeWorkDataService1.FetchStudentHomeWorksAsync(activeProfileRealm, teacherHomeWorkId2);
          IStudentHomeWorkDbDataService homeWorkDataService2 = studentDetailViewModel._studentHomeWorkDataService;
          string rolelessId = studentDetailViewModel.ActiveProfileRealm.RolelessId;
          teacherHomeWorkId1 = lesson.TeacherHomeWorkId;
          int teacherHomeWorkId3 = teacherHomeWorkId1.Value;
          IEnumerable<StudentHomeWorkRealm> studentHomeWorks = homeWork;
          homeWorkDataService2.OverrideStudentHomeWorks(rolelessId, teacherHomeWorkId3, studentHomeWorks);
          studentDetailViewModel.Homeworks = studentDetailViewModel.UpdateHomeWorksList(homeWork);
        }
        catch (Exception ex)
        {
          ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkStudentDetailViewModel.cs", 175);
          switch (ex)
          {
            case NoInternetConnectionException _:
            case ServerUnreachableException _:
              studentDetailViewModel.IsOffline = true;
              studentDetailViewModel.ReloadHomeWorksFromDatabase();
              break;
          }
        }
        finally
        {
          // ISSUE: reference to a compiler-generated method
          ((MvxMainThreadDispatchingObject) studentDetailViewModel).InvokeOnMainThread(new Action(studentDetailViewModel.\u003CInitStudentHomeWorks\u003Eb__29_0), true);
        }
      }
      else
        studentDetailViewModel.Homeworks = new List<StudentHomeWorkRealm>();
    }

    private List<StudentHomeWorkRealm> UpdateHomeWorksList(
      IEnumerable<StudentHomeWorkRealm> homeWork)
    {
      return homeWork.Select<StudentHomeWorkRealm, StudentHomeWorkRealm>((Func<StudentHomeWorkRealm, StudentHomeWorkRealm>) (x =>
      {
        bool flag1 = this.ActiveProfile.TokenInfo.InstituteUserId == x.RogzitoId && this.ActiveProfile.TokenInfo.Role == UserRoles.Student;
        bool flag2 = x.TanuloAltalTorolt || x.TanarAltalTorolt;
        x.IgnoredCanDeleteByUser = flag1 && !flag2;
        return x;
      })).OrderByDescending<StudentHomeWorkRealm, DateTimeOffset>((Func<StudentHomeWorkRealm, DateTimeOffset>) (x => x.FeladasDatuma)).ToList<StudentHomeWorkRealm>();
    }

    private async Task AddHomework()
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel = this;
      if (!studentDetailViewModel.HasInternetConnection)
      {
        // ISSUE: reference to a compiler-generated method
        ((MvxMainThreadDispatchingObject) studentDetailViewModel).InvokeOnMainThread(new Action(studentDetailViewModel.\u003CAddHomework\u003Eb__31_0), true);
      }
      else
      {
        TanuloHaziFeladatCreateResponse feladatCreateResponse = await (Task<TanuloHaziFeladatCreateResponse>) studentDetailViewModel._navigationService.Navigate<HomeWorkEditViewModel, LessonRealm, TanuloHaziFeladatCreateResponse>((M1) studentDetailViewModel.Lesson, (IMvxBundle) null, new CancellationToken());
        if (feladatCreateResponse == null)
          return;
        try
        {
          await studentDetailViewModel.RefreshLesson(feladatCreateResponse.HozzaadottTanuloHaziFeladatId);
        }
        catch (Exception ex)
        {
          ErrorHandler.Current.HandleError(ex);
        }
      }
    }

    private async Task ExecuteDeleteHomeWorkCommand(StudentHomeWorkRealm homework)
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel = this;
      if (!studentDetailViewModel.HasInternetConnection)
      {
        // ISSUE: reference to a compiler-generated method
        ((MvxMainThreadDispatchingObject) studentDetailViewModel).InvokeOnMainThread(new Action(studentDetailViewModel.\u003CExecuteDeleteHomeWorkCommand\u003Eb__32_0), true);
      }
      else
      {
        string text1 = studentDetailViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Message");
        string text2 = studentDetailViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Title");
        string text3 = studentDetailViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Confirm");
        string text4 = studentDetailViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Cancel");
        ConfirmConfig confirmConfig1 = new ConfirmConfig();
        confirmConfig1.set_Message(text1);
        confirmConfig1.set_Title(text2);
        confirmConfig1.set_OkText(text3);
        confirmConfig1.set_CancelText(text4);
        ConfirmConfig confirmConfig2 = confirmConfig1;
        if (studentDetailViewModel._platformStyleProvider != null)
          confirmConfig2.set_AndroidStyleId(new int?(studentDetailViewModel._platformStyleProvider.DeleteConfirmationStyle));
        if (!await studentDetailViewModel._userDialogs.ConfirmAsync(confirmConfig2, new CancellationToken?()))
          return;
        try
        {
          studentDetailViewModel.IsHomeWorkLoading = true;
          await studentDetailViewModel._studentHomeWorkDataService.DeleteStudentHomeWorkAsync(studentDetailViewModel.ActiveProfileRealm, int.Parse(homework.Id));
          StudentHomeWorkRealm studentHomeWorkRealm = await studentDetailViewModel._studentHomeWorkDataService.FetchStudentHomeworkAsync(studentDetailViewModel.ActiveProfileRealm, int.Parse(homework.Id));
          await studentDetailViewModel.InitStudentHomeWorks(studentDetailViewModel.Lesson);
        }
        catch (Exception ex)
        {
          if (ex is ServerValidationException validationException)
            await studentDetailViewModel._userDialogs.AlertAsync(validationException.ValidationException.GetAggregatedValidationMessage(), validationException.ValidationException.Message, studentDetailViewModel._textProvider.GetText((string) null, (string) null, "Alert_ButtonOk_Text"), new CancellationToken?());
          else
            ErrorHandler.Current.HandleError(ex);
        }
        finally
        {
          studentDetailViewModel.IsHomeWorkLoading = false;
        }
      }
    }

    private async Task Refresh()
    {
      HomeWorkStudentDetailViewModel studentDetailViewModel = this;
      try
      {
        if (!studentDetailViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkStudentDetailViewModel.cs", 301);
        await studentDetailViewModel.InitStudentHomeWorks(studentDetailViewModel.Lesson).ConfigureAwait(false);
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        // ISSUE: reference to a compiler-generated method
        ((MvxMainThreadDispatchingObject) studentDetailViewModel).InvokeOnMainThread(new Action(studentDetailViewModel.\u003CRefresh\u003Eb__33_0), true);
      }
    }
  }
}
