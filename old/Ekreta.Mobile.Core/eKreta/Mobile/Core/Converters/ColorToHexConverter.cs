// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Converters.ColorToHexConverter
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Converters
{
  public static class ColorToHexConverter
  {
    public static string GetString(Color color)
    {
      return string.Format("#{0:X2}{1:X2}{2:X2}", (object) (int) (((Color) ref color).get_R() * (double) byte.MaxValue), (object) (int) (((Color) ref color).get_G() * (double) byte.MaxValue), (object) (int) (((Color) ref color).get_B() * (double) byte.MaxValue));
    }
  }
}
