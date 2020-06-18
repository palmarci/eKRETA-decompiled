// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Specifications.NewPostaladaElemByProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Specifications
{
  public class NewPostaladaElemByProfileSpecification : ProfileSpecification<PostaladaElemRealm>
  {
    public NewPostaladaElemByProfileSpecification(string rolelessId)
      : base(rolelessId)
    {
    }

    public override IQueryable<PostaladaElemRealm> ToRealmResults(
      Realm realm)
    {
      return ((IQueryable<PostaladaElemRealm>) realm.All<PostaladaElemRealm>()).Where<PostaladaElemRealm>((Expression<Func<PostaladaElemRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId && !x.IsElolvasva));
    }
  }
}
