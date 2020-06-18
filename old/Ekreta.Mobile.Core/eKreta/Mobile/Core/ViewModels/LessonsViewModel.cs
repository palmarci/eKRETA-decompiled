// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.LessonsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class LessonsViewModel : ViewModelBase
  {
    private List<GroupedList<DateTime, LessonRealm>> _days = new List<GroupedList<DateTime, LessonRealm>>();
    private List<DateTime> cachedLessons = new List<DateTime>();
    private DateTime _firstDayOfWeek = DateTime.Today.FirstDayOfWeek();
    private DateTime _lastDayOfWeek = DateTime.Today.LastDayOfWeek();
    private DateTime _lastDayOfWeekDisplay = DateTime.Today.LastDayOfWeek().AddDays(-2.0);
    private readonly IMvxMessenger _messenger;
    private readonly ILessonDbDataService _lessonDataService;
    private bool _isOffline;
    private bool _isError;
    private string _errorTitle;
    private string _errorSubtitle;
    private LessonRealm _selectedItem;
    private GroupedList<DateTime, LessonRealm> _selectedDay;
    private MvxAsyncCommand<LessonRealm> _openHomeWorkCommand;
    private MvxAsyncCommand _previousWeekCommand;
    private MvxAsyncCommand _nextWeekCommand;

    public LessonsViewModel(IMvxMessenger messenger, ILessonDbDataService lessonDataService)
    {
      this._messenger = messenger;
      this._lessonDataService = lessonDataService;
    }

    public List<GroupedList<DateTime, LessonRealm>> Days
    {
      get
      {
        return this._days;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<GroupedList<DateTime, LessonRealm>>>((M0&) ref this._days, (M0) value, nameof (Days));
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

    public bool IsError
    {
      get
      {
        return this._isError;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isError, (M0) (value ? 1 : 0), nameof (IsError));
      }
    }

    public string ErrorTitle
    {
      get
      {
        return this._errorTitle;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._errorTitle, (M0) value, nameof (ErrorTitle));
      }
    }

    public string ErrorSubtitle
    {
      get
      {
        return this._errorSubtitle;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._errorSubtitle, (M0) value, nameof (ErrorSubtitle));
      }
    }

    public LessonRealm SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<LessonRealm>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.OpenHomeWorkCommand.Execute(value);
      }
    }

    public DateTime FirstDayOfWeek
    {
      get
      {
        return this._firstDayOfWeek;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<DateTime>((M0&) ref this._firstDayOfWeek, (M0) value, nameof (FirstDayOfWeek));
      }
    }

    public DateTime LastDayOfWeek
    {
      get
      {
        return this._lastDayOfWeek;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<DateTime>((M0&) ref this._lastDayOfWeek, (M0) value, nameof (LastDayOfWeek));
      }
    }

    public DateTime LastDayOfWeekDisplay
    {
      get
      {
        return this._lastDayOfWeekDisplay;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<DateTime>((M0&) ref this._lastDayOfWeekDisplay, (M0) value, nameof (LastDayOfWeekDisplay));
      }
    }

    public GroupedList<DateTime, LessonRealm> SelectedDay
    {
      get
      {
        return this._selectedDay;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<GroupedList<DateTime, LessonRealm>>((M0&) ref this._selectedDay, (M0) value, nameof (SelectedDay));
      }
    }

    public MvxAsyncCommand<LessonRealm> OpenHomeWorkCommand
    {
      get
      {
        return this._openHomeWorkCommand ?? (this._openHomeWorkCommand = new MvxAsyncCommand<LessonRealm>(new Func<LessonRealm, Task>(this.ExecuteOpenHomeWorkCommand), new Func<LessonRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public MvxAsyncCommand PreviousWeekCommand
    {
      get
      {
        return this._previousWeekCommand ?? (this._previousWeekCommand = new MvxAsyncCommand(new Func<Task>(this.ExecutePreviousWeekCommand), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand NextWeekCommand
    {
      get
      {
        return this._nextWeekCommand ?? (this._nextWeekCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteNextWeekCommand), (Func<bool>) null, false));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<ActiveProfileChangedMessage>((Action<M0>) (x => this.cachedLessons = new List<DateTime>()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<LessonChangedMessage>((Action<M0>) (x => this.RefreshLesson(x.Lesson)), (MvxReference) 1, (string) null);
    }

    public override void Prepare()
    {
      base.Prepare();
      this.InitDays();
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (LessonRealm) null;
    }

    private void RefreshLesson(LessonRealm lesson)
    {
      GroupedList<DateTime, LessonRealm> selectedDay = this.SelectedDay;
      this.ComposeLessons((IEnumerable<LessonRealm>) this._lessonDataService.GetLessons(this.ActiveProfileRealm.RolelessId, this.FirstDayOfWeek, this.LastDayOfWeek).OrderBy<LessonRealm, DateTime>((Func<LessonRealm, DateTime>) (x => x.StartTimeLocal)));
      this.SelectedDay = selectedDay;
    }

    private async Task InitDays()
    {
      LessonsViewModel lessonsViewModel = this;
      lessonsViewModel.IsError = false;
      lessonsViewModel.IsLoading = true;
      lessonsViewModel.IsOffline = false;
      try
      {
        IEnumerable<LessonRealm> lessonRealms;
        if (!lessonsViewModel.HasInternetConnection)
        {
          lessonRealms = lessonsViewModel._lessonDataService.GetLessons(lessonsViewModel.ActiveProfileRealm.RolelessId, lessonsViewModel.FirstDayOfWeek, lessonsViewModel.LastDayOfWeek);
          if (lessonRealms == null)
            lessonsViewModel.ShowError();
        }
        else if (lessonsViewModel.cachedLessons.Contains(lessonsViewModel.FirstDayOfWeek))
        {
          lessonRealms = lessonsViewModel._lessonDataService.GetLessons(lessonsViewModel.ActiveProfileRealm.RolelessId, lessonsViewModel.FirstDayOfWeek, lessonsViewModel.LastDayOfWeek);
        }
        else
        {
          lessonRealms = await lessonsViewModel._lessonDataService.FetchLessonsAsync(lessonsViewModel.ActiveProfile, new DateTime?(lessonsViewModel.FirstDayOfWeek), new DateTime?(lessonsViewModel.LastDayOfWeek), true);
          lessonsViewModel._lessonDataService.OverrideLessons(lessonsViewModel.ActiveProfileRealm.RolelessId, lessonRealms, lessonsViewModel.FirstDayOfWeek, lessonsViewModel.LastDayOfWeek);
          lessonsViewModel.cachedLessons.Add(lessonsViewModel.FirstDayOfWeek);
        }
        IEnumerable<LessonRealm> lessons = (IEnumerable<LessonRealm>) lessonRealms.OrderBy<LessonRealm, DateTime>((Func<LessonRealm, DateTime>) (x => x.StartTimeLocal));
        lessonsViewModel.ComposeLessons(lessons);
      }
      catch (Exception ex)
      {
        IEnumerable<LessonRealm> lessons = lessonsViewModel._lessonDataService.GetLessons(lessonsViewModel.ActiveProfileRealm.RolelessId, lessonsViewModel.FirstDayOfWeek, lessonsViewModel.LastDayOfWeek);
        if (lessons == null)
        {
          lessonsViewModel.ShowError();
        }
        else
        {
          lessonsViewModel.ComposeLessons(lessons);
          lessonsViewModel.IsOffline = true;
        }
      }
      finally
      {
        lessonsViewModel.IsLoading = false;
      }
    }

    private void ShowError()
    {
      if (this.HasInternetConnection)
      {
        this.ErrorTitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_Title");
        this.ErrorSubtitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_Subtitle");
      }
      else
      {
        this.ErrorTitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_NoInternet_Title");
        this.ErrorSubtitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_NoInternet_Subtitle");
      }
      this.IsError = true;
    }

    private void ComposeLessons(IEnumerable<LessonRealm> lessons)
    {
      this.Days = this.GetDefaultDays();
      this.LastDayOfWeekDisplay = this.LastDayOfWeek;
      if (lessons != null && lessons.Count<LessonRealm>() > 0)
      {
        this.Days = lessons.GroupBy<LessonRealm, DateTime>((Func<LessonRealm, DateTime>) (x => x.Date.LocalDateTime)).Select<IGrouping<DateTime, LessonRealm>, GroupedList<DateTime, LessonRealm>>((Func<IGrouping<DateTime, LessonRealm>, GroupedList<DateTime, LessonRealm>>) (x => new GroupedList<DateTime, LessonRealm>(x.Key, x.Key.ToString("dddd").ToUpper()[0].ToString(), (IEnumerable<LessonRealm>) x.ToList<LessonRealm>(), "{0}"))).OrderBy<GroupedList<DateTime, LessonRealm>, DateTime>((Func<GroupedList<DateTime, LessonRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, LessonRealm>>();
        List<GroupedList<DateTime, LessonRealm>> days = this.Days;
        this.LastDayOfWeekDisplay = (days != null ? days.LastOrDefault<GroupedList<DateTime, LessonRealm>>()?.Key : new DateTime?()) ?? this.LastDayOfWeek;
      }
      this.SelectedDay = this.Days.FirstOrDefault<GroupedList<DateTime, LessonRealm>>((Func<GroupedList<DateTime, LessonRealm>, bool>) (x => x.Key == DateTime.Today)) ?? this.Days.First<GroupedList<DateTime, LessonRealm>>();
    }

    private List<GroupedList<DateTime, LessonRealm>> GetDefaultDays()
    {
      List<GroupedList<DateTime, LessonRealm>> groupedListList = new List<GroupedList<DateTime, LessonRealm>>();
      DateTime dateTime = this.FirstDayOfWeek.FirstDayOfWeek();
      for (int index = 0; index < 5; ++index)
      {
        DateTime key = dateTime.AddDays((double) index);
        groupedListList.Add(new GroupedList<DateTime, LessonRealm>(key, key.ToString("dddd").ToUpper()[0].ToString(), (IEnumerable<LessonRealm>) null, "{0}"));
      }
      return groupedListList;
    }

    private async Task ExecuteOpenHomeWorkCommand(LessonRealm lesson)
    {
      LessonsViewModel lessonsViewModel = this;
      lessonsViewModel._singleNavigation.DisableNavigation();
      if (lesson.IsTanuloHaziFeladatEnabled)
      {
        int num1 = await lessonsViewModel._navigationService.Navigate<HomeWorkStudentDetailViewModel, LessonRealm>((M1) lesson, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      }
      else
      {
        int num2 = await lessonsViewModel._navigationService.Navigate<HomeWorkDetailViewModel, LessonRealm>((M1) lesson, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      }
    }

    private async Task ExecutePreviousWeekCommand()
    {
      this.FirstDayOfWeek = this.FirstDayOfWeek.AddDays(-7.0);
      this.LastDayOfWeek = this.LastDayOfWeek.AddDays(-7.0);
      this.LastDayOfWeekDisplay = this.LastDayOfWeek.AddDays(-2.0);
      await this.InitDays();
    }

    private async Task ExecuteNextWeekCommand()
    {
      this.FirstDayOfWeek = this.FirstDayOfWeek.AddDays(7.0);
      this.LastDayOfWeek = this.LastDayOfWeek.AddDays(7.0);
      this.LastDayOfWeekDisplay = this.LastDayOfWeek.AddDays(-2.0);
      await this.InitDays();
    }
  }
}
