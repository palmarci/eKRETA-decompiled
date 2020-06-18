// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.SettingsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross.Base;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class SettingsViewModel : ViewModelBase
  {
    private readonly IMvxMessenger _messenger;
    private readonly ISettingsDbDataService _settingsDataService;
    private IPushNotificationPlatformSpecificService _pushNotificationPlatformSpecificService;
    private bool _isPushNotificationDisabledByDevice;

    public SettingsViewModel(
      IMvxMessenger messenger,
      ISettingsDbDataService settingsDataService,
      IPushNotificationPlatformSpecificService pushNotificationPlatformSpecificService)
    {
      this._messenger = messenger;
      this._settingsDataService = settingsDataService;
      this._pushNotificationPlatformSpecificService = pushNotificationPlatformSpecificService;
    }

    public bool IsPushNotificationDisabledByDevice
    {
      get
      {
        return this._isPushNotificationDisabledByDevice;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isPushNotificationDisabledByDevice, (M0) (value ? 1 : 0), nameof (IsPushNotificationDisabledByDevice));
      }
    }

    public bool IsPushNotificationEnabled
    {
      get
      {
        PushSettings pushSettings = this.ActiveProfile.PushSettings;
        return pushSettings != null && pushSettings.IsPushActive;
      }
      set
      {
        if (this.IsLoading)
          return;
        this.CallPushNotificationService(value);
      }
    }

    public int DashboardDayRange
    {
      get
      {
        return this._settingsDataService.GetDashboardDayRange();
      }
      set
      {
        this._messenger.Publish<DashboardDayChanged>((M0) new DashboardDayChanged((object) this, value));
        this._settingsDataService.SetDashboardDayRange(value);
      }
    }

    public async void CallPushNotificationService(bool subscribe)
    {
      SettingsViewModel settingsViewModel = this;
      string toastTitle;
      try
      {
        settingsViewModel.Busy();
        int num;
        try
        {
          TaskAwaiter<bool> taskAwaiter;
          if (subscribe)
          {
            TaskAwaiter<bool> awaiter = settingsViewModel._profileDataService.NotificationRegistrationAsync(settingsViewModel.ActiveProfile).GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 0;
              taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<bool>, SettingsViewModel.\u003CCallPushNotificationService\u003Ed__14>(ref awaiter, this);
              return;
            }
            toastTitle = awaiter.GetResult() ? settingsViewModel._textProvider.GetText((string) null, (string) null, "Settings_Push_Registration_Success") : settingsViewModel._textProvider.GetText((string) null, (string) null, "Settings_Push_Registration_Failed");
          }
          else
          {
            TaskAwaiter<bool> awaiter = settingsViewModel._profileDataService.NotificationDeleteAsync(settingsViewModel.ActiveProfile, false).GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 1;
              taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<bool>, SettingsViewModel.\u003CCallPushNotificationService\u003Ed__14>(ref awaiter, this);
              return;
            }
            toastTitle = awaiter.GetResult() ? settingsViewModel._textProvider.GetText((string) null, (string) null, "Settings_Push_Delete_Success") : settingsViewModel._textProvider.GetText((string) null, (string) null, "Settings_Push_Delete_Failed");
          }
        }
        catch (DisabledPushByDeviceException ex)
        {
          ex.SetErrorCode<DisabledPushByDeviceException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/SettingsViewModel.cs", 79);
          ErrorHandler.Current.HandleError((Exception) ex);
          toastTitle = settingsViewModel._textProvider.GetText((string) null, (string) null, "Push_NeedEnable");
        }
        ((MvxNotifyPropertyChanged) settingsViewModel).RaisePropertyChanged("IsPushNotificationEnabled");
        TaskAwaiter awaiter1 = Task.Delay(200).GetAwaiter();
        if (!awaiter1.IsCompleted)
        {
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 2;
          TaskAwaiter taskAwaiter = awaiter1;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, SettingsViewModel.\u003CCallPushNotificationService\u003Ed__14>(ref awaiter1, this);
          return;
        }
        awaiter1.GetResult();
        WeakReference weakTitle = new WeakReference((object) toastTitle);
        ((MvxMainThreadDispatchingObject) settingsViewModel).InvokeOnMainThread((Action) (() =>
        {
          if (!weakTitle.IsAlive)
            return;
          this._userDialogs.Toast(weakTitle.Target as string, new TimeSpan?(TimeSpan.FromSeconds(3.0)));
        }), true);
        settingsViewModel.NotBusy();
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        toastTitle = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      toastTitle = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult();
    }

    public override void Start()
    {
      base.Start();
      this.ActiveProfile = this._profileDataService.GetActiveProfile();
      this.Busy();
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.IsPushNotificationDisabledByDevice = !this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice();
      this.NotBusy();
    }
  }
}
