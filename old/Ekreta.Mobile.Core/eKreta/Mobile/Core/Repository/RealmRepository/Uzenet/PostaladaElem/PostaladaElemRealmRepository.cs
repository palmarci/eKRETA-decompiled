﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem.PostaladaElemRealmRepository
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Uzenetek;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem
{
  public class PostaladaElemRealmRepository : BaseRealmRepository<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem, PostaladaElemRealm>, IPostaladaElemRepository, IRepository<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem>
  {
    public PostaladaElemRealmRepository()
    {
      this._mapper = (IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem, PostaladaElemRealm>) new PostaladaElemRealmMapper();
    }
  }
}
