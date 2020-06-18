// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.TabbedControl
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using System;
using System.Collections;
using System.Collections.ObjectModel;
using Telerik.XamarinForms.Primitives;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class TabbedControl : RadTabView
  {
    public static readonly BindableProperty ItemTemplateProperty = BindableProperty.Create(nameof (ItemTemplate), typeof (DataTemplate), typeof (ItemsControl), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) TabbedControl.\u003C\u003Ec.\u003C\u003E9, __methodptr(\u003C\u002Ecctor\u003Eb__10_0)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty ItemsSourceProperty = BindableProperty.Create(nameof (ItemsSource), typeof (IEnumerable), typeof (ItemsControl), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) TabbedControl.\u003C\u003Ec.\u003C\u003E9, __methodptr(\u003C\u002Ecctor\u003Eb__10_1)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public IEnumerable ItemsSource
    {
      get
      {
        return (IEnumerable) ((BindableObject) this).GetValue(TabbedControl.ItemsSourceProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(TabbedControl.ItemsSourceProperty, (object) value);
      }
    }

    public DataTemplate ItemTemplate
    {
      get
      {
        return (DataTemplate) ((BindableObject) this).GetValue(TabbedControl.ItemTemplateProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(TabbedControl.ItemTemplateProperty, (object) value);
      }
    }

    private static void Populate(BindableObject bindable)
    {
      TabbedControl tabbedControl = (TabbedControl) bindable;
      ((Collection<TabViewItem>) tabbedControl.get_Items()).Clear();
      if (tabbedControl.ItemsSource == null || tabbedControl.ItemTemplate == null)
        return;
      foreach (object obj in tabbedControl.ItemsSource)
      {
        object content = ((ElementTemplate) tabbedControl.ItemTemplate).CreateContent();
        if (!(content is TabViewItem))
          throw new Exception("Invalid visual object content").SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Controls/TabbedControl.cs", 73);
        TabViewItem tabViewItem = content as TabViewItem;
        ((BindableObject) tabViewItem).set_BindingContext(obj);
        ((Collection<TabViewItem>) tabbedControl.get_Items()).Add(tabViewItem);
      }
    }

    public TabbedControl()
    {
      base.\u002Ector();
    }
  }
}
