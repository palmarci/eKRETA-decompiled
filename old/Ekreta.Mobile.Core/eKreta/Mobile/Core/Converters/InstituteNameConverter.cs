// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.InstituteNameConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using MvvmCross;
using MvvmCross.Localization;
using System;
using System.Globalization;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public class InstituteNameConverter : IValueConverter
  {
    private readonly IMvxTextProvider _textProvider;

    public InstituteNameConverter()
    {
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
    }

    public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
    {
      string text = this._textProvider.GetText((string) null, (string) null, "Button_SelectInstitute_Text");
      if (!(value is Institute))
        return (object) text;
      return !(value is Institute institute) ? (object) text : (object) institute.Name;
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
