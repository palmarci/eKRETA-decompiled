// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework.StudentHomeWorkRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System;
using System.Reflection;
using System.Web;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework
{
  [Woven(typeof (StudentHomeWorkRealm.RealmHelper))]
  [Preserve(true, false)]
  public class StudentHomeWorkRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [Preserve]
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

    [WovenProperty]
    [Preserve]
    public string TanuloNev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (TanuloNev)) : this.\u003CTanuloNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanuloNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanuloNev));
        }
        else
          this.SetStringValue(nameof (TanuloNev), value);
      }
    }

    [WovenProperty]
    [Preserve]
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

    [Ignored]
    public DateTimeOffset FeladasDatumaLocal
    {
      get
      {
        return (DateTimeOffset) this.FeladasDatuma.LocalDateTime;
      }
    }

    [Preserve]
    [WovenProperty]
    public string FeladatSzovege
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (FeladatSzovege)) : this.\u003CFeladatSzovege\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFeladatSzovege\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FeladatSzovege));
        }
        else
          this.SetStringValue(nameof (FeladatSzovege), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int RogzitoId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (RogzitoId))) : this.\u003CRogzitoId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CRogzitoId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (RogzitoId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (RogzitoId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public bool TanuloAltalTorolt
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (TanuloAltalTorolt)) : this.\u003CTanuloAltalTorolt\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanuloAltalTorolt\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanuloAltalTorolt));
        }
        else
          this.SetBooleanValue(nameof (TanuloAltalTorolt), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool TanarAltalTorolt
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (TanarAltalTorolt)) : this.\u003CTanarAltalTorolt\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanarAltalTorolt\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanarAltalTorolt));
        }
        else
          this.SetBooleanValue(nameof (TanarAltalTorolt), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int TanarHaziFeladatId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (TanarHaziFeladatId))) : this.\u003CTanarHaziFeladatId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanarHaziFeladatId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanarHaziFeladatId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (TanarHaziFeladatId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [WovenProperty]
    [Preserve]
    public bool CanDeleteByUser
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (CanDeleteByUser)) : this.\u003CCanDeleteByUser\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCanDeleteByUser\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CanDeleteByUser));
        }
        else
          this.SetBooleanValue(nameof (CanDeleteByUser), value);
      }
    }

    [Ignored]
    public string DecodedHomeWorkText
    {
      get
      {
        return HttpUtility.HtmlDecode(this.FeladatSzovege ?? "");
      }
    }

    [Ignored]
    public bool IgnoredCanDeleteByUser { get; set; }

    [Ignored]
    public bool Torolt
    {
      get
      {
        return !this.TanarAltalTorolt && this.TanuloAltalTorolt;
      }
    }

    [Preserve]
    [Indexed]
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
    public StudentHomeWorkRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<StudentHomeWorkRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new StudentHomeWorkRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        StudentHomeWorkRealm studentHomeWorkRealm = (StudentHomeWorkRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CTanuloNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.TanuloNev = studentHomeWorkRealm.\u003CTanuloNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        studentHomeWorkRealm.FeladasDatuma = studentHomeWorkRealm.\u003CFeladasDatuma\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CFeladatSzovege\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.FeladatSzovege = studentHomeWorkRealm.\u003CFeladatSzovege\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CRogzitoId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.RogzitoId = studentHomeWorkRealm.\u003CRogzitoId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CTanuloAltalTorolt\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.TanuloAltalTorolt = studentHomeWorkRealm.\u003CTanuloAltalTorolt\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CTanarAltalTorolt\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.TanarAltalTorolt = studentHomeWorkRealm.\u003CTanarAltalTorolt\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CTanarHaziFeladatId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.TanarHaziFeladatId = studentHomeWorkRealm.\u003CTanarHaziFeladatId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentHomeWorkRealm.\u003CCanDeleteByUser\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          studentHomeWorkRealm.CanDeleteByUser = studentHomeWorkRealm.\u003CCanDeleteByUser\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && studentHomeWorkRealm.\u003CProfileId\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        studentHomeWorkRealm.ProfileId = studentHomeWorkRealm.\u003CProfileId\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        StudentHomeWorkRealm studentHomeWorkRealm = (StudentHomeWorkRealm) instance;
        value = (object) studentHomeWorkRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
