// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.HomeWork.TanuloHaziFeladat
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models.HomeWork
{
  public class TanuloHaziFeladat
  {
    public int Id { get; set; }

    public string TanuloNev { get; set; }

    public DateTime FeladasDatuma { get; set; }

    public string FeladatSzovege { get; set; }

    public int RogzitoId { get; set; }

    public bool TanuloAltalTorolt { get; set; }

    public bool TanarAltalTorolt { get; set; }

    [JsonIgnore]
    public bool CanDeleteByUser { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    [JsonIgnore]
    public int TeacherHomeWorkId { get; set; }

    [JsonIgnore]
    public bool Torolt
    {
      get
      {
        return !this.TanarAltalTorolt && this.TanuloAltalTorolt;
      }
    }
  }
}
