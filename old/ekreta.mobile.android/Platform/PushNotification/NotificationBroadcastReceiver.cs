// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.NotificationBroadcastReceiver
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.OS;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using eKreta.Mobile.Droid.Helpers;
using MvvmCross;
using MvvmCross.Forms.Presenters;
using MvvmCross.Platforms.Android.Services;
using MvvmCross.Plugin.Messenger;
using Plugin.CurrentActivity;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  [BroadcastReceiver(Enabled = true)]
  [IntentFilter(new string[] {"OpenNotification"})]
  internal class NotificationBroadcastReceiver : MvxBroadcastReceiver
  {
    private const string PushMessageExtra = "pushMessageExtra";

    public virtual async void OnReceive(Context context, Intent intent)
    {
      NotificationBroadcastReceiver broadcastReceiver = this;
      if (context == null || intent == null || !(intent.get_Action() == "OpenNotification"))
        return;
      await MvvmCrossHelper.Init(context);
      bool isNewTaskRequired = broadcastReceiver.IsContextIsService(context);
      if (MainActivity.instance == null)
        broadcastReceiver.StartNewMainActivity(context, isNewTaskRequired, intent);
      else if (CrossCurrentActivity.get_Current().get_Activity() == null)
      {
        broadcastReceiver.StartNewMainActivity(context, isNewTaskRequired, intent);
        ((IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>()).Publish<DelayedOpenNotificationMessage>((M0) new DelayedOpenNotificationMessage((object) broadcastReceiver, NotificationBroadcastReceiver.CreatePushMessageBundle(intent.get_Extras())));
      }
      else
      {
        await broadcastReceiver.NavigateToRootPage();
        ((IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>()).Publish<DelayedOpenNotificationMessage>((M0) new DelayedOpenNotificationMessage((object) broadcastReceiver, NotificationBroadcastReceiver.CreatePushMessageBundle(intent.get_Extras())));
      }
    }

    public static PushMessage CreatePushMessageBundle(Bundle bundle)
    {
      return new PushMessage()
      {
        InstituteCode = ((BaseBundle) bundle).GetString("InstituteCode"),
        UserId = ((BaseBundle) bundle).GetInt("UserId"),
        ItemId = ((BaseBundle) bundle).GetInt("ItemId"),
        Message = ((BaseBundle) bundle).GetString("Message"),
        MessageId = ((BaseBundle) bundle).GetString("MessageId"),
        NotificationRole = ((BaseBundle) bundle).GetInt("NotificationRole"),
        NotificationType = (NotificationMessageType) ((BaseBundle) bundle).GetInt("NotificationType")
      };
    }

    protected async Task NavigateToRootPage()
    {
      if (!(((IMvxFormsViewPresenter) Mvx.get_IoCProvider().Resolve<IMvxFormsViewPresenter>()).get_FormsApplication().get_MainPage() is MasterDetailPage mainPage))
        return;
      await ((NavigableElement) mainPage?.get_Detail())?.get_Navigation()?.PopToRootAsync();
    }

    private void StartNewMainActivity(Context context, bool isNewTaskRequired, Intent intent)
    {
      Intent intent1 = new Intent(context, typeof (MainActivity));
      intent1.PutExtra("pushMessageExtra", intent?.get_Extras());
      if (isNewTaskRequired)
      {
        intent1.AddFlags((ActivityFlags) 268435456);
        intent1.AddFlags((ActivityFlags) 2097152);
      }
      context.StartActivity(intent1);
    }

    private bool IsContextIsService(Context context)
    {
      return !(context is Activity);
    }

    public NotificationBroadcastReceiver()
    {
      base.\u002Ector();
    }
  }
}
