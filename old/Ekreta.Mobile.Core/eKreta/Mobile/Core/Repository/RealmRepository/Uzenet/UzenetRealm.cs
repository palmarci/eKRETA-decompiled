// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.UzenetRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany;
using Realms;
using Realms.Weaving;
using System;
using System.Collections.Generic;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet
{
  [Woven(typeof (UzenetRealm.RealmHelper))]
  [Preserve(true, false)]
  public class UzenetRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [WovenProperty]
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

    [Preserve]
    [WovenProperty]
    public DateTimeOffset KuldesDatum
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (KuldesDatum)) : this.\u003CKuldesDatum\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CKuldesDatum\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (KuldesDatum));
        }
        else
          this.SetDateTimeOffsetValue(nameof (KuldesDatum), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string FeladoNev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (FeladoNev)) : this.\u003CFeladoNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFeladoNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FeladoNev));
        }
        else
          this.SetStringValue(nameof (FeladoNev), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string FeladoTitulus
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (FeladoTitulus)) : this.\u003CFeladoTitulus\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFeladoTitulus\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FeladoTitulus));
        }
        else
          this.SetStringValue(nameof (FeladoTitulus), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Szoveg
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Szoveg)) : this.\u003CSzoveg\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSzoveg\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Szoveg));
        }
        else
          this.SetStringValue(nameof (Szoveg), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Targy
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Targy)) : this.\u003CTargy\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTargy\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Targy));
        }
        else
          this.SetStringValue(nameof (Targy), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public IList<CimzettRealm> CimzettLista
    {
      get
      {
        if (this.\u003CCimzettLista\u003Ek__BackingField == null)
        {
          UzenetRealm uzenetRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<CimzettRealm>(nameof (CimzettLista));
            uzenetRealm.\u003CCimzettLista\u003Ek__BackingField = (IList<CimzettRealm>) listValue;
          }
          else
          {
            List<CimzettRealm> cimzettRealmList = new List<CimzettRealm>();
            uzenetRealm.\u003CCimzettLista\u003Ek__BackingField = (IList<CimzettRealm>) cimzettRealmList;
          }
        }
        return this.\u003CCimzettLista\u003Ek__BackingField;
      }
    }

    [WovenProperty]
    [Preserve]
    public IList<CsatolmanyRealm> Csatolmanyok
    {
      get
      {
        if (this.\u003CCsatolmanyok\u003Ek__BackingField == null)
        {
          UzenetRealm uzenetRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<CsatolmanyRealm>(nameof (Csatolmanyok));
            uzenetRealm.\u003CCsatolmanyok\u003Ek__BackingField = (IList<CsatolmanyRealm>) listValue;
          }
          else
          {
            List<CsatolmanyRealm> csatolmanyRealmList = new List<CsatolmanyRealm>();
            uzenetRealm.\u003CCsatolmanyok\u003Ek__BackingField = (IList<CsatolmanyRealm>) csatolmanyRealmList;
          }
        }
        return this.\u003CCsatolmanyok\u003Ek__BackingField;
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
    public UzenetRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<UzenetRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new UzenetRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        UzenetRealm uzenetRealm = (UzenetRealm) instance;
        // ISSUE: reference to a compiler-generated field
        uzenetRealm.KuldesDatum = uzenetRealm.\u003CKuldesDatum\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || uzenetRealm.\u003CFeladoNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          uzenetRealm.FeladoNev = uzenetRealm.\u003CFeladoNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || uzenetRealm.\u003CFeladoTitulus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          uzenetRealm.FeladoTitulus = uzenetRealm.\u003CFeladoTitulus\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || uzenetRealm.\u003CSzoveg\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          uzenetRealm.Szoveg = uzenetRealm.\u003CSzoveg\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || uzenetRealm.\u003CTargy\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          uzenetRealm.Targy = uzenetRealm.\u003CTargy\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || uzenetRealm.\u003CCimzettLista\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<CimzettRealm> listaKBackingField = uzenetRealm.\u003CCimzettLista\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          uzenetRealm.\u003CCimzettLista\u003Ek__BackingField = (IList<CimzettRealm>) null;
          if (!skipDefaults)
            uzenetRealm.CimzettLista.Clear();
          if (listaKBackingField != null)
          {
            for (int index = 0; index < listaKBackingField.Count; ++index)
            {
              uzenetRealm.get_Realm().Add<CimzettRealm>((M0) listaKBackingField[index], update);
              uzenetRealm.CimzettLista.Add(listaKBackingField[index]);
            }
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && uzenetRealm.\u003CCsatolmanyok\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        IList<CsatolmanyRealm> csatolmanyokKBackingField = uzenetRealm.\u003CCsatolmanyok\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        uzenetRealm.\u003CCsatolmanyok\u003Ek__BackingField = (IList<CsatolmanyRealm>) null;
        if (!skipDefaults)
          uzenetRealm.Csatolmanyok.Clear();
        if (csatolmanyokKBackingField == null)
          return;
        for (int index = 0; index < csatolmanyokKBackingField.Count; ++index)
        {
          uzenetRealm.get_Realm().Add<CsatolmanyRealm>((M0) csatolmanyokKBackingField[index], update);
          uzenetRealm.Csatolmanyok.Add(csatolmanyokKBackingField[index]);
        }
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        UzenetRealm uzenetRealm = (UzenetRealm) instance;
        value = (object) uzenetRealm.Azonosito;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
