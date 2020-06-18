// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IAbsenceDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IAbsenceDataService
  {
    void AddOrUpdate(Profile profile, Absence absence);

    void AddOrUpdate(Profile profile, IEnumerable<Absence> absences);

    IEnumerable<Absence> GetAbsences(Profile profile);

    IEnumerable<Absence> GetLatestAbsences(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int DiffWithStored(Profile profile, IEnumerable<Absence> absences);

    void Delete(Profile profile);

    Absence Get(int itemId);

    void ExpireNewsItems();
  }
}
