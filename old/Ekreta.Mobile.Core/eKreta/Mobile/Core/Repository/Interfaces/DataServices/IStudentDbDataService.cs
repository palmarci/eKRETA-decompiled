// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IStudentDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IStudentDbDataService
  {
    void AddOrUpdate(ProfileRealm profile, StudentRealm student);

    StudentRealm GetStudent(string profileRolelessId);

    IEnumerable<StudentRealm> GetStudents();

    void Delete(StudentRealm student);
  }
}
