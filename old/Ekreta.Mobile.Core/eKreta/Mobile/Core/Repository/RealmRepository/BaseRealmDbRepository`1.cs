// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.BaseRealmDbRepository`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public abstract class BaseRealmDbRepository<T> : IDbRepository<T> where T : RealmObject, IPrimaryKey
  {
    protected RealmConfiguration _realmConfiguration;

    public BaseRealmDbRepository()
    {
      this._realmConfiguration = RealmUtils.RealmConfiguration;
    }

    public void AddOrUpdate(T item, Action<T> action = null)
    {
      if ((object) item == null)
        return;
      try
      {
        RealmDb.Instance.Write((Action) (() =>
        {
          Action<T> action1 = action;
          if (action1 != null)
            action1(item);
          RealmDb.Instance.Add<T>((M0) item, true);
        }));
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmDbRepository.cs", 39);
      }
    }

    public async Task AddOrUpdateAsync(T item, Action<T> action = null)
    {
      if ((object) item == null)
        return;
      try
      {
        await RealmDb.Instance.WriteAsync((Action<Realm>) (tempRealm =>
        {
          Action<T> action1 = action;
          if (action1 != null)
            action1(item);
          tempRealm.Add<T>((M0) item, true);
        }));
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdateAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmDbRepository.cs", 61);
      }
    }

    public void AddOrUpdate(IEnumerable<T> items, Action<T> action = null)
    {
      if (items == null)
        return;
      try
      {
        RealmDb.Instance.Write((Action) (() =>
        {
          foreach (T obj in items)
          {
            Action<T> action1 = action;
            if (action1 != null)
              action1(obj);
            RealmDb.Instance.Add<T>((M0) obj, true);
          }
        }));
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmDbRepository.cs", 86);
      }
    }

    public async Task AddOrUpdateAsync(IEnumerable<T> items, Action<T> action = null)
    {
      if (items == null)
        return;
      try
      {
        await RealmDb.Instance.WriteAsync((Action<Realm>) (tempRealm =>
        {
          foreach (T obj in items)
          {
            Action<T> action1 = action;
            if (action1 != null)
              action1(obj);
            tempRealm.Add<T>((M0) obj, true);
          }
        }));
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdateAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmDbRepository.cs", 111);
      }
    }

    public T Find(string Id)
    {
      M0 m0 = RealmDb.Instance.Find<T>(Id);
      return (object) (T) m0 != null ? (T) m0 : default (T);
    }

    public IQueryable<T> Query()
    {
      return (IQueryable<T>) RealmDb.Instance.All<T>();
    }

    public int Count()
    {
      return ((IQueryable<T>) RealmDb.Instance.All<T>()).Count<T>();
    }

    public void Remove(T item)
    {
      if ((object) item == null)
        return;
      RealmDb.Instance.Write((Action) (() =>
      {
        T obj = (T) RealmDb.Instance.Find<T>(item.PrimaryKey);
        if ((object) obj == null)
          return;
        RealmDb.Instance.Remove((RealmObject) (object) obj);
      }));
    }

    public void Remove(IEnumerable<T> items)
    {
      if (items == null || !items.Any<T>())
        return;
      RealmDb.Instance.Write((Action) (() =>
      {
        foreach (T obj1 in items)
        {
          T obj2 = (T) RealmDb.Instance.Find<T>(obj1.PrimaryKey);
          if ((object) obj2 != null)
            RealmDb.Instance.Remove((RealmObject) (object) obj2);
        }
      }));
    }
  }
}
