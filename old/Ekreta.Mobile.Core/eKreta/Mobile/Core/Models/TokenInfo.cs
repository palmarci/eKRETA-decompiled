// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.TokenInfo
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models
{
  public class TokenInfo
  {
    [JsonProperty("idp:user_id")]
    public Guid UserId { get; set; }

    [JsonProperty("role")]
    public UserRoles Role { get; set; }

    [JsonProperty("kreta:institute_code")]
    public string InstituteCode { get; set; }

    [JsonProperty("kreta:institute_user_id")]
    public int InstituteUserId { get; set; }

    [JsonProperty("kreta:school_year_id")]
    public string SchoolYearId { get; set; }

    [JsonProperty("kreta:tutelary_id")]
    public string TutelaryId { get; set; }
  }
}
