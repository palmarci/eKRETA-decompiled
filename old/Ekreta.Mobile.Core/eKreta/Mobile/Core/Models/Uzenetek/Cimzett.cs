﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Uzenetek.Cimzett
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;

namespace Ekreta.Mobile.Core.Models.Uzenetek
{
  public class Cimzett
  {
    [JsonProperty("azonosito")]
    public long Azonosito { get; set; }

    [JsonProperty("kretaAzonosito")]
    public long KretaAzonosito { get; set; }

    [JsonProperty("nev")]
    public string Nev { get; set; }

    [JsonProperty("tipus")]
    public CimzettTipusAdatSzotarElem Tipus { get; set; }
  }
}
