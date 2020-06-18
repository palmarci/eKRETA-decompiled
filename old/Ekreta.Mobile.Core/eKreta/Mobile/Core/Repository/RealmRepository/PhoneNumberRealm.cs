// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.PhoneNumberRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Woven(typeof (PhoneNumberRealm.RealmHelper))]
  [Preserve(true, false)]
  public class PhoneNumberRealm : RealmObject, IReflectableType
  {
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

    [WovenProperty]
    [Preserve]
    public string Telefonszam
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Telefonszam)) : this.\u003CTelefonszam\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTelefonszam\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Telefonszam));
        }
        else
          this.SetStringValue(nameof (Telefonszam), value);
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
    public PhoneNumberRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<PhoneNumberRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new PhoneNumberRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        PhoneNumberRealm phoneNumberRealm = (PhoneNumberRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || phoneNumberRealm.\u003CTelefonszam\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          phoneNumberRealm.Telefonszam = phoneNumberRealm.\u003CTelefonszam\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || phoneNumberRealm.\u003CTipus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          phoneNumberRealm.Tipus = phoneNumberRealm.\u003CTipus\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !phoneNumberRealm.\u003CIsAlapertelmezett\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        phoneNumberRealm.IsAlapertelmezett = phoneNumberRealm.\u003CIsAlapertelmezett\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        PhoneNumberRealm phoneNumberRealm = (PhoneNumberRealm) instance;
        value = (object) phoneNumberRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
