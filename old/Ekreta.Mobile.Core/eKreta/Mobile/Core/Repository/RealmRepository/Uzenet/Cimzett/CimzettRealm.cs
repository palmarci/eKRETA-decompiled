// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett.CimzettRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem;
using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett
{
  [Woven(typeof (CimzettRealm.RealmHelper))]
  [Preserve(true, false)]
  public class CimzettRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Realms.PrimaryKey]
    [Preserve]
    public string Azonosito
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Azonosito)) : this.\u003CAzonosito\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CAzonosito\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Azonosito));
        }
        else
          this.SetStringValueUnique(nameof (Azonosito), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public long KretaAzonosito
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<long>.op_Implicit((RealmInteger<long>) this.GetRealmIntegerValue<long>(nameof (KretaAzonosito))) : this.\u003CKretaAzonosito\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CKretaAzonosito\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (KretaAzonosito));
        }
        else
          this.SetRealmIntegerValue<long>(nameof (KretaAzonosito), (RealmInteger<M0>) RealmInteger<long>.op_Implicit(value));
      }
    }

    [WovenProperty]
    [Preserve]
    public string Nev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Nev)) : this.\u003CNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Nev));
        }
        else
          this.SetStringValue(nameof (Nev), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public CimzettTipusAdatSzotarElemRealm Tipus
    {
      get
      {
        return this.get_IsManaged() ? (CimzettTipusAdatSzotarElemRealm) this.GetObjectValue<CimzettTipusAdatSzotarElemRealm>(nameof (Tipus)) : this.\u003CTipus\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTipus\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tipus));
        }
        else
          this.SetObjectValue<CimzettTipusAdatSzotarElemRealm>(nameof (Tipus), (M0) value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Azonosito;
      }
    }

    [Preserve]
    public CimzettRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<CimzettRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new CimzettRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        CimzettRealm cimzettRealm = (CimzettRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || cimzettRealm.\u003CKretaAzonosito\u003Ek__BackingField != 0L)
        {
          // ISSUE: reference to a compiler-generated field
          cimzettRealm.KretaAzonosito = cimzettRealm.\u003CKretaAzonosito\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || cimzettRealm.\u003CNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          cimzettRealm.Nev = cimzettRealm.\u003CNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (cimzettRealm.\u003CTipus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          cimzettRealm.get_Realm().Add<CimzettTipusAdatSzotarElemRealm>((M0) cimzettRealm.\u003CTipus\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        cimzettRealm.Tipus = cimzettRealm.\u003CTipus\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        CimzettRealm cimzettRealm = (CimzettRealm) instance;
        value = (object) cimzettRealm.Azonosito;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
