// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.StringToResourceConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross;
using MvvmCross.Localization;
using System;
using System.Globalization;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public class StringToResourceConverter : IValueConverter
  {
    public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
    {
      return (object) ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, value.ToString());
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
