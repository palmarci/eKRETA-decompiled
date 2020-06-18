// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher.FormTeacherRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher
{
  [Preserve(true, false)]
  [Woven(typeof (FormTeacherRealm.RealmHelper))]
  public class FormTeacherRealm : RealmObject, IPrimaryKey, IReflectableType
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

    [Preserve]
    [WovenProperty]
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
    public FormTeacherRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<FormTeacherRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new FormTeacherRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        FormTeacherRealm formTeacherRealm = (FormTeacherRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || formTeacherRealm.\u003CName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          formTeacherRealm.Name = formTeacherRealm.\u003CName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || formTeacherRealm.\u003CEmail\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          formTeacherRealm.Email = formTeacherRealm.\u003CEmail\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && formTeacherRealm.\u003CPhoneNumber\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        formTeacherRealm.PhoneNumber = formTeacherRealm.\u003CPhoneNumber\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        FormTeacherRealm formTeacherRealm = (FormTeacherRealm) instance;
        value = (object) formTeacherRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
