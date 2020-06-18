// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.StudentDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class StudentDataService : IStudentDataService
  {
    private readonly IStudentRepository _studentRepository;
    private readonly IFormTeacherRepository _formteacherRepository;
    private readonly ITutelaryRepository _tutelaryRepository;
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;

    public StudentDataService()
    {
      this._studentRepository = (IStudentRepository) Mvx.get_IoCProvider().Resolve<IStudentRepository>();
      this._formteacherRepository = (IFormTeacherRepository) Mvx.get_IoCProvider().Resolve<IFormTeacherRepository>();
      this._tutelaryRepository = (ITutelaryRepository) Mvx.get_IoCProvider().Resolve<ITutelaryRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public Ekreta.Mobile.Core.Models.Student GetStudent(Profile profile)
    {
      return this._studentRepository.Query((ISpecification) new StudentByProfileSpecification(profile.RolelessId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Student>();
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Student> GetStudents()
    {
      return this._studentRepository.Query();
    }

    public async Task<Ekreta.Mobile.Core.Models.Student> FetchStudentAsync(
      Profile profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetStudentAsync(profile, new DateTime?(), new DateTime?(), true);
    }

    public void Delete(Ekreta.Mobile.Core.Models.Student student)
    {
      this._studentRepository.Remove(student);
      this._formteacherRepository.Remove(student.FormTeacher);
      foreach (Tutelary tutelary in student.Tutelaries)
        this._tutelaryRepository.Remove(tutelary);
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Student student)
    {
      if (student == null)
        return;
      student.ProfileId = profile.RolelessId;
      this._studentRepository.AddOrUpdate(student);
    }
  }
}
