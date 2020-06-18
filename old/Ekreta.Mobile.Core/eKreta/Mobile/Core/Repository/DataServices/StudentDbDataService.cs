// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.StudentDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class StudentDbDataService : IStudentDbDataService
  {
    private readonly IStudentDbRepository _studentRepository;
    private readonly IFormTeacherDbRepository _formteacherRepository;
    private readonly ITutelaryDbRepository _tutelaryRepository;
    private readonly ISecureStore _secureStore;
    private readonly IDbMobileApi _mobileApi;

    public StudentDbDataService()
    {
      this._studentRepository = (IStudentDbRepository) Mvx.get_IoCProvider().Resolve<IStudentDbRepository>();
      this._formteacherRepository = (IFormTeacherDbRepository) Mvx.get_IoCProvider().Resolve<IFormTeacherDbRepository>();
      this._tutelaryRepository = (ITutelaryDbRepository) Mvx.get_IoCProvider().Resolve<ITutelaryDbRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
    }

    public StudentRealm GetStudent(string profileRolelessId)
    {
      return this._studentRepository.Query().FirstOrDefault<StudentRealm>((Expression<Func<StudentRealm, bool>>) (x => x.ProfileId == profileRolelessId));
    }

    public IEnumerable<StudentRealm> GetStudents()
    {
      return (IEnumerable<StudentRealm>) this._studentRepository.Query();
    }

    public void Delete(StudentRealm student)
    {
      this._studentRepository.Remove(student);
      this._formteacherRepository.Remove(student.FormTeacher);
      foreach (TutelaryRealm tutelary in (IEnumerable<TutelaryRealm>) student.Tutelaries)
        this._tutelaryRepository.Remove(tutelary);
    }

    public void AddOrUpdate(ProfileRealm profile, StudentRealm student)
    {
      if (student == null)
        return;
      this._studentRepository.AddOrUpdate(student, (Action<StudentRealm>) (s => s.ProfileId = profile.RolelessId));
    }
  }
}
