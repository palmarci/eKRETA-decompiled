// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ITeacherHomeWorkDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ITeacherHomeWorkDbDataService : IDataService
  {
    TeacherHomeWorkRealm GetTeacherHomeWork(LessonRealm lesson);

    Task<TeacherHomeWorkRealm> FetchTeacherHomeWorkAsync(
      ProfileRealm profile,
      int id,
      bool forceRefresh = false);

    TeacherHomeWorkRealm Get(int id);

    void SaveTeacherHomeWork(string profileRolelessId, TeacherHomeWorkRealm teacherHomeWork);

    void AddOrUpdate(TeacherHomeWorkRealm teacherHomeWork, Action<TeacherHomeWorkRealm> action);

    Task AddOrUpdateAsync(
      TeacherHomeWorkRealm teacherHomeWork,
      Action<TeacherHomeWorkRealm> action);

    void AddOrUpdate(
      IEnumerable<TeacherHomeWorkRealm> teacherHomeWorks,
      Action<TeacherHomeWorkRealm> action);

    Task AddOrUpdateAsync(
      IEnumerable<TeacherHomeWorkRealm> absences,
      Action<TeacherHomeWorkRealm> action);

    void Delete(string profileRolelessId);
  }
}
