// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.EvaluationDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class EvaluationDataService : IEvaluationDataService
  {
    private readonly IEvaluationRepository _evaluationRepository;
    private readonly ISettingsDataService _settingsDataService;

    public EvaluationDataService()
    {
      this._evaluationRepository = (IEvaluationRepository) Mvx.get_IoCProvider().Resolve<IEvaluationRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(Profile profile, eKreta.Mobile.Core.Models.Evaluation evaluation)
    {
      evaluation.ProfileId = profile.RolelessId;
      this._evaluationRepository.AddOrUpdate(evaluation);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<eKreta.Mobile.Core.Models.Evaluation> evaluations)
    {
      if (evaluations == null || !evaluations.Any<eKreta.Mobile.Core.Models.Evaluation>())
        return;
      string profileId = profile.RolelessId;
      evaluations = evaluations.Select<eKreta.Mobile.Core.Models.Evaluation, eKreta.Mobile.Core.Models.Evaluation>((Func<eKreta.Mobile.Core.Models.Evaluation, eKreta.Mobile.Core.Models.Evaluation>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._evaluationRepository.AddOrUpdate(evaluations);
    }

    public eKreta.Mobile.Core.Models.Evaluation Get(int itemId)
    {
      return this._evaluationRepository.Find(itemId.ToString());
    }

    public eKreta.Mobile.Core.Models.Evaluation Get(string itemId)
    {
      return this._evaluationRepository.Find(itemId);
    }

    public IEnumerable<eKreta.Mobile.Core.Models.Evaluation> GetEvaluations(
      Profile profile)
    {
      return this._evaluationRepository.Query((ISpecification) new EvaluationByProfileSpecification(profile.RolelessId));
    }

    public IEnumerable<eKreta.Mobile.Core.Models.Evaluation> GetLatestEvaluations(
      Profile profile)
    {
      return this._evaluationRepository.Query((ISpecification) new LatestEvaluationRealmSpecification(profile.RolelessId, this._settingsDataService.GetDashboardDayRange()));
    }

    public int GetNewItemCount()
    {
      return this._evaluationRepository.Count((ISpecification) new NewEvaluationSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._evaluationRepository.Count((ISpecification) new NewEvaluationByProfileRealmSpecification(profile.RolelessId));
    }

    public int DiffWithStored(Profile profile, IEnumerable<eKreta.Mobile.Core.Models.Evaluation> evaluations)
    {
      IEnumerable<eKreta.Mobile.Core.Models.Evaluation> evaluations1 = this.GetEvaluations(profile);
      return evaluations != null ? evaluations1.Except<eKreta.Mobile.Core.Models.Evaluation>(evaluations).Count<eKreta.Mobile.Core.Models.Evaluation>() : evaluations1.Count<eKreta.Mobile.Core.Models.Evaluation>();
    }

    public void Delete(Profile profile)
    {
      this._evaluationRepository.Remove((ISpecification) new EvaluationByProfileSpecification(profile.RolelessId));
    }

    public void ExpireNewsItems()
    {
      this._evaluationRepository.AddOrUpdate(this._evaluationRepository.Query((ISpecification) new ExpiredEvaluationsRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<eKreta.Mobile.Core.Models.Evaluation, eKreta.Mobile.Core.Models.Evaluation>((Func<eKreta.Mobile.Core.Models.Evaluation, eKreta.Mobile.Core.Models.Evaluation>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }
  }
}
