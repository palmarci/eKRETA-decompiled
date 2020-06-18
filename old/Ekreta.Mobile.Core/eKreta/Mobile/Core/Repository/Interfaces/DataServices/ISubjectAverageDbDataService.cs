// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ISubjectAverageDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ISubjectAverageDbDataService : IDataService
  {
    IEnumerable<SubjectAverageRealm> GetSubjectAverages(
      string profileRolelessId);

    void Delete(string profileRolelessId);

    void AddOrUpdate(
      string profileRolelessId,
      IEnumerable<SubjectAverageRealm> subjectAverages,
      Action<SubjectAverageRealm> action = null);

    Task AddOrUpdateAsync(
      string profileRolelessId,
      IEnumerable<SubjectAverageRealm> subjectAverages,
      Action<SubjectAverageRealm> action = null);

    Task<IEnumerable<SubjectAverageRealm>> FetchSubjectAveragesAsync(
      ProfileRealm profile);
  }
}
