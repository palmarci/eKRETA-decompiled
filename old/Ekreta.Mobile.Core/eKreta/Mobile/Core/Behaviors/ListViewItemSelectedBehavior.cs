// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Behaviors.ListViewItemSelectedBehavior
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Windows.Input;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Behaviors
{
  public class ListViewItemSelectedBehavior : Behavior<ListView>
  {
    public static readonly BindableProperty CommandProperty = BindableProperty.Create(nameof (Command), typeof (ICommand), typeof (ListViewItemSelectedBehavior), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty CommandParameterProperty = BindableProperty.Create(nameof (CommandParameter), typeof (object), typeof (ListViewItemSelectedBehavior), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    protected virtual void OnAttachedTo(ListView bindable)
    {
      base.OnAttachedTo(bindable);
      bindable.add_ItemSelected(new EventHandler<SelectedItemChangedEventArgs>(this.OnListViewItemSelected));
    }

    protected virtual void OnDetachingFrom(ListView bindable)
    {
      base.OnDetachingFrom(bindable);
      bindable.remove_ItemSelected(new EventHandler<SelectedItemChangedEventArgs>(this.OnListViewItemSelected));
    }

    private void OnListViewItemSelected(object sender, SelectedItemChangedEventArgs e)
    {
      object parameter = this.CommandParameter ?? e.get_SelectedItem();
      if (this.Command != null && parameter != null && this.Command.CanExecute(parameter))
        this.Command.Execute(parameter);
      ((ListView) sender).set_SelectedItem((object) null);
    }

    public ICommand Command
    {
      get
      {
        return (ICommand) ((BindableObject) this).GetValue(ListViewItemSelectedBehavior.CommandProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ListViewItemSelectedBehavior.CommandProperty, (object) value);
      }
    }

    public object CommandParameter
    {
      get
      {
        return ((BindableObject) this).GetValue(ListViewItemSelectedBehavior.CommandParameterProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ListViewItemSelectedBehavior.CommandParameterProperty, value);
      }
    }

    public ListViewItemSelectedBehavior()
    {
      base.\u002Ector();
    }
  }
}
