// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.AbstractNotificationBuilder
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.OS;
using Ekreta.Mobile.Core.Models.PushNotification;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  public abstract class AbstractNotificationBuilder : ContextWrapper
  {
    protected NotificationManager _manager;
    protected PushMessage _pushMessage;
    protected const string GroupId = "GroupId";
    protected const int SummaryId = 0;

    protected NotificationManager Manager
    {
      get
      {
        return this._manager ?? (this._manager = (NotificationManager) ((Context) this).GetSystemService("notification"));
      }
    }

    protected int SmallIcon
    {
      get
      {
        return 2131165544;
      }
    }

    protected int NotificationId
    {
      get
      {
        return this._pushMessage.MessageId.GetHashCode();
      }
    }

    protected AbstractNotificationBuilder(Context context, PushMessage pushMessage)
    {
      this.\u002Ector(context);
      this._pushMessage = pushMessage;
    }

    public abstract void ShowNotification();

    protected PendingIntent CreatePendingIntent()
    {
      Intent intent = new Intent((Context) this, typeof (NotificationBroadcastReceiver));
      intent.SetAction("OpenNotification");
      intent.PutExtras(this.CreatePushBundle(this._pushMessage));
      return PendingIntent.GetBroadcast((Context) this, this.NotificationId, intent, (PendingIntentFlags) 134217728);
    }

    protected Bundle CreatePushBundle(PushMessage data)
    {
      Bundle bundle = new Bundle();
      ((BaseBundle) bundle).PutString("InstituteCode", data.InstituteCode);
      ((BaseBundle) bundle).PutInt("UserId", data.UserId);
      ((BaseBundle) bundle).PutInt("ItemId", data.ItemId);
      ((BaseBundle) bundle).PutInt("NotificationType", (int) data.NotificationType);
      ((BaseBundle) bundle).PutInt("NotificationRole", data.NotificationRole);
      return bundle;
    }
  }
}
