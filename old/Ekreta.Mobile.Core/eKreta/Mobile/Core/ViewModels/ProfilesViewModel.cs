// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.ProfilesViewModel
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
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class ProfilesViewModel : ViewModelBase
  {
    private ObservableCollection<Profile> _profiles = new ObservableCollection<Profile>();
    private readonly IMvxMessenger _messenger;
    private readonly IPlatformStyleProvider _platformStyleProvider;
    private readonly IRefreshDataService _refreshDataService;
    private readonly IStudentDataService _studentDataService;
    private readonly IAuthDataService _authDataService;
    private bool _shouldPopViewModel;
    private Profile _selectedItem;
    private MvxAsyncCommand _newProfileCommand;
    private MvxAsyncCommand<Profile> _profileSelectedCommand;
    private MvxAsyncCommand<Profile> _profileDeleteCommand;
    private int _profileNewItemsCount;

    public ProfilesViewModel(
      IMvxMessenger messenger,
      IPlatformStyleProvider platformStyleProvider,
      IRefreshDataService refreshDataService,
      IStudentDataService studentDataService,
      IAuthDataService authDataService)
    {
      this._messenger = messenger;
      this._platformStyleProvider = platformStyleProvider;
      this._refreshDataService = refreshDataService;
      this._studentDataService = studentDataService;
      this._authDataService = authDataService;
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

    public Profile SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<Profile>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ProfileSelectedCommand.Execute(value);
      }
    }

    public MvxAsyncCommand NewProfileCommand
    {
      get
      {
        return this._newProfileCommand ?? (this._newProfileCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteNewProfileCommand), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand<Profile> ProfileSelectedCommand
    {
      get
      {
        return this._profileSelectedCommand ?? (this._profileSelectedCommand = new MvxAsyncCommand<Profile>(new Func<Profile, Task>(this.ProfileSelected), (Func<Profile, bool>) null, false));
      }
    }

    public MvxAsyncCommand<Profile> ProfileDeleteCommand
    {
      get
      {
        return this._profileDeleteCommand ?? (this._profileDeleteCommand = new MvxAsyncCommand<Profile>(new Func<Profile, Task>(this.DeleteProfile), (Func<Profile, bool>) null, false));
      }
    }

    public int ProfileNewItemsCount
    {
      get
      {
        return this._profileNewItemsCount;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<int>((M0&) ref this._profileNewItemsCount, (M0) value, nameof (ProfileNewItemsCount));
      }
    }

    public ObservableCollection<Profile> Profiles
    {
      get
      {
        return this._profiles;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ObservableCollection<Profile>>((M0&) ref this._profiles, (M0) value, nameof (Profiles));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<ProfileSyncMessage>((Action<M0>) (x => this.IsLoading = x.IsLoading), (MvxReference) 1, (string) null);
    }

    public override void ViewAppearing()
    {
      base.ViewAppearing();
      this.GetProfiles();
    }

    private bool SetFirstProfileActive()
    {
      Profile profile = this._profileDataService.GetProfiles().FirstOrDefault<Profile>();
      if (profile == null)
        return false;
      this._profileDataService.SetActiveProfile(profile);
      return true;
    }

    private async void RefreshProfile(Profile profile)
    {
      await Task.Run((Func<Task>) (async () =>
      {
        try
        {
          if (!this.HasInternetConnection)
            throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ProfilesViewModel.cs", 122);
          this.IsLoading = this._settings.RefreshProfileInProgress = true;
          this._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) this, this.IsLoading));
          Profile activeProfile = (Profile) null;
          await Task.Run((Func<Task>) (async () => activeProfile = await this._refreshDataService.RefreshProfileAsync(profile, false)));
          this.ActiveProfile = activeProfile;
          this._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) this, this.ActiveProfile));
        }
        catch (Exception ex)
        {
          ErrorHandler.Current.HandleError(ex);
        }
        finally
        {
          this.IsLoading = this._settings.RefreshProfileInProgress = false;
          this._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) this, this.IsLoading));
        }
      }));
    }

    private async Task DeleteProfile(Profile profile)
    {
      ProfilesViewModel profilesViewModel = this;
      if (profile == null)
        return;
      string text1 = profilesViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Profile_Message");
      string str = profilesViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Profile_Title") + " - " + profile.Student?.Name;
      string text2 = profilesViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Confirm");
      string text3 = profilesViewModel._textProvider.GetText((string) null, (string) null, "Common_Delete_Cancel");
      ConfirmConfig confirmConfig1 = new ConfirmConfig();
      confirmConfig1.set_Message(text1);
      confirmConfig1.set_Title(str);
      confirmConfig1.set_OkText(text2);
      confirmConfig1.set_CancelText(text3);
      ConfirmConfig confirmConfig2 = confirmConfig1;
      if (profilesViewModel._platformStyleProvider.DeleteConfirmationStyle != -1)
        confirmConfig2.set_AndroidStyleId(new int?(profilesViewModel._platformStyleProvider.DeleteConfirmationStyle));
      if (!await profilesViewModel._userDialogs.ConfirmAsync(confirmConfig2, new CancellationToken?()))
        return;
      try
      {
        profilesViewModel.IsLoading = profilesViewModel._settings.RefreshProfileInProgress = true;
        profilesViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) profilesViewModel, profilesViewModel.IsLoading));
        try
        {
          if (profile.PushSettings.IsPushActive)
          {
            int num = await profilesViewModel._profileDataService.NotificationDeleteAsync(profile, false).ConfigureAwait(false) ? 1 : 0;
          }
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "ProfileDeleteCommand || NotificationDeleteAsync", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ProfilesViewModel.cs", 149);
        }
        profilesViewModel._authDataService.DeleteProfile(profile);
        if (!profilesViewModel.SetFirstProfileActive())
        {
          int num1 = await profilesViewModel._navigationService.Navigate<LoginViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
        }
        profilesViewModel._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) profilesViewModel, profile));
        profilesViewModel.SelectedItem = (Profile) null;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "ProfileDeleteCommand || " + ex.Source, "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ProfilesViewModel.cs", 163);
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        profilesViewModel.IsLoading = profilesViewModel._settings.RefreshProfileInProgress = false;
        profilesViewModel._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) profilesViewModel, profilesViewModel.IsLoading));
      }
      profilesViewModel.GetProfiles();
    }

    private async void GetProfiles()
    {
      ProfilesViewModel profilesViewModel = this;
      try
      {
        profilesViewModel.Busy();
        List<Profile> profiles = (List<Profile>) null;
        TaskAwaiter awaiter = Task.Run((Action) (() =>
        {
          profiles = this._profileDataService.GetProfiles().ToList<Profile>();
          List<Student> list = this._studentDataService.GetStudents().ToList<Student>();
          foreach (Profile profile1 in profiles)
          {
            Profile profile = profile1;
            profile.Student = list.FirstOrDefault<Student>((Func<Student, bool>) (x => x.ProfileId == profile.RolelessId)) ?? new Student();
            profile.NewItemsCount = this._refreshDataService.GetProfileNewsItemCount(profile);
          }
        })).GetAwaiter();
        if (!awaiter.IsCompleted)
        {
          int num;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 0;
          TaskAwaiter taskAwaiter = awaiter;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, ProfilesViewModel.\u003CGetProfiles\u003Ed__36>(ref awaiter, this);
          return;
        }
        awaiter.GetResult();
        profilesViewModel.Profiles = new ObservableCollection<Profile>((IEnumerable<Profile>) profiles.OrderBy<Profile, string>((Func<Profile, string>) (x => x.Student?.Name)));
        profilesViewModel.NotBusy();
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

    private async Task ProfileSelected(Profile p)
    {
      ProfilesViewModel profilesViewModel = this;
      if (profilesViewModel._settings.RefreshProfileInProgress)
        return;
      await Task.Run((Action) (() =>
      {
        try
        {
          this.IsLoading = this._settings.RefreshProfileInProgress = true;
          this._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) this, this.IsLoading));
          this._profileDataService.SetActiveProfile(p);
          this._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) this, p));
          this.GetProfiles();
          this.RefreshProfile(p);
        }
        catch (Exception ex)
        {
          ErrorHandler.Current.HandleError(ex);
        }
        finally
        {
          this.IsLoading = this._settings.RefreshProfileInProgress = false;
          this._messenger.Publish<ProfileSyncMessage>((M0) new ProfileSyncMessage((object) this, this.IsLoading));
        }
      }));
      profilesViewModel.ShouldPopViewModel = true;
    }

    private async Task ExecuteNewProfileCommand()
    {
      ProfilesViewModel profilesViewModel = this;
      if (profilesViewModel._settings.RefreshProfileInProgress)
        return;
      int num = await profilesViewModel._navigationService.Navigate<NewProfileViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }
  }
}
