// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Renderers.ViewCellItemSelectedCustomRenderer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.Views;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace eKreta.Mobile.Droid.Renderers
{
  public class ViewCellItemSelectedCustomRenderer : ViewCellRenderer
  {
    public ViewCellItemSelectedCustomRenderer()
    {
      base.\u002Ector();
    }

    protected virtual View GetCellCore(
      Cell item,
      View convertView,
      ViewGroup parent,
      Context context)
    {
      View cellCore = base.GetCellCore(item, convertView, parent, context);
      cellCore?.SetBackgroundResource(2131034272);
      return cellCore;
    }
  }
}
