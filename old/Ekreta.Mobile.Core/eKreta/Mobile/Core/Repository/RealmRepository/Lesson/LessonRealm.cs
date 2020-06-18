// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.LessonRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  [Woven(typeof (LessonRealm.RealmHelper))]
  [Preserve(true, false)]
  public class LessonRealm : RealmObject, IPrimaryKey, INewItem, IReflectableType
  {
    [Realms.PrimaryKey]
    [WovenProperty]
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

    [Preserve]
    [WovenProperty]
    public int LessonId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (LessonId))) : this.\u003CLessonId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLessonId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (LessonId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (LessonId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [WovenProperty]
    [Preserve]
    public string CalendarOraType
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (CalendarOraType)) : this.\u003CCalendarOraType\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCalendarOraType\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CalendarOraType));
        }
        else
          this.SetStringValue(nameof (CalendarOraType), value);
      }
    }

    [WovenProperty]
    [Preserve]
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
    public short Count
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<short>.op_Implicit((RealmInteger<short>) this.GetRealmIntegerValue<short>(nameof (Count))) : this.\u003CCount\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCount\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Count));
        }
        else
          this.SetRealmIntegerValue<short>(nameof (Count), (RealmInteger<M0>) RealmInteger<short>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset StartTime
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (StartTime)) : this.\u003CStartTime\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CStartTime\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (StartTime));
        }
        else
          this.SetDateTimeOffsetValue(nameof (StartTime), value);
      }
    }

    [Ignored]
    public DateTime StartTimeLocal
    {
      get
      {
        return this.StartTime.LocalDateTime;
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset EndTime
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (EndTime)) : this.\u003CEndTime\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEndTime\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (EndTime));
        }
        else
          this.SetDateTimeOffsetValue(nameof (EndTime), value);
      }
    }

    [Ignored]
    public DateTime EndTimeLocal
    {
      get
      {
        return this.EndTime.LocalDateTime;
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

    [WovenProperty]
    [Preserve]
    public string ClassRoom
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (ClassRoom)) : this.\u003CClassRoom\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CClassRoom\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ClassRoom));
        }
        else
          this.SetStringValue(nameof (ClassRoom), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public ClassGroupRealm ClassGroup
    {
      get
      {
        return this.get_IsManaged() ? (ClassGroupRealm) this.GetObjectValue<ClassGroupRealm>(nameof (ClassGroup)) : this.\u003CClassGroup\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CClassGroup\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ClassGroup));
        }
        else
          this.SetObjectValue<ClassGroupRealm>(nameof (ClassGroup), (M0) value);
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

    [WovenProperty]
    [Preserve]
    public string DeputyTeacher
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (DeputyTeacher)) : this.\u003CDeputyTeacher\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDeputyTeacher\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (DeputyTeacher));
        }
        else
          this.SetStringValue(nameof (DeputyTeacher), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string State
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (State)) : this.\u003CState\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CState\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (State));
        }
        else
          this.SetStringValue(nameof (State), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string StateName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (StateName)) : this.\u003CStateName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CStateName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (StateName));
        }
        else
          this.SetStringValue(nameof (StateName), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string PresenceType
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (PresenceType)) : this.\u003CPresenceType\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPresenceType\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PresenceType));
        }
        else
          this.SetStringValue(nameof (PresenceType), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string PresenceTypeName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (PresenceTypeName)) : this.\u003CPresenceTypeName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPresenceTypeName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PresenceTypeName));
        }
        else
          this.SetStringValue(nameof (PresenceTypeName), value);
      }
    }

    [Preserve]
    [WovenProperty]
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
    public string Homework
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Homework)) : this.\u003CHomework\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CHomework\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Homework));
        }
        else
          this.SetStringValue(nameof (Homework), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public int? TeacherHomeWorkId
    {
      get
      {
        if (!this.get_IsManaged())
          return this.\u003CTeacherHomeWorkId\u003Ek__BackingField;
        RealmInteger<int>? realmIntegerValue = (RealmInteger<int>?) this.GetNullableRealmIntegerValue<int>(nameof (TeacherHomeWorkId));
        return !realmIntegerValue.HasValue ? new int?() : new int?(RealmInteger<int>.op_Implicit(realmIntegerValue.GetValueOrDefault()));
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTeacherHomeWorkId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TeacherHomeWorkId));
        }
        else
        {
          int? nullable = value;
          this.SetNullableRealmIntegerValue<int>(nameof (TeacherHomeWorkId), (RealmInteger<M0>?) (nullable.HasValue ? new RealmInteger<int>?(RealmInteger<int>.op_Implicit(nullable.GetValueOrDefault())) : new RealmInteger<int>?()));
        }
      }
    }

    [WovenProperty]
    [Preserve]
    public bool IsTanuloHaziFeladatEnabled
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsTanuloHaziFeladatEnabled)) : this.\u003CIsTanuloHaziFeladatEnabled\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsTanuloHaziFeladatEnabled\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsTanuloHaziFeladatEnabled));
        }
        else
          this.SetBooleanValue(nameof (IsTanuloHaziFeladatEnabled), value);
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
    [WovenProperty]
    public bool IsHomeworkDone
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsHomeworkDone)) : this.\u003CIsHomeworkDone\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsHomeworkDone\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsHomeworkDone));
        }
        else
          this.SetBooleanValue(nameof (IsHomeworkDone), value);
      }
    }

    [Ignored]
    public bool HasHomework
    {
      get
      {
        return this.TeacherHomeWorkId.HasValue;
      }
    }

    [Ignored]
    public string CountDisplayText
    {
      get
      {
        return this.Count == (short) -1 ? "N" : this.Count.ToString();
      }
    }

    [WovenProperty]
    [Preserve]
    [Indexed]
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
    [Indexed]
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
    public string OsztalyCsoportId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyCsoportId)) : this.\u003COsztalyCsoportId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyCsoportId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyCsoportId));
        }
        else
          this.SetStringValue(nameof (OsztalyCsoportId), value);
      }
    }

    [Preserve]
    public LessonRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<LessonRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new LessonRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        LessonRealm lessonRealm = (LessonRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CLessonId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.LessonId = lessonRealm.\u003CLessonId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CCalendarOraType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.CalendarOraType = lessonRealm.\u003CCalendarOraType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        lessonRealm.Date = lessonRealm.\u003CDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CCount\u003Ek__BackingField != (short) 0)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.Count = lessonRealm.\u003CCount\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        lessonRealm.StartTime = lessonRealm.\u003CStartTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        lessonRealm.EndTime = lessonRealm.\u003CEndTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CSubject\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.Subject = lessonRealm.\u003CSubject\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CSubjectCategory\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.SubjectCategory = lessonRealm.\u003CSubjectCategory\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CSubjectCategoryName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.SubjectCategoryName = lessonRealm.\u003CSubjectCategoryName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CClassRoom\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.ClassRoom = lessonRealm.\u003CClassRoom\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (lessonRealm.\u003CClassGroup\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.get_Realm().Add<ClassGroupRealm>((M0) lessonRealm.\u003CClassGroup\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        lessonRealm.ClassGroup = lessonRealm.\u003CClassGroup\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.Teacher = lessonRealm.\u003CTeacher\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CDeputyTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.DeputyTeacher = lessonRealm.\u003CDeputyTeacher\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CState\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.State = lessonRealm.\u003CState\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CStateName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.StateName = lessonRealm.\u003CStateName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CPresenceType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.PresenceType = lessonRealm.\u003CPresenceType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CPresenceTypeName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.PresenceTypeName = lessonRealm.\u003CPresenceTypeName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CTheme\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.Theme = lessonRealm.\u003CTheme\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CHomework\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.Homework = lessonRealm.\u003CHomework\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        lessonRealm.TeacherHomeWorkId = lessonRealm.\u003CTeacherHomeWorkId\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CIsTanuloHaziFeladatEnabled\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.IsTanuloHaziFeladatEnabled = lessonRealm.\u003CIsTanuloHaziFeladatEnabled\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CSeenByUser\u003Ek__BackingField)
        {
          // ISSUE: explicit non-virtual call
          // ISSUE: reference to a compiler-generated field
          __nonvirtual (lessonRealm.SeenByUser) = lessonRealm.\u003CSeenByUser\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CIsHomeworkDone\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.IsHomeworkDone = lessonRealm.\u003CIsHomeworkDone\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || lessonRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          lessonRealm.ProfileId = lessonRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        lessonRealm.CreatedDate = lessonRealm.\u003CCreatedDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && lessonRealm.\u003COsztalyCsoportId\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        lessonRealm.OsztalyCsoportId = lessonRealm.\u003COsztalyCsoportId\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        LessonRealm lessonRealm = (LessonRealm) instance;
        value = (object) lessonRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
