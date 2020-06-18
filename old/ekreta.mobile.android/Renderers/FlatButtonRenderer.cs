// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.FlatButtonRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Graphics;
using Android.Views;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class FlatButtonRenderer : ButtonRenderer
  {
    public FlatButtonRenderer(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnDraw(Canvas canvas)
    {
      ((View) this).OnDraw(canvas);
    }
  }
}
