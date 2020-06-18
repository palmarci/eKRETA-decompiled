// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.ClassGroupRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Woven(typeof (ClassGroupRealm.RealmHelper))]
  [Preserve(true, false)]
  public class ClassGroupRealm : RealmObject, IReflectableType
  {
    [WovenProperty]
    [Preserve]
    public string OsztalyCsoportTipus
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyCsoportTipus)) : this.\u003COsztalyCsoportTipus\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyCsoportTipus\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyCsoportTipus));
        }
        else
          this.SetStringValue(nameof (OsztalyCsoportTipus), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public EducationTaskRealm OktatasNevelesiFeladat
    {
      get
      {
        return this.get_IsManaged() ? (EducationTaskRealm) this.GetObjectValue<EducationTaskRealm>(nameof (OktatasNevelesiFeladat)) : this.\u003COktatasNevelesiFeladat\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COktatasNevelesiFeladat\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OktatasNevelesiFeladat));
        }
        else
          this.SetObjectValue<EducationTaskRealm>(nameof (OktatasNevelesiFeladat), (M0) value);
      }
    }

    [Preserve]
    [WovenProperty]
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
    public bool IsAktiv
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsAktiv)) : this.\u003CIsAktiv\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsAktiv\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsAktiv));
        }
        else
          this.SetBooleanValue(nameof (IsAktiv), value);
      }
    }

    [WovenProperty]
    [Preserve]
    [PrimaryKey]
    public string Uid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Uid)) : this.\u003CUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Uid));
        }
        else
          this.SetStringValueUnique(nameof (Uid), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string OsztalyfonokUid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyfonokUid)) : this.\u003COsztalyfonokUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyfonokUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyfonokUid));
        }
        else
          this.SetStringValue(nameof (OsztalyfonokUid), value);
      }
    }

    [Preserve]
    public ClassGroupRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<ClassGroupRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new ClassGroupRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        ClassGroupRealm classGroupRealm = (ClassGroupRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || classGroupRealm.\u003COsztalyCsoportTipus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          classGroupRealm.OsztalyCsoportTipus = classGroupRealm.\u003COsztalyCsoportTipus\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (classGroupRealm.\u003COktatasNevelesiFeladat\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          classGroupRealm.get_Realm().Add<EducationTaskRealm>((M0) classGroupRealm.\u003COktatasNevelesiFeladat\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        classGroupRealm.OktatasNevelesiFeladat = classGroupRealm.\u003COktatasNevelesiFeladat\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || classGroupRealm.\u003CNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          classGroupRealm.Nev = classGroupRealm.\u003CNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || classGroupRealm.\u003CIsAktiv\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          classGroupRealm.IsAktiv = classGroupRealm.\u003CIsAktiv\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && classGroupRealm.\u003COsztalyfonokUid\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        classGroupRealm.OsztalyfonokUid = classGroupRealm.\u003COsztalyfonokUid\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        ClassGroupRealm classGroupRealm = (ClassGroupRealm) instance;
        value = (object) classGroupRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
