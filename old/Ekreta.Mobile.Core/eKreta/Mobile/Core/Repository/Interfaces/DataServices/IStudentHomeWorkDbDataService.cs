// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IStudentHomeWorkDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IStudentHomeWorkDbDataService : IDataService
  {
    IEnumerable<StudentHomeWorkRealm> GetStudentHomeworks(
      string profileRolelessId,
      int teacherHomeWorkId);

    StudentHomeWorkRealm GetStudentHomeWork(int id);

    void AddOrUpdate(
      string profileRolelessId,
      int teacherHomeWorkId,
      StudentHomeWorkRealm studentHomeWork);

    void AddOrUpdate(
      string profileRolelessId,
      int teacherHomeWorkId,
      IEnumerable<StudentHomeWorkRealm> studentHomeWorks);

    void OverrideStudentHomeWorks(
      string profileRolelessId,
      int teacherHomeWorkId,
      IEnumerable<StudentHomeWorkRealm> studentHomeWorks);

    Task<TanuloHaziFeladatCreateResponse> CreateStudentHomeWorkAsync(
      ProfileRealm profile,
      LessonRealm lesson,
      string text);

    Task<StudentHomeWorkRealm> FetchStudentHomeworkAsync(
      ProfileRealm profile,
      int id);

    Task<IEnumerable<StudentHomeWorkRealm>> FetchStudentHomeWorksAsync(
      ProfileRealm profile,
      int teacherHomeWorkId);

    Task DeleteStudentHomeWorkAsync(ProfileRealm profile, int id);

    void Delete(string profileRolelessId);
  }
}
