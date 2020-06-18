// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Institute.InstituteRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Institute
{
  [Preserve(true, false)]
  [Woven(typeof (InstituteRealm.RealmHelper))]
  public class InstituteRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Preserve]
    [WovenProperty]
    public string InformationImageUrl
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InformationImageUrl)) : this.\u003CInformationImageUrl\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInformationImageUrl\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InformationImageUrl));
        }
        else
          this.SetStringValue(nameof (InformationImageUrl), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string InformationUrl
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InformationUrl)) : this.\u003CInformationUrl\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInformationUrl\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InformationUrl));
        }
        else
          this.SetStringValue(nameof (InformationUrl), value);
      }
    }

    [Realms.PrimaryKey]
    [Preserve]
    [WovenProperty]
    public string InstituteCode
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InstituteCode)) : this.\u003CInstituteCode\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstituteCode\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstituteCode));
        }
        else
          this.SetStringValueUnique(nameof (InstituteCode), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string InstituteId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InstituteId)) : this.\u003CInstituteId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstituteId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstituteId));
        }
        else
          this.SetStringValue(nameof (InstituteId), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Name
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Name)) : this.\u003CName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Name));
        }
        else
          this.SetStringValue(nameof (Name), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Url
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Url)) : this.\u003CUrl\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUrl\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Url));
        }
        else
          this.SetStringValue(nameof (Url), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string City
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (City)) : this.\u003CCity\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCity\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (City));
        }
        else
          this.SetStringValue(nameof (City), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public FeatureToggleSet FeatureToggleSet
    {
      get
      {
        return this.get_IsManaged() ? (FeatureToggleSet) this.GetObjectValue<FeatureToggleSet>(nameof (FeatureToggleSet)) : this.\u003CFeatureToggleSet\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFeatureToggleSet\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FeatureToggleSet));
        }
        else
          this.SetObjectValue<FeatureToggleSet>(nameof (FeatureToggleSet), (M0) value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.InstituteCode;
      }
    }

    [Preserve]
    public InstituteRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<InstituteRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new InstituteRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        InstituteRealm instituteRealm = (InstituteRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CInformationImageUrl\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.InformationImageUrl = instituteRealm.\u003CInformationImageUrl\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CInformationUrl\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.InformationUrl = instituteRealm.\u003CInformationUrl\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CInstituteId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.InstituteId = instituteRealm.\u003CInstituteId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.Name = instituteRealm.\u003CName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CUrl\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.Url = instituteRealm.\u003CUrl\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || instituteRealm.\u003CCity\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.City = instituteRealm.\u003CCity\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (instituteRealm.\u003CFeatureToggleSet\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          instituteRealm.get_Realm().Add<FeatureToggleSet>((M0) instituteRealm.\u003CFeatureToggleSet\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        instituteRealm.FeatureToggleSet = instituteRealm.\u003CFeatureToggleSet\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        InstituteRealm instituteRealm = (InstituteRealm) instance;
        value = (object) instituteRealm.InstituteCode;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
