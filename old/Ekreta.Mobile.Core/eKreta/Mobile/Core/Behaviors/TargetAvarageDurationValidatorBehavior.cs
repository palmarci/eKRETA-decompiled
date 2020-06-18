// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Behaviors.TargetAvarageDurationValidatorBehavior
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Behaviors
{
  public class TargetAvarageDurationValidatorBehavior : Behavior<Entry>
  {
    public static readonly BindableProperty IsValidProperty = BindableProperty.Create(nameof (IsValid), typeof (bool), typeof (TargetAvarageDurationValidatorBehavior), (object) true, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public bool IsValid
    {
      get
      {
        return (bool) ((BindableObject) this).GetValue(TargetAvarageDurationValidatorBehavior.IsValidProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(TargetAvarageDurationValidatorBehavior.IsValidProperty, (object) value);
      }
    }

    protected virtual void OnAttachedTo(Entry bindable)
    {
      base.OnAttachedTo(bindable);
      bindable.add_TextChanged(new EventHandler<TextChangedEventArgs>(this.Entry_TextChanged));
    }

    protected virtual void OnDetachingFrom(Entry bindable)
    {
      base.OnDetachingFrom(bindable);
      bindable.remove_TextChanged(new EventHandler<TextChangedEventArgs>(this.Entry_TextChanged));
    }

    private void Entry_TextChanged(object sender, TextChangedEventArgs e)
    {
      this.IsValid = false;
      float result = 0.0f;
      if (float.TryParse(e.get_NewTextValue(), out result))
        this.IsValid = (double) result > 1.0 && (double) result <= 5.0;
      ((Entry) sender).set_TextColor(this.IsValid ? Color.get_Default() : (Color) Color.Red);
    }

    public TargetAvarageDurationValidatorBehavior()
    {
      base.\u002Ector();
    }
  }
}
