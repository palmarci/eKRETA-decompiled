// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Exam
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Exam : IEquatable<Exam>, INewItem
  {
    public string ImageSource { get; set; }

    public bool SeenByUser { get; set; }

    public string Uid { get; set; }

    [JsonIgnore]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    [JsonProperty("Id")]
    public int ExamId { get; set; }

    public DateTime Datum { get; set; }

    public string HetNapja { get; set; }

    public int Oraszam { get; set; }

    public string Tantargy { get; set; }

    public string Tanar { get; set; }

    public string SzamonkeresMegnevezese { get; set; }

    public string SzamonkeresModja { get; set; }

    public DateTime BejelentesDatuma { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    public override bool Equals(object obj)
    {
      return obj is Exam exam && this.Uid == exam.Uid && (this.Id == exam.Id && this.ExamId == exam.ExamId) && (this.Datum == exam.Datum && this.HetNapja == exam.HetNapja && (this.Oraszam == exam.Oraszam && this.Tantargy == exam.Tantargy)) && (this.Tanar == exam.Tanar && this.SzamonkeresMegnevezese == exam.SzamonkeresMegnevezese && this.SzamonkeresModja == exam.SzamonkeresModja) && this.BejelentesDatuma == exam.BejelentesDatuma;
    }

    public bool Equals(Exam other)
    {
      return this.Equals((object) other);
    }

    public override int GetHashCode()
    {
      return ((((((((((1320075983 * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Uid)) * -1521134295 + this.ExamId.GetHashCode()) * -1521134295 + this.Datum.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.HetNapja)) * -1521134295 + this.Oraszam.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Tantargy)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Tanar)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SzamonkeresMegnevezese)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SzamonkeresModja)) * -1521134295 + this.BejelentesDatuma.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.ProfileId);
    }
  }
}
