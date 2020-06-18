// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.HtmlLabelRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Text;
using Android.Widget;
using Java.Lang;
using System.ComponentModel;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class HtmlLabelRenderer : LabelRenderer
  {
    public HtmlLabelRenderer(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnElementChanged(ElementChangedEventArgs<Label> e)
    {
      base.OnElementChanged(e);
      if (((VisualElementRenderer<Label>) this).get_Element() == null || ((VisualElementRenderer<Label>) this).get_Element().get_Text() == null)
        return;
      ((ViewRenderer<Label, TextView>) this).get_Control()?.SetText((ICharSequence) Html.FromHtml(((VisualElementRenderer<Label>) this).get_Element().get_Text()), TextView.BufferType.get_Spannable());
    }

    protected virtual void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
    {
      base.OnElementPropertyChanged(sender, e);
      if (((VisualElementRenderer<Label>) this).get_Element().get_Text() == null || !(e.PropertyName == ((BindableProperty) Label.TextProperty).get_PropertyName()))
        return;
      ((ViewRenderer<Label, TextView>) this).get_Control()?.SetText((ICharSequence) Html.FromHtml(((VisualElementRenderer<Label>) this).get_Element().get_Text()), TextView.BufferType.get_Spannable());
    }
  }
}
