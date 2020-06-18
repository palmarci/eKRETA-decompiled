// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Absence.AbsenceRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Absence
{
  public class AbsenceRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Absence, AbsenceRealm>, IMapper<Ekreta.Mobile.Core.Models.Absence, AbsenceRealm>
  {
    public Ekreta.Mobile.Core.Models.Absence From(AbsenceRealm item)
    {
      Ekreta.Mobile.Core.Models.Absence absence = new Ekreta.Mobile.Core.Models.Absence();
      absence.AbsenceId = int.Parse(item.Id);
      absence.CreatingTime = item.CreatingTime.LocalDateTime;
      absence.DelayTimeMinutes = item.DelayTimeMinutes;
      absence.JustificationState = item.JustificationState;
      absence.JustificationStateName = item.JustificationStateName;
      absence.JustificationType = item.JustificationType;
      absence.JustificationTypeName = item.JustificationTypeName;
      absence.LessonStartTime = item.LessonStartTime.LocalDateTime;
      absence.Mode = item.Mode;
      absence.ModeName = item.ModeName;
      absence.NumberOfLessons = item.NumberOfLessons;
      absence.Subject = item.Subject;
      absence.SubjectCategory = item.SubjectCategory;
      absence.SubjectCategoryName = item.SubjectCategoryName;
      absence.Teacher = item.Teacher;
      absence.Type = item.Type;
      absence.TypeName = item.TypeName;
      absence.ProfileId = item.ProfileId;
      absence.SeenByUser = item.SeenByUser;
      absence.OsztalyCsoportUid = item.OsztalyCsoportUid;
      return absence;
    }

    public AbsenceRealm To(Ekreta.Mobile.Core.Models.Absence item)
    {
      return new AbsenceRealm()
      {
        Id = item.AbsenceId.ToString(),
        CreatingTime = new DateTimeOffset(item.CreatingTime),
        DelayTimeMinutes = item.DelayTimeMinutes,
        JustificationState = item.JustificationState,
        JustificationStateName = item.JustificationStateName,
        JustificationType = item.JustificationType,
        JustificationTypeName = item.JustificationTypeName,
        LessonStartTime = new DateTimeOffset(item.LessonStartTime),
        Mode = item.Mode,
        ModeName = item.ModeName,
        NumberOfLessons = item.NumberOfLessons,
        Subject = item.Subject,
        SubjectCategory = item.SubjectCategory,
        SubjectCategoryName = item.SubjectCategoryName,
        Teacher = item.Teacher,
        Type = item.Type,
        TypeName = item.TypeName,
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser,
        OsztalyCsoportUid = item.OsztalyCsoportUid
      };
    }
  }
}
