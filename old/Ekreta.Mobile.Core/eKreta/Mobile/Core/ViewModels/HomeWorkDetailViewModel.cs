// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.HomeWorkDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class HomeWorkDetailViewModel : ViewModelBase<LessonRealm>
  {
    protected readonly IMvxMessenger _messenger;
    protected readonly IPlatformStyleProvider _platformStyleProvider;
    protected readonly ITeacherHomeWorkDbDataService _teacherHomeWorkDbDataService;
    protected readonly ILessonDbDataService _lessonDataService;
    protected readonly IMobileApi _mobileApi;
    private bool _isOffline;
    private TeacherHomeWorkRealm _teacherHomeWork;
    private LessonRealm _lesson;
    private bool _viewAppeared;

    public HomeWorkDetailViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._teacherHomeWorkDbDataService = (ITeacherHomeWorkDbDataService) Mvx.get_IoCProvider().Resolve<ITeacherHomeWorkDbDataService>();
      this._lessonDataService = (ILessonDbDataService) Mvx.get_IoCProvider().Resolve<ILessonDbDataService>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      if (!Mvx.get_IoCProvider().CanResolve<IPlatformStyleProvider>())
        return;
      this._platformStyleProvider = (IPlatformStyleProvider) Mvx.get_IoCProvider().Resolve<IPlatformStyleProvider>();
    }

    public bool HomeWorkDone
    {
      get
      {
        TeacherHomeWorkRealm teacherHomeWork = this._teacherHomeWork;
        return teacherHomeWork != null && teacherHomeWork.Done;
      }
      set
      {
        if (!this._viewAppeared)
          return;
        this.HomeWorkDoneChanged(value);
      }
    }

    public bool IsOffline
    {
      get
      {
        return this._isOffline;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isOffline, (M0) (value ? 1 : 0), nameof (IsOffline));
      }
    }

    public string HomeWorkText
    {
      get
      {
        return this._textProvider.GetText((string) null, (string) null, "Lesson_Model_HomeWork");
      }
    }

    public string HomeWorkDeadLineText
    {
      get
      {
        if (this.TeacherHomeWork != null)
        {
          DateTimeOffset hatarido = this.TeacherHomeWork.Hatarido;
          if (this.TeacherHomeWork.Hatarido != new DateTimeOffset())
            return "(" + this._textProvider.GetText((string) null, (string) null, "Lesson_Model_HomeWorkDate") + string.Format("{0:d}", (object) this.TeacherHomeWork.HataridoLocal) + ")";
        }
        return string.Empty;
      }
    }

    public LessonRealm Lesson
    {
      get
      {
        return this._lesson;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<LessonRealm>((M0&) ref this._lesson, (M0) value, nameof (Lesson));
      }
    }

    public string LessonHomework
    {
      get
      {
        return this.GetHomeWorkTextOrErrorText(this.Lesson?.Homework);
      }
    }

    public string TeacherHomeWorkText
    {
      get
      {
        return this.GetHomeWorkTextOrErrorText(this.TeacherHomeWork?.Szoveg);
      }
    }

    public TeacherHomeWorkRealm TeacherHomeWork
    {
      get
      {
        return this._teacherHomeWork;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<TeacherHomeWorkRealm>((M0&) ref this._teacherHomeWork, (M0) value, nameof (TeacherHomeWork));
      }
    }

    public bool HomeWorkDoneIsEnabled
    {
      get
      {
        return this.Lesson.HasHomework;
      }
    }

    public override void ViewAppeared()
    {
      this._viewAppeared = true;
      base.ViewAppeared();
    }

    public virtual void Prepare(LessonRealm parameter)
    {
      this.Prepare();
      this.Lesson = parameter;
      this.TeacherHomeWork = this._teacherHomeWorkDbDataService.GetTeacherHomeWork(this.Lesson);
    }

    public virtual async Task Initialize()
    {
      HomeWorkDetailViewModel workDetailViewModel = this;
      workDetailViewModel.HomeWorkNewItem();
      TeacherHomeWorkRealm teacherHomeWorkRealm = await workDetailViewModel.FetchTeacherHomeWork();
      workDetailViewModel.TeacherHomeWork = teacherHomeWorkRealm ?? new TeacherHomeWorkRealm();
      if (!workDetailViewModel.HasInternetConnection && workDetailViewModel.Lesson.HasHomework && (workDetailViewModel.TeacherHomeWork == null || workDetailViewModel.TeacherHomeWork != null && workDetailViewModel.TeacherHomeWork.Id == null))
      {
        string text = workDetailViewModel._textProvider.GetText((string) null, (string) null, "HomeWorkDetailCannotDownloadWOInternet");
        workDetailViewModel._userDialogs.Toast(text, new TimeSpan?(TimeSpan.FromSeconds(2.0)));
      }
      // ISSUE: reference to a compiler-generated method
      ((MvxMainThreadDispatchingObject) workDetailViewModel).InvokeOnMainThread(new Action(workDetailViewModel.\u003CInitialize\u003Eb__34_0), true);
    }

    private string GetHomeWorkTextOrErrorText(string text)
    {
      string str = text;
      if (!this.HasInternetConnection && this.Lesson.HasHomework && (this.TeacherHomeWork == null || this.TeacherHomeWork != null && this.TeacherHomeWork.Id == null))
        str = "<center><font color='red'>" + this._textProvider.GetText((string) null, (string) null, "HomeWorkDetailCannotDownloadWOInternet") + "</font></center>";
      return str;
    }

    private async Task<TeacherHomeWorkRealm> FetchTeacherHomeWork()
    {
      HomeWorkDetailViewModel workDetailViewModel = this;
      TeacherHomeWorkRealm teacherHomeWork;
      TeacherHomeWorkRealm result;
      try
      {
        teacherHomeWork = (TeacherHomeWorkRealm) null;
        try
        {
          workDetailViewModel.IsOffline = false;
          if (!workDetailViewModel._connectivity.get_IsConnected())
            throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkDetailViewModel.cs", 155);
          if (workDetailViewModel.Lesson.TeacherHomeWorkId.HasValue)
          {
            TaskAwaiter<TeacherHomeWorkRealm> awaiter = workDetailViewModel._teacherHomeWorkDbDataService.FetchTeacherHomeWorkAsync(workDetailViewModel.ActiveProfileRealm, workDetailViewModel.Lesson.TeacherHomeWorkId.Value, true).GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              int num;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 0;
              TaskAwaiter<TeacherHomeWorkRealm> taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TeacherHomeWorkRealm>, HomeWorkDetailViewModel.\u003CFetchTeacherHomeWork\u003Ed__36>(ref awaiter, this);
              return;
            }
            teacherHomeWork = awaiter.GetResult();
            workDetailViewModel._teacherHomeWorkDbDataService.SaveTeacherHomeWork(workDetailViewModel.ActiveProfileRealm.RolelessId, teacherHomeWork);
          }
          if (teacherHomeWork == null)
            workDetailViewModel.CreateTanarHaziFeladatFromLesson();
        }
        catch (Exception ex)
        {
          ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkDetailViewModel.cs", 171);
          switch (ex)
          {
            case NoInternetConnectionException _:
            case ServerUnreachableException _:
              workDetailViewModel.IsOffline = true;
              result = workDetailViewModel._teacherHomeWorkDbDataService.GetTeacherHomeWork(workDetailViewModel.Lesson);
              goto label_14;
          }
        }
        result = teacherHomeWork;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        teacherHomeWork = (TeacherHomeWorkRealm) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
label_14:
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      teacherHomeWork = (TeacherHomeWorkRealm) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    private TanarHaziFeladat CreateTanarHaziFeladatFromLesson()
    {
      if (!this.Lesson.HasHomework)
        return (TanarHaziFeladat) null;
      return new TanarHaziFeladat()
      {
        Szoveg = this.Lesson.Homework
      };
    }

    private void HomeWorkNewItem()
    {
      if (this.Lesson.SeenByUser)
        return;
      this.Lesson.SeenByUser();
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }

    public async Task HomeWorkDoneChanged(bool done)
    {
      HomeWorkDetailViewModel workDetailViewModel = this;
      try
      {
        TaskAwaiter taskAwaiter;
        int num;
        if (done != workDetailViewModel.HomeWorkDone)
        {
          try
          {
            if (workDetailViewModel.ActiveProfile.IsTutelary)
            {
              TaskAwaiter awaiter = ((MvxNotifyPropertyChanged) workDetailViewModel).RaisePropertyChanged("HomeWorkDone").GetAwaiter();
              if (!awaiter.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 0;
                taskAwaiter = awaiter;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter, this);
                return;
              }
              awaiter.GetResult();
              awaiter = workDetailViewModel._modalDialog.DisplayAlertByResourceKeysAsync("HomeWorkDetail_Update_IsTutelary", "Common_NoInternet_Title").GetAwaiter();
              if (!awaiter.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 1;
                taskAwaiter = awaiter;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter, this);
                return;
              }
              awaiter.GetResult();
            }
            else if (!workDetailViewModel.HasInternetConnection)
            {
              TaskAwaiter awaiter = ((MvxNotifyPropertyChanged) workDetailViewModel).RaisePropertyChanged("HomeWorkDone").GetAwaiter();
              if (!awaiter.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 2;
                taskAwaiter = awaiter;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter, this);
                return;
              }
              awaiter.GetResult();
              awaiter = workDetailViewModel._modalDialog.DisplayAlertByResourceKeysAsync("HomeWorkStudentDetail_Update_NoInternet", "Common_NoInternet_Title").GetAwaiter();
              if (!awaiter.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 3;
                taskAwaiter = awaiter;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter, this);
                return;
              }
              awaiter.GetResult();
            }
            else
            {
              TaskAwaiter awaiter1 = workDetailViewModel._mobileApi.SaveTeacherHomeWorkDoneStatusAsync(workDetailViewModel.ActiveProfile, workDetailViewModel._teacherHomeWork.Id, done).GetAwaiter();
              if (!awaiter1.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 4;
                taskAwaiter = awaiter1;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter1, this);
                return;
              }
              awaiter1.GetResult();
              workDetailViewModel._teacherHomeWorkDbDataService.AddOrUpdate(workDetailViewModel.TeacherHomeWork, (Action<TeacherHomeWorkRealm>) (_teacherHomeWork => _teacherHomeWork.Done = done));
              workDetailViewModel._lessonDataService.AddOrUpdate(workDetailViewModel.Lesson, (Action<LessonRealm>) (lesson => lesson.IsHomeworkDone = done));
              TaskAwaiter awaiter2 = ((MvxNotifyPropertyChanged) workDetailViewModel).RaisePropertyChanged("HomeWorkDone").GetAwaiter();
              if (!awaiter2.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 5;
                taskAwaiter = awaiter2;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter2, this);
                return;
              }
              awaiter2.GetResult();
            }
          }
          catch (Exception ex)
          {
            ErrorHandler.Current.HandleError(ex);
            TaskAwaiter awaiter = ((MvxNotifyPropertyChanged) workDetailViewModel).RaisePropertyChanged("HomeWorkDone").GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 6;
              taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, HomeWorkDetailViewModel.\u003CHomeWorkDoneChanged\u003Ed__39>(ref awaiter, this);
              return;
            }
            awaiter.GetResult();
          }
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult();
    }
  }
}
