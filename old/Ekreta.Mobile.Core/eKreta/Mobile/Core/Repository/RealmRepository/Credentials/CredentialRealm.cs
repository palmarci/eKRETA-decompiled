// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Credentials.CredentialRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Credentials
{
  [Woven(typeof (CredentialRealm.RealmHelper))]
  [Preserve(true, false)]
  public class CredentialRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Realms.PrimaryKey]
    [Preserve]
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

    public string PrimaryKey
    {
      get
      {
        return this.Id;
      }
    }

    [WovenProperty]
    [Preserve]
    public string Password
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Password)) : this.\u003CPassword\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPassword\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Password));
        }
        else
          this.SetStringValue(nameof (Password), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string UserName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (UserName)) : this.\u003CUserName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUserName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (UserName));
        }
        else
          this.SetStringValue(nameof (UserName), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string InstitudeId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InstitudeId)) : this.\u003CInstitudeId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstitudeId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstitudeId));
        }
        else
          this.SetStringValue(nameof (InstitudeId), value);
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

    [Preserve]
    public CredentialRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<CredentialRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new CredentialRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        CredentialRealm credentialRealm = (CredentialRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || credentialRealm.\u003CPassword\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          credentialRealm.Password = credentialRealm.\u003CPassword\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || credentialRealm.\u003CUserName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          credentialRealm.UserName = credentialRealm.\u003CUserName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || credentialRealm.\u003CInstitudeId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          credentialRealm.InstitudeId = credentialRealm.\u003CInstitudeId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && credentialRealm.\u003CUserId\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        credentialRealm.UserId = credentialRealm.\u003CUserId\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        CredentialRealm credentialRealm = (CredentialRealm) instance;
        value = (object) credentialRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
