// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.SubjectAverageDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class SubjectAverageDataService : ISubjectAverageDataService, IDataService
  {
    private readonly IMobileApi _mobileApi;
    private readonly ISubjectAverageRepository _subjectAverageRepository;

    public SubjectAverageDataService()
    {
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      this._subjectAverageRepository = (ISubjectAverageRepository) Mvx.get_IoCProvider().Resolve<ISubjectAverageRepository>();
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.SubjectAverage> GetSubjectAverages(
      Profile profile)
    {
      return this._subjectAverageRepository.Query((ISpecification) new SubjectAverageByProfileSpecification(profile.RolelessId));
    }

    public void Delete(Profile profile)
    {
      this._subjectAverageRepository.Remove((ISpecification) new SubjectAverageByProfileSpecification(profile.RolelessId));
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.SubjectAverage> subjectAverages)
    {
      if (subjectAverages == null || !subjectAverages.Any<Ekreta.Mobile.Core.Models.SubjectAverage>())
        return;
      subjectAverages = subjectAverages.Select<Ekreta.Mobile.Core.Models.SubjectAverage, Ekreta.Mobile.Core.Models.SubjectAverage>((Func<Ekreta.Mobile.Core.Models.SubjectAverage, Ekreta.Mobile.Core.Models.SubjectAverage>) (x =>
      {
        x.ProfileId = profile.RolelessId;
        return x;
      }));
      this._subjectAverageRepository.AddOrUpdate(subjectAverages);
    }

    public async Task<IEnumerable<Ekreta.Mobile.Core.Models.SubjectAverage>> FetchSubjectAveragesAsync(
      Profile profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetSubjectAveragesAsync(profile, false);
    }
  }
}
