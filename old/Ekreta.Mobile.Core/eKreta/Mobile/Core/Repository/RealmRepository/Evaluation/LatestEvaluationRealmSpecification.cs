// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation.LatestEvaluationRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation
{
  public class LatestEvaluationRealmSpecification : ProfileSpecification<EvaluationRealm>
  {
    public LatestEvaluationRealmSpecification(string rolelessProfileId, int dayRange)
      : base(rolelessProfileId)
    {
      this.DayRange = dayRange;
    }

    public int DayRange { get; }

    public override IQueryable<EvaluationRealm> ToRealmResults(Realm realm)
    {
      DateTimeOffset day = new DateTimeOffset(DateTime.Today.AddDays((double) -this.DayRange));
      return (IQueryable<EvaluationRealm>) ((IQueryable<EvaluationRealm>) realm.All<EvaluationRealm>()).Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.CreatingTime >= day && x.ProfileId == this._rolelessProfileId)).OrderByDescending<EvaluationRealm, DateTimeOffset>((Expression<Func<EvaluationRealm, DateTimeOffset>>) (x => x.CreatingTime));
    }
  }
}
