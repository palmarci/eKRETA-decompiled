// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.PersonalDataSheetViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using MvvmCross.ViewModels;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class PersonalDataSheetViewModel : ViewModelBase
  {
    private readonly IStudentDbDataService _studentDataService;
    private StudentRealm _student;
    private bool _tutelaryFrameIsVisible;

    public PersonalDataSheetViewModel(IStudentDbDataService studentDataService)
    {
      this._studentDataService = studentDataService;
    }

    public StudentRealm Student
    {
      get
      {
        return this._student;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<StudentRealm>((M0&) ref this._student, (M0) value, nameof (Student));
      }
    }

    public bool TutelaryFrameIsVisible
    {
      get
      {
        return this._tutelaryFrameIsVisible;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._tutelaryFrameIsVisible, (M0) (value ? 1 : 0), nameof (TutelaryFrameIsVisible));
      }
    }

    public string StudentAddressDataList
    {
      get
      {
        return string.Join("\n", (IEnumerable<string>) this._student.AddressDataList.ToList<string>());
      }
    }

    public override void Start()
    {
      base.Start();
      this.Busy();
      this.ActiveProfileRealm = this._profileDbDataService.GetActiveProfile();
      if (this.ActiveProfileRealm != null)
        this.Student = this._studentDataService.GetStudent(this.ActiveProfileRealm.RolelessId);
      this.TutelaryFrameIsVisible = (uint) this.Student.Tutelaries.Count<TutelaryRealm>() > 0U;
      this.NotBusy();
    }
  }
}
