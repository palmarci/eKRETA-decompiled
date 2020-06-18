// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.TeacherHomeWorkDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using MvvmCross;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class TeacherHomeWorkDataService : ITeacherHomeWorkDataService, IDataService
  {
    private readonly ITeacherHomeWorkRepository _teacherHomeWorkRepository;
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;

    public TeacherHomeWorkDataService()
    {
      this._teacherHomeWorkRepository = (ITeacherHomeWorkRepository) Mvx.get_IoCProvider().Resolve<ITeacherHomeWorkRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public TanarHaziFeladat Get(int id)
    {
      return this._teacherHomeWorkRepository.Find(id.ToString());
    }

    public TanarHaziFeladat GetTeacherHomeWork(Lesson lesson)
    {
      return !lesson.TeacherHomeWorkId.HasValue ? (TanarHaziFeladat) null : this._teacherHomeWorkRepository.Find(lesson.TeacherHomeWorkId.ToString());
    }

    public async Task<TanarHaziFeladat> FetchTeacherHomeWorkAsync(
      Profile profile,
      int id)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetTanarHaziFeladatAsync(profile, id, false);
    }

    public void SaveTeacherHomeWork(Profile profile, TanarHaziFeladat teacherHomeWork)
    {
      teacherHomeWork.ProfileId = profile.RolelessId;
      this._teacherHomeWorkRepository.AddOrUpdate(teacherHomeWork);
    }

    public void Delete(Profile profile)
    {
      this._teacherHomeWorkRepository.Remove((ISpecification) new TeacherHomeWorkByProfileSpecification(profile.RolelessId));
    }
  }
}
