// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.StatisticsToColorConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System;
using System.Globalization;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public class StatisticsToColorConverter : IValueConverter
  {
    public Color LowColor { get; set; }

    public Color MediumColor { get; set; }

    public Color HighColor { get; set; }

    public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
    {
      Color color = this.LowColor;
      if (value is Statistics statistics)
      {
        if (statistics.IsMediumLevel)
          color = this.MediumColor;
        if (statistics.IsHighLevel)
          color = this.HighColor;
      }
      return (object) color;
    }

    public object ConvertBack(
      object value,
      Type targetType,
      object parameter,
      CultureInfo culture)
    {
      throw new NotImplementedException();
    }
  }
}
