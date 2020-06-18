// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.ExamDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class ExamDbDataService : IExamDbDataService
  {
    private readonly IExamDbRepository _examRepository;
    private readonly ISettingsDbDataService _settingsDataService;
    private readonly IDbMobileApi _mobileApi;

    public ExamDbDataService()
    {
      this._examRepository = (IExamDbRepository) Mvx.get_IoCProvider().Resolve<IExamDbRepository>();
      this._settingsDataService = (ISettingsDbDataService) Mvx.get_IoCProvider().Resolve<ISettingsDbDataService>();
      this._mobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
    }

    public void AddOrUpdate(ExamRealm exam, Action<ExamRealm> action = null)
    {
      this._examRepository.AddOrUpdate(exam, action);
    }

    public void AddOrUpdate(IEnumerable<ExamRealm> exams, Action<ExamRealm> action = null)
    {
      if (exams == null || !exams.Any<ExamRealm>())
        return;
      this._examRepository.AddOrUpdate(exams, action);
    }

    public ExamRealm Get(int itemId)
    {
      return this._examRepository.Find(itemId.ToString());
    }

    public ExamRealm Get(string itemId)
    {
      return this._examRepository.Find(itemId);
    }

    public ExamRealm GetByUid(int uid)
    {
      // ISSUE: object of a compiler-generated type is created
      // ISSUE: variable of a compiler-generated type
      ExamDbDataService.\u003C\u003Ec__DisplayClass8_0 cDisplayClass80 = new ExamDbDataService.\u003C\u003Ec__DisplayClass8_0();
      // ISSUE: reference to a compiler-generated field
      cDisplayClass80.uid = uid;
      ParameterExpression parameterExpression;
      // ISSUE: reference to a compiler-generated field
      // ISSUE: method reference
      return this._examRepository.Query().FirstOrDefault<ExamRealm>(Expression.Lambda<Func<ExamRealm, bool>>((Expression) Expression.Equal(x.Uid, (Expression) Expression.Call(cDisplayClass80.uid, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (int.ToString)), Array.Empty<Expression>())), parameterExpression));
    }

    public int GetNewItemCount()
    {
      return this._examRepository.Query().Count<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => !x.SeenByUser));
    }

    public void Delete(string profileId)
    {
      this._examRepository.Remove((IEnumerable<ExamRealm>) this._examRepository.Query().Where<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.ProfileId == profileId)));
    }

    public void ExpireNewsItems()
    {
      DateTimeOffset expirationTime = DateTimeOffset.Now.AddDays((double) -this._settingsDataService.NewsItemExpirationDay);
      this._examRepository.AddOrUpdate((IEnumerable<ExamRealm>) this._examRepository.Query().Where<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.BejelentesDatuma < expirationTime)), (Action<ExamRealm>) (exam => exam.SeenByUser = true));
    }

    public async Task<IEnumerable<ExamRealm>> FetchExamsAsync(
      ProfileRealm profile,
      bool forceRefresh = false)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetExamsAsync(profile, new DateTime?(), new DateTime?(), forceRefresh);
    }

    public IEnumerable<ExamRealm> GetLatest(string profileId)
    {
      DateTimeOffset day = new DateTimeOffset(DateTime.Today.AddDays((double) this._settingsDataService.GetDashboardDayRange()));
      return (IEnumerable<ExamRealm>) this._examRepository.Query().Where<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.ProfileId == profileId && x.BejelentesDatuma >= day)).OrderByDescending<ExamRealm, DateTimeOffset>((Expression<Func<ExamRealm, DateTimeOffset>>) (x => x.BejelentesDatuma));
    }

    public IEnumerable<ExamRealm> GetExams(string profileId)
    {
      return (IEnumerable<ExamRealm>) this._examRepository.Query().Where<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.ProfileId == profileId));
    }

    public int GetNewItemCount(string profileId)
    {
      return this._examRepository.Query().Count<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.ProfileId == profileId && !x.SeenByUser && x.Datum > DateTimeOffset.Now));
    }

    public int DiffWithStored(string profileId, IEnumerable<ExamRealm> exams)
    {
      return this.GetExams(profileId).Except<ExamRealm>(exams).Count<ExamRealm>();
    }
  }
}
