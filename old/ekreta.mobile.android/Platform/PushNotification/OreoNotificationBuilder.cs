// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.OreoNotificationBuilder
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.Support.V4.Content;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  internal class OreoNotificationBuilder : AbstractNotificationBuilder
  {
    private const string AbsenceChannelName = "Mulasztások";
    private const string EvaluationChannelName = "Értékelések";
    private const string NoteChannelName = "Feljegyzések";
    private const string MessageChannelName = "Üzenetek";
    private const string HomeWorkChannelName = "Házifeladatok";
    private const string ExamChannelName = "Számonkérések";

    internal OreoNotificationBuilder(Context context, PushMessage pushMessage)
      : base(context, pushMessage)
    {
    }

    public override void ShowNotification()
    {
      NotificationChannel notificationChannels = this.CreateNotificationChannels(this._pushMessage.NotificationType.ToString(), this.GetChannelName(this._pushMessage.NotificationType));
      this.Manager.CreateNotificationChannel(notificationChannels);
      Notification.Builder builder1 = new Notification.Builder((Context) this, notificationChannels.get_Id()).SetColor(ContextCompat.GetColor((Context) this, 2131034136)).SetSmallIcon(this.SmallIcon).SetContentTitle(this._pushMessage.Message).SetAutoCancel(true).SetGroup("GroupId").SetContentIntent(this.CreatePendingIntent());
      Notification.Builder builder2 = new Notification.Builder((Context) this, notificationChannels.get_Id()).SetColor(ContextCompat.GetColor((Context) this, 2131034136)).SetSmallIcon(this.SmallIcon).SetContentTitle(this._pushMessage.Message).SetAutoCancel(true).SetGroup("GroupId").SetGroupSummary(true).SetContentIntent(this.CreatePendingIntent());
      this.Manager.Notify(this.NotificationId, builder1.Build());
      this.Manager.Notify(0, builder2.Build());
    }

    private NotificationChannel CreateNotificationChannels(
      string name,
      string channelName)
    {
      NotificationChannel notificationChannel1 = new NotificationChannel(name, channelName, (NotificationImportance) 5);
      notificationChannel1.set_LightColor(((Context) this).GetColor(2131034136));
      notificationChannel1.set_LockscreenVisibility((NotificationVisibility) 0);
      NotificationChannel notificationChannel2 = notificationChannel1;
      notificationChannel2.EnableVibration(true);
      return notificationChannel2;
    }

    private string GetChannelName(NotificationMessageType notificationType)
    {
      switch (notificationType)
      {
        case NotificationMessageType.Evaluation:
          return "Értékelések";
        case NotificationMessageType.Absence:
          return "Mulasztások";
        case NotificationMessageType.Note:
          return "Feljegyzések";
        case NotificationMessageType.Message:
          return "Üzenetek";
        case NotificationMessageType.Homework:
          return "Házifeladatok";
        case NotificationMessageType.Exam:
          return "Számonkérések";
        default:
          return "Értékelések";
      }
    }
  }
}
