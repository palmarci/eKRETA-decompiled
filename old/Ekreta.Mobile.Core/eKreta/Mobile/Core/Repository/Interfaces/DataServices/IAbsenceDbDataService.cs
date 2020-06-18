// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IAbsenceDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IAbsenceDbDataService
  {
    void AddOrUpdate(AbsenceRealm absence, Action<AbsenceRealm> action);

    Task AddOrUpdateAsync(AbsenceRealm absence, Action<AbsenceRealm> action);

    void AddOrUpdate(IEnumerable<AbsenceRealm> absences, Action<AbsenceRealm> action);

    Task AddOrUpdateAsync(IEnumerable<AbsenceRealm> absences, Action<AbsenceRealm> action);

    IEnumerable<AbsenceRealm> GetAbsences(string profileRolelessId);

    IEnumerable<AbsenceRealm> GetLatestAbsences(string profileRolelessId);

    int GetNewItemCount();

    int GetNewItemCount(string profileRolelessId);

    int DiffWithStored(string profileRolelessId, IEnumerable<AbsenceRealm> absences);

    void Delete(string profileRolelessId);

    AbsenceRealm Get(int itemId);

    void ExpireNewsItems();
  }
}
