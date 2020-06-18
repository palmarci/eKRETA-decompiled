// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.ListViewCustomRenderer.ListViewCustomRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Graphics;
using Android.Support.V4.Widget;
using Android.Views;
using Android.Widget;
using System;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.ListViewCustomRenderer
{
  public class ListViewCustomRenderer : ListViewRenderer
  {
    public ListViewCustomRenderer(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnDetachedFromWindow()
    {
      if (((VisualElementRenderer<ListView>) this).get_Element() == null)
        return;
      base.OnDetachedFromWindow();
    }

    protected virtual void OnElementChanged(ElementChangedEventArgs<ListView> e)
    {
      base.OnElementChanged(e);
      try
      {
        if (!(((View) ((ViewRenderer<ListView, ListView>) this).get_Control()).get_Parent() is SwipeRefreshLayout parent))
          return;
        int[] numArray = new int[1]
        {
          Color.op_Implicit(Color.ParseColor("#32B1D5"))
        };
        parent.SetColorSchemeColors(numArray);
      }
      catch (Exception ex)
      {
      }
    }
  }
}
