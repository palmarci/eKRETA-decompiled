// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.LessonRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  public class LessonRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Lesson, LessonRealm>, IMapper<Ekreta.Mobile.Core.Models.Lesson, LessonRealm>
  {
    public Ekreta.Mobile.Core.Models.Lesson From(LessonRealm item)
    {
      Ekreta.Mobile.Core.Models.Lesson lesson = new Ekreta.Mobile.Core.Models.Lesson();
      lesson.Id = item.Id;
      lesson.LessonId = item.LessonId;
      lesson.ClassRoom = item.ClassRoom;
      lesson.Count = item.Count;
      lesson.Date = item.Date.LocalDateTime;
      lesson.DeputyTeacher = item.DeputyTeacher;
      lesson.EndTime = item.EndTime.LocalDateTime;
      lesson.Homework = item.Homework;
      lesson.PresenceType = item.PresenceType;
      lesson.PresenceTypeName = item.PresenceTypeName;
      lesson.StartTime = item.StartTime.LocalDateTime;
      lesson.State = item.State;
      lesson.StateName = item.StateName;
      lesson.Subject = item.Subject;
      lesson.SubjectCategory = item.SubjectCategory;
      lesson.SubjectCategoryName = item.SubjectCategoryName;
      lesson.Teacher = item.Teacher;
      lesson.Theme = item.Theme;
      lesson.CalendarOraType = item.CalendarOraType;
      lesson.TeacherHomeWorkId = item.TeacherHomeWorkId;
      lesson.IsTanuloHaziFeladatEnabled = item.IsTanuloHaziFeladatEnabled;
      lesson.ProfileId = item.ProfileId;
      lesson.SeenByUser = item.SeenByUser;
      lesson.OsztalyCsoportUid = item.OsztalyCsoportId;
      lesson.IsHomeworkDone = item.IsHomeworkDone;
      return lesson;
    }

    public LessonRealm To(Ekreta.Mobile.Core.Models.Lesson item)
    {
      LessonRealm lessonRealm = new LessonRealm();
      lessonRealm.Id = item.Id;
      lessonRealm.LessonId = item.LessonId;
      ClassGroup classGroup = item.ClassGroup;
      lessonRealm.ClassGroup = classGroup != null ? classGroup.Map() : (ClassGroupRealm) null;
      lessonRealm.ClassRoom = item.ClassRoom;
      lessonRealm.Count = item.Count;
      lessonRealm.Date = new DateTimeOffset(item.Date);
      lessonRealm.DeputyTeacher = item.DeputyTeacher;
      lessonRealm.EndTime = new DateTimeOffset(item.EndTime);
      lessonRealm.Homework = item.Homework;
      lessonRealm.PresenceType = item.PresenceType;
      lessonRealm.PresenceTypeName = item.PresenceTypeName;
      lessonRealm.StartTime = new DateTimeOffset(item.StartTime);
      lessonRealm.State = item.State;
      lessonRealm.StateName = item.StateName;
      lessonRealm.Subject = item.Subject;
      lessonRealm.SubjectCategory = item.SubjectCategory;
      lessonRealm.SubjectCategoryName = item.SubjectCategoryName;
      lessonRealm.Teacher = item.Teacher;
      lessonRealm.Theme = item.Theme;
      lessonRealm.CalendarOraType = item.CalendarOraType;
      lessonRealm.IsTanuloHaziFeladatEnabled = item.IsTanuloHaziFeladatEnabled;
      lessonRealm.TeacherHomeWorkId = item.TeacherHomeWorkId;
      lessonRealm.ProfileId = item.ProfileId;
      lessonRealm.SeenByUser = item.SeenByUser;
      lessonRealm.OsztalyCsoportId = item.OsztalyCsoportUid;
      lessonRealm.IsHomeworkDone = item.IsHomeworkDone;
      return lessonRealm;
    }
  }
}
