// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.SubjectAverageDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;
using Xamarin.Forms.Internals;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class SubjectAverageDbDataService : ISubjectAverageDbDataService, IDataService
  {
    private readonly IDbMobileApi _dbMobileApi;
    private readonly ISubjectAverageDbRepository _subjectAverageRepository;

    public SubjectAverageDbDataService()
    {
      this._dbMobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
      this._subjectAverageRepository = (ISubjectAverageDbRepository) Mvx.get_IoCProvider().Resolve<ISubjectAverageDbRepository>();
    }

    public IEnumerable<SubjectAverageRealm> GetSubjectAverages(
      string profileRolelessId)
    {
      return (IEnumerable<SubjectAverageRealm>) this._subjectAverageRepository.Query().Where<SubjectAverageRealm>((Expression<Func<SubjectAverageRealm, bool>>) (x => x.ProfileId == profileRolelessId));
    }

    public void Delete(string profileRolelessId)
    {
      this._subjectAverageRepository.Remove((IEnumerable<SubjectAverageRealm>) this._subjectAverageRepository.Query().Where<SubjectAverageRealm>((Expression<Func<SubjectAverageRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }

    public void AddOrUpdate(
      string profileRolelessId,
      IEnumerable<SubjectAverageRealm> subjectAverages,
      Action<SubjectAverageRealm> action = null)
    {
      if (subjectAverages == null || !subjectAverages.Any<SubjectAverageRealm>())
        return;
      EnumerableExtensions.ForEach<SubjectAverageRealm>((IEnumerable<M0>) subjectAverages, (Action<M0>) (x => x.ProfileId = profileRolelessId));
      this._subjectAverageRepository.AddOrUpdate(subjectAverages, action);
    }

    public async Task AddOrUpdateAsync(
      string profileRolelessId,
      IEnumerable<SubjectAverageRealm> subjectAverages,
      Action<SubjectAverageRealm> action = null)
    {
      if (subjectAverages == null || !subjectAverages.Any<SubjectAverageRealm>())
        return;
      EnumerableExtensions.ForEach<SubjectAverageRealm>((IEnumerable<M0>) subjectAverages, (Action<M0>) (x => x.ProfileId = profileRolelessId));
      await this._subjectAverageRepository.AddOrUpdateAsync(subjectAverages, action);
    }

    public async Task<IEnumerable<SubjectAverageRealm>> FetchSubjectAveragesAsync(
      ProfileRealm profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._dbMobileApi.GetSubjectAveragesAsync(profile, false);
    }
  }
}
