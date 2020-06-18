// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IEvaluationDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IEvaluationDbDataService
  {
    void AddOrUpdate(EvaluationRealm evaluation, Action<EvaluationRealm> action = null);

    Task AddOrUpdateAsync(EvaluationRealm evaluation, Action<EvaluationRealm> action = null);

    void AddOrUpdate(IEnumerable<EvaluationRealm> evaluations, Action<EvaluationRealm> action = null);

    Task AddOrUpdateAsync(
      IEnumerable<EvaluationRealm> evaluations,
      Action<EvaluationRealm> action = null);

    IEnumerable<EvaluationRealm> GetEvaluations(string profileRolelessId);

    IEnumerable<EvaluationRealm> GetLatestEvaluations(
      string profileRolelessId);

    int GetNewItemCount();

    int GetNewItemCount(string profileRolelessId);

    int DiffWithStored(string profileRolelessId, IEnumerable<EvaluationRealm> evaluations);

    void Delete(string profileRolelessId);

    EvaluationRealm Get(int itemId);

    EvaluationRealm Get(string itemId);

    void ExpireNewsItems();
  }
}
