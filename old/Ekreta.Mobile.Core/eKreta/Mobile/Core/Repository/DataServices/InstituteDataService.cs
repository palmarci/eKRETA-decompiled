// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.InstituteDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using MvvmCross;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class InstituteDataService : IInstituteDataService
  {
    private readonly IInstituteRepository _instituteRepository;
    private readonly IGlobalMobileApi _globalMobileApi;

    public InstituteDataService()
    {
      this._instituteRepository = (IInstituteRepository) Mvx.get_IoCProvider().Resolve<IInstituteRepository>();
      this._globalMobileApi = (IGlobalMobileApi) Mvx.get_IoCProvider().Resolve<IGlobalMobileApi>();
    }

    public Ekreta.Mobile.Core.Models.Institute GetInstitute(string instituteCode)
    {
      return this._instituteRepository.Find(instituteCode);
    }

    public Ekreta.Mobile.Core.Models.Institute GetInstituteById(string instituteId)
    {
      return this._instituteRepository.Query((ISpecification) new InstituteByIdSpecificaton(instituteId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Institute>();
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Institute> GetInstitutes()
    {
      return this._instituteRepository.Query();
    }

    public async Task<IEnumerable<Ekreta.Mobile.Core.Models.Institute>> FetchInstitutesAsync()
    {
      IEnumerable<Ekreta.Mobile.Core.Models.Institute> institutesAsync = await this._globalMobileApi.GetInstitutesAsync();
      this.SaveInstitutes(institutesAsync);
      return institutesAsync;
    }

    public void SaveInstitutes(IEnumerable<Ekreta.Mobile.Core.Models.Institute> institutes)
    {
      this._instituteRepository.AddOrUpdate(institutes);
    }
  }
}
