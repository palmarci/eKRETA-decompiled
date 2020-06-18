// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.EmailAddressRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Preserve(true, false)]
  [Woven(typeof (EmailAddressRealm.RealmHelper))]
  public class EmailAddressRealm : RealmObject, IReflectableType
  {
    [Preserve]
    [PrimaryKey]
    [WovenProperty]
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
    public string Email
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Email)) : this.\u003CEmail\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEmail\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Email));
        }
        else
          this.SetStringValue(nameof (Email), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Tipus
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Tipus)) : this.\u003CTipus\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTipus\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tipus));
        }
        else
          this.SetStringValue(nameof (Tipus), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool IsAlapertelmezett
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsAlapertelmezett)) : this.\u003CIsAlapertelmezett\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsAlapertelmezett\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsAlapertelmezett));
        }
        else
          this.SetBooleanValue(nameof (IsAlapertelmezett), value);
      }
    }

    [Preserve]
    public EmailAddressRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EmailAddressRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EmailAddressRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EmailAddressRealm emailAddressRealm = (EmailAddressRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || emailAddressRealm.\u003CEmail\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          emailAddressRealm.Email = emailAddressRealm.\u003CEmail\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || emailAddressRealm.\u003CTipus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          emailAddressRealm.Tipus = emailAddressRealm.\u003CTipus\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !emailAddressRealm.\u003CIsAlapertelmezett\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        emailAddressRealm.IsAlapertelmezett = emailAddressRealm.\u003CIsAlapertelmezett\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EmailAddressRealm emailAddressRealm = (EmailAddressRealm) instance;
        value = (object) emailAddressRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
