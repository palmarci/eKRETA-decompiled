// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.TokenData
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models
{
  public class TokenData
  {
    [JsonProperty("token_type")]
    public string TokenType { get; set; }

    [JsonProperty("access_token")]
    public string AccessToken { get; set; }

    [JsonProperty("expires_in")]
    public string ExpiresIn { get; set; }

    [JsonProperty("refresh_token")]
    public string RefreshToken { get; set; }

    public DateTime ExpiresAt { get; set; }
  }
}
