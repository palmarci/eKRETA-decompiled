// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.TeacherHomeWorkDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class TeacherHomeWorkDbDataService : ITeacherHomeWorkDbDataService, IDataService
  {
    private readonly ITeacherHomeWorkDbRepository _teacherHomeWorkRepository;
    private readonly ISecureStore _secureStore;
    private readonly IDbMobileApi _mobileApi;

    public TeacherHomeWorkDbDataService()
    {
      this._teacherHomeWorkRepository = (ITeacherHomeWorkDbRepository) Mvx.get_IoCProvider().Resolve<ITeacherHomeWorkDbRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
    }

    public void AddOrUpdate(
      TeacherHomeWorkRealm teacherHomeWork,
      Action<TeacherHomeWorkRealm> action)
    {
      this._teacherHomeWorkRepository.AddOrUpdate(teacherHomeWork, action);
    }

    public async Task AddOrUpdateAsync(
      TeacherHomeWorkRealm teacherHomeWork,
      Action<TeacherHomeWorkRealm> action)
    {
      await this._teacherHomeWorkRepository.AddOrUpdateAsync(teacherHomeWork, action);
    }

    public void AddOrUpdate(
      IEnumerable<TeacherHomeWorkRealm> teacherHomeWorks,
      Action<TeacherHomeWorkRealm> action)
    {
      if (teacherHomeWorks == null || !teacherHomeWorks.Any<TeacherHomeWorkRealm>())
        return;
      this._teacherHomeWorkRepository.AddOrUpdate(teacherHomeWorks, action);
    }

    public async Task AddOrUpdateAsync(
      IEnumerable<TeacherHomeWorkRealm> teacherHomeWorks,
      Action<TeacherHomeWorkRealm> action)
    {
      if (teacherHomeWorks == null || !teacherHomeWorks.Any<TeacherHomeWorkRealm>())
        return;
      await this._teacherHomeWorkRepository.AddOrUpdateAsync(teacherHomeWorks, action);
    }

    public TeacherHomeWorkRealm GetTeacherHomeWork(LessonRealm lesson)
    {
      return !lesson.TeacherHomeWorkId.HasValue ? (TeacherHomeWorkRealm) null : this._teacherHomeWorkRepository.Find(lesson.TeacherHomeWorkId.ToString());
    }

    public async Task<TeacherHomeWorkRealm> FetchTeacherHomeWorkAsync(
      ProfileRealm profile,
      int id,
      bool forceRefresh = false)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanarHaziFeladatAsync(profile, id, forceRefresh);
    }

    public TeacherHomeWorkRealm Get(int id)
    {
      return this._teacherHomeWorkRepository.Find(id.ToString());
    }

    public void SaveTeacherHomeWork(string profileRolelessId, TeacherHomeWorkRealm teacherHomeWork)
    {
      this._teacherHomeWorkRepository.AddOrUpdate(teacherHomeWork, (Action<TeacherHomeWorkRealm>) (homework => homework.ProfileId = profileRolelessId));
    }

    public void Delete(string profileRolelessId)
    {
      this._teacherHomeWorkRepository.Remove((IEnumerable<TeacherHomeWorkRealm>) this._teacherHomeWorkRepository.Query().Where<TeacherHomeWorkRealm>((Expression<Func<TeacherHomeWorkRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }
  }
}
