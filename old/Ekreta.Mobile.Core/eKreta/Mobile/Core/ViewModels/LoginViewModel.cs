// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.LoginViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using Plugin.Connectivity.Abstractions;
using System.Threading;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class LoginViewModel : NewProfileViewModel
  {
    public LoginViewModel(
      IMvxMessenger messenger,
      IWebNavigation webNavigation,
      IAppVersionService appVersionService,
      IRefreshDataService refreshDataService,
      IAuthDataService authDataService,
      IPlatformStyleProvider platformStyleProvider,
      ICredentialsDataService credentialsDataService)
      : base(messenger, webNavigation, appVersionService, refreshDataService, authDataService, platformStyleProvider, credentialsDataService)
    {
    }

    public override void ViewDisappearing()
    {
      // ISSUE: method pointer
      this._connectivity.remove_ConnectivityChanged(new ConnectivityChangedEventHandler((object) this, __methodptr(ConnectivityChanged)));
      this.IsForeground = false;
    }

    public override void ViewAppearing()
    {
      this._singleNavigation.ResetNavigationEnabled();
    }

    protected override void NavigateToDashboard()
    {
      this._navigationService.Navigate<MasterViewModel>((IMvxBundle) null, new CancellationToken());
      this._navigationService.Navigate<RootContentViewModel>((IMvxBundle) null, new CancellationToken());
    }
  }
}
