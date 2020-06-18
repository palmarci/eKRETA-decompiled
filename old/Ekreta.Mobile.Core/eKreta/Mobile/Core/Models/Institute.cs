// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Institute
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Institute
  {
    public string InformationImageUrl { get; set; }

    public string InformationUrl { get; set; }

    public string InstituteId { get; set; }

    public string InstituteCode { get; set; }

    public string Name { get; set; }

    public string Url { get; set; }

    public string City { get; set; }

    [JsonIgnore]
    public bool HasAdvertisingUrl
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.InformationImageUrl);
      }
    }

    public IDictionary<string, bool> FeatureToggleSet { get; set; }

    public override string ToString()
    {
      return "[Institute: Name=" + this.Name + ", City=" + this.City + ", Code=" + this.InstituteCode + "]";
    }
  }
}
