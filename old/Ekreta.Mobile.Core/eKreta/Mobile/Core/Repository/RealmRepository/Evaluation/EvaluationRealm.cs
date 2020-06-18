// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation.EvaluationRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation
{
  [Preserve(true, false)]
  [Woven(typeof (EvaluationRealm.RealmHelper))]
  public class EvaluationRealm : RealmObject, IPrimaryKey, INewItem, IReflectableType
  {
    [WovenProperty]
    [Preserve]
    [Realms.PrimaryKey]
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
    public string Form
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Form)) : this.\u003CForm\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CForm\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Form));
        }
        else
          this.SetStringValue(nameof (Form), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string FormName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (FormName)) : this.\u003CFormName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFormName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FormName));
        }
        else
          this.SetStringValue(nameof (FormName), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Type
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Type)) : this.\u003CType\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CType\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Type));
        }
        else
          this.SetStringValue(nameof (Type), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string TypeName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (TypeName)) : this.\u003CTypeName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTypeName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TypeName));
        }
        else
          this.SetStringValue(nameof (TypeName), value);
      }
    }

    [WovenProperty]
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
          this.SetStringValue(nameof (Subject), value);
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

    [Preserve]
    [WovenProperty]
    public string Mode
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Mode)) : this.\u003CMode\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CMode\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Mode));
        }
        else
          this.SetStringValue(nameof (Mode), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Weight
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Weight)) : this.\u003CWeight\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CWeight\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Weight));
        }
        else
          this.SetStringValue(nameof (Weight), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Value
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Value)) : this.\u003CValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Value));
        }
        else
          this.SetStringValue(nameof (Value), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public int NumberValue
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (NumberValue))) : this.\u003CNumberValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNumberValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (NumberValue));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (NumberValue), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public string Teacher
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Teacher)) : this.\u003CTeacher\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTeacher\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Teacher));
        }
        else
          this.SetStringValue(nameof (Teacher), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset Date
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (Date)) : this.\u003CDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Date));
        }
        else
          this.SetDateTimeOffsetValue(nameof (Date), value);
      }
    }

    [Ignored]
    public DateTime DateLocal
    {
      get
      {
        return this.Date.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    public DateTimeOffset CreatingTime
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (CreatingTime)) : this.\u003CCreatingTime\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCreatingTime\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CreatingTime));
        }
        else
          this.SetDateTimeOffsetValue(nameof (CreatingTime), value);
      }
    }

    [Ignored]
    public DateTime CreatingTimeLocal
    {
      get
      {
        return this.CreatingTime.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    public string Theme
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Theme)) : this.\u003CTheme\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTheme\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Theme));
        }
        else
          this.SetStringValue(nameof (Theme), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public EvaluationNatureRealm EvaluationNatureRealm
    {
      get
      {
        return this.get_IsManaged() ? (EvaluationNatureRealm) this.GetObjectValue<EvaluationNatureRealm>(nameof (EvaluationNatureRealm)) : this.\u003CEvaluationNatureRealm\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEvaluationNatureRealm\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (EvaluationNatureRealm));
        }
        else
          this.SetObjectValue<EvaluationNatureRealm>(nameof (EvaluationNatureRealm), (M0) value);
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

    [Preserve]
    [Indexed]
    [WovenProperty]
    public DateTimeOffset CreatedDate
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (CreatedDate)) : this.\u003CCreatedDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCreatedDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CreatedDate));
        }
        else
          this.SetDateTimeOffsetValue(nameof (CreatedDate), value);
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
    public string OsztalyCsoportUid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyCsoportUid)) : this.\u003COsztalyCsoportUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyCsoportUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyCsoportUid));
        }
        else
          this.SetStringValue(nameof (OsztalyCsoportUid), value);
      }
    }

    public bool IsDiligenceOrDeportment()
    {
      return this.Form == "Diligence" || this.Form == "Deportment";
    }

    [Preserve]
    [WovenProperty]
    public bool SeenByUser
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (SeenByUser)) : this.\u003CSeenByUser\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSeenByUser\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SeenByUser));
        }
        else
          this.SetBooleanValue(nameof (SeenByUser), value);
      }
    }

    [Ignored]
    public string EvaluationTitle
    {
      get
      {
        if (!string.IsNullOrEmpty(this.SubjectCategoryName))
          return this.Subject;
        return this.EvaluationNatureRealm?.Description;
      }
    }

    [Ignored]
    public string DisplayValue
    {
      get
      {
        switch (this.Form)
        {
          case "Percent":
            return "%";
          case "Diligence":
          case "Deportment":
          case "Text":
            return "...";
          case "Mark":
            return this.NumberValue.ToString();
          default:
            return this.NumberValue.ToString();
        }
      }
    }

    [Preserve]
    public EvaluationRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EvaluationRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EvaluationRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EvaluationRealm evaluationRealm = (EvaluationRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CForm\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Form = evaluationRealm.\u003CForm\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CFormName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.FormName = evaluationRealm.\u003CFormName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Type = evaluationRealm.\u003CType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CTypeName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.TypeName = evaluationRealm.\u003CTypeName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CSubject\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Subject = evaluationRealm.\u003CSubject\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CSubjectCategory\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.SubjectCategory = evaluationRealm.\u003CSubjectCategory\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CSubjectCategoryName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.SubjectCategoryName = evaluationRealm.\u003CSubjectCategoryName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CMode\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Mode = evaluationRealm.\u003CMode\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CWeight\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Weight = evaluationRealm.\u003CWeight\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CValue\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Value = evaluationRealm.\u003CValue\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CNumberValue\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.NumberValue = evaluationRealm.\u003CNumberValue\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Teacher = evaluationRealm.\u003CTeacher\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        evaluationRealm.Date = evaluationRealm.\u003CDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        evaluationRealm.CreatingTime = evaluationRealm.\u003CCreatingTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CTheme\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.Theme = evaluationRealm.\u003CTheme\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (evaluationRealm.\u003CEvaluationNatureRealm\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.get_Realm().Add<EvaluationNatureRealm>((M0) evaluationRealm.\u003CEvaluationNatureRealm\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        evaluationRealm.EvaluationNatureRealm = evaluationRealm.\u003CEvaluationNatureRealm\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.ProfileId = evaluationRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        evaluationRealm.CreatedDate = evaluationRealm.\u003CCreatedDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationRealm.\u003COsztalyCsoportUid\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationRealm.OsztalyCsoportUid = evaluationRealm.\u003COsztalyCsoportUid\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !evaluationRealm.\u003CSeenByUser\u003Ek__BackingField)
          return;
        // ISSUE: explicit non-virtual call
        // ISSUE: reference to a compiler-generated field
        __nonvirtual (evaluationRealm.SeenByUser) = evaluationRealm.\u003CSeenByUser\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EvaluationRealm evaluationRealm = (EvaluationRealm) instance;
        value = (object) evaluationRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
