// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Cache.ProfileCacheSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Cache
{
  public class ProfileCacheSpecification : ProfileSpecification<CacheDataRealm>
  {
    public ProfileCacheSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<CacheDataRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<CacheDataRealm>) realm.All<CacheDataRealm>()).Where<CacheDataRealm>((Expression<Func<CacheDataRealm, bool>>) (x => x.Key.Contains(this._rolelessProfileId)));
    }
  }
}
