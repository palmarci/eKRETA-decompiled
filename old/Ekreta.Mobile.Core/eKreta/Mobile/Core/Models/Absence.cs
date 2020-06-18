// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Absence
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Absence : ClassGroupContainer, IEquatable<Absence>, INewItem
  {
    public string ImageSource { get; set; }

    public bool SeenByUser { get; set; }

    public int AbsenceId { get; set; }

    public string Type { get; set; }

    public string TypeName { get; set; }

    public string Subject { get; set; }

    public string SubjectCategory { get; set; }

    public string SubjectCategoryName { get; set; }

    public string Mode { get; set; }

    public string ModeName { get; set; }

    public byte? DelayTimeMinutes { get; set; }

    public string Teacher { get; set; }

    public DateTime LessonStartTime { get; set; }

    public short NumberOfLessons { get; set; }

    public DateTime CreatingTime { get; set; }

    public string JustificationState { get; set; }

    public string JustificationStateName { get; set; }

    public string JustificationType { get; set; }

    public string JustificationTypeName { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    public override bool Equals(object obj)
    {
      if (obj is Absence absence && this.AbsenceId == absence.AbsenceId && (this.Type == absence.Type && this.TypeName == absence.TypeName) && (this.Subject == absence.Subject && this.SubjectCategory == absence.SubjectCategory && (this.SubjectCategoryName == absence.SubjectCategoryName && this.Mode == absence.Mode)) && this.ModeName == absence.ModeName)
      {
        byte? delayTimeMinutes1 = this.DelayTimeMinutes;
        int? nullable1 = delayTimeMinutes1.HasValue ? new int?((int) delayTimeMinutes1.GetValueOrDefault()) : new int?();
        byte? delayTimeMinutes2 = absence.DelayTimeMinutes;
        int? nullable2 = delayTimeMinutes2.HasValue ? new int?((int) delayTimeMinutes2.GetValueOrDefault()) : new int?();
        if (nullable1.GetValueOrDefault() == nullable2.GetValueOrDefault() & nullable1.HasValue == nullable2.HasValue && this.Teacher == absence.Teacher && (this.LessonStartTime == absence.LessonStartTime && (int) this.NumberOfLessons == (int) absence.NumberOfLessons) && (this.CreatingTime == absence.CreatingTime && this.JustificationState == absence.JustificationState && (this.JustificationStateName == absence.JustificationStateName && this.JustificationType == absence.JustificationType)))
          return this.JustificationTypeName == absence.JustificationTypeName;
      }
      return false;
    }

    public bool Equals(Absence other)
    {
      return this.Equals((object) other);
    }

    public override int GetHashCode()
    {
      return ((((((((((((((((-1410991376 * -1521134295 + this.AbsenceId.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Type)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.TypeName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Subject)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategory)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategoryName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Mode)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.ModeName)) * -1521134295 + this.DelayTimeMinutes.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Teacher)) * -1521134295 + this.LessonStartTime.GetHashCode()) * -1521134295 + this.NumberOfLessons.GetHashCode()) * -1521134295 + this.CreatingTime.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.JustificationState)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.JustificationStateName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.JustificationType)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.JustificationTypeName);
    }
  }
}
