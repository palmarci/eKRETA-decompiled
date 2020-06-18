// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.IRepository`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces
{
  public interface IRepository<T>
  {
    void AddOrUpdate(T item);

    void AddOrUpdate(IEnumerable<T> items);

    T Find(string Id);

    void Remove(T item);

    void Remove(IEnumerable<T> items);

    void Remove(ISpecification specification);

    IEnumerable<T> Query();

    IEnumerable<T> Query(ISpecification specification);

    int Count();

    int Count(ISpecification specification);
  }
}
