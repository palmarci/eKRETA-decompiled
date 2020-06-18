// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.TargetAvarageToDoubleConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Globalization;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public class TargetAvarageToDoubleConverter : IValueConverter
  {
    public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
    {
      return value is double ? (object) value.ToString() : value;
    }

    public object ConvertBack(
      object value,
      Type targetType,
      object parameter,
      CultureInfo culture)
    {
      string s = value?.ToString();
      if (s != null)
        s = s.Replace(',', '.');
      double result = 0.0;
      return double.TryParse(s, NumberStyles.Any, (IFormatProvider) CultureInfo.InvariantCulture, out result) ? (object) result : value;
    }
  }
}
