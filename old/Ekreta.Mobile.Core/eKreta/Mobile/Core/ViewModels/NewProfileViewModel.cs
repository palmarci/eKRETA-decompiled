// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.NewProfileViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Acr.UserDialogs;
using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.Navigation;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class NewProfileViewModel : ViewModelBase<Profile>
  {
    private bool _saveMyPassword = true;
    private readonly IAuthDataService _authDataService;
    private readonly IRefreshDataService _refreshDataService;
    private readonly IMvxMessenger _messenger;
    private readonly IWebNavigation _webNavigation;
    private readonly IAppVersionService _appVersionService;
    private readonly IPlatformStyleProvider _platformStyleProvider;
    private readonly ICredentialsDataService _credentialsDataService;
    private bool _shouldPopViewModel;
    private bool _isReLogin;
    private string _userName;
    private string _password;
    private bool _isProfileSaved;
    private Institute _selectedInstitute;
    private MvxAsyncCommand _saveCommand;
    private MvxCommand _selectInstituteCommand;
    private MvxAsyncCommand _openGdprCommand;
    private MvxCommand _openFaqCommand;
    private MvxAsyncCommand _deleteProfileCommand;
    private MvxSubscriptionToken _selectedInstituteToken;

    public NewProfileViewModel(
      IMvxMessenger messenger,
      IWebNavigation webNavigation,
      IAppVersionService appVersionService,
      IRefreshDataService refreshDataService,
      IAuthDataService authDataService,
      IPlatformStyleProvider platformStyleProvider,
      ICredentialsDataService credentialsDataService)
    {
      this._messenger = messenger;
      this._webNavigation = webNavigation;
      this._appVersionService = appVersionService;
      this._refreshDataService = refreshDataService;
      this._platformStyleProvider = platformStyleProvider;
      this._credentialsDataService = credentialsDataService;
      this._authDataService = authDataService;
    }

    public bool IsProfileSaved
    {
      get
      {
        return this._isProfileSaved;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isProfileSaved, (M0) (value ? 1 : 0), nameof (IsProfileSaved));
      }
    }

    public bool ShouldPopViewModel
    {
      get
      {
        return this._shouldPopViewModel;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._shouldPopViewModel, (M0) (value ? 1 : 0), nameof (ShouldPopViewModel));
      }
    }

    public bool IsReLogin
    {
      get
      {
        return this._isReLogin;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isReLogin, (M0) (value ? 1 : 0), nameof (IsReLogin));
      }
    }

    public string UserName
    {
      get
      {
        return this._userName;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._userName, (M0) value, nameof (UserName));
      }
    }

    public string Password
    {
      get
      {
        return this._password;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._password, (M0) value, nameof (Password));
      }
    }

    public string AppVersion
    {
      get
      {
        return this._appVersionService.GetAppVersionDisplayText();
      }
    }

    public Institute SelectedInstitute
    {
      get
      {
        return this._selectedInstitute;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<Institute>((M0&) ref this._selectedInstitute, (M0) value, nameof (SelectedInstitute));
        ((MvxCommandBase) this.LoginCommand)?.RaiseCanExecuteChanged();
      }
    }

    public bool SaveMyPassword
    {
      get
      {
        return this._saveMyPassword;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._saveMyPassword, (M0) (value ? 1 : 0), nameof (SaveMyPassword));
      }
    }

    public MvxAsyncCommand LoginCommand
    {
      get
      {
        return this._saveCommand ?? (this._saveCommand = new MvxAsyncCommand(new Func<Task>(this.SaveProfile), new Func<bool>(this.CanSaveProfile), false));
      }
    }

    public MvxAsyncCommand DeleteProfileCommand
    {
      get
      {
        return this._deleteProfileCommand ?? (this._deleteProfileCommand = new MvxAsyncCommand(new Func<Task>(this.DeleteProfile), (Func<bool>) null, false));
      }
    }

    public MvxCommand SelectInstituteCommand
    {
      get
      {
        return this._selectInstituteCommand ?? (this._selectInstituteCommand = new MvxCommand(new Action(this.SelectInstitute), new Func<bool>(this._singleNavigation.CanExecuteNavigationCommand)));
      }
    }

    public MvxCommand OpenFAQCommand
    {
      get
      {
        return this._openFaqCommand ?? (this._openFaqCommand = new MvxCommand(new Action(this.ExecuteOpenFAQCommand)));
      }
    }

    public MvxAsyncCommand OpenGDPRCommand
    {
      get
      {
        return this._openGdprCommand ?? (this._openGdprCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteOpenGPRCommand), (Func<bool>) null, false));
      }
    }

    public async Task DeleteProfile()
    {
      NewProfileViewModel profileViewModel = this;
      string text1 = profileViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Profile_Message");
      string str = profileViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Profile_Title") + " - " + profileViewModel.UserName;
      string text2 = profileViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Confirm");
      string text3 = profileViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Cancel");
      ConfirmConfig confirmConfig1 = new ConfirmConfig();
      confirmConfig1.set_Message(text1);
      confirmConfig1.set_Title(str);
      confirmConfig1.set_OkText(text2);
      confirmConfig1.set_CancelText(text3);
      ConfirmConfig confirmConfig2 = confirmConfig1;
      if (profileViewModel._platformStyleProvider.DeleteConfirmationStyle != -1)
        confirmConfig2.set_AndroidStyleId(new int?(profileViewModel._platformStyleProvider.DeleteConfirmationStyle));
      if (!await profileViewModel._userDialogs.ConfirmAsync(confirmConfig2, new CancellationToken?()))
        return;
      profileViewModel.Busy();
      profileViewModel.DeleteProfileByCredential(profileViewModel._credentialsDataService);
      profileViewModel._credentialsDataService.DeleteCredential(profileViewModel.UserName, profileViewModel.Password);
      profileViewModel.SelectAnotherProfileForActiveProfile();
      profileViewModel.NotBusy();
    }

    public virtual void Prepare(Profile parameter)
    {
      this.PrepareViewModelByProfile(parameter);
    }

    protected virtual void NavigateToDashboard()
    {
      this.ShouldPopViewModel = true;
    }

    private async void SelectInstitute()
    {
      NewProfileViewModel profileViewModel = this;
      profileViewModel._singleNavigation.DisableNavigation();
      profileViewModel._selectedInstituteToken = profileViewModel._messenger.Subscribe<SelectedInstituteMessage>((Action<M0>) new Action<SelectedInstituteMessage>(profileViewModel.SelectedInstituteMessageArrived), (MvxReference) 1, (string) null);
      int num = await profileViewModel._navigationService.Navigate<InstitutePickerViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private void SelectedInstituteMessageArrived(SelectedInstituteMessage message)
    {
      this.SelectedInstitute = message.Institute;
      this._selectedInstituteToken?.Dispose();
    }

    private bool CanSaveProfile()
    {
      return !string.IsNullOrEmpty(this.UserName) && !string.IsNullOrEmpty(this.Password) && this.SelectedInstitute != null;
    }

    private async Task SaveProfile()
    {
      NewProfileViewModel profileViewModel = this;
      if (profileViewModel.CheckAndHandleNoInternetConnection())
        return;
      try
      {
        profileViewModel.IsLoading = true;
        // ISSUE: reference to a compiler-generated method
        await Task.Run(new Func<Task>(profileViewModel.\u003CSaveProfile\u003Eb__60_0));
      }
      catch (HttpRequestException ex)
      {
        ErrorHandler.Current.HandleError((Exception) new HttpRequestExceptionDecorator(ex).SetErrorCode<HttpRequestExceptionDecorator>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/NewProfileViewModel.cs", 229));
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        profileViewModel.IsLoading = profileViewModel._settings.RefreshProfileInProgress = false;
      }
    }

    private void SelectAnotherProfileForActiveProfile()
    {
      List<Profile> list = this._profileDataService.GetProfiles().ToList<Profile>();
      Credentials credentials = this._credentialsDataService.GetAllCredentials().FirstOrDefault<Credentials>();
      if (list.Any<Profile>())
      {
        Profile profile = list.First<Profile>();
        this._profileDataService.SetActiveProfile(profile);
        this._navigationService.Close((IMvxViewModel) this, new CancellationToken());
        this._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) this, profile));
      }
      else if (credentials != null)
      {
        IMvxNavigationService navigationService = this._navigationService;
        Profile profile = new Profile();
        profile.Id = credentials.UserId;
        CancellationToken cancellationToken = new CancellationToken();
        navigationService.Navigate<LoginViewModel, Profile>((M1) profile, (IMvxBundle) null, cancellationToken);
      }
      else
        this._navigationService.Navigate<LoginViewModel>((IMvxBundle) null, new CancellationToken());
    }

    private void DeleteProfileByCredential(ICredentialsDataService credentialsDataService)
    {
      if (this.ActiveProfile == null || !this.ActiveProfile.Id.Equals(credentialsDataService.GetCredentialProfileId(this.UserName, this.Password)))
        return;
      this._profileDataService.Delete(this.ActiveProfile);
    }

    private void OpenUrl(string url)
    {
      this._webNavigation.OpenUrl(url);
    }

    private async void PrepareViewModelByProfile(Profile parameter)
    {
      NewProfileViewModel profileViewModel = this;
      profileViewModel.Busy();
      if (parameter != null)
      {
        profileViewModel.IsProfileSaved = true;
        profileViewModel.IsReLogin = true;
        Credentials savedCredentials = profileViewModel._credentialsDataService.GetCredentials(parameter.Id);
        IInstituteDataService instituteDataService = (IInstituteDataService) Mvx.get_IoCProvider().Resolve<IInstituteDataService>();
        List<Institute> list = instituteDataService.GetInstitutes().ToList<Institute>();
        if (!list.Any<Institute>())
          list = (await instituteDataService.FetchInstitutesAsync()).ToList<Institute>();
        profileViewModel.SelectedInstitute = list.FirstOrDefault<Institute>((Func<Institute, bool>) (x => x.InstituteId == savedCredentials?.InstitudeId));
        profileViewModel.Password = savedCredentials?.Password;
        profileViewModel.UserName = savedCredentials?.UserName;
      }
      else
        profileViewModel.IsProfileSaved = false;
      profileViewModel.NotBusy();
    }

    private async Task ExecuteOpenGPRCommand()
    {
      NewProfileViewModel profileViewModel = this;
      if (profileViewModel._connectivity.get_IsConnected())
      {
        string result = profileViewModel._appVersionService.GDPRLink().GetAwaiter().GetResult();
        profileViewModel.OpenUrl(result);
      }
      else
      {
        int num = await profileViewModel._modalDialog.DisplayAlertAsync(profileViewModel._textProvider.GetText((string) null, (string) null, "GDPR_Connection_Error_Message"), profileViewModel._textProvider.GetText((string) null, (string) null, "GDPR_Connection_Error_Title"), "OK", (string) null) ? 1 : 0;
      }
    }

    private void ExecuteOpenFAQCommand()
    {
      this.OpenUrl(this._textProvider.GetText((string) null, (string) null, "FAQLink"));
    }
  }
}
