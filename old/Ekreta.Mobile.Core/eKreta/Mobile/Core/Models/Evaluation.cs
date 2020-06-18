// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Core.Models.Evaluation
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Core.Models
{
  public class Evaluation : ClassGroupContainer, IEquatable<Evaluation>
  {
    public int EvaluationId { get; set; }

    public string Form { get; set; }

    public string FormName { get; set; }

    public string Type { get; set; }

    public string TypeName { get; set; }

    public string Subject { get; set; }

    public string SubjectCategory { get; set; }

    public string SubjectCategoryName { get; set; }

    public string Mode { get; set; }

    public string Weight { get; set; }

    public string Value { get; set; }

    public int NumberValue { get; set; }

    public string Teacher { get; set; }

    public DateTime Date { get; set; }

    public DateTime CreatingTime { get; set; }

    public string Theme { get; set; }

    [JsonProperty("Jelleg")]
    public EvaluationNature EvaluationNature { get; set; }

    [JsonIgnore]
    public string EvaluationTitle
    {
      get
      {
        if (!string.IsNullOrEmpty(this.SubjectCategoryName))
          return this.Subject;
        return this.EvaluationNature?.Description;
      }
    }

    [JsonIgnore]
    public string DisplayValue
    {
      get
      {
        switch (this.Form)
        {
          case "Percent":
            return "%";
          case "Diligence":
          case "Deportment":
          case "Text":
            return "...";
          case "Mark":
            return this.NumberValue.ToString();
          default:
            return this.NumberValue.ToString();
        }
      }
    }

    [JsonIgnore]
    public string ProfileId { get; set; }

    public bool SeenByUser { get; set; }

    public bool IsDiligenceOrDeportment()
    {
      return this.Form == "Diligence" || this.Form == "Deportment";
    }

    public override bool Equals(object obj)
    {
      return obj is Evaluation evaluation && this.EvaluationId == evaluation.EvaluationId && (this.Form == evaluation.Form && this.FormName == evaluation.FormName) && (this.Type == evaluation.Type && this.TypeName == evaluation.TypeName && (this.Subject == evaluation.Subject && this.SubjectCategory == evaluation.SubjectCategory)) && (this.SubjectCategoryName == evaluation.SubjectCategoryName && this.Mode == evaluation.Mode && (this.Weight == evaluation.Weight && this.Value == evaluation.Value) && (this.NumberValue == evaluation.NumberValue && this.Teacher == evaluation.Teacher && (this.Date == evaluation.Date && this.CreatingTime == evaluation.CreatingTime))) && this.Theme == evaluation.Theme && this.EvaluationTitle == evaluation.EvaluationTitle;
    }

    public bool Equals(Evaluation other)
    {
      return this.Equals((object) other);
    }

    public override int GetHashCode()
    {
      return (((((((((((((((-158013286 * -1521134295 + this.EvaluationId.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Form)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.FormName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Type)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.TypeName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Subject)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategory)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategoryName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Mode)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Weight)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Value)) * -1521134295 + this.NumberValue.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Teacher)) * -1521134295 + this.Date.GetHashCode()) * -1521134295 + this.CreatingTime.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Theme);
    }

    private string GetFormTitle()
    {
      if (this.Form == "Diligence")
        return "Szorgalom";
      return this.Form == "Deportment" ? "Magatartás" : string.Empty;
    }
  }
}
