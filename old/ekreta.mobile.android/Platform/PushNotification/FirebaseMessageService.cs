// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PushNotification.FirebaseMessageService
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.OS;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.PushNotification;
using eKreta.Mobile.Droid.Helpers;
using Firebase.Messaging;
using MvvmCross;
using System;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace eKreta.Mobile.Droid.Platform.PushNotification
{
  [Service]
  [IntentFilter(new string[] {"com.google.firebase.MESSAGING_EVENT"})]
  public class FirebaseMessageService : FirebaseMessagingService
  {
    private IPushNotificationService _pushNotificationService;
    private readonly Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue _queue;

    public virtual async void OnMessageReceived(RemoteMessage message)
    {
      FirebaseMessageService firebaseMessageService = this;
      try
      {
        TaskAwaiter awaiter1 = firebaseMessageService.Init().GetAwaiter();
        int num;
        if (!awaiter1.IsCompleted)
        {
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 0;
          TaskAwaiter taskAwaiter = awaiter1;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, FirebaseMessageService.\u003COnMessageReceived\u003Ed__2>(ref awaiter1, this);
          return;
        }
        awaiter1.GetResult();
        PushMessage pushMessage = firebaseMessageService.CreateNotificationObject(message);
        if (pushMessage != null)
        {
          TaskAwaiter<bool> awaiter2 = firebaseMessageService._queue.Enqueue<bool>((Func<Task<bool>>) (() => this._pushNotificationService.HandleNotification(pushMessage))).GetAwaiter();
          if (!awaiter2.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 1;
            TaskAwaiter<bool> taskAwaiter = awaiter2;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<bool>, FirebaseMessageService.\u003COnMessageReceived\u003Ed__2>(ref awaiter2, this);
            return;
          }
          if (awaiter2.GetResult())
            NotificationFactory.CreateNotification((Context) firebaseMessageService, Build.VERSION.get_SdkInt(), pushMessage).ShowNotification();
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult();
    }

    private async Task Init()
    {
      FirebaseMessageService firebaseMessageService = this;
      await MvvmCrossHelper.Init((Context) firebaseMessageService);
      if (!Mvx.get_IoCProvider().CanResolve<IPushNotificationService>())
        return;
      firebaseMessageService._pushNotificationService = (IPushNotificationService) Mvx.get_IoCProvider().Resolve<IPushNotificationService>();
    }

    private PushMessage CreateNotificationObject(RemoteMessage remoteMessage)
    {
      return this._pushNotificationService.CreatePushMessage(remoteMessage.get_Data());
    }

    public FirebaseMessageService()
    {
      base.\u002Ector();
    }
  }
}
