﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ITeacherHomeWorkDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ITeacherHomeWorkDataService : IDataService
  {
    TanarHaziFeladat Get(int id);

    TanarHaziFeladat GetTeacherHomeWork(Lesson lesson);

    Task<TanarHaziFeladat> FetchTeacherHomeWorkAsync(Profile profile, int id);

    void SaveTeacherHomeWork(Profile profile, TanarHaziFeladat teacherHomeWork);

    void Delete(Profile profile);
  }
}
