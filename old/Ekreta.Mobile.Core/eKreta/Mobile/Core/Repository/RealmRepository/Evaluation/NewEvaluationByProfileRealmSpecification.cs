// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation.NewEvaluationByProfileRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation
{
  public class NewEvaluationByProfileRealmSpecification : ProfileSpecification<EvaluationRealm>
  {
    public NewEvaluationByProfileRealmSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<EvaluationRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<EvaluationRealm>) realm.All<EvaluationRealm>()).Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId && !x.SeenByUser));
    }
  }
}
