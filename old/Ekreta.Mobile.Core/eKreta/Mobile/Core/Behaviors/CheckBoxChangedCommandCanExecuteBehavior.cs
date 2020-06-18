// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Behaviors.CheckBoxChangedCommandCanExecuteBehavior
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.Commands;
using System;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Behaviors
{
  public class CheckBoxChangedCommandCanExecuteBehavior : Behavior<CheckBox>
  {
    public static readonly BindableProperty CommandProperty = BindableProperty.Create(nameof (Command), typeof (IMvxCommand), typeof (CheckBoxChangedCommandCanExecuteBehavior), (object) null, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, new BindableProperty.BindingPropertyChangedDelegate((object) null, __methodptr(CommandChanged)), (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public IMvxCommand Command
    {
      get
      {
        return (IMvxCommand) ((BindableObject) this).GetValue(CheckBoxChangedCommandCanExecuteBehavior.CommandProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(CheckBoxChangedCommandCanExecuteBehavior.CommandProperty, (object) value);
      }
    }

    private static void CommandChanged(BindableObject bindable, object oldValue, object newValue)
    {
      ((CheckBoxChangedCommandCanExecuteBehavior) bindable).RaiseCommandCanExecuteChanged();
    }

    protected virtual void OnAttachedTo(CheckBox bindable)
    {
      base.OnAttachedTo(bindable);
      bindable.add_CheckedChanged(new EventHandler<CheckedChangedEventArgs>(this.OnEditorTextChanged));
    }

    protected virtual void OnDetachingFrom(CheckBox bindable)
    {
      base.OnDetachingFrom(bindable);
      bindable.remove_CheckedChanged(new EventHandler<CheckedChangedEventArgs>(this.OnEditorTextChanged));
    }

    private void OnEditorTextChanged(object sender, CheckedChangedEventArgs e)
    {
      this.RaiseCommandCanExecuteChanged();
    }

    private void RaiseCommandCanExecuteChanged()
    {
      this.Command?.RaiseCanExecuteChanged();
    }

    public CheckBoxChangedCommandCanExecuteBehavior()
    {
      base.\u002Ector();
    }
  }
}
