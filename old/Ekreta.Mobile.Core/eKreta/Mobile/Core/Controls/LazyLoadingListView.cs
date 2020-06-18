// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.LazyLoadingListView
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections;
using System.Windows.Input;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class LazyLoadingListView : ListView
  {
    public static readonly BindableProperty LoadCommandProperty = BindableProperty.Create(nameof (LoadCommand), typeof (ICommand), typeof (LazyLoadingListView), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public LazyLoadingListView()
    {
      base.\u002Ector();
      this.add_ItemAppearing(new EventHandler<ItemVisibilityEventArgs>(this.LazyLoadingListView_ItemAppearing));
    }

    public ICommand LoadCommand
    {
      get
      {
        return (ICommand) ((BindableObject) this).GetValue(LazyLoadingListView.LoadCommandProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(LazyLoadingListView.LoadCommandProperty, (object) value);
      }
    }

    private void LazyLoadingListView_ItemAppearing(object sender, ItemVisibilityEventArgs e)
    {
      if (!(((ItemsView<Cell>) this).get_ItemsSource() is IList itemsSource) || itemsSource.Count <= 0)
        return;
      object obj = itemsSource[itemsSource.Count - 1];
      if (this.get_IsGroupingEnabled())
        obj = !(obj is IList list) || list.Count <= 0 ? (object) null : list[list.Count - 1];
      if (this.LoadCommand == null || !this.LoadCommand.CanExecute((object) null) || e.get_Item() != obj)
        return;
      this.LoadCommand.Execute((object) null);
    }
  }
}
