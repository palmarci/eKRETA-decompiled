// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.BaseRealmRepository`2
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public abstract class BaseRealmRepository<T, V>
    where T : class
    where V : RealmObject, IPrimaryKey
  {
    protected RealmConfiguration _realmConfiguration;
    protected IRealmMapper<T, V> _mapper;

    public BaseRealmRepository()
    {
      this._realmConfiguration = RealmUtils.RealmConfiguration;
    }

    public void AddOrUpdate(T item)
    {
      if ((object) item == null)
        return;
      using (Realm realmInstance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
      {
        try
        {
          realmInstance.Write((Action) (() => realmInstance.Add<V>((M0) this._mapper.To(item), true)));
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmRepository.cs", 39);
        }
      }
    }

    public void AddOrUpdate(IEnumerable<T> items)
    {
      if (items == null)
        return;
      using (Realm realmInstance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
      {
        try
        {
          realmInstance.Write((Action) (() =>
          {
            foreach (T obj in items)
              realmInstance.Add<V>((M0) this._mapper.To(obj), true);
          }));
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (AddOrUpdate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/RealmRepository/BaseRealmRepository.cs", 66);
        }
      }
    }

    public T Find(string Id)
    {
      using (Realm instance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
      {
        V v = (V) instance.Find<V>(Id);
        return (object) v != null ? this._mapper.From(v) : default (T);
      }
    }

    public IEnumerable<T> Query()
    {
      using (Realm instance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        return (IEnumerable<T>) ((IEnumerable<V>) instance.All<V>()).ToList<V>().Select<V, T>((Func<V, T>) (x => this._mapper.From(x))).ToList<T>();
    }

    public IEnumerable<T> Query(ISpecification specification)
    {
      if (!(specification is IRealmSpecification<V>))
        throw new InvalidCastException("Not an IRealmSpecification!");
      using (Realm instance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        return (IEnumerable<T>) (specification as IRealmSpecification<V>).ToRealmResults(instance).ToList<V>().Select<V, T>((Func<V, T>) (x => this._mapper.From(x))).ToList<T>();
    }

    public int Count()
    {
      using (Realm instance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        return ((IQueryable<V>) instance.All<V>()).Count<V>();
    }

    public int Count(ISpecification specification)
    {
      if (!(specification is IRealmSpecification<V>))
        throw new InvalidCastException("Not an IRealmSpecification!");
      using (Realm instance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        return (specification as IRealmSpecification<V>).ToRealmResults(instance).Count<V>();
    }

    public void Remove(T item)
    {
      if ((object) item == null)
        return;
      using (Realm realmInstance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        realmInstance.Write((Action) (() =>
        {
          V v = (V) realmInstance.Find<V>(this._mapper.To(item).PrimaryKey);
          if ((object) v == null)
            return;
          realmInstance.Remove((RealmObject) (object) v);
        }));
    }

    public void Remove(IEnumerable<T> items)
    {
      if (items == null || !items.Any<T>())
        return;
      using (Realm realmInstance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        realmInstance.Write((Action) (() =>
        {
          foreach (T obj in items)
          {
            V v = (V) realmInstance.Find<V>(this._mapper.To(obj).PrimaryKey);
            if ((object) v != null)
              realmInstance.Remove((RealmObject) (object) v);
          }
        }));
    }

    public void Remove(ISpecification specification)
    {
      if (!(specification is IRealmSpecification<V>))
        throw new InvalidCastException("Not an IRealmSpecification!");
      IRealmSpecification<V> realmSpecification = specification as IRealmSpecification<V>;
      using (Realm realmInstance = Realm.GetInstance((RealmConfigurationBase) this._realmConfiguration))
        realmInstance.Write((Action) (() => realmInstance.RemoveRange<V>((IQueryable<M0>) realmSpecification.ToRealmResults(realmInstance))));
    }
  }
}
