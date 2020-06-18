// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.CustomSearchBarRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Graphics;
using Android.Graphics.Drawables;
using Android.Views;
using Android.Widget;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class CustomSearchBarRenderer : SearchBarRenderer
  {
    public CustomSearchBarRenderer(Context context)
    {
      base.\u002Ector(context);
    }

    protected virtual void OnElementChanged(ElementChangedEventArgs<SearchBar> args)
    {
      base.OnElementChanged(args);
      SearchView control = ((ViewRenderer<SearchBar, SearchView>) this).get_Control();
      int identifier1 = ((View) control).get_Context().get_Resources().GetIdentifier("android:id/search_src_text", (string) null, (string) null);
      EditText viewById1 = ((View) control).FindViewById(identifier1) as EditText;
      ((View) viewById1).set_Background((Drawable) null);
      ((View) viewById1).SetBackgroundColor(Color.get_White());
      int identifier2 = ((View) control).get_Context().get_Resources().GetIdentifier("android:id/search_plate", (string) null, (string) null);
      ((View) control).FindViewById(identifier2).SetBackgroundColor(Color.get_White());
      int identifier3 = ((View) control).get_Context().get_Resources().GetIdentifier("android:id/search_mag_icon", (string) null, (string) null);
      View viewById2 = ((View) control).FindViewById(identifier3);
      (viewById2 as ImageView).SetColorFilter(Color.get_Transparent(), PorterDuff.Mode.get_SrcIn());
      viewById2.set_LayoutParameters((ViewGroup.LayoutParams) new LinearLayout.LayoutParams(0, 0));
      int identifier4 = ((View) control).get_Context().get_Resources().GetIdentifier("android:id/search_close_btn", (string) null, (string) null);
      if (identifier4 <= 0)
        return;
      (((View) control).FindViewById(identifier4) as ImageView).SetColorFilter(Color.get_Black(), PorterDuff.Mode.get_SrcIn());
    }
  }
}
