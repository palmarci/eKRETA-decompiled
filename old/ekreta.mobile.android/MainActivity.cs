// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.MainActivity
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.OS;
using Android.Runtime;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.ViewModels;
using eKreta.Mobile.Droid.Platform;
using eKreta.Mobile.Droid.Platform.Monitoring;
using eKreta.Mobile.Droid.Platform.PushNotification;
using FFImageLoading.Forms.Droid;
using MvvmCross;
using MvvmCross.Forms.Platforms.Android.Views;
using MvvmCross.Forms.Presenters;
using MvvmCross.ViewModels;
using Plugin.CurrentActivity;
using Rg.Plugins.Popup.Services;
using System;
using System.Collections.Generic;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid
{
  [IntentFilter(new string[] {"android.intent.action.VIEW"}, Categories = new string[] {"android.intent.category.DEFAULT", "android.intent.category.BROWSABLE"}, DataScheme = "ekreta")]
  [Activity]
  public class MainActivity : MvxFormsAppCompatActivity
  {
    public static MainActivity instance;
    private const string PushMessageExtra = "pushMessageExtra";
    private PushMessage _pushMessage;

    public virtual void OnLowMemory()
    {
      ((Activity) this).OnLowMemory();
      CrossMobileAnalytics.Current.TrackException((Exception) new OutOfMemoryException(), (IDictionary<string, string>) null, nameof (OnLowMemory), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/MainActivity.cs", 48);
    }

    public virtual void OnBackPressed()
    {
      if (!Rg.Plugins.Popup.Popup.SendBackPressed(new Action(((MvxFormsAppCompatActivity) this).OnBackPressed)))
        return;
      PopupNavigation.get_Instance().PopAsync(true);
    }

    protected virtual void OnCreate(Bundle bundle)
    {
      base.OnCreate(bundle);
      Rg.Plugins.Popup.Popup.Init((Context) this, bundle);
      Xamarin.Essentials.Platform.Init((Activity) this, bundle);
      FormsAppCompatActivity.set_ToolbarResource(2131427436);
      FormsAppCompatActivity.set_TabLayoutResource(2131427435);
      Application.set_Current(((IMvxFormsViewPresenter) Mvx.get_IoCProvider().GetSingleton<IMvxFormsViewPresenter>()).get_FormsApplication());
      FormsAppCompatActivity.set_ToolbarResource(2131427436);
      FormsAppCompatActivity.set_TabLayoutResource(2131427435);
      MainActivity.instance = this;
      CrossCurrentActivity.get_Current().set_Activity((Activity) this);
      CachedImageRenderer.Init(new bool?(false));
      CrossMobileAnalytics.Current.Register<GoogleMobileAnalyticsProvider>();
      CrossMobileAnalytics.Current.Register<HockeyAppMobileAnalyticsProvider>();
      if (((Activity) this).get_Intent().get_Data() != null)
      {
        ConfigurationRepository.SetEnvironment(((Activity) this).get_Intent().get_Data().ToString());
        if (Settings.Environment != ConfigurationRepository.EnvironmentSetting.Environment)
          Settings.Reset();
      }
      ProtectedAppsChecker.CheckProtectedAppsFeature((Context) this);
    }

    protected virtual object GetAppStartHint(object hint = null)
    {
      if (((Activity) this).get_Intent().get_Extras() != null)
      {
        Bundle bundle = ((Activity) this).get_Intent().get_Extras().GetBundle("pushMessageExtra");
        if (bundle != null)
          this._pushMessage = NotificationBroadcastReceiver.CreatePushMessageBundle(bundle);
      }
      return (object) this._pushMessage;
    }

    protected virtual void OnResume()
    {
      base.OnResume();
      CrossCurrentActivity.get_Current().set_Activity((Activity) this);
    }

    protected virtual void OnPause()
    {
      base.OnPause();
      CrossCurrentActivity.get_Current().set_Activity((Activity) null);
    }

    protected virtual void OnDestroy()
    {
      if (Application.get_Current() != null)
      {
        Page mainPage = Application.get_Current().get_MainPage();
        if (mainPage != null && mainPage is MasterDetailPage)
        {
          object bindingContext = ((BindableObject) (Application.get_Current().get_MainPage() as MasterDetailPage).get_Master()).get_BindingContext();
          if (bindingContext != null && bindingContext is ViewModelBase)
            ((MvxViewModel) (bindingContext as ViewModelBase)).ViewDestroy(true);
        }
      }
      base.OnDestroy();
    }

    protected virtual void OnStart()
    {
      base.OnStart();
      CrossCurrentActivity.get_Current().set_Activity((Activity) this);
    }

    public virtual void OnRequestPermissionsResult(
      int requestCode,
      string[] permissions,
      [GeneratedEnum] Permission[] grantResults)
    {
      Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);
      ((Activity) this).OnRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public MainActivity()
    {
      base.\u002Ector();
    }
  }
}
