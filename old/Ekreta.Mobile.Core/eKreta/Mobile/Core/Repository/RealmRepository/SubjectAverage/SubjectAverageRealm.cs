// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage.SubjectAverageRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage
{
  [Preserve(true, false)]
  [Woven(typeof (SubjectAverageRealm.RealmHelper))]
  public class SubjectAverageRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Realms.PrimaryKey]
    [Preserve]
    public string Subject
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Subject)) : this.\u003CSubject\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSubject\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Subject));
        }
        else
          this.SetStringValueUnique(nameof (Subject), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string SubjectCategory
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SubjectCategory)) : this.\u003CSubjectCategory\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSubjectCategory\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SubjectCategory));
        }
        else
          this.SetStringValue(nameof (SubjectCategory), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string SubjectCategoryName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SubjectCategoryName)) : this.\u003CSubjectCategoryName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSubjectCategoryName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SubjectCategoryName));
        }
        else
          this.SetStringValue(nameof (SubjectCategoryName), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public float? Value
    {
      get
      {
        return this.get_IsManaged() ? this.GetNullableSingleValue(nameof (Value)) : this.\u003CValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Value));
        }
        else
          this.SetNullableSingleValue(nameof (Value), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public float? ClassValue
    {
      get
      {
        return this.get_IsManaged() ? this.GetNullableSingleValue(nameof (ClassValue)) : this.\u003CClassValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CClassValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ClassValue));
        }
        else
          this.SetNullableSingleValue(nameof (ClassValue), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public float? Difference
    {
      get
      {
        return this.get_IsManaged() ? this.GetNullableSingleValue(nameof (Difference)) : this.\u003CDifference\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDifference\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Difference));
        }
        else
          this.SetNullableSingleValue(nameof (Difference), value);
      }
    }

    [Indexed]
    [Preserve]
    [WovenProperty]
    public string ProfileId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (ProfileId)) : this.\u003CProfileId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CProfileId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ProfileId));
        }
        else
          this.SetStringValue(nameof (ProfileId), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Subject;
      }
    }

    [Preserve]
    [WovenProperty]
    public string SubjectUid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SubjectUid)) : this.\u003CSubjectUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSubjectUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SubjectUid));
        }
        else
          this.SetStringValue(nameof (SubjectUid), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public int SortIndex
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (SortIndex))) : this.\u003CSortIndex\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSortIndex\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SortIndex));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (SortIndex), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    public SubjectAverageRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<SubjectAverageRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new SubjectAverageRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        SubjectAverageRealm subjectAverageRealm = (SubjectAverageRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || subjectAverageRealm.\u003CSubjectCategory\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          subjectAverageRealm.SubjectCategory = subjectAverageRealm.\u003CSubjectCategory\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || subjectAverageRealm.\u003CSubjectCategoryName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          subjectAverageRealm.SubjectCategoryName = subjectAverageRealm.\u003CSubjectCategoryName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        subjectAverageRealm.Value = subjectAverageRealm.\u003CValue\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        subjectAverageRealm.ClassValue = subjectAverageRealm.\u003CClassValue\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        subjectAverageRealm.Difference = subjectAverageRealm.\u003CDifference\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || subjectAverageRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          subjectAverageRealm.ProfileId = subjectAverageRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || subjectAverageRealm.\u003CSubjectUid\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          subjectAverageRealm.SubjectUid = subjectAverageRealm.\u003CSubjectUid\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && subjectAverageRealm.\u003CSortIndex\u003Ek__BackingField == 0)
          return;
        // ISSUE: reference to a compiler-generated field
        subjectAverageRealm.SortIndex = subjectAverageRealm.\u003CSortIndex\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        SubjectAverageRealm subjectAverageRealm = (SubjectAverageRealm) instance;
        value = (object) subjectAverageRealm.Subject;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
