// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Cache.CacheDataRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Cache
{
  [Preserve(true, false)]
  [Woven(typeof (CacheDataRealm.RealmHelper))]
  public class CacheDataRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Realms.PrimaryKey]
    [Preserve]
    public string Key
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Key)) : this.\u003CKey\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CKey\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Key));
        }
        else
          this.SetStringValueUnique(nameof (Key), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Value
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Value)) : this.\u003CValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Value));
        }
        else
          this.SetStringValue(nameof (Value), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public DateTimeOffset ExpirationDate
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (ExpirationDate)) : this.\u003CExpirationDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CExpirationDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ExpirationDate));
        }
        else
          this.SetDateTimeOffsetValue(nameof (ExpirationDate), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Key;
      }
    }

    [Preserve]
    public CacheDataRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<CacheDataRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new CacheDataRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        CacheDataRealm cacheDataRealm = (CacheDataRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || cacheDataRealm.\u003CValue\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          cacheDataRealm.Value = cacheDataRealm.\u003CValue\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        cacheDataRealm.ExpirationDate = cacheDataRealm.\u003CExpirationDate\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        CacheDataRealm cacheDataRealm = (CacheDataRealm) instance;
        value = (object) cacheDataRealm.Key;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
