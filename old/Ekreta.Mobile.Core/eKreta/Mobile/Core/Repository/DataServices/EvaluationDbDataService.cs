// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.EvaluationDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class EvaluationDbDataService : IEvaluationDbDataService
  {
    private readonly IEvaluationDbRepository _evaluationRepository;
    private readonly ISettingsDataService _settingsDataService;

    public EvaluationDbDataService()
    {
      this._evaluationRepository = (IEvaluationDbRepository) Mvx.get_IoCProvider().Resolve<IEvaluationDbRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(EvaluationRealm evaluation, Action<EvaluationRealm> action = null)
    {
      this._evaluationRepository.AddOrUpdate(evaluation, action);
    }

    public async Task AddOrUpdateAsync(
      EvaluationRealm evaluation,
      Action<EvaluationRealm> action = null)
    {
      await this._evaluationRepository.AddOrUpdateAsync(evaluation, action);
    }

    public void AddOrUpdate(
      IEnumerable<EvaluationRealm> evaluations,
      Action<EvaluationRealm> action = null)
    {
      if (evaluations == null && !evaluations.Any<EvaluationRealm>())
        return;
      this._evaluationRepository.AddOrUpdate(evaluations, action);
    }

    public async Task AddOrUpdateAsync(
      IEnumerable<EvaluationRealm> evaluations,
      Action<EvaluationRealm> action = null)
    {
      if (evaluations == null && !evaluations.Any<EvaluationRealm>())
        return;
      await this._evaluationRepository.AddOrUpdateAsync(evaluations, action);
    }

    public EvaluationRealm Get(int itemId)
    {
      return this._evaluationRepository.Find(itemId.ToString());
    }

    public EvaluationRealm Get(string itemId)
    {
      return this._evaluationRepository.Find(itemId);
    }

    public IEnumerable<EvaluationRealm> GetEvaluations(
      string profileRolelessId)
    {
      return (IEnumerable<EvaluationRealm>) this._evaluationRepository.Query().Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.ProfileId == profileRolelessId));
    }

    public IEnumerable<EvaluationRealm> GetLatestEvaluations(
      string profileRolelessId)
    {
      return (IEnumerable<EvaluationRealm>) this._evaluationRepository.Query().ToList<EvaluationRealm>().Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x =>
      {
        DateTimeOffset dateTimeOffset = new DateTimeOffset(DateTime.Today.AddDays((double) -this._settingsDataService.GetDashboardDayRange()));
        return x.CreatingTime >= dateTimeOffset && x.ProfileId == profileRolelessId;
      })).OrderByDescending<EvaluationRealm, DateTimeOffset>((Func<EvaluationRealm, DateTimeOffset>) (x => x.CreatingTime));
    }

    public int GetNewItemCount()
    {
      return this._evaluationRepository.Query().Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => !x.SeenByUser)).Count<EvaluationRealm>();
    }

    public int GetNewItemCount(string profileRolelessId)
    {
      return this._evaluationRepository.Query().Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.ProfileId == profileRolelessId && !x.SeenByUser)).Count<EvaluationRealm>();
    }

    public int DiffWithStored(string profileRolelessId, IEnumerable<EvaluationRealm> evaluations)
    {
      IEnumerable<EvaluationRealm> evaluations1 = this.GetEvaluations(profileRolelessId);
      return evaluations != null ? evaluations1.Except<EvaluationRealm>(evaluations).Count<EvaluationRealm>() : evaluations1.Count<EvaluationRealm>();
    }

    public void Delete(string profileRolelessId)
    {
      this._evaluationRepository.Remove((IEnumerable<EvaluationRealm>) this._evaluationRepository.Query().Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }

    public void ExpireNewsItems()
    {
      this._evaluationRepository.AddOrUpdate(this._evaluationRepository.Query().ToList<EvaluationRealm>().Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x =>
      {
        DateTimeOffset dateTimeOffset = DateTimeOffset.Now.AddDays((double) -this._settingsDataService.NewsItemExpirationDay);
        return x.CreatedDate < dateTimeOffset;
      })), (Action<EvaluationRealm>) (absence => absence.SeenByUser = true));
    }
  }
}
