// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.StrikeThroughLabel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class StrikeThroughLabel : HtmlLabel
  {
    public static readonly BindableProperty IsStrikeThroughProperty = BindableProperty.Create(nameof (IsStrikeThrough), typeof (bool), typeof (Label), (object) true, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);

    public bool IsStrikeThrough
    {
      get
      {
        return (bool) ((BindableObject) this).GetValue(StrikeThroughLabel.IsStrikeThroughProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(StrikeThroughLabel.IsStrikeThroughProperty, (object) value);
      }
    }
  }
}
