// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.ScrollableWebViewRendererAndroid
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Views;
using Android.Webkit;
using System;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class ScrollableWebViewRendererAndroid : WebViewRenderer
  {
    public ScrollableWebViewRendererAndroid(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnElementChanged(ElementChangedEventArgs<WebView> e)
    {
      base.OnElementChanged(e);
      if (e.get_OldElement() != null)
        ((View) ((ViewRenderer<WebView, WebView>) this).get_Control()).remove_Touch(new EventHandler<View.TouchEventArgs>(this.Control_Touch));
      if (e.get_NewElement() == null)
        return;
      ((View) ((ViewRenderer<WebView, WebView>) this).get_Control()).add_Touch(new EventHandler<View.TouchEventArgs>(this.Control_Touch));
    }

    private void Control_Touch(object sender, View.TouchEventArgs e)
    {
      MotionEventActions action = e.get_Event().get_Action();
      if (action != null)
      {
        if (action == 1)
          ((View) ((ViewRenderer<WebView, WebView>) this).get_Control()).get_Parent().RequestDisallowInterceptTouchEvent(false);
      }
      else
        ((View) ((ViewRenderer<WebView, WebView>) this).get_Control()).get_Parent().RequestDisallowInterceptTouchEvent(true);
      ((View) ((ViewRenderer<WebView, WebView>) this).get_Control()).OnTouchEvent(e.get_Event());
    }
  }
}
