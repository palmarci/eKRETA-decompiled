// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.IDbRepository`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces
{
  public interface IDbRepository<T>
  {
    void AddOrUpdate(T item, Action<T> action = null);

    Task AddOrUpdateAsync(T item, Action<T> action = null);

    void AddOrUpdate(IEnumerable<T> items, Action<T> action = null);

    Task AddOrUpdateAsync(IEnumerable<T> items, Action<T> action = null);

    T Find(string Id);

    IQueryable<T> Query();

    int Count();

    void Remove(T item);

    void Remove(IEnumerable<T> items);
  }
}
