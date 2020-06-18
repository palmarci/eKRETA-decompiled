// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.ActiveProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile
{
  public class ActiveProfileSpecification : IRealmSpecification<ProfileRealm>, ISpecification
  {
    public IQueryable<ProfileRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<ProfileRealm>) realm.All<ProfileRealm>()).Where<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.IsActive));
    }
  }
}
