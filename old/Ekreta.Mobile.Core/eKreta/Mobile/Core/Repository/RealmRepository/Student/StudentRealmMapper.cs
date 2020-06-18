// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Student.StudentRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Enum;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Mappers;
using Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Student
{
  public class StudentRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Student, StudentRealm>, IMapper<Ekreta.Mobile.Core.Models.Student, StudentRealm>
  {
    private static readonly FormTeacherRealmMapper formTeacherMapper = new FormTeacherRealmMapper();
    private static readonly TutelaryRealmMapper tutelaryMapper = new TutelaryRealmMapper();

    public Ekreta.Mobile.Core.Models.Student From(StudentRealm item)
    {
      Ekreta.Mobile.Core.Models.Student student1 = new Ekreta.Mobile.Core.Models.Student();
      student1.TanuloAktualisOktatasNevelesiKategoriaja = (StudentEducationCategory) System.Enum.Parse(typeof (StudentEducationCategory), item.TanuloAktualisOktatasNevelesiKategoriaja);
      student1.StudentId = int.Parse(item.StudentId);
      student1.InstituteCode = item.InstituteCode;
      student1.SchoolYearId = item.SchoolYearId;
      student1.InstituteName = item.InstituteName;
      student1.Name = item.Name;
      student1.MothersName = item.MothersName;
      student1.NameOfBirth = item.NameOfBirth;
      student1.PlaceOfBirth = item.PlaceOfBirth;
      student1.DateOfBirthUtc = item.DateOfBirthUtc.UtcDateTime.ToLocalTime();
      student1.AddressDataList = (IEnumerable<string>) item.AddressDataList.ToList<string>();
      student1.ProfileId = item.ProfileId;
      IList<FormMasterRealm> osztalyfonokok = item.Osztalyfonokok;
      student1.Osztalyfonokok = osztalyfonokok != null ? osztalyfonokok.Map() : (List<FormMaster>) null;
      Ekreta.Mobile.Core.Models.Student student2 = student1;
      if (item.FormTeacher != null)
        student2.FormTeacher = StudentRealmMapper.formTeacherMapper.From(item.FormTeacher);
      if (item.Tutelaries != null)
      {
        List<Ekreta.Mobile.Core.Models.Tutelary> tutelaryList = new List<Ekreta.Mobile.Core.Models.Tutelary>();
        foreach (TutelaryRealm tutelary in (IEnumerable<TutelaryRealm>) item.Tutelaries)
          tutelaryList.Add(StudentRealmMapper.tutelaryMapper.From(tutelary));
        student2.Tutelaries = (IEnumerable<Ekreta.Mobile.Core.Models.Tutelary>) tutelaryList;
      }
      if (item.OsztalyCsoportok != null)
      {
        student2.OsztalyCsoportok = new List<ClassGroup>();
        foreach (ClassGroupRealm source in (IEnumerable<ClassGroupRealm>) item.OsztalyCsoportok)
          student2.OsztalyCsoportok.Add(source.Map());
      }
      return student2;
    }

    public StudentRealm To(Ekreta.Mobile.Core.Models.Student item)
    {
      StudentRealm studentRealm = new StudentRealm()
      {
        TanuloAktualisOktatasNevelesiKategoriaja = item.TanuloAktualisOktatasNevelesiKategoriaja.ToString(),
        StudentId = item.StudentId.ToString(),
        InstituteCode = item.InstituteCode,
        SchoolYearId = item.SchoolYearId,
        InstituteName = item.InstituteName,
        Name = item.Name,
        MothersName = item.MothersName,
        NameOfBirth = item.NameOfBirth,
        PlaceOfBirth = item.PlaceOfBirth,
        DateOfBirthUtc = new DateTimeOffset(item.DateOfBirthUtc),
        ProfileId = item.ProfileId
      };
      if (item.FormTeacher != null)
        studentRealm.FormTeacher = StudentRealmMapper.formTeacherMapper.To(item.FormTeacher);
      if (item.AddressDataList != null)
      {
        foreach (string addressData in item.AddressDataList)
          studentRealm.AddressDataList.Add(addressData);
      }
      if (item.Tutelaries != null)
      {
        foreach (Ekreta.Mobile.Core.Models.Tutelary tutelary in item.Tutelaries)
          studentRealm.Tutelaries.Add(StudentRealmMapper.tutelaryMapper.To(tutelary));
      }
      if (item.OsztalyCsoportok != null)
      {
        foreach (ClassGroup source in item.OsztalyCsoportok)
          studentRealm.OsztalyCsoportok.Add(source.Map());
      }
      if (item.Osztalyfonokok != null)
      {
        foreach (FormMaster source in item.Osztalyfonokok)
          studentRealm.Osztalyfonokok.Add(source.Map());
      }
      return studentRealm;
    }
  }
}
