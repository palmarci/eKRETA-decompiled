// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Uzenetek.Uzenet
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Models.Uzenetek
{
  public class Uzenet
  {
    [JsonProperty("azonosito")]
    public long Azonosito { get; set; }

    [JsonProperty("kuldesDatum")]
    public DateTimeOffset KuldesDatum { get; set; }

    [JsonIgnore]
    public DateTime KuldesDatumLocal
    {
      get
      {
        return this.KuldesDatum.LocalDateTime;
      }
    }

    [JsonProperty("feladoNev")]
    public string FeladoNev { get; set; }

    public string FeladoNevWithTitulus
    {
      get
      {
        return this.FeladoNev + " (" + this.FeladoTitulus + ")";
      }
    }

    [JsonProperty("feladoTitulus")]
    public string FeladoTitulus { get; set; }

    [JsonProperty("szoveg")]
    public string Szoveg { get; set; }

    [JsonProperty("targy")]
    public string Targy { get; set; }

    [JsonProperty("cimzettLista")]
    public List<Cimzett> CimzettLista { get; set; }

    [JsonProperty("csatolmanyok")]
    public List<Csatolmany> Csatolmanyok { get; set; }

    [JsonIgnore]
    public bool HasAttachment
    {
      get
      {
        return this.Csatolmanyok != null && this.Csatolmanyok.Any<Csatolmany>();
      }
    }

    public string PlainSzoveg
    {
      get
      {
        string str = this.Szoveg.StripHTML();
        return str.Substring(0, Math.Min(str.Length, 100));
      }
    }
  }
}
