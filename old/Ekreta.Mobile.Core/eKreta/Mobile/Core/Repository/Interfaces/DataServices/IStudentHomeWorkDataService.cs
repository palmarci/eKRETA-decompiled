// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IStudentHomeWorkDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IStudentHomeWorkDataService : IDataService
  {
    IEnumerable<TanuloHaziFeladat> GetStudentHomeworks(
      Profile profile,
      int teacherHomeWorkId);

    TanuloHaziFeladat GetStudentHomeWork(int id);

    void AddOrUpdate(Profile profile, int teacherHomeWorkId, TanuloHaziFeladat studentHomeWork);

    void AddOrUpdate(
      Profile profile,
      int teacherHomeWorkId,
      IEnumerable<TanuloHaziFeladat> studentHomeWorks);

    void OverrideStudentHomeWorks(
      Profile profile,
      int teacherHomeWorkId,
      IEnumerable<TanuloHaziFeladat> studentHomeWorks);

    Task<TanuloHaziFeladatCreateResponse> CreateStudentHomeWorkAsync(
      Profile profile,
      Lesson lesson,
      string text);

    Task<TanuloHaziFeladat> FetchStudentHomeworkAsync(Profile profile, int id);

    Task<IEnumerable<TanuloHaziFeladat>> FetchStudentHomeWorksAsync(
      Profile profile,
      int teacherHomeWorkId);

    Task DeleteStudentHomeWorkAsync(Profile profile, int id);

    void Delete(Profile profile);
  }
}
