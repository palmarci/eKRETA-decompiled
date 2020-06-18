// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ILessonDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ILessonDataService
  {
    void AddOrUpdate(Profile profile, Lesson lesson);

    void AddOrUpdate(Profile profile, IEnumerable<Lesson> lessons);

    void OverrideLessons(
      Profile profile,
      IEnumerable<Lesson> lessons,
      DateTime fromDate,
      DateTime toDate);

    IEnumerable<Lesson> GetLessons(
      Profile profile,
      DateTime fromDate,
      DateTime toDate);

    Task<IEnumerable<Lesson>> FetchLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    IEnumerable<Lesson> GetLatestHomeWorks(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int DiffHomeWorksWithStored(
      Profile profile,
      IEnumerable<Lesson> lessons,
      DateTime fromDate,
      DateTime toDate);

    void Delete(Profile profile);

    Lesson Get(string id);

    void ExpireNewsItems();

    Lesson GetByTeacherHomeworkId(int homeworkId);
  }
}
