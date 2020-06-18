// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IDbMobileApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.RealmRepository.Event;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IDbMobileApi
  {
    Task<TokenData> GetTokenAsync(
      string instituteUrl,
      string userName,
      string password,
      string instituteCode);

    Task<TokenData> RefreshTokenAsync(string instituteUrl, string refreshToken);

    Task<StudentRealm> GetStudentAsync(
      ProfileRealm profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<LessonRealm>> GetLessonsAsync(
      ProfileRealm profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<EventRealm>> GetEventsAsync(
      ProfileRealm profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false);

    Task<IEnumerable<ExamRealm>> GetExamsAsync(
      ProfileRealm profile,
      DateTime? DatumTol = null,
      DateTime? DatumIg = null,
      bool forceRefresh = false);

    Task SendJustificationAsync(
      ProfileRealm profile,
      string verificationType,
      DateTime fromDate,
      DateTime toDate,
      string comment,
      byte[] pictureData);

    Task<TeacherHomeWorkRealm> GetTanarHaziFeladatAsync(
      ProfileRealm profile,
      int tanarHaziFeladatId,
      bool forceRefresh = false);

    Task<TanuloHaziFeladatCreateResponse> CreateTanuloHaziFeladatAsync(
      ProfileRealm profile,
      LessonRealm lesson,
      string feladatSzovege);

    Task<IEnumerable<StudentHomeWorkRealm>> GetTanuloHaziFeladatListaAsync(
      ProfileRealm profile,
      int tanarHaziFeladatId,
      bool forceRefresh = false);

    Task<StudentHomeWorkRealm> GetTanuloHaziFeladatAsync(
      ProfileRealm profile,
      int tanuloHaziFeladatId,
      bool forceRefresh = false);

    Task DeleteTanuloHaziFeladatAsync(ProfileRealm profile, int tanuloHaziFeladatId);

    Task<IEnumerable<SubjectAverageRealm>> GetSubjectAveragesAsync(
      ProfileRealm profile,
      bool forceRefresh = false);
  }
}
