// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.AndroidLabelRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Views;
using Android.Widget;
using System;
using System.ComponentModel;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class AndroidLabelRenderer : LabelRenderer
  {
    public AndroidLabelRenderer(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnAttachedToWindow()
    {
      try
      {
        ((View) this).OnAttachedToWindow();
      }
      catch (Exception ex)
      {
      }
    }

    protected virtual void Dispose(bool disposing)
    {
      try
      {
        ((ViewRenderer<Label, TextView>) this).Dispose(disposing);
      }
      catch (Exception ex)
      {
      }
    }

    protected virtual void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
    {
      try
      {
        if (((ViewRenderer<Label, TextView>) this).get_Control() == null || ((VisualElementRenderer<Label>) this).get_Element() == null)
          return;
        base.OnElementPropertyChanged(sender, e);
      }
      catch (Exception ex)
      {
      }
    }
  }
}
