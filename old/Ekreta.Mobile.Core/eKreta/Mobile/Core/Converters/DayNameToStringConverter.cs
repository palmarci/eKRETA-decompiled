// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.DayNameToStringConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public class DayNameToStringConverter : IValueConverter
  {
    public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
    {
      DateTime dateTime = (DateTime) value;
      switch (Device.get_RuntimePlatform())
      {
        case "iOS":
          return (object) dateTime.ToString("dddd");
        case "Android":
          return (object) ((IEnumerable<string>) culture.DateTimeFormat.AbbreviatedDayNames).ElementAt<string>((int) dateTime.DayOfWeek);
        default:
          return (object) dateTime.ToString("d");
      }
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
