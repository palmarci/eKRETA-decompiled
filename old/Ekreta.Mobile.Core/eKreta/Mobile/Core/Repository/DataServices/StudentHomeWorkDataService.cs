// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.StudentHomeWorkDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class StudentHomeWorkDataService : IStudentHomeWorkDataService, IDataService
  {
    private readonly IStudentHomeWorkRepository _studentHomeWorkRepository;
    private readonly ILessonDataService _lessonDataService;
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;

    public StudentHomeWorkDataService()
    {
      this._studentHomeWorkRepository = (IStudentHomeWorkRepository) Mvx.get_IoCProvider().Resolve<IStudentHomeWorkRepository>();
      this._lessonDataService = (ILessonDataService) Mvx.get_IoCProvider().Resolve<ILessonDataService>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public async Task<TanuloHaziFeladatCreateResponse> CreateStudentHomeWorkAsync(
      Profile profile,
      Lesson lesson,
      string text)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      TanuloHaziFeladatCreateResponse haziFeladatAsync = await this._mobileApi.CreateTanuloHaziFeladatAsync(profile, lesson, text);
      if (!lesson.TeacherHomeWorkId.HasValue)
      {
        lesson.TeacherHomeWorkId = new int?(haziFeladatAsync.TanarHaziFeladatId);
        this._lessonDataService.AddOrUpdate(profile, lesson);
      }
      return haziFeladatAsync;
    }

    public async Task<TanuloHaziFeladat> FetchStudentHomeworkAsync(
      Profile profile,
      int id)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanuloHaziFeladatAsync(profile, id, true);
    }

    public async Task<IEnumerable<TanuloHaziFeladat>> FetchStudentHomeWorksAsync(
      Profile profile,
      int teacherHomeWorkId)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanuloHaziFeladatListaAsync(profile, teacherHomeWorkId, true);
    }

    public async Task DeleteStudentHomeWorkAsync(Profile profile, int id)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      await this._mobileApi.DeleteTanuloHaziFeladatAsync(profile, id);
    }

    public IEnumerable<TanuloHaziFeladat> GetStudentHomeworks(
      Profile profile,
      int teacherHomeWorkId)
    {
      return this._studentHomeWorkRepository.Query((ISpecification) new GetByProfileAndTeacherHomeWorkIdSpecification(profile.RolelessId, teacherHomeWorkId));
    }

    public TanuloHaziFeladat GetStudentHomeWork(int id)
    {
      return this._studentHomeWorkRepository.Find(id.ToString());
    }

    public void AddOrUpdate(
      Profile profile,
      int teacherHomeWorkId,
      TanuloHaziFeladat studentHomeWork)
    {
      studentHomeWork.ProfileId = profile.RolelessId;
      studentHomeWork.TeacherHomeWorkId = teacherHomeWorkId;
      this._studentHomeWorkRepository.AddOrUpdate(studentHomeWork);
    }

    public void AddOrUpdate(
      Profile profile,
      int teacherHomeWorkId,
      IEnumerable<TanuloHaziFeladat> studentHomeWorks)
    {
      string profileId = profile.RolelessId;
      studentHomeWorks = studentHomeWorks.Select<TanuloHaziFeladat, TanuloHaziFeladat>((Func<TanuloHaziFeladat, TanuloHaziFeladat>) (x =>
      {
        x.ProfileId = profileId;
        x.TeacherHomeWorkId = teacherHomeWorkId;
        return x;
      }));
      this._studentHomeWorkRepository.AddOrUpdate(studentHomeWorks);
    }

    public void OverrideStudentHomeWorks(
      Profile profile,
      int teacherHomeWorkId,
      IEnumerable<TanuloHaziFeladat> studentHomeWorks)
    {
      if (studentHomeWorks == null || !studentHomeWorks.Any<TanuloHaziFeladat>())
        return;
      foreach (int teacherHomeWorkId1 in studentHomeWorks.Select<TanuloHaziFeladat, int>((Func<TanuloHaziFeladat, int>) (x => x.TeacherHomeWorkId)).Distinct<int>())
        this._studentHomeWorkRepository.Remove((ISpecification) new GetByProfileAndTeacherHomeWorkIdSpecification(profile.RolelessId, teacherHomeWorkId1));
      this.AddOrUpdate(profile, teacherHomeWorkId, studentHomeWorks);
    }

    public void Delete(Profile profile)
    {
      this._studentHomeWorkRepository.Remove((ISpecification) new GetByProfileSpecification(profile.RolelessId));
    }
  }
}
