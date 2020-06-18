// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IMobileApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IMobileApi
  {
    Task<TokenData> GetTokenAsync(
      string instituteUrl,
      string userName,
      string password,
      string instituteCode);

    Task<TokenData> RefreshTokenAsync(string instituteUrl, string refreshToken);

    Task<Student> GetStudentAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<Lesson>> GetLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<Event>> GetEventsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<Exam>> GetExamsAsync(
      Profile profile,
      DateTime? DatumTol = null,
      DateTime? DatumIg = null,
      bool forceRefresh = false);

    Task SendJustificationAsync(
      Profile profile,
      string verificationType,
      DateTime fromDate,
      DateTime toDate,
      string comment,
      byte[] pictureData);

    Task<TanarHaziFeladat> GetTanarHaziFeladatAsync(
      Profile profile,
      int tanarHaziFeladatId,
      bool forceRefresh = false);

    Task<TanuloHaziFeladatCreateResponse> CreateTanuloHaziFeladatAsync(
      Profile profile,
      Lesson lesson,
      string feladatSzovege);

    Task SaveTeacherHomeWorkDoneStatusAsync(
      Profile profile,
      string teacherHomeWorkId,
      bool done);

    Task<IEnumerable<TanuloHaziFeladat>> GetTanuloHaziFeladatListaAsync(
      Profile profile,
      int tanarHaziFeladatId,
      bool forceRefresh = false);

    Task<TanuloHaziFeladat> GetTanuloHaziFeladatAsync(
      Profile profile,
      int tanuloHaziFeladatId,
      bool forceRefresh = false);

    Task DeleteTanuloHaziFeladatAsync(Profile profile, int tanuloHaziFeladatId);

    Task<IEnumerable<SubjectAverage>> GetSubjectAveragesAsync(
      Profile profile,
      bool forceRefresh = false);
  }
}
