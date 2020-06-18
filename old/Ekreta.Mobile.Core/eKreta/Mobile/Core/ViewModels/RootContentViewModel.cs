// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.RootContentViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;
using Xamarin.Essentials;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class RootContentViewModel : ViewModelBase
  {
    private bool _hasAnyInformationToShow = true;
    private static MvxSubscriptionToken delayedPushMessageToken;
    private readonly IRefreshDataService _refreshDataService;
    private readonly IMvxMessenger _messenger;
    private readonly IPushNotificationService _pushNotificationService;
    private readonly ISettingsDataService _settingsDataService;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IAbsenceDbDataService _absenceDbDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly IEvaluationDbDataService _evaluationDbDataService;
    private readonly IEventDataService _eventDataService;
    private readonly IExamDataService _examDataService;
    private readonly IExamDbDataService _examDbDataService;
    private readonly INoteDataService _noteDataService;
    private readonly INoteDbDataService _noteDbDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly ILessonDbDataService _lessonDbDataService;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IFirebaseAnalytics _firebaseAnalytics;
    private readonly IRatingDataService _ratingDataService;
    private readonly IFirebaseRemoteConfigurationService _remoteConfigurationService;
    private ListItem _selectedItem;
    private MvxAsyncCommand<bool> _refreshCommand;
    private MvxCommand<ListItem> _showDetailCommand;
    private IEnumerable<GroupedList<DateTime, ListItem>> _listItems;
    private MvxAsyncCommand _showInformationPageCommand;
    private MvxAsyncCommand _navigateToInformationUrlCommand;
    private bool isDelayedPushNavigated;
    private int lastMessageId;
    private IPushNotificationPlatformSpecificService _pushNotificationPlatformSpecificService;
    private int _tryNavigateToDetailCounter;

    public RootContentViewModel(
      IRefreshDataService refreshDataService,
      IMvxMessenger messenger,
      IPushNotificationService pushNotificationService,
      ISettingsDataService settingsDataService,
      IAbsenceDataService absenceDataService,
      IAbsenceDbDataService absenceDbDataService,
      IEvaluationDataService evaluationDataService,
      IEvaluationDbDataService evaluationDbDataService,
      IEventDataService eventDataService,
      IExamDataService examDataService,
      IExamDbDataService examDbDataService,
      INoteDataService noteDataService,
      INoteDbDataService noteDbDataService,
      ILessonDataService lessonDataService,
      ILessonDbDataService lessonDbDataService,
      IUzenetDataService uzenetDataService,
      IRatingDataService ratingDataService,
      IPushNotificationPlatformSpecificService pushNotificationPlatformSpecificService,
      IFirebaseAnalytics firebaseAnalytics,
      IFirebaseRemoteConfigurationService remoteConfigurationService)
    {
      this._refreshDataService = refreshDataService;
      this._messenger = messenger;
      this._pushNotificationService = pushNotificationService;
      this._settingsDataService = settingsDataService;
      this._absenceDataService = absenceDataService;
      this._absenceDbDataService = absenceDbDataService;
      this._evaluationDataService = evaluationDataService;
      this._evaluationDbDataService = evaluationDbDataService;
      this._eventDataService = eventDataService;
      this._examDataService = examDataService;
      this._examDbDataService = examDbDataService;
      this._noteDataService = noteDataService;
      this._noteDbDataService = noteDbDataService;
      this._lessonDataService = lessonDataService;
      this._lessonDbDataService = lessonDbDataService;
      this._uzenetDataService = uzenetDataService;
      this._pushNotificationPlatformSpecificService = pushNotificationPlatformSpecificService;
      this._firebaseAnalytics = firebaseAnalytics;
      this._ratingDataService = ratingDataService;
      this._remoteConfigurationService = remoteConfigurationService;
    }

    public MvxAsyncCommand NavigateToInformationUrlCommand
    {
      get
      {
        return this._navigateToInformationUrlCommand ?? (this._navigateToInformationUrlCommand = new MvxAsyncCommand(new Func<Task>(this.NavigateToInformationUrlAsync), (Func<bool>) null, false));
      }
    }

    public bool HasAnyInformationToShow
    {
      get
      {
        return this._hasAnyInformationToShow;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._hasAnyInformationToShow, (M0) (value ? 1 : 0), nameof (HasAnyInformationToShow));
      }
    }

    public IEnumerable<GroupedList<DateTime, ListItem>> ListItems
    {
      get
      {
        return this._listItems;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<DateTime, ListItem>>>((M0&) ref this._listItems, (M0) value, nameof (ListItems));
      }
    }

    public ListItem SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<ListItem>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public string EmptyViewTitle
    {
      get
      {
        return this._settingsDataService.GetDashboardDayRange() != 0 ? string.Format(this._textProvider.GetText((string) null, (string) null, "RootContentPage_EmptyList_Multiple_Day"), (object) this._settingsDataService.GetDashboardDayRange()) : this._textProvider.GetText((string) null, (string) null, "RootContentPage_EmptyList_Current_Day");
      }
    }

    public MvxAsyncCommand<bool> RefreshCommand
    {
      get
      {
        return this._refreshCommand ?? (this._refreshCommand = new MvxAsyncCommand<bool>(new Func<bool, Task>(this.RefreshDashboard), (Func<bool, bool>) null, false));
      }
    }

    public MvxAsyncCommand ShowInformationPageCommand
    {
      get
      {
        return this._showInformationPageCommand ?? (this._showInformationPageCommand = new MvxAsyncCommand(new Func<Task>(this.ShowInformationPage), (Func<bool>) null, false));
      }
    }

    public MvxCommand<ListItem> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxCommand<ListItem>(new Action<ListItem>(this.ShowDetail), new Func<ListItem, bool>(this._singleNavigation.CanExecuteNavigationCommand)));
      }
    }

    public bool IsViewAppeared { get; private set; }

    public PushMessage PushMessage { get; private set; }

    public override void Start()
    {
      base.Start();
      CrossMobileAnalytics.Current.TrackPageView("Dashboard", (IDictionary<string, string>) null);
      this._messenger.Subscribe<ActiveProfileChangedMessage>((Action<M0>) (async x => await this.GetListItems()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<LoginRequiredMessage>((Action<M0>) (x => this.ReLogin(x.Profile)), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<ProfileSyncMessage>((Action<M0>) (x => this.IsLoading = x.IsLoading), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (async x => await this.GetListItems()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<NewsItemsRemovedMessage>((Action<M0>) (async x => await this.GetListItems()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<DashboardDayChanged>((Action<M0>) (async x => await this.GetListItems()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<OpenNotificationMessage>((Action<M0>) (async x => await this.OpenPushMessage(x.PushMessage)), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<DelayedOpenNotificationMessage>((Action<M0>) (async x => await this.DelayedOpenPushMessage(x.PushMessage)), (MvxReference) 1, (string) null);
    }

    public virtual async Task Initialize()
    {
      RootContentViewModel contentViewModel = this;
      // ISSUE: reference to a compiler-generated method
      await contentViewModel.\u003C\u003En__0();
      await contentViewModel.GetListItems();
      try
      {
        await contentViewModel._remoteConfigurationService.FetchAndActivateAsync();
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      if (contentViewModel._ratingDataService.Init(contentViewModel._profileDataService.GetActiveProfile(), contentViewModel._remoteConfigurationService.CheckValueChanged("IsRatingEnabled")).LastSeenDate.AddDays((double) contentViewModel._ratingDataService.IdleDays) < DateTime.Now)
        contentViewModel._modalDialog.InvokeRatingFlow(contentViewModel._profileDataService.GetActiveProfile());
      Profile activeProfile = contentViewModel._profileDataService.GetActiveProfile();
      if (activeProfile == null)
      {
        int num = await contentViewModel._navigationService.Navigate<LoginViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      }
      else
      {
        if (activeProfile.PushSettings == null || !activeProfile.PushSettings.IsPushActive || contentViewModel._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
          return;
        Dialogs.ShowToast("Push_SubscribedNeedEnable");
      }
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.IsLoading = this._settings.RefreshProfileInProgress;
      this.SelectedItem = (ListItem) null;
      this.IsViewAppeared = true;
      this.SetHasAnyInformation(this.HasInternetConnection);
      if (this.PushMessage == null)
        return;
      Task.Run((Func<Task>) (async () => await this.DelayedOpenPushMessage(this.PushMessage)));
    }

    public virtual void ViewDestroy(bool viewFinishing = true)
    {
      ((MvxViewModelResult<object>) this).ViewDestroy(viewFinishing);
      this.IsViewAppeared = false;
    }

    protected override void OnConnectivityChanged(bool isConnectedToInternet)
    {
      this.SetHasAnyInformation(isConnectedToInternet);
    }

    private void SetHasAnyInformation(bool isConnectedToInternet)
    {
      this.HasAnyInformationToShow = !isConnectedToInternet | !this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice();
    }

    private async Task DelayedOpenPushMessage(PushMessage pushMessage)
    {
      RootContentViewModel contentViewModel = this;
      try
      {
        TaskAwaiter taskAwaiter1;
        int num;
        if (contentViewModel.IsViewAppeared)
        {
          contentViewModel.HideSideBar();
          contentViewModel.ChangeProfile(pushMessage);
          if (contentViewModel.IsLoading)
          {
            RootContentViewModel.delayedPushMessageToken = contentViewModel._messenger.Subscribe<ProfileSyncMessage>((Action<M0>) (async x => await this.NavigateToDetailPageByPush(pushMessage, x)), (MvxReference) 0, (string) null);
          }
          else
          {
            TaskAwaiter awaiter1 = contentViewModel.NavigateToRootPage().GetAwaiter();
            if (!awaiter1.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 0;
              taskAwaiter1 = awaiter1;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, RootContentViewModel.\u003CDelayedOpenPushMessage\u003Ed__65>(ref awaiter1, this);
              return;
            }
            awaiter1.GetResult();
            TaskAwaiter<bool> awaiter2 = contentViewModel.RefreshDashboard(true).GetAwaiter();
            if (!awaiter2.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 1;
              TaskAwaiter<bool> taskAwaiter2 = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<bool>, RootContentViewModel.\u003CDelayedOpenPushMessage\u003Ed__65>(ref awaiter2, this);
              return;
            }
            if (awaiter2.GetResult())
            {
              TaskAwaiter awaiter3 = contentViewModel.NavigateToDetail(pushMessage).GetAwaiter();
              if (!awaiter3.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 2;
                taskAwaiter1 = awaiter3;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, RootContentViewModel.\u003CDelayedOpenPushMessage\u003Ed__65>(ref awaiter3, this);
                return;
              }
              awaiter3.GetResult();
            }
          }
          contentViewModel.PushMessage = (PushMessage) null;
        }
        else
        {
          contentViewModel.PushMessage = pushMessage;
          TaskAwaiter awaiter = contentViewModel.NavigateToRootPage().GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 3;
            taskAwaiter1 = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, RootContentViewModel.\u003CDelayedOpenPushMessage\u003Ed__65>(ref awaiter, this);
            return;
          }
          awaiter.GetResult();
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

    private async Task NavigateToDetailPageByPush(PushMessage pushMessage, ProfileSyncMessage x)
    {
      if (x.IsLoading || this.isDelayedPushNavigated)
        return;
      this.isDelayedPushNavigated = true;
      await this.NavigateToDetail(pushMessage);
      RootContentViewModel.delayedPushMessageToken?.Dispose();
    }

    private async Task OpenPushMessage(PushMessage pushMessage)
    {
      RootContentViewModel contentViewModel = this;
      if (!contentViewModel.ChangeProfile(pushMessage))
        return;
      contentViewModel.HideSideBar();
      await contentViewModel.NavigateToRootPage();
      if (!await contentViewModel.RefreshDashboard(true))
        return;
      await contentViewModel.NavigateToDetail(pushMessage);
    }

    private bool ChangeProfile(PushMessage pushMessage)
    {
      this.ActiveProfile = this._profileDataService.GetActiveProfile();
      if (this.ActiveProfile.TokenInfo.InstituteUserId != pushMessage.UserId || this.ActiveProfile.TokenInfo.Role != (UserRoles) pushMessage.NotificationRole)
      {
        Profile profile = this._profileDataService.GetProfile(pushMessage.InstituteCode, pushMessage.UserId, pushMessage.NotificationRole);
        if (profile == null)
          return false;
        this._profileDataService.SetActiveProfile(profile);
        this._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) this, profile));
        this.ActiveProfile = profile;
      }
      else
        this.ActiveProfile = this._profileDataService.GetActiveProfile();
      return true;
    }

    private async Task NavigateToDetail(PushMessage pushMessage)
    {
      RootContentViewModel contentViewModel = this;
      contentViewModel.ChangeProfile(pushMessage);
      if (pushMessage.NotificationType != NotificationMessageType.Message)
        return;
      if (await contentViewModel._pushNotificationService.DownloadPostaladaElem(contentViewModel.ActiveProfile, pushMessage))
      {
        try
        {
          if (pushMessage.ItemId == contentViewModel.lastMessageId)
            return;
          contentViewModel.lastMessageId = pushMessage.ItemId;
          PostaladaElem postaladaElem = contentViewModel._uzenetDataService.GetPostaladaElem(pushMessage.ItemId);
          contentViewModel._tryNavigateToDetailCounter = 0;
          if (postaladaElem == null)
            return;
          int num = await contentViewModel._navigationService.Navigate<MessageDetailViewModel, PostaladaElem>((M1) postaladaElem, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
        }
        catch (Exception ex)
        {
          Dialogs.ShowToast("RootContentPage_PushMessage_ItemNotFound");
        }
      }
      else
      {
        ++contentViewModel._tryNavigateToDetailCounter;
        if (contentViewModel._tryNavigateToDetailCounter <= 3)
        {
          await Task.Delay(400);
          await contentViewModel.NavigateToDetail(pushMessage);
        }
        else
        {
          contentViewModel._tryNavigateToDetailCounter = 0;
          await contentViewModel._modalDialog.DisplayAlertByResourceKeysAsync("PushNotification_CannotOpen_Text", "Common_Alert_Title");
        }
      }
    }

    private async Task GetListItems()
    {
      await Task.Run((Action) (() =>
      {
        this.ActiveProfile = this._profileDataService.GetActiveProfile();
        if (this.ActiveProfile == null)
          return;
        ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("ActiveProfile");
        this.ListItems = (IEnumerable<GroupedList<DateTime, ListItem>>) this.GetRawListItems().Where<ListItem>((Func<ListItem, bool>) (x => x.CreatingTime >= DateTime.Today.AddDays((double) -this._settingsDataService.GetDashboardDayRange()))).GroupBy<ListItem, DateTime>((Func<ListItem, DateTime>) (x => x.CreatingTime.Date)).Select<IGrouping<DateTime, ListItem>, GroupedList<DateTime, ListItem>>((Func<IGrouping<DateTime, ListItem>, GroupedList<DateTime, ListItem>>) (x => new GroupedList<DateTime, ListItem>(x.Key, x.Key.ToString("D"), (IEnumerable<ListItem>) x.OrderByDescending<ListItem, bool>((Func<ListItem, bool>) (y => !y.SeenByUser)).ThenByDescending<ListItem, DateTime>((Func<ListItem, DateTime>) (y => y.CreatingTime)), "{0}"))).OrderByDescending<GroupedList<DateTime, ListItem>, DateTime>((Func<GroupedList<DateTime, ListItem>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, ListItem>>();
        ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("ListItems");
        this.ExpireNewsItems();
      }));
    }

    private void ExpireNewsItems()
    {
      this._absenceDataService.ExpireNewsItems();
      this._evaluationDataService.ExpireNewsItems();
      this._noteDataService.ExpireNewsItems();
      this._eventDataService.ExpireNewsItems();
      this._lessonDataService.ExpireNewsItems();
    }

    private List<ListItem> GetRawListItems()
    {
      try
      {
        ListItemCreator listItemCreator = new ListItemCreator(this.ActiveProfile);
        List<ListItem> absenceListItems = listItemCreator.CreateAbsenceListItems();
        List<ListItem> evaluationListItems = listItemCreator.CreateEvaluationListItems();
        List<ListItem> noteListItems = listItemCreator.CreateNoteListItems();
        List<ListItem> homeWorkListItems = listItemCreator.CreateHomeWorkListItems();
        List<ListItem> eventListItems = listItemCreator.CreateEventListItems();
        List<ListItem> examsListItems = listItemCreator.CreateExamsListItems();
        return (absenceListItems ?? new List<ListItem>()).Union<ListItem>((IEnumerable<ListItem>) (evaluationListItems ?? new List<ListItem>())).Union<ListItem>((IEnumerable<ListItem>) (noteListItems ?? new List<ListItem>())).Union<ListItem>((IEnumerable<ListItem>) (homeWorkListItems ?? new List<ListItem>())).Union<ListItem>((IEnumerable<ListItem>) (eventListItems ?? new List<ListItem>())).Union<ListItem>((IEnumerable<ListItem>) (examsListItems ?? new List<ListItem>())).ToList<ListItem>();
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (GetRawListItems), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/RootContentViewModel.cs", 472);
        return new List<ListItem>();
      }
    }

    private void ReLogin(Profile profile)
    {
      this.ActiveProfile = this._profileDataService.GetActiveProfile();
      if (this.ActiveProfile != null)
        this._navigationService.Navigate<NewProfileViewModel, Profile>((M1) this.ActiveProfile, (IMvxBundle) null, new CancellationToken());
      else
        this._navigationService.Navigate<NewProfileViewModel, Profile>((M1) profile, (IMvxBundle) null, new CancellationToken());
    }

    private async Task<bool> RefreshDashboard(bool forceRefresh = false)
    {
      RootContentViewModel contentViewModel = this;
      bool successful = false;
      try
      {
        if (!contentViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/RootContentViewModel.cs", 498);
        contentViewModel.IsLoading = contentViewModel._settings.RefreshProfileInProgress = true;
        contentViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) contentViewModel, contentViewModel.IsLoading));
        Profile profile = await contentViewModel._refreshDataService.RefreshProfileAsync(forceRefresh);
        contentViewModel.ActiveProfile = profile;
        contentViewModel._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) contentViewModel, contentViewModel.ActiveProfile));
        successful = true;
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        contentViewModel.IsLoading = contentViewModel._settings.RefreshProfileInProgress = false;
        contentViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) contentViewModel, contentViewModel.IsLoading));
      }
      return successful;
    }

    private void ShowDetail(ListItem x)
    {
      this._singleNavigation.DisableNavigation();
      if (x.Type == typeof (eKreta.Mobile.Core.Models.Evaluation))
      {
        EvaluationRealm evaluationRealm = this._evaluationDbDataService.Get(x.StringId);
        if (evaluationRealm == null)
          return;
        this._navigationService.Navigate<EvaluationDetailViewModel, EvaluationRealm>((M1) evaluationRealm, (IMvxBundle) null, new CancellationToken());
      }
      else if (x.Type == typeof (Ekreta.Mobile.Core.Models.Absence))
      {
        AbsenceRealm absenceRealm = this._absenceDbDataService.Get(x.Id);
        if (absenceRealm == null)
          return;
        this._navigationService.Navigate<AbsenceDetailViewModel, AbsenceRealm>((M1) absenceRealm, (IMvxBundle) null, new CancellationToken());
      }
      else if (x.Type == typeof (Ekreta.Mobile.Core.Models.Note))
      {
        NoteRealm noteRealm = this._noteDbDataService.Get(this.ActiveProfile.RolelessId, x.Id);
        if (noteRealm == null)
          return;
        this._navigationService.Navigate<NoteDetailViewModel, NoteRealm>((M1) noteRealm, (IMvxBundle) null, new CancellationToken());
      }
      else if (x.Type == typeof (Ekreta.Mobile.Core.Models.Lesson))
      {
        LessonRealm teacherHomeworkId = this._lessonDbDataService.GetByTeacherHomeworkId(x.Id);
        if (teacherHomeworkId == null)
          return;
        if (teacherHomeworkId.IsTanuloHaziFeladatEnabled)
          this._navigationService.Navigate<HomeWorkStudentDetailViewModel, LessonRealm>((M1) teacherHomeworkId, (IMvxBundle) null, new CancellationToken());
        else
          this._navigationService.Navigate<HomeWorkDetailViewModel, LessonRealm>((M1) teacherHomeworkId, (IMvxBundle) null, new CancellationToken());
      }
      else if (x.Type == typeof (Event))
      {
        Event @event = this._eventDataService.Get(x.StringId);
        if (@event == null)
          return;
        this._navigationService.Navigate<EventDetailViewModel, Event>((M1) @event, (IMvxBundle) null, new CancellationToken());
      }
      else
      {
        if (!(x.Type == typeof (Ekreta.Mobile.Core.Models.Exam)))
          return;
        ExamRealm examRealm = this._examDbDataService.Get(x.StringId);
        if (examRealm == null)
          return;
        this._navigationService.Navigate<ExamsDetailViewModel, ExamRealm>((M1) examRealm, (IMvxBundle) null, new CancellationToken());
      }
    }

    private async Task ShowInformationPage()
    {
      int num = await this._navigationService.Navigate<InformationViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private async Task NavigateToInformationUrlAsync()
    {
      RootContentViewModel contentViewModel = this;
      contentViewModel._firebaseAnalytics.SendEvent("info_banner_clicked");
      string informationUrl = contentViewModel.ActiveProfile.Institute.InformationUrl;
      if (string.IsNullOrWhiteSpace(informationUrl) || !Uri.IsWellFormedUriString(informationUrl, UriKind.Absolute))
        return;
      await Launcher.OpenAsync(new Uri(informationUrl));
    }
  }
}
