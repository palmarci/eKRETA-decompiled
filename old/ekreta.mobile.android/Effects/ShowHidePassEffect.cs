// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Effects.ShowHidePassEffect
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Views;
using Android.Widget;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Effects
{
  public class ShowHidePassEffect : PlatformEffect
  {
    protected virtual void OnAttached()
    {
      this.ConfigureControl();
    }

    protected virtual void OnDetached()
    {
    }

    private void ConfigureControl()
    {
      EditText control = (EditText) ((PlatformEffect<ViewGroup, View>) this).get_Control();
      ((TextView) control).SetCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 2131165500, 0);
      ((View) control).SetOnTouchListener((View.IOnTouchListener) new OnDrawableTouchListener());
    }

    public ShowHidePassEffect()
    {
      base.\u002Ector();
    }
  }
}
