// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Exception.AuthorizationExceptionData
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;

namespace Ekreta.Mobile.Core.Models.Exception
{
  public class AuthorizationExceptionData
  {
    public const string INVALID_USERNAME_PASSWORD = "Invalid login name or password";

    public string Error { get; set; }

    [JsonProperty("error_code")]
    public string ErrorCode { get; set; }

    [JsonProperty("error_description")]
    public string ErrorDescription { get; set; }
  }
}
