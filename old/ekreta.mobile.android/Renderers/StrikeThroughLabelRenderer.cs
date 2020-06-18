// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.StrikeThroughLabelRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Graphics;
using Android.Widget;
using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Monitoring;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class StrikeThroughLabelRenderer : HtmlLabelRenderer
  {
    public StrikeThroughLabelRenderer(Context context)
      : base(context)
    {
    }

    protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
    {
      try
      {
        if (((ViewRenderer<Label, TextView>) this).get_Control() == null || ((VisualElementRenderer<Label>) this).get_Element() == null)
          return;
        if ((((VisualElementRenderer<Label>) this).get_Element() as StrikeThroughLabel).IsStrikeThrough)
          ((ViewRenderer<Label, TextView>) this).get_Control().set_PaintFlags((PaintFlags) (((ViewRenderer<Label, TextView>) this).get_Control().get_PaintFlags() | 16));
        else
          ((ViewRenderer<Label, TextView>) this).get_Control().set_PaintFlags((PaintFlags) (((ViewRenderer<Label, TextView>) this).get_Control().get_PaintFlags() & -17));
        base.OnElementPropertyChanged(sender, e);
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (OnElementPropertyChanged), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/Renderers/StrikeThroughLabelRenderer.cs", 37);
      }
    }
  }
}
