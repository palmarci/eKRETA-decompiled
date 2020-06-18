// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.StudentHomeWorkDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class StudentHomeWorkDbDataService : IStudentHomeWorkDbDataService, IDataService
  {
    private readonly IStudentHomeWorkDbRepository _studentHomeWorkRepository;
    private readonly ILessonDbDataService _lessonDataService;
    private readonly ISecureStore _secureStore;
    private readonly IDbMobileApi _mobileApi;

    public StudentHomeWorkDbDataService()
    {
      this._studentHomeWorkRepository = (IStudentHomeWorkDbRepository) Mvx.get_IoCProvider().Resolve<IStudentHomeWorkDbRepository>();
      this._lessonDataService = (ILessonDbDataService) Mvx.get_IoCProvider().Resolve<ILessonDbDataService>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
    }

    public async Task<TanuloHaziFeladatCreateResponse> CreateStudentHomeWorkAsync(
      ProfileRealm profile,
      LessonRealm lesson,
      string text)
    {
      TanuloHaziFeladatCreateResponse result;
      try
      {
        if (profile == null)
          throw new ArgumentNullException(nameof (profile));
        TaskAwaiter<TanuloHaziFeladatCreateResponse> awaiter = this._mobileApi.CreateTanuloHaziFeladatAsync(profile, lesson, text).GetAwaiter();
        if (!awaiter.IsCompleted)
        {
          int num;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 0;
          TaskAwaiter<TanuloHaziFeladatCreateResponse> taskAwaiter = awaiter;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TanuloHaziFeladatCreateResponse>, StudentHomeWorkDbDataService.\u003CCreateStudentHomeWorkAsync\u003Ed__5>(ref awaiter, this);
          return;
        }
        TanuloHaziFeladatCreateResponse newHomeWork = awaiter.GetResult();
        if (!lesson.TeacherHomeWorkId.HasValue)
          this._lessonDataService.AddOrUpdate(lesson, (Action<LessonRealm>) (l => l.TeacherHomeWorkId = new int?(newHomeWork.TanarHaziFeladatId)));
        result = newHomeWork;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<StudentHomeWorkRealm> FetchStudentHomeworkAsync(
      ProfileRealm profile,
      int id)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanuloHaziFeladatAsync(profile, id, true);
    }

    public async Task<IEnumerable<StudentHomeWorkRealm>> FetchStudentHomeWorksAsync(
      ProfileRealm profile,
      int teacherHomeWorkId)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanuloHaziFeladatListaAsync(profile, teacherHomeWorkId, true);
    }

    public async Task DeleteStudentHomeWorkAsync(ProfileRealm profile, int id)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      await this._mobileApi.DeleteTanuloHaziFeladatAsync(profile, id);
    }

    public IEnumerable<StudentHomeWorkRealm> GetStudentHomeworks(
      string profileRolelessId,
      int teacherHomeWorkId)
    {
      return (IEnumerable<StudentHomeWorkRealm>) this._studentHomeWorkRepository.Query().Where<StudentHomeWorkRealm>((Expression<Func<StudentHomeWorkRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.TanarHaziFeladatId == teacherHomeWorkId));
    }

    public StudentHomeWorkRealm GetStudentHomeWork(int id)
    {
      return this._studentHomeWorkRepository.Find(id.ToString());
    }

    public void AddOrUpdate(
      string profileRolelessId,
      int teacherHomeWorkId,
      StudentHomeWorkRealm studentHomeWork)
    {
      this._studentHomeWorkRepository.AddOrUpdate(studentHomeWork, (Action<StudentHomeWorkRealm>) (homework =>
      {
        homework.ProfileId = profileRolelessId;
        homework.TanarHaziFeladatId = teacherHomeWorkId;
      }));
    }

    public void AddOrUpdate(
      string profileRolelessId,
      int teacherHomeWorkId,
      IEnumerable<StudentHomeWorkRealm> studentHomeWorks)
    {
      this._studentHomeWorkRepository.AddOrUpdate(studentHomeWorks, (Action<StudentHomeWorkRealm>) (homework =>
      {
        homework.ProfileId = profileRolelessId;
        homework.TanarHaziFeladatId = teacherHomeWorkId;
      }));
    }

    public void OverrideStudentHomeWorks(
      string profileRolelessId,
      int teacherHomeWorkId,
      IEnumerable<StudentHomeWorkRealm> studentHomeWorks)
    {
      if (studentHomeWorks == null || !studentHomeWorks.Any<StudentHomeWorkRealm>())
        return;
      foreach (int num in studentHomeWorks.Select<StudentHomeWorkRealm, int>((Func<StudentHomeWorkRealm, int>) (x => x.TanarHaziFeladatId)).Distinct<int>())
        this._studentHomeWorkRepository.Remove((IEnumerable<StudentHomeWorkRealm>) this._studentHomeWorkRepository.Query().Where<StudentHomeWorkRealm>((Expression<Func<StudentHomeWorkRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.TanarHaziFeladatId == teacherHomeWorkId)));
      this.AddOrUpdate(profileRolelessId, teacherHomeWorkId, studentHomeWorks);
    }

    public void Delete(string profileRolelessId)
    {
      this._studentHomeWorkRepository.Remove((IEnumerable<StudentHomeWorkRealm>) this._studentHomeWorkRepository.Query().Where<StudentHomeWorkRealm>((Expression<Func<StudentHomeWorkRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }
  }
}
