// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.ExamDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class ExamDataService : IExamDataService
  {
    private readonly IExamRepository _examRepository;
    private readonly ISettingsDataService _settingsDataService;
    private readonly IMobileApi _mobileApi;

    public ExamDataService()
    {
      this._examRepository = (IExamRepository) Mvx.get_IoCProvider().Resolve<IExamRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Exam exam)
    {
      exam.ProfileId = profile.Id;
      this._examRepository.AddOrUpdate(exam);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Exam> exams)
    {
      if (exams == null || !exams.Any<Ekreta.Mobile.Core.Models.Exam>())
        return;
      string profileId = profile.Id;
      exams = exams.Select<Ekreta.Mobile.Core.Models.Exam, Ekreta.Mobile.Core.Models.Exam>((Func<Ekreta.Mobile.Core.Models.Exam, Ekreta.Mobile.Core.Models.Exam>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._examRepository.AddOrUpdate(exams);
    }

    public Ekreta.Mobile.Core.Models.Exam Get(int itemId)
    {
      return this._examRepository.Find(itemId.ToString());
    }

    public Ekreta.Mobile.Core.Models.Exam Get(string itemId)
    {
      return this._examRepository.Find(itemId);
    }

    public Ekreta.Mobile.Core.Models.Exam GetByUid(int uid)
    {
      return this._examRepository.Query((ISpecification) new ExamsByUidSpecification(uid.ToString())).FirstOrDefault<Ekreta.Mobile.Core.Models.Exam>();
    }

    public int GetNewItemCount()
    {
      return this._examRepository.Count((ISpecification) new NewExamsSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._examRepository.Count((ISpecification) new NewExamsByProfileSpecification(profile.Id));
    }

    public void Delete(Profile profile)
    {
      this._examRepository.Remove((ISpecification) new ExamsByProfileSpecification(profile.Id));
    }

    public void ExpireNewsItems()
    {
      this._examRepository.AddOrUpdate(this._examRepository.Query((ISpecification) new ExpiredExamsRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<Ekreta.Mobile.Core.Models.Exam, Ekreta.Mobile.Core.Models.Exam>((Func<Ekreta.Mobile.Core.Models.Exam, Ekreta.Mobile.Core.Models.Exam>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }

    public async Task<IEnumerable<Ekreta.Mobile.Core.Models.Exam>> FetchExamsAsync(
      Profile profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetExamsAsync(profile, new DateTime?(), new DateTime?(), false);
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Exam> GetLatest(Profile profile)
    {
      return this._examRepository.Query((ISpecification) new LatestExamRealmSpecification(profile.Id, this._settingsDataService.GetDashboardDayRange()));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Exam> GetExams(Profile profile)
    {
      return this._examRepository.Query((ISpecification) new ExamByProfileSpecification(profile.Id));
    }

    public int GetNewsByProfile(Profile profile)
    {
      return this._examRepository.Count((ISpecification) new NewExamsByProfileSpecification(profile.Id));
    }

    public int DiffWithStored(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Exam> exams)
    {
      return this.GetExams(profile).Except<Ekreta.Mobile.Core.Models.Exam>(exams).Count<Ekreta.Mobile.Core.Models.Exam>();
    }
  }
}
