// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.ProfileSpecification`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public abstract class ProfileSpecification<T> : IRealmSpecification<T>, ISpecification
    where T : RealmObject
  {
    protected string _rolelessProfileId;

    public ProfileSpecification(string rolelessProfileId)
    {
      this._rolelessProfileId = rolelessProfileId;
    }

    public abstract IQueryable<T> ToRealmResults(Realm realm);
  }
}
