// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.FirebaseIdService
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Ekreta.Mobile.Core.Interfaces;
using eKreta.Mobile.Droid.Helpers;
using Firebase.Iid;
using MvvmCross;
using System.Threading.Tasks;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  [Service]
  [IntentFilter(new string[] {"com.google.firebase.INSTANCE_ID_EVENT"})]
  public class FirebaseIdService : FirebaseInstanceIdService
  {
    private const string TAG = "FirebaseIdService";
    private IPushNotificationService _pushNotificationService;

    public virtual async void OnTokenRefresh()
    {
      await this.Init();
      await this._pushNotificationService.UpdateRegistrationsAsync(FirebaseInstanceId.get_Instance().get_Token());
    }

    private async Task Init()
    {
      FirebaseIdService firebaseIdService = this;
      await MvvmCrossHelper.Init((Context) firebaseIdService);
      if (!Mvx.get_IoCProvider().CanResolve<IPushNotificationService>())
        return;
      firebaseIdService._pushNotificationService = (IPushNotificationService) Mvx.get_IoCProvider().Resolve<IPushNotificationService>();
    }

    public FirebaseIdService()
    {
      base.\u002Ector();
    }
  }
}
