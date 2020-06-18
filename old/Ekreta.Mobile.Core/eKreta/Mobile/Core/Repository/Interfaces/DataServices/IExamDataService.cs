// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IExamDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IExamDataService
  {
    void AddOrUpdate(Profile profile, Exam exam);

    void AddOrUpdate(Profile profile, IEnumerable<Exam> exams);

    Task<IEnumerable<Exam>> FetchExamsAsync(Profile profile);

    IEnumerable<Exam> GetExams(Profile profile);

    IEnumerable<Exam> GetLatest(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int GetNewsByProfile(Profile profile);

    int DiffWithStored(Profile profile, IEnumerable<Exam> exams);

    void Delete(Profile profile);

    Exam Get(int itemId);

    Exam GetByUid(int uid);

    Exam Get(string itemId);

    void ExpireNewsItems();
  }
}
