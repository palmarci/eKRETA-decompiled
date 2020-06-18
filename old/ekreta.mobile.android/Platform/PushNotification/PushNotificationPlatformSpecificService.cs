// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.PushNotificationPlatformSpecificService
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Support.V4.App;
using Ekreta.Mobile.Core.Interfaces;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  public class PushNotificationPlatformSpecificService : IPushNotificationPlatformSpecificService
  {
    public bool IsPushNotificationEnabledByDevice()
    {
      return NotificationManagerCompat.From(Application.get_Context()).AreNotificationsEnabled();
    }
  }
}
