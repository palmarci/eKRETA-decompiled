// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ILessonDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ILessonDbDataService
  {
    void AddOrUpdate(LessonRealm lesson, Action<LessonRealm> action);

    Task AddOrUpdateAsync(LessonRealm lesson, Action<LessonRealm> action);

    void AddOrUpdate(IEnumerable<LessonRealm> lessons, Action<LessonRealm> action);

    Task AddOrUpdateAsync(IEnumerable<LessonRealm> lessons, Action<LessonRealm> action);

    void OverrideLessons(
      string profileRolelessId,
      IEnumerable<LessonRealm> lessons,
      DateTime fromDate,
      DateTime toDate);

    IEnumerable<LessonRealm> GetLessons(
      string profileRolelessId,
      DateTime fromDate,
      DateTime toDate);

    LessonRealm Get(string id);

    LessonRealm GetByTeacherHomeworkId(int homeworkId);

    int GetNewItemCount();

    int GetNewItemCount(string profileRolelessId);

    IEnumerable<LessonRealm> GetLatestHomeWorks(string profileRolelessId);

    Task<IEnumerable<LessonRealm>> FetchLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    int DiffHomeWorksWithStored(
      string profileRolelessId,
      IEnumerable<LessonRealm> lessons,
      DateTime fromDate,
      DateTime toDate);

    void Delete(string profileRolelessId);

    void ExpireNewsItems();
  }
}
