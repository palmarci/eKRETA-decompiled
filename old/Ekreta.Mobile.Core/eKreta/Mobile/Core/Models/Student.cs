// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Student
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Enum;
using eKreta.Mobile.Core.Models;
using MvvmCross.ViewModels;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Student : MvxNotifyPropertyChanged
  {
    private IEnumerable<Lesson> _lessons;

    public StudentEducationCategory TanuloAktualisOktatasNevelesiKategoriaja { get; set; }

    public int StudentId { get; set; }

    public string Name { get; set; }

    public string DisplayName
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.Name) ? this.Name : "Nem szinkronizált";
      }
    }

    public string NameOfBirth { get; set; }

    public int SchoolYearId { get; set; }

    public string PlaceOfBirth { get; set; }

    public DateTime DateOfBirthUtc { get; set; }

    public string MothersName { get; set; }

    public IEnumerable<string> AddressDataList { get; set; }

    public string InstituteName { get; set; }

    public string InstituteCode { get; set; }

    public IEnumerable<Evaluation> Evaluations { get; set; }

    public IEnumerable<Absence> Absences { get; set; }

    public IEnumerable<Note> Notes { get; set; }

    [Obsolete("Az új API-ban már nem használjuk")]
    public FormTeacher FormTeacher { get; set; }

    public List<FormMaster> Osztalyfonokok { get; set; }

    public IEnumerable<Lesson> Lessons
    {
      get
      {
        return this._lessons;
      }
      set
      {
        this.SetProperty<IEnumerable<Lesson>>((M0&) ref this._lessons, (M0) value, nameof (Lessons));
      }
    }

    public IEnumerable<Tutelary> Tutelaries { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    public List<ClassGroup> OsztalyCsoportok { get; set; }

    public Student()
    {
      base.\u002Ector();
    }
  }
}
