// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Lesson
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Lesson : ClassGroupContainer, INewItem
  {
    public string ImageSource { get; set; }

    public bool SeenByUser { get; set; }

    [JsonIgnore]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    public int LessonId { get; set; }

    public string CalendarOraType { get; set; }

    public DateTime Date { get; set; }

    public short Count { get; set; }

    public DateTime StartTime { get; set; }

    public DateTime EndTime { get; set; }

    public string Subject { get; set; }

    public string SubjectCategory { get; set; }

    public string SubjectCategoryName { get; set; }

    public string ClassRoom { get; set; }

    public string Teacher { get; set; }

    public string DeputyTeacher { get; set; }

    public string State { get; set; }

    public string StateName { get; set; }

    public string PresenceType { get; set; }

    public string PresenceTypeName { get; set; }

    public int? TeacherHomeWorkId { get; set; }

    public string Theme { get; set; }

    public string Homework { get; set; }

    public bool IsTanuloHaziFeladatEnabled { get; set; }

    [JsonProperty("IsHaziFeladatMegoldva")]
    public bool IsHomeworkDone { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    [JsonIgnore]
    public bool HasHomework
    {
      get
      {
        return this.TeacherHomeWorkId.HasValue;
      }
    }

    public override int GetHashCode()
    {
      return ((((((((((((((((((((((((560323660 * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.ImageSource)) * -1521134295 + this.SeenByUser.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Id)) * -1521134295 + this.LessonId.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.CalendarOraType)) * -1521134295 + this.Date.GetHashCode()) * -1521134295 + this.Count.GetHashCode()) * -1521134295 + this.StartTime.GetHashCode()) * -1521134295 + this.EndTime.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Subject)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategory)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.SubjectCategoryName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.ClassRoom)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Teacher)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.DeputyTeacher)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.State)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.StateName)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.PresenceType)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.PresenceTypeName)) * -1521134295 + EqualityComparer<int?>.Default.GetHashCode(this.TeacherHomeWorkId)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Theme)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Homework)) * -1521134295 + this.IsTanuloHaziFeladatEnabled.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.ProfileId)) * -1521134295 + this.HasHomework.GetHashCode();
    }
  }
}
