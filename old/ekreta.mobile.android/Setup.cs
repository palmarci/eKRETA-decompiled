// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Setup
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Acr.UserDialogs;
using Android.App;
using Ekreta.Mobile.Core;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Monitoring;
using eKreta.Mobile.Droid.Helpers;
using eKreta.Mobile.Droid.Platform;
using eKreta.Mobile.Droid.Platform.FirebaseAnalytics;
using eKreta.Mobile.Droid.Platform.PushNotification;
using ImageCircle.Forms.Plugin.Droid;
using MvvmCross;
using MvvmCross.Core;
using MvvmCross.Forms.Platforms.Android.Core;
using MvvmCross.Forms.Presenters;
using MvvmCross.Platforms.Android;
using MvvmCross.Platforms.Android.Core;
using MvvmCross.ViewModels;
using Plugin.DeviceInfo;
using Plugin.DeviceInfo.Abstractions;
using Plugin.Messaging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Security;
using System.Reflection;
using Xamarin.Forms;

namespace eKreta.Mobile.Droid
{
  public class Setup : MvxFormsAndroidSetup
  {
    public static bool IsRunning;

    public Setup()
    {
      base.\u002Ector();
    }

    public virtual IEnumerable<Assembly> GetViewModelAssemblies()
    {
      return ((MvxSetup) this).GetViewModelAssemblies().Union<Assembly>((IEnumerable<Assembly>) new Assembly[1]
      {
        Assembly.Load("Ekreta.Mobile.Core")
      });
    }

    protected virtual Application CreateFormsApplication()
    {
      return (Application) new FormsApp();
    }

    protected virtual IMvxFormsPagePresenter CreateFormsPagePresenter(
      IMvxFormsViewPresenter viewPresenter)
    {
      IMvxFormsPagePresenter formsPagePresenter = base.CreateFormsPagePresenter(viewPresenter);
      Mvx.get_IoCProvider().RegisterSingleton<IMvxFormsPagePresenter>((M0) formsPagePresenter);
      return formsPagePresenter;
    }

    protected virtual IMvxApplication CreateApp()
    {
      return (IMvxApplication) new Ekreta.Mobile.Core.App();
    }

    protected virtual void InitializeFirstChance()
    {
      ((MvxSetup) this).InitializeFirstChance();
      MvvmCrossHelper.IsRunning = true;
      Mvx.get_IoCProvider().RegisterType<IDeviceSpecification, DeviceSpecification>();
      Mvx.get_IoCProvider().RegisterType<IPushNotificationPlatformSpecificService, PushNotificationPlatformSpecificService>();
      Mvx.get_IoCProvider().RegisterSingleton<IMessaging>((Func<M0>) (() => CrossMessaging.get_Current()));
      Mvx.get_IoCProvider().RegisterSingleton<IDeviceInfo>((Func<M0>) (() => CrossDeviceInfo.get_Current()));
      Mvx.get_IoCProvider().RegisterType<IFirebaseAnalytics, eKreta.Mobile.Droid.Platform.FirebaseAnalytics.FirebaseAnalytics>();
      Mvx.get_IoCProvider().RegisterType<IFirebaseRemoteConfigurationService, FirebaseRemoteConfigurationService>();
      Mvx.get_IoCProvider().RegisterSingleton<IUserDialogs>((Func<M0>) (() => Acr.UserDialogs.UserDialogs.get_Instance()));
      Acr.UserDialogs.UserDialogs.Init((Func<Activity>) (() => ((IMvxAndroidCurrentTopActivity) Mvx.get_IoCProvider().Resolve<IMvxAndroidCurrentTopActivity>()).get_Activity()));
      ImageCircleRenderer.Init();
      ServicePointManager.ServerCertificateValidationCallback += (RemoteCertificateValidationCallback) ((sender, certificate, chain, sslPolicyErrors) => true);
      AppDomain.CurrentDomain.UnhandledException += new UnhandledExceptionEventHandler(this.CurrentDomain_UnhandledException);
    }

    protected virtual void InitializeLastChance()
    {
      ((MvxAndroidSetup) this).InitializeLastChance();
      MvvmCrossHelper.IsRunning = false;
    }

    private void CurrentDomain_UnhandledException(object sender, UnhandledExceptionEventArgs e)
    {
      CrossMobileAnalytics.Current.TrackException((Exception) e.ExceptionObject, (IDictionary<string, string>) null, nameof (CurrentDomain_UnhandledException), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/Setup.cs", 102);
    }
  }
}
