// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.TokenDecoder
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Text;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class TokenDecoder
  {
    private static char _base64UrlCharacter63 = '_';
    private static char base64Character62 = '+';
    private static char base64Character63 = '/';
    private static char base64PadCharacter = '=';
    private static char base64UrlCharacter62 = '-';
    private static string doubleBase64PadCharacter = "==";

    public static byte[] DecodeBytes(string str)
    {
      if (str == null)
        throw new ArgumentNullException(nameof (str));
      str = str.Replace(TokenDecoder.base64UrlCharacter62, TokenDecoder.base64Character62);
      str = str.Replace(TokenDecoder._base64UrlCharacter63, TokenDecoder.base64Character63);
      switch (str.Length % 4)
      {
        case 2:
          str += TokenDecoder.doubleBase64PadCharacter;
          break;
        case 3:
          str += TokenDecoder.base64PadCharacter.ToString();
          break;
      }
      return Convert.FromBase64String(str);
    }

    public static string Decode(string tokenAsString)
    {
      byte[] bytes = TokenDecoder.DecodeBytes(tokenAsString.Split('.')[1]);
      return Encoding.UTF8.GetString(bytes, 0, bytes.Length);
    }
  }
}
