// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.HomeWorksViewModel
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
  public class HomeWorksViewModel : ViewModelBase
  {
    private DateTime _firstDayOfWeek = DateTime.Today.FirstDayOfWeek();
    private DateTime _lastDayOfWeek = DateTime.Today.LastDayOfWeek().AddDays(-2.0);
    private DateTime _lastDayOfWeekDisplay = DateTime.Today.LastDayOfWeek().AddDays(-2.0);
    private List<DateTime> cachedLessons = new List<DateTime>();
    private bool _hasNextWeek = true;
    private readonly IMvxMessenger _messenger;
    private readonly ILessonDbDataService _lessonDataService;
    private readonly ISettingsDbDataService _settingsDataService;
    private bool _isOffline;
    private bool _isError;
    private bool _doneHomeWorkFilterIsActive;
    private string _errorTitle;
    private string _errorSubtitle;
    private List<GroupedList<DateTime, LessonRealm>> _homeWorks;
    private LessonRealm _selectedItem;
    private MvxAsyncCommand<LessonRealm> _showDetailCommand;
    private MvxAsyncCommand _previousWeekCommand;
    private MvxAsyncCommand _nextWeekCommand;
    private MvxAsyncCommand _filterDoneHomeWorksCommand;

    public HomeWorksViewModel(
      IMvxMessenger messenger,
      ILessonDbDataService lessonDataService,
      ISettingsDbDataService settingsDataService)
    {
      this._messenger = messenger;
      this._lessonDataService = lessonDataService;
      this._settingsDataService = settingsDataService;
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

    public List<GroupedList<DateTime, LessonRealm>> HomeWorks
    {
      get
      {
        return this._homeWorks;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<GroupedList<DateTime, LessonRealm>>>((M0&) ref this._homeWorks, (M0) value, nameof (HomeWorks));
      }
    }

    public bool HasNextWeek
    {
      get
      {
        return this._hasNextWeek;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._hasNextWeek, (M0) (value ? 1 : 0), nameof (HasNextWeek));
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
        this.ShowDetailCommand.Execute(value);
      }
    }

    public bool DoneHomeWorkFilterIsActive
    {
      get
      {
        return this._doneHomeWorkFilterIsActive;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._doneHomeWorkFilterIsActive, (M0) (value ? 1 : 0), nameof (DoneHomeWorkFilterIsActive));
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
        return this._nextWeekCommand ?? (this._nextWeekCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteNextWeekCommand), new Func<bool>(this.CanExecuteNextWeek), false));
      }
    }

    public MvxAsyncCommand<LessonRealm> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<LessonRealm>(new Func<LessonRealm, Task>(this.ExecuteShowDetailCommand), new Func<LessonRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public MvxAsyncCommand FilterDoneHomeWorksCommand
    {
      get
      {
        return this._filterDoneHomeWorksCommand ?? (this._filterDoneHomeWorksCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteFilterDoneHomeworksCommand), (Func<bool>) null, false));
      }
    }

    public override void Start()
    {
      base.Start();
      this.ActiveProfileRealm = this._profileDbDataService.GetActiveProfile();
      this._messenger.Subscribe<ActiveProfileChangedMessage>((Action<M0>) (x => this.cachedLessons = new List<DateTime>()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (async x => await this.LoadHomeWorks(false)), (MvxReference) 1, (string) null);
    }

    public virtual async Task Initialize()
    {
      this.DoneHomeWorkFilterIsActive = this._settingsDataService.GetDoneHomeWorkFilterSetting();
      await this.LoadHomeWorks(false);
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (LessonRealm) null;
    }

    private bool CanExecuteNextWeek()
    {
      return this.HasNextWeek;
    }

    private async Task LoadHomeWorks(bool forceRefresh = false)
    {
      HomeWorksViewModel homeWorksViewModel = this;
      homeWorksViewModel.IsError = false;
      homeWorksViewModel.IsLoading = true;
      if (homeWorksViewModel.SelectedItem != null)
        homeWorksViewModel.IsLoading = false;
      homeWorksViewModel.IsOffline = false;
      try
      {
        IEnumerable<LessonRealm> lessonRealms;
        if (!homeWorksViewModel.HasInternetConnection)
        {
          lessonRealms = homeWorksViewModel._lessonDataService.GetLessons(homeWorksViewModel.ActiveProfileRealm.RolelessId, homeWorksViewModel.FirstDayOfWeek, homeWorksViewModel.LastDayOfWeek);
          if (lessonRealms == null)
            homeWorksViewModel.ShowError();
        }
        else if (homeWorksViewModel.cachedLessons.Contains(homeWorksViewModel.FirstDayOfWeek) && !forceRefresh)
        {
          lessonRealms = homeWorksViewModel._lessonDataService.GetLessons(homeWorksViewModel.ActiveProfileRealm.RolelessId, homeWorksViewModel.FirstDayOfWeek, homeWorksViewModel.LastDayOfWeek);
        }
        else
        {
          IEnumerable<LessonRealm> lessons = await homeWorksViewModel._lessonDataService.FetchLessonsAsync(homeWorksViewModel.ActiveProfile, new DateTime?(homeWorksViewModel.FirstDayOfWeek), new DateTime?(homeWorksViewModel.LastDayOfWeek), true);
          homeWorksViewModel._lessonDataService.OverrideLessons(homeWorksViewModel.ActiveProfileRealm.RolelessId, lessons, homeWorksViewModel.FirstDayOfWeek, homeWorksViewModel.LastDayOfWeek);
          lessonRealms = homeWorksViewModel._lessonDataService.GetLessons(homeWorksViewModel.ActiveProfileRealm.RolelessId, homeWorksViewModel.FirstDayOfWeek, homeWorksViewModel.LastDayOfWeek);
          homeWorksViewModel.cachedLessons.Add(homeWorksViewModel.FirstDayOfWeek);
        }
        if (homeWorksViewModel.DoneHomeWorkFilterIsActive)
          lessonRealms = lessonRealms.Where<LessonRealm>((Func<LessonRealm, bool>) (x => !x.IsHomeworkDone));
        homeWorksViewModel.ComposeHomeWorks(lessonRealms);
      }
      catch (Exception ex)
      {
        IEnumerable<LessonRealm> lessons = homeWorksViewModel._lessonDataService.GetLessons(homeWorksViewModel.ActiveProfileRealm.RolelessId, homeWorksViewModel.FirstDayOfWeek, homeWorksViewModel.LastDayOfWeek);
        if (lessons == null)
        {
          homeWorksViewModel.ShowError();
        }
        else
        {
          homeWorksViewModel.ComposeHomeWorks(lessons);
          homeWorksViewModel.IsOffline = true;
        }
      }
      finally
      {
        homeWorksViewModel.IsLoading = false;
      }
    }

    private void ComposeHomeWorks(IEnumerable<LessonRealm> lessons)
    {
      if (lessons != null)
        this.IsLoading = false;
      this.LastDayOfWeekDisplay = this.LastDayOfWeek;
      if (lessons != null && lessons.Count<LessonRealm>() > 0)
      {
        this.HomeWorks = lessons.Where<LessonRealm>((Func<LessonRealm, bool>) (x => x.HasHomework)).GroupBy<LessonRealm, DateTime>((Func<LessonRealm, DateTime>) (x => x.DateLocal)).Select<IGrouping<DateTime, LessonRealm>, GroupedList<DateTime, LessonRealm>>((Func<IGrouping<DateTime, LessonRealm>, GroupedList<DateTime, LessonRealm>>) (x => new GroupedList<DateTime, LessonRealm>(x.Key, x.Key.ToString("D"), (IEnumerable<LessonRealm>) x.ToList<LessonRealm>(), "{0}"))).OrderByDescending<GroupedList<DateTime, LessonRealm>, DateTime>((Func<GroupedList<DateTime, LessonRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, LessonRealm>>();
        List<GroupedList<DateTime, LessonRealm>> homeWorks = this.HomeWorks;
        DateTime dateTime = (homeWorks != null ? homeWorks.FirstOrDefault<GroupedList<DateTime, LessonRealm>>()?.Key : new DateTime?()) ?? this.LastDayOfWeek;
        if (dateTime > this.LastDayOfWeek)
          this.LastDayOfWeekDisplay = dateTime;
      }
      else
        this.HomeWorks = new List<GroupedList<DateTime, LessonRealm>>();
      this.SetEmptyState<List<GroupedList<DateTime, LessonRealm>>>(ref this._homeWorks, "HomeWorks");
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

    private async Task ExecuteShowDetailCommand(LessonRealm lesson)
    {
      HomeWorksViewModel homeWorksViewModel = this;
      homeWorksViewModel._singleNavigation.DisableNavigation();
      if (lesson.IsTanuloHaziFeladatEnabled)
      {
        int num1 = await homeWorksViewModel._navigationService.Navigate<HomeWorkStudentDetailViewModel, LessonRealm>((M1) lesson, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      }
      else
      {
        int num2 = await homeWorksViewModel._navigationService.Navigate<HomeWorkDetailViewModel, LessonRealm>((M1) lesson, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      }
    }

    private async Task ExecuteNextWeekCommand()
    {
      HomeWorksViewModel homeWorksViewModel1 = this;
      DateTime dateTime1 = homeWorksViewModel1.LastDayOfWeek.AddDays(7.0);
      if (dateTime1 <= DateTime.Today.LastDayOfWeek().AddDays(7.0))
      {
        HomeWorksViewModel homeWorksViewModel2 = homeWorksViewModel1;
        DateTime dateTime2 = dateTime1.AddDays(2.0);
        DateTime dateTime3 = DateTime.Today.LastDayOfWeek();
        DateTime dateTime4 = dateTime3.AddDays(7.0);
        int num = dateTime2 != dateTime4 ? 1 : 0;
        homeWorksViewModel2.HasNextWeek = num != 0;
        HomeWorksViewModel homeWorksViewModel3 = homeWorksViewModel1;
        dateTime3 = homeWorksViewModel1.FirstDayOfWeek;
        DateTime dateTime5 = dateTime3.AddDays(7.0);
        homeWorksViewModel3.FirstDayOfWeek = dateTime5;
        HomeWorksViewModel homeWorksViewModel4 = homeWorksViewModel1;
        dateTime3 = homeWorksViewModel1.LastDayOfWeek;
        DateTime dateTime6 = dateTime3.AddDays(7.0);
        homeWorksViewModel4.LastDayOfWeek = dateTime6;
        homeWorksViewModel1.LastDayOfWeekDisplay = homeWorksViewModel1.LastDayOfWeek;
        await homeWorksViewModel1.LoadHomeWorks(false);
      }
      else
        homeWorksViewModel1.HasNextWeek = false;
    }

    private async Task ExecutePreviousWeekCommand()
    {
      HomeWorksViewModel homeWorksViewModel1 = this;
      homeWorksViewModel1.HasNextWeek = true;
      HomeWorksViewModel homeWorksViewModel2 = homeWorksViewModel1;
      DateTime dateTime1 = homeWorksViewModel1.FirstDayOfWeek;
      DateTime dateTime2 = dateTime1.AddDays(-7.0);
      homeWorksViewModel2.FirstDayOfWeek = dateTime2;
      HomeWorksViewModel homeWorksViewModel3 = homeWorksViewModel1;
      dateTime1 = homeWorksViewModel1.LastDayOfWeek;
      DateTime dateTime3 = dateTime1.AddDays(-7.0);
      homeWorksViewModel3.LastDayOfWeek = dateTime3;
      homeWorksViewModel1.LastDayOfWeekDisplay = homeWorksViewModel1.LastDayOfWeek;
      await homeWorksViewModel1.LoadHomeWorks(false);
    }

    private async Task ExecuteFilterDoneHomeworksCommand()
    {
      this.DoneHomeWorkFilterIsActive = !this.DoneHomeWorkFilterIsActive;
      this._settingsDataService.SetDoneHomeWorkFilterSetting(this.DoneHomeWorkFilterIsActive);
      await this.LoadHomeWorks(false);
    }
  }
}
