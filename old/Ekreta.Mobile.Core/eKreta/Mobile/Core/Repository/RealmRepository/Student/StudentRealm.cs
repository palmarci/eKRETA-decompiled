// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Student.StudentRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using Realms;
using Realms.Weaving;
using System;
using System.Collections.Generic;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Student
{
  [Woven(typeof (StudentRealm.RealmHelper))]
  [Preserve(true, false)]
  public class StudentRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Preserve]
    [WovenProperty]
    public string TanuloAktualisOktatasNevelesiKategoriaja
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (TanuloAktualisOktatasNevelesiKategoriaja)) : this.\u003CTanuloAktualisOktatasNevelesiKategoriaja\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanuloAktualisOktatasNevelesiKategoriaja\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (TanuloAktualisOktatasNevelesiKategoriaja));
        }
        else
          this.SetStringValue(nameof (TanuloAktualisOktatasNevelesiKategoriaja), value);
      }
    }

    [WovenProperty]
    [Preserve]
    [Realms.PrimaryKey]
    public string StudentId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (StudentId)) : this.\u003CStudentId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CStudentId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (StudentId));
        }
        else
          this.SetStringValueUnique(nameof (StudentId), value);
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

    [Ignored]
    public string DisplayName
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.Name) ? this.Name : "Nem szinkronizált";
      }
    }

    [Preserve]
    [WovenProperty]
    public string NameOfBirth
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (NameOfBirth)) : this.\u003CNameOfBirth\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNameOfBirth\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (NameOfBirth));
        }
        else
          this.SetStringValue(nameof (NameOfBirth), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int SchoolYearId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (SchoolYearId))) : this.\u003CSchoolYearId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSchoolYearId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SchoolYearId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (SchoolYearId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public string PlaceOfBirth
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (PlaceOfBirth)) : this.\u003CPlaceOfBirth\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPlaceOfBirth\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PlaceOfBirth));
        }
        else
          this.SetStringValue(nameof (PlaceOfBirth), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset DateOfBirthUtc
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (DateOfBirthUtc)) : this.\u003CDateOfBirthUtc\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDateOfBirthUtc\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (DateOfBirthUtc));
        }
        else
          this.SetDateTimeOffsetValue(nameof (DateOfBirthUtc), value);
      }
    }

    [Ignored]
    public DateTime DateOfBirthLocal
    {
      get
      {
        return this.DateOfBirthUtc.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    public string MothersName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (MothersName)) : this.\u003CMothersName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CMothersName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (MothersName));
        }
        else
          this.SetStringValue(nameof (MothersName), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public IList<string> AddressDataList
    {
      get
      {
        if (this.\u003CAddressDataList\u003Ek__BackingField == null)
        {
          StudentRealm studentRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<string>(nameof (AddressDataList));
            studentRealm.\u003CAddressDataList\u003Ek__BackingField = (IList<string>) listValue;
          }
          else
          {
            List<string> stringList = new List<string>();
            studentRealm.\u003CAddressDataList\u003Ek__BackingField = (IList<string>) stringList;
          }
        }
        return this.\u003CAddressDataList\u003Ek__BackingField;
      }
    }

    [Preserve]
    [WovenProperty]
    public string InstituteName
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InstituteName)) : this.\u003CInstituteName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstituteName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstituteName));
        }
        else
          this.SetStringValue(nameof (InstituteName), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string InstituteCode
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (InstituteCode)) : this.\u003CInstituteCode\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CInstituteCode\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (InstituteCode));
        }
        else
          this.SetStringValue(nameof (InstituteCode), value);
      }
    }

    [Obsolete("Az új apiban már nem használjuk")]
    [Preserve]
    [WovenProperty]
    public FormTeacherRealm FormTeacher
    {
      get
      {
        return this.get_IsManaged() ? (FormTeacherRealm) this.GetObjectValue<FormTeacherRealm>(nameof (FormTeacher)) : this.\u003CFormTeacher\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFormTeacher\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FormTeacher));
        }
        else
          this.SetObjectValue<FormTeacherRealm>(nameof (FormTeacher), (M0) value);
      }
    }

    [WovenProperty]
    [Preserve]
    public IList<FormMasterRealm> Osztalyfonokok
    {
      get
      {
        if (this.\u003COsztalyfonokok\u003Ek__BackingField == null)
        {
          StudentRealm studentRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<FormMasterRealm>(nameof (Osztalyfonokok));
            studentRealm.\u003COsztalyfonokok\u003Ek__BackingField = (IList<FormMasterRealm>) listValue;
          }
          else
          {
            List<FormMasterRealm> formMasterRealmList = new List<FormMasterRealm>();
            studentRealm.\u003COsztalyfonokok\u003Ek__BackingField = (IList<FormMasterRealm>) formMasterRealmList;
          }
        }
        return this.\u003COsztalyfonokok\u003Ek__BackingField;
      }
    }

    [Preserve]
    [WovenProperty]
    public IList<ClassGroupRealm> OsztalyCsoportok
    {
      get
      {
        if (this.\u003COsztalyCsoportok\u003Ek__BackingField == null)
        {
          StudentRealm studentRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<ClassGroupRealm>(nameof (OsztalyCsoportok));
            studentRealm.\u003COsztalyCsoportok\u003Ek__BackingField = (IList<ClassGroupRealm>) listValue;
          }
          else
          {
            List<ClassGroupRealm> classGroupRealmList = new List<ClassGroupRealm>();
            studentRealm.\u003COsztalyCsoportok\u003Ek__BackingField = (IList<ClassGroupRealm>) classGroupRealmList;
          }
        }
        return this.\u003COsztalyCsoportok\u003Ek__BackingField;
      }
    }

    [Ignored]
    public IList<EvaluationRealm> Evaluations { get; set; }

    [Ignored]
    public IList<SubjectAverageRealm> SubjectAverages { get; set; }

    [Ignored]
    public IList<AbsenceRealm> Absences { get; set; }

    [Ignored]
    public IList<NoteRealm> Notes { get; set; }

    [Ignored]
    public IList<LessonRealm> Lessons { get; set; }

    [WovenProperty]
    [Preserve]
    public IList<TutelaryRealm> Tutelaries
    {
      get
      {
        if (this.\u003CTutelaries\u003Ek__BackingField == null)
        {
          StudentRealm studentRealm = this;
          if (this.get_IsManaged())
          {
            IList<M0> listValue = this.GetListValue<TutelaryRealm>(nameof (Tutelaries));
            studentRealm.\u003CTutelaries\u003Ek__BackingField = (IList<TutelaryRealm>) listValue;
          }
          else
          {
            List<TutelaryRealm> tutelaryRealmList = new List<TutelaryRealm>();
            studentRealm.\u003CTutelaries\u003Ek__BackingField = (IList<TutelaryRealm>) tutelaryRealmList;
          }
        }
        return this.\u003CTutelaries\u003Ek__BackingField;
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
        return this.StudentId;
      }
    }

    [Preserve]
    public StudentRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<StudentRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new StudentRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        StudentRealm studentRealm = (StudentRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CTanuloAktualisOktatasNevelesiKategoriaja\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.TanuloAktualisOktatasNevelesiKategoriaja = studentRealm.\u003CTanuloAktualisOktatasNevelesiKategoriaja\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.Name = studentRealm.\u003CName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CNameOfBirth\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.NameOfBirth = studentRealm.\u003CNameOfBirth\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CSchoolYearId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.SchoolYearId = studentRealm.\u003CSchoolYearId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CPlaceOfBirth\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.PlaceOfBirth = studentRealm.\u003CPlaceOfBirth\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        studentRealm.DateOfBirthUtc = studentRealm.\u003CDateOfBirthUtc\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CMothersName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.MothersName = studentRealm.\u003CMothersName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CAddressDataList\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<string> listKBackingField = studentRealm.\u003CAddressDataList\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          studentRealm.\u003CAddressDataList\u003Ek__BackingField = (IList<string>) null;
          if (!skipDefaults)
            studentRealm.AddressDataList.Clear();
          if (listKBackingField != null)
          {
            for (int index = 0; index < listKBackingField.Count; ++index)
              studentRealm.AddressDataList.Add(listKBackingField[index]);
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CInstituteName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.InstituteName = studentRealm.\u003CInstituteName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CInstituteCode\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.InstituteCode = studentRealm.\u003CInstituteCode\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (studentRealm.\u003CFormTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          studentRealm.get_Realm().Add<FormTeacherRealm>((M0) studentRealm.\u003CFormTeacher\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        studentRealm.FormTeacher = studentRealm.\u003CFormTeacher\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003COsztalyfonokok\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<FormMasterRealm> osztalyfonokokKBackingField = studentRealm.\u003COsztalyfonokok\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          studentRealm.\u003COsztalyfonokok\u003Ek__BackingField = (IList<FormMasterRealm>) null;
          if (!skipDefaults)
            studentRealm.Osztalyfonokok.Clear();
          if (osztalyfonokokKBackingField != null)
          {
            for (int index = 0; index < osztalyfonokokKBackingField.Count; ++index)
            {
              studentRealm.get_Realm().Add<FormMasterRealm>((M0) osztalyfonokokKBackingField[index], update);
              studentRealm.Osztalyfonokok.Add(osztalyfonokokKBackingField[index]);
            }
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003COsztalyCsoportok\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<ClassGroupRealm> csoportokKBackingField = studentRealm.\u003COsztalyCsoportok\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          studentRealm.\u003COsztalyCsoportok\u003Ek__BackingField = (IList<ClassGroupRealm>) null;
          if (!skipDefaults)
            studentRealm.OsztalyCsoportok.Clear();
          if (csoportokKBackingField != null)
          {
            for (int index = 0; index < csoportokKBackingField.Count; ++index)
            {
              studentRealm.get_Realm().Add<ClassGroupRealm>((M0) csoportokKBackingField[index], update);
              studentRealm.OsztalyCsoportok.Add(csoportokKBackingField[index]);
            }
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || studentRealm.\u003CTutelaries\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          IList<TutelaryRealm> tutelariesKBackingField = studentRealm.\u003CTutelaries\u003Ek__BackingField;
          // ISSUE: reference to a compiler-generated field
          studentRealm.\u003CTutelaries\u003Ek__BackingField = (IList<TutelaryRealm>) null;
          if (!skipDefaults)
            studentRealm.Tutelaries.Clear();
          if (tutelariesKBackingField != null)
          {
            for (int index = 0; index < tutelariesKBackingField.Count; ++index)
            {
              studentRealm.get_Realm().Add<TutelaryRealm>((M0) tutelariesKBackingField[index], update);
              studentRealm.Tutelaries.Add(tutelariesKBackingField[index]);
            }
          }
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && studentRealm.\u003CProfileId\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        studentRealm.ProfileId = studentRealm.\u003CProfileId\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        StudentRealm studentRealm = (StudentRealm) instance;
        value = (object) studentRealm.StudentId;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
