// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.EmployeeRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Collections.Generic;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Woven(typeof (EmployeeRealm.RealmHelper))]
  [Preserve(true, false)]
  public class EmployeeRealm : RealmObject, IReflectableType
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

    [WovenProperty]
    [Preserve]
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

    [Preserve]
    [WovenProperty]
    public IList<PhoneNumberRealm> Telefonok
    {
      get
      {
        if (this.\u003CTelefonok\u003Ek__BackingField == null)
        {
          EmployeeRealm employeeRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<PhoneNumberRealm>(nameof (Telefonok));
            employeeRealm.\u003CTelefonok\u003Ek__BackingField = (IList<PhoneNumberRealm>) listValue;
          }
          else
          {
            List<PhoneNumberRealm> phoneNumberRealmList = new List<PhoneNumberRealm>();
            employeeRealm.\u003CTelefonok\u003Ek__BackingField = (IList<PhoneNumberRealm>) phoneNumberRealmList;
          }
        }
        return this.\u003CTelefonok\u003Ek__BackingField;
      }
    }

    [Preserve]
    [WovenProperty]
    public IList<EmailAddressRealm> Emailek
    {
      get
      {
        if (this.\u003CEmailek\u003Ek__BackingField == null)
        {
          EmployeeRealm employeeRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<EmailAddressRealm>(nameof (Emailek));
            employeeRealm.\u003CEmailek\u003Ek__BackingField = (IList<EmailAddressRealm>) listValue;
          }
          else
          {
            List<EmailAddressRealm> emailAddressRealmList = new List<EmailAddressRealm>();
            employeeRealm.\u003CEmailek\u003Ek__BackingField = (IList<EmailAddressRealm>) emailAddressRealmList;
          }
        }
        return this.\u003CEmailek\u003Ek__BackingField;
      }
    }

    [Preserve]
    public EmployeeRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EmployeeRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EmployeeRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EmployeeRealm employeeRealm = (EmployeeRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || employeeRealm.\u003CNev\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          employeeRealm.Nev = employeeRealm.\u003CNev\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || employeeRealm.\u003CTelefonok\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<PhoneNumberRealm> telefonokKBackingField = employeeRealm.\u003CTelefonok\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          employeeRealm.\u003CTelefonok\u003Ek__BackingField = (IList<PhoneNumberRealm>) null;
          if (!skipDefaults)
            employeeRealm.Telefonok.Clear();
          if (telefonokKBackingField != null)
          {
            for (int index = 0; index < telefonokKBackingField.Count; ++index)
            {
              employeeRealm.get_Realm().Add<PhoneNumberRealm>((M0) telefonokKBackingField[index], update);
              employeeRealm.Telefonok.Add(telefonokKBackingField[index]);
            }
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && employeeRealm.\u003CEmailek\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        IList<EmailAddressRealm> emailekKBackingField = employeeRealm.\u003CEmailek\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        employeeRealm.\u003CEmailek\u003Ek__BackingField = (IList<EmailAddressRealm>) null;
        if (!skipDefaults)
          employeeRealm.Emailek.Clear();
        if (emailekKBackingField == null)
          return;
        for (int index = 0; index < emailekKBackingField.Count; ++index)
        {
          employeeRealm.get_Realm().Add<EmailAddressRealm>((M0) emailekKBackingField[index], update);
          employeeRealm.Emailek.Add(emailekKBackingField[index]);
        }
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EmployeeRealm employeeRealm = (EmployeeRealm) instance;
        value = (object) employeeRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
