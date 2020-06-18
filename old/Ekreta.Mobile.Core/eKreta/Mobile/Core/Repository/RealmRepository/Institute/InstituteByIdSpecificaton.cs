// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Institute.InstituteByIdSpecificaton
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Institute
{
  public class InstituteByIdSpecificaton : IRealmSpecification<InstituteRealm>, ISpecification
  {
    protected string _instituteId;

    public InstituteByIdSpecificaton(string instituteId)
    {
      this._instituteId = instituteId;
    }

    public IQueryable<InstituteRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<InstituteRealm>) realm.All<InstituteRealm>()).Where<InstituteRealm>((Expression<Func<InstituteRealm, bool>>) (x => x.InstituteId == this._instituteId));
    }
  }
}
