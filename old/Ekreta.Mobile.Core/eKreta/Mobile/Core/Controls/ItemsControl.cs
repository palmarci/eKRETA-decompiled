// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.ItemsControl
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections;
using System.Collections.Generic;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class ItemsControl : StackLayout
  {
    public static readonly BindableProperty ItemTemplateProperty = BindableProperty.Create(nameof (ItemTemplate), typeof (DataTemplate), typeof (ItemsControl), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) ItemsControl.\u003C\u003Ec.\u003C\u003E9, __methodptr(\u003C\u002Ecctor\u003Eb__10_0)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty ItemsSourceProperty = BindableProperty.Create(nameof (ItemsSource), typeof (IEnumerable), typeof (ItemsControl), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) ItemsControl.\u003C\u003Ec.\u003C\u003E9, __methodptr(\u003C\u002Ecctor\u003Eb__10_1)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public ItemsControl()
    {
      base.\u002Ector();
      this.set_Spacing(0.0);
    }

    public IEnumerable ItemsSource
    {
      get
      {
        return (IEnumerable) ((BindableObject) this).GetValue(ItemsControl.ItemsSourceProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ItemsControl.ItemsSourceProperty, (object) value);
      }
    }

    public DataTemplate ItemTemplate
    {
      get
      {
        return (DataTemplate) ((BindableObject) this).GetValue(ItemsControl.ItemTemplateProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ItemsControl.ItemTemplateProperty, (object) value);
      }
    }

    private static void Populate(BindableObject bindable)
    {
      ItemsControl itemsControl = (ItemsControl) bindable;
      ((ICollection<View>) ((Layout<View>) itemsControl).get_Children()).Clear();
      if (itemsControl.ItemsSource == null || itemsControl.ItemTemplate == null)
        return;
      foreach (object obj in itemsControl.ItemsSource)
      {
        object content = ((ElementTemplate) itemsControl.ItemTemplate).CreateContent();
        switch (content)
        {
          case View _:
          case ViewCell _:
            View view = content is View ? content as View : ((ViewCell) content).get_View();
            ((BindableObject) view).set_BindingContext(obj);
            ((ICollection<View>) ((Layout<View>) itemsControl).get_Children()).Add(view);
            continue;
          default:
            throw new Exception("Invalid visual object content");
        }
      }
    }
  }
}
