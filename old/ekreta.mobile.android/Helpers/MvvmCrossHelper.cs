// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Helpers.MvvmCrossHelper
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.Util;
using MvvmCross.Core;
using MvvmCross.Platforms.Android.Core;
using System.Threading.Tasks;

namespace eKreta.Mobile.Droid.Helpers
{
  public class MvvmCrossHelper
  {
    private const string TAG = "MvvmCrossHelper";

    public static bool IsRunning { get; set; }

    public static async Task Init(Context context)
    {
      while (MvvmCrossHelper.IsRunning)
      {
        Log.Debug(nameof (MvvmCrossHelper), "MvvmCrossHelper.Init is running");
        Log.Debug(nameof (MvvmCrossHelper), "Context:" + ((object) context).GetType().ToString());
        Log.Debug(nameof (MvvmCrossHelper), string.Format("Context is Activity:{0}", (object) (context is Activity)));
        await Task.Delay(200);
      }
      ((MvxSetupSingleton) MvxAndroidSetupSingleton.EnsureSingletonAvailable(context)).EnsureInitialized();
    }
  }
}
