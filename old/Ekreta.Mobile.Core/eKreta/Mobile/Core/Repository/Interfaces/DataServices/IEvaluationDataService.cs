// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IEvaluationDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IEvaluationDataService
  {
    void AddOrUpdate(Profile profile, Evaluation evaluation);

    void AddOrUpdate(Profile profile, IEnumerable<Evaluation> evaluations);

    IEnumerable<Evaluation> GetEvaluations(Profile profile);

    IEnumerable<Evaluation> GetLatestEvaluations(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int DiffWithStored(Profile profile, IEnumerable<Evaluation> evaluations);

    void Delete(Profile profile);

    Evaluation Get(int itemId);

    Evaluation Get(string itemId);

    void ExpireNewsItems();
  }
}
