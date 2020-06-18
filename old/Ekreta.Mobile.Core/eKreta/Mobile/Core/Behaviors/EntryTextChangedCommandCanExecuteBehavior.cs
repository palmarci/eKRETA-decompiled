// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Behaviors.EntryTextChangedCommandCanExecuteBehavior
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.Commands;
using System;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Behaviors
{
  public class EntryTextChangedCommandCanExecuteBehavior : Behavior<Entry>
  {
    public static readonly BindableProperty CommandProperty = BindableProperty.Create(nameof (Command), typeof (IMvxCommand), typeof (EntryTextChangedCommandCanExecuteBehavior), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) null, __methodptr(CommandChanged)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public IMvxCommand Command
    {
      get
      {
        return (IMvxCommand) ((BindableObject) this).GetValue(EntryTextChangedCommandCanExecuteBehavior.CommandProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(EntryTextChangedCommandCanExecuteBehavior.CommandProperty, (object) value);
      }
    }

    private static void CommandChanged(BindableObject bindable, object oldValue, object newValue)
    {
      ((EntryTextChangedCommandCanExecuteBehavior) bindable).RaiseCommandCanExecuteChanged();
    }

    protected virtual void OnAttachedTo(Entry bindable)
    {
      base.OnAttachedTo(bindable);
      bindable.add_TextChanged(new EventHandler<TextChangedEventArgs>(this.OnEntryTextChanged));
    }

    protected virtual void OnDetachingFrom(Entry bindable)
    {
      base.OnDetachingFrom(bindable);
      bindable.remove_TextChanged(new EventHandler<TextChangedEventArgs>(this.OnEntryTextChanged));
    }

    private void OnEntryTextChanged(object sender, TextChangedEventArgs e)
    {
      this.RaiseCommandCanExecuteChanged();
    }

    private void RaiseCommandCanExecuteChanged()
    {
      this.Command?.RaiseCanExecuteChanged();
    }

    public EntryTextChangedCommandCanExecuteBehavior()
    {
      base.\u002Ector();
    }
  }
}
