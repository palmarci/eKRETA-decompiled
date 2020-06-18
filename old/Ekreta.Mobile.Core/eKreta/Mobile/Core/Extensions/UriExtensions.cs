// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.UriExtensions
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Net;
using System.Text;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class UriExtensions
  {
    public static Uri AddParameter(this Uri uri, string name, string value)
    {
      UriBuilder uriBuilder = new UriBuilder(uri);
      string str = WebUtility.UrlDecode(uriBuilder.Query);
      if (str.Length > 1)
        str = str.Remove(0, 1);
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder.AppendFormat(str.Length > 1 ? "&{0}={1}" : "{0}={1}", (object) name, (object) value);
      uriBuilder.Query = stringBuilder.ToString();
      return uriBuilder.Uri;
    }
  }
}
