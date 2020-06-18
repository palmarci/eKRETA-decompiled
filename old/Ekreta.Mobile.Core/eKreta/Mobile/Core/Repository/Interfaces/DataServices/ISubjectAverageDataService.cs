﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ISubjectAverageDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ISubjectAverageDataService : IDataService
  {
    IEnumerable<SubjectAverage> GetSubjectAverages(Profile profile);

    void Delete(Profile profile);

    void AddOrUpdate(Profile profile, IEnumerable<SubjectAverage> subjectAverages);

    Task<IEnumerable<SubjectAverage>> FetchSubjectAveragesAsync(
      Profile profile);
  }
}
