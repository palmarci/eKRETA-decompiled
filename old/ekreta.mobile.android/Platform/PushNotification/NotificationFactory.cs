// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.NotificationFactory
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.OS;
using Ekreta.Mobile.Core.Models.PushNotification;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  public class NotificationFactory
  {
    public static AbstractNotificationBuilder CreateNotification(
      Context context,
      BuildVersionCodes sdkInt,
      PushMessage pushMessage)
    {
      return sdkInt >= 26 ? (AbstractNotificationBuilder) new OreoNotificationBuilder(context, pushMessage) : (AbstractNotificationBuilder) new NotificationBuilder(context, pushMessage);
    }
  }
}
