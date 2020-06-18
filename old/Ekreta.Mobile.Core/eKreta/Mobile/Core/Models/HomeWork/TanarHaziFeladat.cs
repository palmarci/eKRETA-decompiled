// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.HomeWork.TanarHaziFeladat
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models.HomeWork
{
  public class TanarHaziFeladat
  {
    public int Id { get; set; }

    public string OsztalyCsoport { get; set; }

    public string Tantargy { get; set; }

    public string Rogzito { get; set; }

    public bool IsTanarRogzitette { get; set; }

    public int? TanitasiOraId { get; set; }

    public string Szoveg { get; set; }

    public DateTime FeladasDatuma { get; set; }

    public DateTime Hatarido { get; set; }

    public bool EnableTanuloHazifeladat { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    [JsonProperty("IsMegoldva")]
    public bool Done { get; set; }
  }
}
