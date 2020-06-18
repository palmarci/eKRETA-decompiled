// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IExamDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IExamDbDataService
  {
    void AddOrUpdate(ExamRealm exam, Action<ExamRealm> action = null);

    void AddOrUpdate(IEnumerable<ExamRealm> exams, Action<ExamRealm> action = null);

    Task<IEnumerable<ExamRealm>> FetchExamsAsync(
      ProfileRealm profile,
      bool foreceRefresh = false);

    IEnumerable<ExamRealm> GetExams(string profileId);

    IEnumerable<ExamRealm> GetLatest(string profileId);

    int GetNewItemCount();

    int GetNewItemCount(string profileId);

    int DiffWithStored(string profileId, IEnumerable<ExamRealm> exams);

    void Delete(string profileId);

    ExamRealm Get(int itemId);

    ExamRealm GetByUid(int uid);

    ExamRealm Get(string itemId);

    void ExpireNewsItems();
  }
}
