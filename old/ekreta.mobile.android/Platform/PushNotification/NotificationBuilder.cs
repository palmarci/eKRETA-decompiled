// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.NotificationBuilder
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Support.V4.App;
using Android.Support.V4.Content;
using Ekreta.Mobile.Core.Models.PushNotification;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  internal class NotificationBuilder : AbstractNotificationBuilder
  {
    public NotificationBuilder(Context context, PushMessage pushMessage)
      : base(context, pushMessage)
    {
    }

    public override void ShowNotification()
    {
      NotificationCompat.Builder builder1 = new NotificationCompat.Builder((Context) this).SetColor(ContextCompat.GetColor((Context) this, 2131034136)).SetSmallIcon(this.SmallIcon).SetContentTitle(this._pushMessage.Message).SetAutoCancel(true).SetPriority(2).SetDefaults(2).SetGroup("GroupId").SetContentIntent(this.CreatePendingIntent());
      NotificationCompat.Builder builder2 = new NotificationCompat.Builder((Context) this).SetColor(ContextCompat.GetColor((Context) this, 2131034136)).SetSmallIcon(this.SmallIcon).SetContentTitle(this._pushMessage.Message).SetAutoCancel(true).SetPriority(2).SetDefaults(2).SetGroup("GroupId").SetGroupSummary(true).SetContentIntent(this.CreatePendingIntent());
      this.Manager.Notify(this.NotificationId, builder1.Build());
      this.Manager.Notify(0, builder2.Build());
    }
  }
}
