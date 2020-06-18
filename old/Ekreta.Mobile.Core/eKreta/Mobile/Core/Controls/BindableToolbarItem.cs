// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.BindableToolbarItem
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class BindableToolbarItem : ToolbarItem
  {
    public static readonly BindableProperty IsVisibleProperty = BindableProperty.Create(nameof (BindableToolbarItem), typeof (bool), typeof (ToolbarItem), (object) true, (BindingMode) 1, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) null, __methodptr(OnIsVisibleChanged)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public BindableToolbarItem()
    {
      base.\u002Ector();
      this.InitVisibility();
    }

    public bool IsVisible
    {
      get
      {
        return (bool) ((BindableObject) this).GetValue(BindableToolbarItem.IsVisibleProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(BindableToolbarItem.IsVisibleProperty, (object) value);
      }
    }

    private void InitVisibility()
    {
      BindableToolbarItem.OnIsVisibleChanged((BindableObject) this, (object) false, (object) this.IsVisible);
    }

    protected virtual void OnParentSet()
    {
      ((Element) this).OnParentSet();
      this.InitVisibility();
    }

    private static void OnIsVisibleChanged(
      BindableObject bindable,
      object oldvalue,
      object newvalue)
    {
      BindableToolbarItem item = bindable as BindableToolbarItem;
      if (item != null && ((Element) item).get_Parent() == null || item == null)
        return;
      IList<ToolbarItem> items = ((Page) ((Element) item).get_Parent()).get_ToolbarItems();
      if ((bool) newvalue && !((ICollection<ToolbarItem>) items).Contains((ToolbarItem) item))
      {
        Device.BeginInvokeOnMainThread((Action) (() => ((ICollection<ToolbarItem>) items).Add((ToolbarItem) item)));
      }
      else
      {
        if ((bool) newvalue || !((ICollection<ToolbarItem>) items).Contains((ToolbarItem) item))
          return;
        Device.BeginInvokeOnMainThread((Action) (() => ((ICollection<ToolbarItem>) items).Remove((ToolbarItem) item)));
      }
    }
  }
}
