// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.ViewModelBase`2
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Acr.UserDialogs;
using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Forms.Presenters;
using MvvmCross.Localization;
using MvvmCross.Navigation;
using MvvmCross.ViewModels;
using Plugin.Connectivity.Abstractions;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.ViewModels
{
  public abstract class ViewModelBase<T, TR> : MvxViewModel<T, TR>, IModalViewModel
    where T : class
    where TR : class
  {
    protected readonly IApplicationSettings _settings;
    protected readonly IMvxNavigationService _navigationService;
    protected readonly IUserDialogs _userDialogs;
    protected readonly IModalDialog _modalDialog;
    protected readonly IConnectivity _connectivity;
    protected readonly ISingleNavigation _singleNavigation;
    protected readonly IProfileDataService _profileDataService;
    protected readonly IProfileDbDataService _profileDbDataService;
    protected readonly IMvxFormsViewPresenter _formsViewPresenter;
    protected IMvxTextProvider _textProvider;
    private bool _executeNavigationCommand;
    private bool _isLoading;
    private bool _isModal;
    private bool _isForeground;
    private Ekreta.Mobile.Core.Models.Profile _activeProfile;
    private ProfileRealm _activeProfileRealm;
    private string _title;
    private string _titleIncludeConnectivityState;

    protected ViewModelBase()
    {
      base.\u002Ector();
      this._settings = (IApplicationSettings) Mvx.get_IoCProvider().Resolve<IApplicationSettings>();
      this._navigationService = (IMvxNavigationService) Mvx.get_IoCProvider().Resolve<IMvxNavigationService>();
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
      this._userDialogs = (IUserDialogs) Mvx.get_IoCProvider().Resolve<IUserDialogs>();
      this._modalDialog = (IModalDialog) Mvx.get_IoCProvider().Resolve<IModalDialog>();
      this._connectivity = (IConnectivity) Mvx.get_IoCProvider().Resolve<IConnectivity>();
      this._singleNavigation = (ISingleNavigation) Mvx.get_IoCProvider().Resolve<ISingleNavigation>();
      this._profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      this._profileDbDataService = (IProfileDbDataService) Mvx.get_IoCProvider().Resolve<IProfileDbDataService>();
      this._formsViewPresenter = (IMvxFormsViewPresenter) Mvx.get_IoCProvider().Resolve<IMvxFormsViewPresenter>();
    }

    public string TitleIncludeConnectivityState
    {
      get
      {
        return this._titleIncludeConnectivityState;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._titleIncludeConnectivityState, (M0) value, nameof (TitleIncludeConnectivityState));
      }
    }

    public string Title
    {
      get
      {
        return this._title;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._title, (M0) value, nameof (Title)))
          return;
        this.SetTitleIncludeConnectivityState(value);
      }
    }

    public bool ExecuteNavigationCommand
    {
      get
      {
        return this._executeNavigationCommand;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._executeNavigationCommand, (M0) (value ? 1 : 0), nameof (ExecuteNavigationCommand));
      }
    }

    public bool HasInternetConnection
    {
      get
      {
        return this._connectivity.get_IsConnected();
      }
    }

    public bool IsLoading
    {
      get
      {
        return this._isLoading;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isLoading, (M0) (value ? 1 : 0), nameof (IsLoading));
      }
    }

    public Ekreta.Mobile.Core.Models.Profile ActiveProfile
    {
      get
      {
        return this._activeProfile;
      }
      protected set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<Ekreta.Mobile.Core.Models.Profile>((M0&) ref this._activeProfile, (M0) value, nameof (ActiveProfile));
      }
    }

    public ProfileRealm ActiveProfileRealm
    {
      get
      {
        return this._activeProfileRealm;
      }
      protected set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ProfileRealm>((M0&) ref this._activeProfileRealm, (M0) value, nameof (ActiveProfileRealm));
      }
    }

    public bool IsModal
    {
      get
      {
        return this._isModal;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isModal, (M0) (value ? 1 : 0), nameof (IsModal));
      }
    }

    public bool IsForeground
    {
      get
      {
        return this._isForeground;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isForeground, (M0) (value ? 1 : 0), nameof (IsForeground));
      }
    }

    protected IApplicationSettings Settings
    {
      get
      {
        return this._settings;
      }
    }

    public virtual void Prepare()
    {
      ((MvxViewModel) this).Prepare();
      try
      {
        this.ActiveProfile = this._profileDataService.GetActiveProfile();
        this.ActiveProfileRealm = this._profileDbDataService.GetActiveProfile();
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Prepare), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ViewModelBase.cs", 133);
        this.ActiveProfile = (Ekreta.Mobile.Core.Models.Profile) null;
      }
    }

    public virtual void ViewAppearing()
    {
      ((MvxViewModel) this).ViewAppearing();
      this._singleNavigation.ResetNavigationEnabled();
    }

    public virtual void ViewAppeared()
    {
      ((MvxViewModel) this).ViewAppeared();
      // ISSUE: method pointer
      this._connectivity.add_ConnectivityChanged(new ConnectivityChangedEventHandler((object) this, __methodptr(ConnectivityChanged)));
      this.IsForeground = true;
      ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("HasInternetConnection");
    }

    public virtual void ViewDisappearing()
    {
      ((MvxViewModel) this).ViewDisappearing();
      // ISSUE: method pointer
      this._connectivity.remove_ConnectivityChanged(new ConnectivityChangedEventHandler((object) this, __methodptr(ConnectivityChanged)));
      this.IsForeground = false;
    }

    protected bool CheckAndHandleNoInternetConnection()
    {
      try
      {
        if (!this.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ViewModelBase.cs", 169);
        return false;
      }
      catch (NoInternetConnectionException ex)
      {
        ex.SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ViewModelBase.cs", 176);
        ErrorHandler.Current.HandleError((Exception) ex);
        return true;
      }
    }

    protected void ConnectivityChanged(object sender, ConnectivityChangedEventArgs e)
    {
      if (this.IsForeground)
      {
        ((MvxMainThreadDispatchingObject) this).InvokeOnMainThread((Action) (() => this._userDialogs.Toast(e.get_IsConnected() ? this._textProvider.GetText((string) null, (string) null, "InternetConnectionEnabled_Title") : this._textProvider.GetText((string) null, (string) null, "InternetConnectionDisabled_Title"), new TimeSpan?(TimeSpan.FromSeconds(2.0)))), true);
        ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("HasInternetConnection");
        this.SetTitleIncludeConnectivityState(this.Title);
      }
      this.OnConnectivityChanged(e.get_IsConnected());
    }

    protected virtual void OnConnectivityChanged(bool isConnectedToInternet)
    {
    }

    protected async Task NavigateToRootPage()
    {
      MasterDetailPage masterDetailPage = this._formsViewPresenter.get_FormsApplication().get_MainPage() as MasterDetailPage;
      if (masterDetailPage == null)
        return;
      Device.BeginInvokeOnMainThread((Action) (async () => await ((NavigableElement) masterDetailPage?.get_Detail())?.get_Navigation()?.PopToRootAsync()));
    }

    protected void HideSideBar()
    {
      MasterDetailPage masterDetailPage = this._formsViewPresenter.get_FormsApplication().get_MainPage() as MasterDetailPage;
      if (masterDetailPage == null)
        return;
      ((MvxMainThreadDispatchingObject) this).InvokeOnMainThread((Action) (() => masterDetailPage.set_IsPresented(false)), true);
    }

    protected void Busy()
    {
      this.IsLoading = true;
    }

    protected void NotBusy()
    {
      this.IsLoading = false;
    }

    protected void SetTitle(string resourceKey)
    {
      this.Title = this._textProvider.GetText((string) null, (string) null, resourceKey);
    }

    private void SetTitleIncludeConnectivityState(string value)
    {
      string text = this._textProvider.GetText((string) null, (string) null, "Text_Offline");
      this.TitleIncludeConnectivityState = !this.HasInternetConnection ? value + " " + text : value;
    }
  }
}
