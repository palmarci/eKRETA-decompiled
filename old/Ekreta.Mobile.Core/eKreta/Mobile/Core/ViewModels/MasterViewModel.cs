// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.MasterViewModel
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
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Commands;
using MvvmCross.Navigation;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using Plugin.Connectivity.Abstractions;
using Plugin.DeviceInfo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class MasterViewModel : ViewModelBase<PushMessage>
  {
    private readonly bool isIPad = CrossDeviceInfo.get_Current().get_Model().ToLower().Contains("ipad");
    private static bool initApp;
    private readonly IMvxMessenger _messenger;
    private readonly IAppVersionService _appVersionService;
    private readonly ISecurityService _securityService;
    private readonly IWebNavigation _webNavigation;
    private readonly ISystemInfo _systemInfo;
    private readonly IStudentDataService _studentDataService;
    private readonly IRefreshDataService _refreshDataService;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly IEventDataService _eventDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly INoteDataService _noteDataService;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IExamDataService _examDataService;
    private Student _student;
    private string _role;
    private List<MenuItem> _menuItems;
    private MenuItem _selectedMenuItem;
    private MvxAsyncCommand _showProfilesCommand;
    private MvxAsyncCommand _refreshProfileCommand;
    private PushMessage _pushMessage;
    private MvxAsyncCommand<MenuItem> _selectMenuItemCommand;
    private bool _isVersionChecked;
    private string _gdprLink;

    public MasterViewModel(
      IMvxMessenger messenger,
      ISecurityService securityService,
      IWebNavigation webNavigation,
      ISystemInfo systemInfo,
      IAppVersionService appVersionService,
      IStudentDataService studentDataService,
      IRefreshDataService refreshDataService,
      IAbsenceDataService absenceDataService,
      IEvaluationDataService evaluationDataService,
      IEventDataService eventDataService,
      ILessonDataService lessonDataService,
      INoteDataService noteDataService,
      IUzenetDataService uzenetDataService,
      IExamDataService examDataService)
    {
      this._messenger = messenger;
      this._securityService = securityService;
      this._webNavigation = webNavigation;
      this._systemInfo = systemInfo;
      this._appVersionService = appVersionService;
      this._studentDataService = studentDataService;
      this._refreshDataService = refreshDataService;
      this._absenceDataService = absenceDataService;
      this._evaluationDataService = evaluationDataService;
      this._eventDataService = eventDataService;
      this._lessonDataService = lessonDataService;
      this._noteDataService = noteDataService;
      this._uzenetDataService = uzenetDataService;
      this._examDataService = examDataService;
    }

    public Student Student
    {
      get
      {
        return this._student;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<Student>((M0&) ref this._student, (M0) value, nameof (Student));
      }
    }

    public string Role
    {
      get
      {
        return this._role;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._role, (M0) value, nameof (Role));
      }
    }

    public string AppVersion
    {
      get
      {
        return this._appVersionService.GetAppVersionDisplayText();
      }
    }

    public List<MenuItem> MenuItems
    {
      get
      {
        return this._menuItems;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<MenuItem>>((M0&) ref this._menuItems, (M0) value, nameof (MenuItems));
      }
    }

    public MenuItem SelectedMenuItem
    {
      get
      {
        return this._selectedMenuItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<MenuItem>((M0&) ref this._selectedMenuItem, (M0) value, nameof (SelectedMenuItem)) || value == null)
          return;
        this.SelectMenuItemCommand.Execute(value);
      }
    }

    public MvxAsyncCommand ShowProfilesCommand
    {
      get
      {
        return this._showProfilesCommand ?? (this._showProfilesCommand = new MvxAsyncCommand(new Func<Task>(this.ShowProfiles), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand RefreshProfileCommand
    {
      get
      {
        return this._refreshProfileCommand ?? (this._refreshProfileCommand = new MvxAsyncCommand(new Func<Task>(this.RefreshProfile), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand<MenuItem> SelectMenuItemCommand
    {
      get
      {
        return this._selectMenuItemCommand ?? (this._selectMenuItemCommand = new MvxAsyncCommand<MenuItem>(new Func<MenuItem, Task>(this.SelectMenuItem), (Func<MenuItem, bool>) null, false));
      }
    }

    public virtual async void Start()
    {
      MasterViewModel masterViewModel = this;
      // ISSUE: reference to a compiler-generated method
      masterViewModel.\u003C\u003En__0();
      // ISSUE: reference to a compiler-generated method
      masterViewModel._messenger.Subscribe<ActiveProfileChangedMessage>((Action<M0>) new Action<ActiveProfileChangedMessage>(masterViewModel.\u003CStart\u003Eb__47_0), (MvxReference) 1, (string) null);
      // ISSUE: reference to a compiler-generated method
      masterViewModel._messenger.Subscribe<ProfileSyncMessage>((Action<M0>) new Action<ProfileSyncMessage>(masterViewModel.\u003CStart\u003Eb__47_1), (MvxReference) 1, (string) null);
      // ISSUE: reference to a compiler-generated method
      masterViewModel._messenger.Subscribe<NewsItemsRemovedMessage>((Action<M0>) new Action<NewsItemsRemovedMessage>(masterViewModel.\u003CStart\u003Eb__47_2), (MvxReference) 1, (string) null);
      // ISSUE: reference to a compiler-generated method
      masterViewModel._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) new Action<NewsItemsReceivedMessage>(masterViewModel.\u003CStart\u003Eb__47_3), (MvxReference) 1, (string) null);
      if (!masterViewModel.isIPad)
        return;
      try
      {
        // ISSUE: reference to a compiler-generated method
        await Task.Run(new Func<Task>(masterViewModel.\u003CStart\u003Eb__47_4)).ConfigureAwait(false);
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
    }

    public override void ViewAppearing()
    {
      base.ViewAppearing();
      this.InitProfile();
    }

    public override async void ViewAppeared()
    {
      MasterViewModel masterViewModel = this;
      // ISSUE: reference to a compiler-generated method
      masterViewModel.\u003C\u003En__1();
      // ISSUE: method pointer
      masterViewModel._connectivity.remove_ConnectivityChanged(new ConnectivityChangedEventHandler((object) masterViewModel, __methodptr(ConnectivityChanged)));
      if (MasterViewModel.initApp || masterViewModel.isIPad)
        return;
      masterViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) masterViewModel, masterViewModel.IsLoading));
      await masterViewModel.InitializeApp();
    }

    public virtual void Prepare(PushMessage parameter)
    {
      this._pushMessage = parameter;
    }

    public virtual async Task Initialize()
    {
      // ISSUE: reference to a compiler-generated method
      await this.\u003C\u003En__2();
      this._gdprLink = await this._appVersionService.GDPRLink();
      await this.CheckNewVersionAvailable();
    }

    private async Task CheckNewVersionAvailable()
    {
      MasterViewModel masterViewModel = this;
      if (await masterViewModel._appVersionService.ShouldUpdateApp() && !masterViewModel._isVersionChecked)
      {
        if (await masterViewModel._modalDialog.DisplayVersionAlertAsync(masterViewModel._textProvider.GetText((string) null, (string) null, "Alert_Message_NewUpdateAvailable_Text"), masterViewModel._textProvider.GetText((string) null, (string) null, "Alert_Title_NewUpdateAvailable_Text"), masterViewModel._textProvider.GetText((string) null, (string) null, "Alert_Ok_NewUpdateAvailable_Button"), masterViewModel._textProvider.GetText((string) null, (string) null, "Alert_Cancel_NewUpdateAvailable_Button")))
        {
          string str;
          if (masterViewModel._systemInfo.Platform == "iOS")
            str = await masterViewModel._appVersionService.IOSMobileStoreUrl();
          else
            str = await masterViewModel._appVersionService.AndroidMobileStoreUrl();
          string targetUrl = str;
          masterViewModel._webNavigation.OpenUrl(targetUrl);
        }
      }
      masterViewModel._isVersionChecked = true;
    }

    private async Task InitializeApp()
    {
      MasterViewModel masterViewModel = this;
      try
      {
        if (masterViewModel._securityService.IsDeviceRooted())
        {
          await masterViewModel.ShowRootedDeviceAlert();
        }
        else
        {
          masterViewModel.IsLoading = masterViewModel._settings.RefreshProfileInProgress = true;
          masterViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) masterViewModel, masterViewModel.IsLoading));
          if (masterViewModel.ActiveProfile != null)
          {
            // ISSUE: reference to a compiler-generated method
            ((MvxMainThreadDispatchingObject) masterViewModel).InvokeOnMainThread(new Action(masterViewModel.\u003CInitializeApp\u003Eb__53_0), true);
            if (masterViewModel._pushMessage != null)
              masterViewModel._messenger.Publish<DelayedOpenNotificationMessage>((M0) new DelayedOpenNotificationMessage((object) masterViewModel, masterViewModel._pushMessage));
            if (!masterViewModel.HasInternetConnection)
            {
              masterViewModel._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) masterViewModel, masterViewModel.ActiveProfile));
              throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MasterViewModel.cs", 279);
            }
            Profile profile = await masterViewModel._refreshDataService.RefreshProfileAsync(masterViewModel.ActiveProfile, true);
            masterViewModel.ActiveProfile = profile;
            masterViewModel._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) masterViewModel, masterViewModel.ActiveProfile));
            await masterViewModel._profileDataService.DefaultPushRegistration();
          }
          else
          {
            // ISSUE: reference to a compiler-generated method
            ((MvxMainThreadDispatchingObject) masterViewModel).InvokeOnMainThread(new Action(masterViewModel.\u003CInitializeApp\u003Eb__53_1), true);
          }
        }
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        masterViewModel.IsLoading = masterViewModel._settings.RefreshProfileInProgress = false;
        masterViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) masterViewModel, masterViewModel.IsLoading));
        MasterViewModel.initApp = true;
      }
    }

    private async Task ShowRootedDeviceAlert()
    {
      int num = await this._navigationService.Navigate<RootedDeviceViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private void InitProfile()
    {
      this.Busy();
      this._singleNavigation.ResetNavigationEnabled();
      this.ActiveProfile = this._profileDataService.GetActiveProfile();
      if (this.ActiveProfile != null)
      {
        try
        {
          this.Student = this._studentDataService.GetStudent(this.ActiveProfile) ?? new Student();
          this.Role = this.ActiveProfile.IsTutelary ? this._textProvider.GetText((string) null, (string) null, "ActiveProfile_Role_Tutelary") : this._textProvider.GetText((string) null, (string) null, "ActiveProfile_Role_Student");
          this.BuildMenu();
        }
        catch (Exception ex)
        {
        }
      }
      this.NotBusy();
    }

    private void ShowNewsItemToast(int count)
    {
      this.InitProfile();
      if (count == 0)
        return;
      ((MvxMainThreadDispatchingObject) this).InvokeOnMainThread((Action) (() => this._userDialogs.Toast(string.Format(this._textProvider.GetText((string) null, (string) null, "Common_NewsItem_Received"), (object) count), new TimeSpan?(TimeSpan.FromSeconds(2.0)))), true);
    }

    private void OpenUrl(string navigationUrl)
    {
      this._webNavigation.OpenUrl(navigationUrl);
    }

    private async Task ShowViewModelFromMaster(Type viewModelType)
    {
      int num = await this._navigationService.Navigate(viewModelType, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private void BuildMenu()
    {
      bool flag = this.Student?.Name != null;
      List<MenuItem> menuItemList = new List<MenuItem>()
      {
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_SzemelyesAdatlap.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_PersonalDataSheet_Title"),
          ViewModelType = typeof (PersonalDataSheetViewModel),
          ModelName = "PersonalDataSheet",
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_uzenetek.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Messages_Title"),
          ViewModelType = typeof (MessagesViewModel),
          ModelName = "Messages",
          IsEnabled = flag,
          NewItemsCount = this._uzenetDataService.GetNewItemCount(this.ActiveProfile)
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Ertekelesek.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Evaluations_Title"),
          ViewModelType = typeof (EvaluationsViewModel),
          ModelName = "Evaluations",
          NewItemsCount = this._evaluationDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Mulasztas.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Absences_Title"),
          ViewModelType = typeof (AbsencesViewModel),
          ModelName = "Absences",
          NewItemsCount = this._absenceDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Orarend.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Lessons_Title"),
          ViewModelType = typeof (LessonsViewModel),
          ModelName = "Lessons",
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Szamonkeresek.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Exams_Title"),
          ViewModelType = typeof (ExamsViewModel),
          ModelName = "Exams",
          NewItemsCount = this._examDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Feljegyzesek.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Notes_Title"),
          ViewModelType = typeof (NotesViewModel),
          ModelName = "Notes",
          NewItemsCount = this._noteDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Faliujsag.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Events_Title"),
          ViewModelType = typeof (EventsViewModel),
          ModelName = "Events",
          NewItemsCount = this._eventDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Hazi.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Homeworks_Title"),
          ViewModelType = typeof (HomeWorksViewModel),
          ModelName = "HomeWorks",
          NewItemsCount = this._lessonDataService.GetNewItemCount(this.ActiveProfile),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Statisztika.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Statistics_Title"),
          ViewModelType = typeof (StatisticsViewModel),
          IsEnabled = flag
        },
        new MenuItem()
        {
          IconUrl = "Ekreta.Mobile.Core.Images.menu_Settings.png",
          Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_Settings_Title"),
          ViewModelType = typeof (SettingsViewModel),
          IsEnabled = flag
        }
      };
      Student student = this.Student;
      bool? nullable1;
      if (student == null)
      {
        nullable1 = new bool?();
      }
      else
      {
        List<FormMaster> osztalyfonokok = student.Osztalyfonokok;
        nullable1 = osztalyfonokok != null ? new bool?(osztalyfonokok.Any<FormMaster>((Func<FormMaster, bool>) (x => x.Tanar.Alkalmazott.HasAnyPublicContact))) : new bool?();
      }
      bool? nullable2 = nullable1;
      menuItemList.Add(new MenuItem()
      {
        IconUrl = "Ekreta.Mobile.Core.Images.menu_Ofo.png",
        Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_FormTeacher_Title"),
        ViewModelType = typeof (FormTeacherViewModel),
        ModelName = "Teacher",
        IsEnabled = ((!nullable2.HasValue ? 0 : (nullable2.Value ? 1 : 0)) & (flag ? 1 : 0)) != 0
      });
      menuItemList.Add(new MenuItem()
      {
        IconUrl = "Ekreta.Mobile.Core.Images.menu_Gyik.png",
        Title = this._textProvider.GetText((string) null, (string) null, "MenuItem_GYIK_Title"),
        NavigationUrl = this._textProvider.GetText((string) null, (string) null, "FAQLink"),
        IsEnabled = flag
      });
      menuItemList.Add(new MenuItem()
      {
        IconUrl = "Ekreta.Mobile.Core.Images.menu_adatvedelem.png",
        Title = this._textProvider.GetText((string) null, (string) null, "Privacy_policy"),
        NavigationUrl = this._gdprLink,
        IsEnabled = flag
      });
      this.MenuItems = menuItemList;
    }

    private async Task RefreshProfile()
    {
      MasterViewModel masterViewModel = this;
      try
      {
        if (!masterViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MasterViewModel.cs", 507);
        masterViewModel.IsLoading = true;
        masterViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) masterViewModel, masterViewModel.IsLoading));
        masterViewModel._settings.RefreshProfileInProgress = true;
        // ISSUE: reference to a compiler-generated method
        await Task.Run(new Func<Task>(masterViewModel.\u003CRefreshProfile\u003Eb__60_0));
        masterViewModel._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) masterViewModel, masterViewModel.ActiveProfile));
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        masterViewModel.IsLoading = false;
        masterViewModel._settings.RefreshProfileInProgress = false;
        masterViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) masterViewModel, masterViewModel.IsLoading));
      }
    }

    private async Task SelectMenuItem(MenuItem menuItem)
    {
      MasterViewModel masterViewModel = this;
      if (!menuItem.IsEnabled)
        return;
      masterViewModel.HideSideBar();
      if (menuItem.ViewModelType != (Type) null)
      {
        masterViewModel.Busy();
        await masterViewModel.ShowViewModelFromMaster(menuItem.ViewModelType);
        masterViewModel.NotBusy();
      }
      else if (menuItem.NavigationUrl != null)
        masterViewModel.OpenUrl(menuItem.NavigationUrl);
      masterViewModel.SelectedMenuItem = (MenuItem) null;
    }

    private async Task ShowProfiles()
    {
      MasterViewModel masterViewModel = this;
      masterViewModel.Busy();
      masterViewModel.HideSideBar();
      await Task.Delay(100);
      int num = await masterViewModel._navigationService.Navigate<ProfilesViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      masterViewModel.NotBusy();
    }

    private async void ActiveProfileChangedMessageArrived()
    {
      MasterViewModel masterViewModel = this;
      masterViewModel.InitProfile();
      masterViewModel.Busy();
      List<Profile> allprofiles = masterViewModel._profileDataService.GetProfiles().ToList<Profile>();
      Credentials credentials = ((ICredentialsDataService) Mvx.get_IoCProvider().Resolve<ICredentialsDataService>()).GetAllCredentials().FirstOrDefault<Credentials>((Func<Credentials, bool>) (x => allprofiles.All<Profile>((Func<Profile, bool>) (ap => ap.Id != x.UserId))));
      if (credentials != null)
      {
        IMvxNavigationService navigationService = masterViewModel._navigationService;
        Profile profile = new Profile();
        profile.Id = credentials.UserId;
        CancellationToken cancellationToken = new CancellationToken();
        int num = await navigationService.Navigate<NewProfileViewModel, Profile>((M1) profile, (IMvxBundle) null, cancellationToken) ? 1 : 0;
      }
      masterViewModel.NotBusy();
    }
  }
}
