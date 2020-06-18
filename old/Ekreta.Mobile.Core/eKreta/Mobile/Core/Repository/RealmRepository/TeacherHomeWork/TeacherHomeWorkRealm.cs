// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork.TeacherHomeWorkRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork
{
  [Woven(typeof (TeacherHomeWorkRealm.RealmHelper))]
  [Preserve(true, false)]
  public class TeacherHomeWorkRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Preserve]
    [Realms.PrimaryKey]
    [WovenProperty]
    public string Id
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Id)) : this.\u003CId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Id));
        }
        else
          this.SetStringValueUnique(nameof (Id), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string OsztalyCsoport
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyCsoport)) : this.\u003COsztalyCsoport\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyCsoport\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyCsoport));
        }
        else
          this.SetStringValue(nameof (OsztalyCsoport), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Tantargy
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Tantargy)) : this.\u003CTantargy\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTantargy\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tantargy));
        }
        else
          this.SetStringValue(nameof (Tantargy), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Rogzito
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Rogzito)) : this.\u003CRogzito\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CRogzito\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Rogzito));
        }
        else
          this.SetStringValue(nameof (Rogzito), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool IsTanarRogzitette
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsTanarRogzitette)) : this.\u003CIsTanarRogzitette\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsTanarRogzitette\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsTanarRogzitette));
        }
        else
          this.SetBooleanValue(nameof (IsTanarRogzitette), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int? TanitasiOraId
    {
      get
      {
        if (!this.get_IsManaged())
          return this.\u003CTanitasiOraId\u003Ek__BackingField;
        RealmInteger<int>? realmIntegerValue = (RealmInteger<int>?) this.GetNullableRealmIntegerValue<int>(nameof (TanitasiOraId));
        return !realmIntegerValue.HasValue ? new int?() : new int?(RealmInteger<int>.op_Implicit(realmIntegerValue.GetValueOrDefault()));
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanitasiOraId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanitasiOraId));
        }
        else
        {
          int? nullable = value;
          this.SetNullableRealmIntegerValue<int>(nameof (TanitasiOraId), (RealmInteger<M0>?) (nullable.HasValue ? new RealmInteger<int>?(RealmInteger<int>.op_Implicit(nullable.GetValueOrDefault())) : new RealmInteger<int>?()));
        }
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

    [Preserve]
    [WovenProperty]
    public DateTimeOffset FeladasDatuma
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (FeladasDatuma)) : this.\u003CFeladasDatuma\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFeladasDatuma\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FeladasDatuma));
        }
        else
          this.SetDateTimeOffsetValue(nameof (FeladasDatuma), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset Hatarido
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (Hatarido)) : this.\u003CHatarido\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CHatarido\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Hatarido));
        }
        else
          this.SetDateTimeOffsetValue(nameof (Hatarido), value);
      }
    }

    [Ignored]
    public DateTime HataridoLocal
    {
      get
      {
        return this.Hatarido.LocalDateTime;
      }
    }

    [Preserve]
    [WovenProperty]
    public bool EnableTanuloHazifeladat
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (EnableTanuloHazifeladat)) : this.\u003CEnableTanuloHazifeladat\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEnableTanuloHazifeladat\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (EnableTanuloHazifeladat));
        }
        else
          this.SetBooleanValue(nameof (EnableTanuloHazifeladat), value);
      }
    }

    [Indexed]
    [Preserve]
    [WovenProperty]
    public string ProfileId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (ProfileId)) : this.\u003CProfileId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CProfileId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ProfileId));
        }
        else
          this.SetStringValue(nameof (ProfileId), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Id;
      }
    }

    [Preserve]
    [WovenProperty]
    public bool Done
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (Done)) : this.\u003CDone\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDone\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Done));
        }
        else
          this.SetBooleanValue(nameof (Done), value);
      }
    }

    [Preserve]
    public TeacherHomeWorkRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<TeacherHomeWorkRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new TeacherHomeWorkRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        TeacherHomeWorkRealm teacherHomeWorkRealm = (TeacherHomeWorkRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003COsztalyCsoport\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.OsztalyCsoport = teacherHomeWorkRealm.\u003COsztalyCsoport\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CTantargy\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.Tantargy = teacherHomeWorkRealm.\u003CTantargy\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CRogzito\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.Rogzito = teacherHomeWorkRealm.\u003CRogzito\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CIsTanarRogzitette\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.IsTanarRogzitette = teacherHomeWorkRealm.\u003CIsTanarRogzitette\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        teacherHomeWorkRealm.TanitasiOraId = teacherHomeWorkRealm.\u003CTanitasiOraId\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CSzoveg\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.Szoveg = teacherHomeWorkRealm.\u003CSzoveg\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        teacherHomeWorkRealm.FeladasDatuma = teacherHomeWorkRealm.\u003CFeladasDatuma\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        teacherHomeWorkRealm.Hatarido = teacherHomeWorkRealm.\u003CHatarido\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CEnableTanuloHazifeladat\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.EnableTanuloHazifeladat = teacherHomeWorkRealm.\u003CEnableTanuloHazifeladat\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || teacherHomeWorkRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherHomeWorkRealm.ProfileId = teacherHomeWorkRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !teacherHomeWorkRealm.\u003CDone\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        teacherHomeWorkRealm.Done = teacherHomeWorkRealm.\u003CDone\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        TeacherHomeWorkRealm teacherHomeWorkRealm = (TeacherHomeWorkRealm) instance;
        value = (object) teacherHomeWorkRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
