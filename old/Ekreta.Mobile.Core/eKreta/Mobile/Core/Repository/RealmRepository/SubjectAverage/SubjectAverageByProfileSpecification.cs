// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage.SubjectAverageByProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage
{
  public class SubjectAverageByProfileSpecification : ProfileSpecification<SubjectAverageRealm>
  {
    public SubjectAverageByProfileSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<SubjectAverageRealm> ToRealmResults(
      Realm realm)
    {
      return ((IQueryable<SubjectAverageRealm>) realm.All<SubjectAverageRealm>()).Where<SubjectAverageRealm>((Expression<Func<SubjectAverageRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId));
    }
  }
}
