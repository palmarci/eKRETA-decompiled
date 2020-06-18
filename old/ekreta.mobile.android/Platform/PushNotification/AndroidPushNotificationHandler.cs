// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.AndroidPushNotificationHandler
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Gms.Common;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Monitoring;
using Firebase;
using Firebase.Iid;
using Java.Lang;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  public class AndroidPushNotificationHandler : IPushNotificationHandler
  {
    private const string TAG = "AndroidPushNotificationService";

    public string Token
    {
      get
      {
        try
        {
          return FirebaseInstanceId.get_Instance().get_Token();
        }
        catch (IllegalStateException ex)
        {
          this.Initialize();
          return FirebaseInstanceId.get_Instance().get_Token();
        }
      }
    }

    public PushNotificationPlatform Platform
    {
      get
      {
        return PushNotificationPlatform.Gcm;
      }
    }

    public void Initialize()
    {
      try
      {
        if (!this.IsPlayServicesAvailable())
          return;
        FirebaseApp.InitializeApp(Application.get_Context());
        this.Log("Firebase InstanceID token: " + FirebaseInstanceId.get_Instance().get_Token());
      }
      catch (Exception ex)
      {
        this.Log(ex.ToString());
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Initialize), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/Platform/PushNotification/AndroidPushNotificationHandler.cs", 51);
      }
    }

    private void Log(string message)
    {
      Android.Util.Log.Debug("AndroidPushNotificationService", message);
    }

    private bool IsPlayServicesAvailable()
    {
      int num = ((Zzc) GoogleApiAvailability.get_Instance()).IsGooglePlayServicesAvailable(Application.get_Context());
      if (num == 0)
        return true;
      if (!((Zzc) GoogleApiAvailability.get_Instance()).IsUserResolvableError(num))
        CrossMobileAnalytics.Current.TrackException(new Exception("This device is not supported"), (IDictionary<string, string>) null, nameof (IsPlayServicesAvailable), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/Platform/PushNotification/AndroidPushNotificationHandler.cs", 73);
      return false;
    }
  }
}
