// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem.CimzettTipusAdatSzotarElemRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem
{
  [Preserve(true, false)]
  [Woven(typeof (CimzettTipusAdatSzotarElemRealm.RealmHelper))]
  public class CimzettTipusAdatSzotarElemRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [Preserve]
    [WovenProperty]
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

    [Preserve]
    [WovenProperty]
    public string Kod
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Kod)) : this.\u003CKod\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CKod\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Kod));
        }
        else
          this.SetStringValue(nameof (Kod), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string RovidNev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (RovidNev)) : this.\u003CRovidNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CRovidNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (RovidNev));
        }
        else
          this.SetStringValue(nameof (RovidNev), value);
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
    public string Leiras
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Leiras)) : this.\u003CLeiras\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLeiras\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Leiras));
        }
        else
          this.SetStringValue(nameof (Leiras), value);
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
    public CimzettTipusAdatSzotarElemRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<CimzettTipusAdatSzotarElemRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new CimzettTipusAdatSzotarElemRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        CimzettTipusAdatSzotarElemRealm adatSzotarElemRealm = (CimzettTipusAdatSzotarElemRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || adatSzotarElemRealm.\u003CKod\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          adatSzotarElemRealm.Kod = adatSzotarElemRealm.\u003CKod\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || adatSzotarElemRealm.\u003CRovidNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          adatSzotarElemRealm.RovidNev = adatSzotarElemRealm.\u003CRovidNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || adatSzotarElemRealm.\u003CNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          adatSzotarElemRealm.Nev = adatSzotarElemRealm.\u003CNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && adatSzotarElemRealm.\u003CLeiras\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        adatSzotarElemRealm.Leiras = adatSzotarElemRealm.\u003CLeiras\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        CimzettTipusAdatSzotarElemRealm adatSzotarElemRealm = (CimzettTipusAdatSzotarElemRealm) instance;
        value = (object) adatSzotarElemRealm.Azonosito;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
