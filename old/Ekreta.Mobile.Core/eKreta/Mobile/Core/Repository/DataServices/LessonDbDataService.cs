// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.LessonDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class LessonDbDataService : ILessonDbDataService
  {
    private readonly ILessonDbRepository _lessonRepository;
    private readonly ISettingsDataService _settingsDataService;
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;

    public LessonDbDataService()
    {
      this._lessonRepository = (ILessonDbRepository) Mvx.get_IoCProvider().Resolve<ILessonDbRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public void AddOrUpdate(LessonRealm lesson, Action<LessonRealm> action)
    {
      this._lessonRepository.AddOrUpdate(lesson, action);
    }

    public async Task AddOrUpdateAsync(LessonRealm lesson, Action<LessonRealm> action)
    {
      await this._lessonRepository.AddOrUpdateAsync(lesson, action);
    }

    public void AddOrUpdate(IEnumerable<LessonRealm> lessons, Action<LessonRealm> action)
    {
      if (lessons == null || !lessons.Any<LessonRealm>())
        return;
      this._lessonRepository.AddOrUpdate(lessons, action);
    }

    public async Task AddOrUpdateAsync(
      IEnumerable<LessonRealm> lessons,
      Action<LessonRealm> action)
    {
      if (lessons == null || !lessons.Any<LessonRealm>())
        return;
      await this._lessonRepository.AddOrUpdateAsync(lessons, action);
    }

    public void OverrideLessons(
      string profileRolelessId,
      IEnumerable<LessonRealm> lessons,
      DateTime fromDate,
      DateTime toDate)
    {
      DateTimeOffset startDate = new DateTimeOffset(fromDate);
      DateTimeOffset endDate = new DateTimeOffset(toDate);
      IEnumerable<LessonRealm> lessons1 = this.GetLessons(profileRolelessId, fromDate, toDate);
      lessons = this.UpdateNewLessonsSeenStatus(lessons, lessons1);
      this._lessonRepository.Remove((IEnumerable<LessonRealm>) this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.Date >= startDate && x.Date <= endDate)));
      this._lessonRepository.AddOrUpdate(lessons, (Action<LessonRealm>) (lesson => lesson.ProfileId = profileRolelessId));
    }

    public IEnumerable<LessonRealm> GetLessons(
      string profileRolelessId,
      DateTime fromDate,
      DateTime toDate)
    {
      DateTimeOffset startDate = new DateTimeOffset(fromDate);
      DateTimeOffset endDate = new DateTimeOffset(toDate);
      return (IEnumerable<LessonRealm>) this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.Date >= startDate && x.Date <= endDate));
    }

    public LessonRealm Get(string id)
    {
      return this._lessonRepository.Find(id);
    }

    public LessonRealm GetByTeacherHomeworkId(int homeworkId)
    {
      return this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.TeacherHomeWorkId == (int?) homeworkId)).FirstOrDefault<LessonRealm>();
    }

    public int GetNewItemCount()
    {
      return this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.TeacherHomeWorkId != new int?() && !x.SeenByUser)).Count<LessonRealm>();
    }

    public int GetNewItemCount(string profileRolelessId)
    {
      return this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.TeacherHomeWorkId != new int?() && !x.SeenByUser)).Count<LessonRealm>();
    }

    public IEnumerable<LessonRealm> GetLatestHomeWorks(
      string profileRolelessId)
    {
      DateTimeOffset day = new DateTimeOffset(DateTime.Today.AddDays((double) -this._settingsDataService.GetDashboardDayRange()));
      return (IEnumerable<LessonRealm>) this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == profileRolelessId && x.Date >= day && x.TeacherHomeWorkId != new int?())).OrderByDescending<LessonRealm, DateTimeOffset>((Expression<Func<LessonRealm, DateTimeOffset>>) (x => x.Date));
    }

    public async Task<IEnumerable<LessonRealm>> FetchLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessonsAsync = await this._mobileApi.GetLessonsAsync(profile, fromDate, toDate, forceRefresh);
      LessonRealmMapper lessonRealmMapper = new LessonRealmMapper();
      List<LessonRealm> source = new List<LessonRealm>();
      foreach (Ekreta.Mobile.Core.Models.Lesson lesson in lessonsAsync)
        source.Add(lessonRealmMapper.To(lesson));
      return source.AsEnumerable<LessonRealm>();
    }

    public int DiffHomeWorksWithStored(
      string profileRolelessId,
      IEnumerable<LessonRealm> lessons,
      DateTime fromDate,
      DateTime toDate)
    {
      if (lessons == null || !lessons.Any<LessonRealm>())
        return 0;
      IEnumerable<LessonRealm> lessons1 = this.GetLessons(profileRolelessId, fromDate, toDate);
      return lessons1 == null || !lessons1.Any<LessonRealm>() ? 0 : lessons1.Where<LessonRealm>((Func<LessonRealm, bool>) (x => x.TeacherHomeWorkId.HasValue)).Except<LessonRealm>(lessons.Where<LessonRealm>((Func<LessonRealm, bool>) (x => x.TeacherHomeWorkId.HasValue))).Count<LessonRealm>();
    }

    public void Delete(string profileRolelessId)
    {
      this._lessonRepository.Remove((IEnumerable<LessonRealm>) this._lessonRepository.Query().Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }

    public void ExpireNewsItems()
    {
      this._lessonRepository.AddOrUpdate(this._lessonRepository.Query().ToList<LessonRealm>().Where<LessonRealm>((Func<LessonRealm, bool>) (x =>
      {
        DateTimeOffset dateTimeOffset = DateTimeOffset.Now.AddDays((double) -this._settingsDataService.NewsItemExpirationDay);
        return x.CreatedDate < dateTimeOffset;
      })), (Action<LessonRealm>) (lesson => lesson.SeenByUser = true));
    }

    private IEnumerable<LessonRealm> UpdateNewLessonsSeenStatus(
      IEnumerable<LessonRealm> lessons,
      IEnumerable<LessonRealm> oldLessons)
    {
      if (oldLessons.Any<LessonRealm>())
        this._lessonRepository.AddOrUpdate(lessons, (Action<LessonRealm>) (lesson => lesson.SeenByUser = oldLessons.Any<LessonRealm>((Func<LessonRealm, bool>) (old => old.LessonId == lesson.LessonId && old.TeacherHomeWorkId.HasValue && old.SeenByUser))));
      else
        this._lessonRepository.AddOrUpdate(lessons, (Action<LessonRealm>) (lesson => lesson.SeenByUser = true));
      return lessons;
    }
  }
}
