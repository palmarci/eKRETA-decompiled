// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.ProfileRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile
{
  [Preserve(true, false)]
  [Woven(typeof (ProfileRealm.RealmHelper))]
  public class ProfileRealm : RealmObject, IPrimaryKey, IReflectableType
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

    [Ignored]
    public string RolelessId
    {
      get
      {
        if (!this.Id.Contains("_"))
          return this.Id;
        return this.Id.Split('_')[0];
      }
    }

    [Preserve]
    [WovenProperty]
    public InstituteRealm Institute
    {
      get
      {
        return this.get_IsManaged() ? (InstituteRealm) this.GetObjectValue<InstituteRealm>(nameof (Institute)) : this.\u003CInstitute\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstitute\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Institute));
        }
        else
          this.SetObjectValue<InstituteRealm>(nameof (Institute), (M0) value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool IsActive
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsActive)) : this.\u003CIsActive\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsActive\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsActive));
        }
        else
          this.SetBooleanValue(nameof (IsActive), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public TokenInfoRealm TokenInfo
    {
      get
      {
        return this.get_IsManaged() ? (TokenInfoRealm) this.GetObjectValue<TokenInfoRealm>(nameof (TokenInfo)) : this.\u003CTokenInfo\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTokenInfo\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TokenInfo));
        }
        else
          this.SetObjectValue<TokenInfoRealm>(nameof (TokenInfo), (M0) value);
      }
    }

    [Preserve]
    [WovenProperty]
    public PushSettingsRealm PushSettings
    {
      get
      {
        return this.get_IsManaged() ? (PushSettingsRealm) this.GetObjectValue<PushSettingsRealm>(nameof (PushSettings)) : this.\u003CPushSettings\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPushSettings\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PushSettings));
        }
        else
          this.SetObjectValue<PushSettingsRealm>(nameof (PushSettings), (M0) value);
      }
    }

    [WovenProperty]
    [Preserve]
    public bool IsFirstLogin
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsFirstLogin)) : this.\u003CIsFirstLogin\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsFirstLogin\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsFirstLogin));
        }
        else
          this.SetBooleanValue(nameof (IsFirstLogin), value);
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
    public ProfileRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<ProfileRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new ProfileRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        ProfileRealm profileRealm = (ProfileRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (profileRealm.\u003CInstitute\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          profileRealm.get_Realm().Add<InstituteRealm>((M0) profileRealm.\u003CInstitute\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        profileRealm.Institute = profileRealm.\u003CInstitute\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || profileRealm.\u003CIsActive\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          profileRealm.IsActive = profileRealm.\u003CIsActive\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (profileRealm.\u003CTokenInfo\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          profileRealm.get_Realm().Add<TokenInfoRealm>((M0) profileRealm.\u003CTokenInfo\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        profileRealm.TokenInfo = profileRealm.\u003CTokenInfo\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (profileRealm.\u003CPushSettings\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          profileRealm.get_Realm().Add<PushSettingsRealm>((M0) profileRealm.\u003CPushSettings\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        profileRealm.PushSettings = profileRealm.\u003CPushSettings\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !profileRealm.\u003CIsFirstLogin\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        profileRealm.IsFirstLogin = profileRealm.\u003CIsFirstLogin\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        ProfileRealm profileRealm = (ProfileRealm) instance;
        value = (object) profileRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
