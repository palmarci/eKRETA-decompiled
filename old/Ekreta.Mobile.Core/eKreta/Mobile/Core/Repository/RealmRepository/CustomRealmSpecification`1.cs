// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.CustomRealmSpecification`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public class CustomRealmSpecification<T> : IRealmSpecification<T>, ISpecification
    where T : RealmObject
  {
    private readonly Func<T, bool> _function;

    public CustomRealmSpecification(Func<T, bool> function)
    {
      this._function = function;
    }

    public IQueryable<T> ToRealmResults(Realm realm)
    {
      return ((IEnumerable<T>) realm.All<T>()).Where<T>(this._function).AsQueryable<T>();
    }
  }
}
