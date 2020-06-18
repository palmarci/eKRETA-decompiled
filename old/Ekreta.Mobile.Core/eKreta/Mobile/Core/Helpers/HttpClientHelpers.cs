// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.HttpClientHelpers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Net;
using System.Net.Http;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class HttpClientHelpers
  {
    public static HttpClientHandler GetClientHandler(bool isGzip = true)
    {
      return new HttpClientHandler()
      {
        AutomaticDecompression = isGzip ? DecompressionMethods.GZip : DecompressionMethods.None,
        ServerCertificateCustomValidationCallback = (Func<HttpRequestMessage, X509Certificate2, X509Chain, SslPolicyErrors, bool>) ((message, cert, chain, errors) => true)
      };
    }
  }
}
