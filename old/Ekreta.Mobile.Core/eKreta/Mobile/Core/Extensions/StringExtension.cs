// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.StringExtension
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Text.RegularExpressions;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class StringExtension
  {
    private static readonly char[] hu = new char[18]
    {
      'é',
      'É',
      'á',
      'Á',
      'ó',
      'Ó',
      'ö',
      'Ö',
      'ő',
      'Ő',
      'ú',
      'Ú',
      'ű',
      'Ű',
      'ü',
      'Ü',
      'í',
      'Í'
    };
    private static readonly char[] en = new char[18]
    {
      'e',
      'E',
      'a',
      'A',
      'o',
      'O',
      'o',
      'O',
      'o',
      'O',
      'u',
      'U',
      'u',
      'U',
      'u',
      'U',
      'i',
      'I'
    };

    public static string Englified(this string sourceString)
    {
      string str = sourceString;
      for (int index = 0; index < StringExtension.hu.Length; ++index)
        str = str.Replace(StringExtension.hu[index], StringExtension.en[index]);
      return str;
    }

    public static string StripHTML(this string input)
    {
      return Regex.Replace(input, "<.*?>", string.Empty);
    }
  }
}
