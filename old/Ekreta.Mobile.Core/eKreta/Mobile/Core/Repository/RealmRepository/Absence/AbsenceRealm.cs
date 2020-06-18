// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Absence.AbsenceRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Absence
{
  [Preserve(true, false)]
  [Woven(typeof (AbsenceRealm.RealmHelper))]
  public class AbsenceRealm : RealmObject, IPrimaryKey, INewItem, IReflectableType
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

    [Preserve]
    [WovenProperty]
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

    [Preserve]
    [WovenProperty]
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

    [WovenProperty]
    [Preserve]
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

    [WovenProperty]
    [Preserve]
    public string ModeName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (ModeName)) : this.\u003CModeName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CModeName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ModeName));
        }
        else
          this.SetStringValue(nameof (ModeName), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public byte? DelayTimeMinutes
    {
      get
      {
        if (!this.get_IsManaged())
          return this.\u003CDelayTimeMinutes\u003Ek__BackingField;
        RealmInteger<byte>? realmIntegerValue = (RealmInteger<byte>?) this.GetNullableRealmIntegerValue<byte>(nameof (DelayTimeMinutes));
        return !realmIntegerValue.HasValue ? new byte?() : new byte?(RealmInteger<byte>.op_Implicit(realmIntegerValue.GetValueOrDefault()));
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDelayTimeMinutes\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (DelayTimeMinutes));
        }
        else
        {
          byte? nullable = value;
          this.SetNullableRealmIntegerValue<byte>(nameof (DelayTimeMinutes), (RealmInteger<M0>?) (nullable.HasValue ? new RealmInteger<byte>?(RealmInteger<byte>.op_Implicit(nullable.GetValueOrDefault())) : new RealmInteger<byte>?()));
        }
      }
    }

    [WovenProperty]
    [Preserve]
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

    [WovenProperty]
    [Preserve]
    public DateTimeOffset LessonStartTime
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (LessonStartTime)) : this.\u003CLessonStartTime\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLessonStartTime\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (LessonStartTime));
        }
        else
          this.SetDateTimeOffsetValue(nameof (LessonStartTime), value);
      }
    }

    [Ignored]
    public DateTime LessonStartTimeLocal
    {
      get
      {
        return this.LessonStartTime.LocalDateTime;
      }
    }

    [Preserve]
    [WovenProperty]
    public short NumberOfLessons
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<short>.op_Implicit((RealmInteger<short>) this.GetRealmIntegerValue<short>(nameof (NumberOfLessons))) : this.\u003CNumberOfLessons\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNumberOfLessons\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (NumberOfLessons));
        }
        else
          this.SetRealmIntegerValue<short>(nameof (NumberOfLessons), (RealmInteger<M0>) RealmInteger<short>.op_Implicit(value));
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
    public string JustificationState
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (JustificationState)) : this.\u003CJustificationState\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CJustificationState\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (JustificationState));
        }
        else
          this.SetStringValue(nameof (JustificationState), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string JustificationStateName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (JustificationStateName)) : this.\u003CJustificationStateName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CJustificationStateName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (JustificationStateName));
        }
        else
          this.SetStringValue(nameof (JustificationStateName), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string JustificationType
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (JustificationType)) : this.\u003CJustificationType\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CJustificationType\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (JustificationType));
        }
        else
          this.SetStringValue(nameof (JustificationType), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string JustificationTypeName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (JustificationTypeName)) : this.\u003CJustificationTypeName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CJustificationTypeName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (JustificationTypeName));
        }
        else
          this.SetStringValue(nameof (JustificationTypeName), value);
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

    [WovenProperty]
    [Preserve]
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

    [Preserve]
    public AbsenceRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<AbsenceRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new AbsenceRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        AbsenceRealm absenceRealm = (AbsenceRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.Type = absenceRealm.\u003CType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CTypeName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.TypeName = absenceRealm.\u003CTypeName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CSubject\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.Subject = absenceRealm.\u003CSubject\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CSubjectCategory\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.SubjectCategory = absenceRealm.\u003CSubjectCategory\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CSubjectCategoryName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.SubjectCategoryName = absenceRealm.\u003CSubjectCategoryName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CMode\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.Mode = absenceRealm.\u003CMode\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CModeName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.ModeName = absenceRealm.\u003CModeName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        absenceRealm.DelayTimeMinutes = absenceRealm.\u003CDelayTimeMinutes\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.Teacher = absenceRealm.\u003CTeacher\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        absenceRealm.LessonStartTime = absenceRealm.\u003CLessonStartTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CNumberOfLessons\u003Ek__BackingField != (short) 0)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.NumberOfLessons = absenceRealm.\u003CNumberOfLessons\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        absenceRealm.CreatingTime = absenceRealm.\u003CCreatingTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CJustificationState\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.JustificationState = absenceRealm.\u003CJustificationState\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CJustificationStateName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.JustificationStateName = absenceRealm.\u003CJustificationStateName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CJustificationType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.JustificationType = absenceRealm.\u003CJustificationType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CJustificationTypeName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.JustificationTypeName = absenceRealm.\u003CJustificationTypeName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.ProfileId = absenceRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || absenceRealm.\u003COsztalyCsoportUid\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          absenceRealm.OsztalyCsoportUid = absenceRealm.\u003COsztalyCsoportUid\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        absenceRealm.CreatedDate = absenceRealm.\u003CCreatedDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !absenceRealm.\u003CSeenByUser\u003Ek__BackingField)
          return;
        // ISSUE: explicit non-virtual call
        // ISSUE: reference to a compiler-generated field
        __nonvirtual (absenceRealm.SeenByUser) = absenceRealm.\u003CSeenByUser\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        AbsenceRealm absenceRealm = (AbsenceRealm) instance;
        value = (object) absenceRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
