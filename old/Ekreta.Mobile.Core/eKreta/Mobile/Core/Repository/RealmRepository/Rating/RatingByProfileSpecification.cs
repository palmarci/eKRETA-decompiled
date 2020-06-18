// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Rating.RatingByProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Rating
{
  public class RatingByProfileSpecification : ProfileSpecification<RatingRealm>
  {
    public RatingByProfileSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<RatingRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<RatingRealm>) realm.All<RatingRealm>()).Where<RatingRealm>((Expression<Func<RatingRealm, bool>>) (x => x.ProfileId.Equals(this._rolelessProfileId)));
    }
  }
}
