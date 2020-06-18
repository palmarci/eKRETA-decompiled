// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.SplashScreenActivity
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using MvvmCross.Platforms.Android.Views;
using System.Threading.Tasks;

namespace eKreta.Mobile.Droid
{
  [Activity]
  [IntentFilter(new string[] {"android.intent.action.VIEW"}, Categories = new string[] {"android.intent.category.DEFAULT", "android.intent.category.BROWSABLE"}, DataScheme = "ekreta")]
  public class SplashScreenActivity : MvxSplashScreenActivity
  {
    public virtual async Task InitializationComplete()
    {
      SplashScreenActivity splashScreenActivity = this;
      Intent intent = new Intent((Context) splashScreenActivity, typeof (MainActivity));
      intent.SetData(((Activity) splashScreenActivity).get_Intent().get_Data());
      ((Context) splashScreenActivity).StartActivity(intent);
      // ISSUE: reference to a compiler-generated method
      await splashScreenActivity.\u003C\u003En__0();
    }

    public SplashScreenActivity()
    {
      this.\u002Ector(0);
    }
  }
}
