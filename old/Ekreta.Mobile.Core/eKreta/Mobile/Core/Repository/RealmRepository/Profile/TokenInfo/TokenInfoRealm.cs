// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo.TokenInfoRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo
{
  [Preserve(true, false)]
  [Woven(typeof (TokenInfoRealm.RealmHelper))]
  public class TokenInfoRealm : RealmObject, IPrimaryKey, IReflectableType
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
    public string UserId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (UserId)) : this.\u003CUserId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUserId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (UserId));
        }
        else
          this.SetStringValue(nameof (UserId), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public int Role
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (Role))) : this.\u003CRole\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CRole\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Role));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (Role), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public int InstituteUserId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (InstituteUserId))) : this.\u003CInstituteUserId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstituteUserId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstituteUserId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (InstituteUserId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public string SchoolYearId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SchoolYearId)) : this.\u003CSchoolYearId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSchoolYearId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SchoolYearId));
        }
        else
          this.SetStringValue(nameof (SchoolYearId), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string TutelaryId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (TutelaryId)) : this.\u003CTutelaryId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTutelaryId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TutelaryId));
        }
        else
          this.SetStringValue(nameof (TutelaryId), value);
      }
    }

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
          this.SetStringValue(nameof (InstituteCode), value);
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
    public TokenInfoRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<TokenInfoRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new TokenInfoRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        TokenInfoRealm tokenInfoRealm = (TokenInfoRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tokenInfoRealm.\u003CUserId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          tokenInfoRealm.UserId = tokenInfoRealm.\u003CUserId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tokenInfoRealm.\u003CRole\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          tokenInfoRealm.Role = tokenInfoRealm.\u003CRole\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tokenInfoRealm.\u003CInstituteUserId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          tokenInfoRealm.InstituteUserId = tokenInfoRealm.\u003CInstituteUserId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tokenInfoRealm.\u003CSchoolYearId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          tokenInfoRealm.SchoolYearId = tokenInfoRealm.\u003CSchoolYearId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tokenInfoRealm.\u003CTutelaryId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          tokenInfoRealm.TutelaryId = tokenInfoRealm.\u003CTutelaryId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && tokenInfoRealm.\u003CInstituteCode\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        tokenInfoRealm.InstituteCode = tokenInfoRealm.\u003CInstituteCode\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        TokenInfoRealm tokenInfoRealm = (TokenInfoRealm) instance;
        value = (object) tokenInfoRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
