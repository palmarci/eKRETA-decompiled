// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary.TutelaryRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary
{
  [Woven(typeof (TutelaryRealm.RealmHelper))]
  [Preserve(true, false)]
  public class TutelaryRealm : RealmObject, IPrimaryKey, IReflectableType
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

    [WovenProperty]
    [Preserve]
    public string PhoneNumber
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (PhoneNumber)) : this.\u003CPhoneNumber\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPhoneNumber\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PhoneNumber));
        }
        else
          this.SetStringValue(nameof (PhoneNumber), value);
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
    public TutelaryRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<TutelaryRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new TutelaryRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        TutelaryRealm tutelaryRealm = (TutelaryRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tutelaryRealm.\u003CName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          tutelaryRealm.Name = tutelaryRealm.\u003CName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || tutelaryRealm.\u003CEmail\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          tutelaryRealm.Email = tutelaryRealm.\u003CEmail\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && tutelaryRealm.\u003CPhoneNumber\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        tutelaryRealm.PhoneNumber = tutelaryRealm.\u003CPhoneNumber\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        TutelaryRealm tutelaryRealm = (TutelaryRealm) instance;
        value = (object) tutelaryRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
