// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.LessonDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class LessonDataService : ILessonDataService
  {
    private readonly ILessonRepository _lessonRepository;
    private readonly ISettingsDataService _settingsDataService;
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;

    public LessonDataService()
    {
      this._lessonRepository = (ILessonRepository) Mvx.get_IoCProvider().Resolve<ILessonRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Lesson lesson)
    {
      lesson.ProfileId = profile.RolelessId;
      this._lessonRepository.AddOrUpdate(lesson);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessons)
    {
      if (lessons == null || !lessons.Any<Ekreta.Mobile.Core.Models.Lesson>())
        return;
      string profileId = profile.RolelessId;
      lessons = lessons.Select<Ekreta.Mobile.Core.Models.Lesson, Ekreta.Mobile.Core.Models.Lesson>((Func<Ekreta.Mobile.Core.Models.Lesson, Ekreta.Mobile.Core.Models.Lesson>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._lessonRepository.AddOrUpdate(lessons);
    }

    public void OverrideLessons(
      Profile profile,
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessons,
      DateTime fromDate,
      DateTime toDate)
    {
      lessons = this.UpdateNewLessonsSeenStatus(lessons, this.GetLessons(profile, fromDate, toDate));
      this._lessonRepository.Remove((ISpecification) new LessonsForIntervalSpecification(profile.RolelessId, fromDate, toDate));
      this.AddOrUpdate(profile, lessons);
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Lesson> GetLessons(
      Profile profile,
      DateTime fromDate,
      DateTime toDate)
    {
      return this._lessonRepository.Query((ISpecification) new LessonsForIntervalSpecification(profile.RolelessId, fromDate, toDate));
    }

    public Ekreta.Mobile.Core.Models.Lesson Get(string Id)
    {
      return this._lessonRepository.Find(Id);
    }

    public int GetNewItemCount()
    {
      return this._lessonRepository.Count((ISpecification) new NewHomeWorksSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._lessonRepository.Count((ISpecification) new NewHomeWorksByProfileSpecification(profile.RolelessId));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Lesson> GetLatestHomeWorks(
      Profile profile)
    {
      return this._lessonRepository.Query((ISpecification) new LatestHomeWorkRealmSpecification(profile.RolelessId, this._settingsDataService.GetDashboardDayRange()));
    }

    public async Task<IEnumerable<Ekreta.Mobile.Core.Models.Lesson>> FetchLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetLessonsAsync(profile, fromDate, toDate, forceRefresh);
    }

    public int DiffHomeWorksWithStored(
      Profile profile,
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessons,
      DateTime fromDate,
      DateTime toDate)
    {
      if (lessons == null || !lessons.Any<Ekreta.Mobile.Core.Models.Lesson>())
        return 0;
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessons1 = this.GetLessons(profile, fromDate, toDate);
      return lessons1 == null || !lessons1.Any<Ekreta.Mobile.Core.Models.Lesson>() ? 0 : lessons1.Where<Ekreta.Mobile.Core.Models.Lesson>((Func<Ekreta.Mobile.Core.Models.Lesson, bool>) (x => x.TeacherHomeWorkId.HasValue)).Except<Ekreta.Mobile.Core.Models.Lesson>(lessons.Where<Ekreta.Mobile.Core.Models.Lesson>((Func<Ekreta.Mobile.Core.Models.Lesson, bool>) (x => x.TeacherHomeWorkId.HasValue))).Count<Ekreta.Mobile.Core.Models.Lesson>();
    }

    public void Delete(Profile profile)
    {
      this._lessonRepository.Remove((ISpecification) new LessonsByProfileSpecification(profile.RolelessId));
    }

    public void ExpireNewsItems()
    {
      this._lessonRepository.AddOrUpdate(this._lessonRepository.Query((ISpecification) new ExpiredHomeWorksRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<Ekreta.Mobile.Core.Models.Lesson, Ekreta.Mobile.Core.Models.Lesson>((Func<Ekreta.Mobile.Core.Models.Lesson, Ekreta.Mobile.Core.Models.Lesson>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }

    public Ekreta.Mobile.Core.Models.Lesson GetByTeacherHomeworkId(int homeworkId)
    {
      return this._lessonRepository.Query((ISpecification) new LessonByTeacherHomeworkId(homeworkId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Lesson>();
    }

    private IEnumerable<Ekreta.Mobile.Core.Models.Lesson> UpdateNewLessonsSeenStatus(
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> lessons,
      IEnumerable<Ekreta.Mobile.Core.Models.Lesson> oldLessons)
    {
      if (oldLessons.Any<Ekreta.Mobile.Core.Models.Lesson>())
        lessons.ToList<Ekreta.Mobile.Core.Models.Lesson>().ForEach((Action<Ekreta.Mobile.Core.Models.Lesson>) (lesson => lesson.SeenByUser = oldLessons.Any<Ekreta.Mobile.Core.Models.Lesson>((Func<Ekreta.Mobile.Core.Models.Lesson, bool>) (old => old.LessonId == lesson.LessonId && old.HasHomework && old.SeenByUser))));
      else
        lessons.ToList<Ekreta.Mobile.Core.Models.Lesson>().ForEach((Action<Ekreta.Mobile.Core.Models.Lesson>) (lesson => lesson.SeenByUser = true));
      return lessons;
    }
  }
}
