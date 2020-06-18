// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.RefreshDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class RefreshDataService : IRefreshDataService
  {
    private readonly IProfileDataService _profileDataService;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly INoteDataService _noteDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly IEventDataService _eventDataService;
    private readonly ISubjectAverageDataService _subjectAverageDataService;
    private readonly IStudentDataService _studentDataService;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IExamDataService _examDataService;
    private readonly IMobileApi _mobileApi;
    private readonly IGlobalMobileApi _globalMobileApi;
    private readonly IMvxMessenger _messenger;

    public RefreshDataService()
    {
      this._profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      this._absenceDataService = (IAbsenceDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDataService>();
      this._evaluationDataService = (IEvaluationDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDataService>();
      this._noteDataService = (INoteDataService) Mvx.get_IoCProvider().Resolve<INoteDataService>();
      this._lessonDataService = (ILessonDataService) Mvx.get_IoCProvider().Resolve<ILessonDataService>();
      this._eventDataService = (IEventDataService) Mvx.get_IoCProvider().Resolve<IEventDataService>();
      this._subjectAverageDataService = (ISubjectAverageDataService) Mvx.get_IoCProvider().Resolve<ISubjectAverageDataService>();
      this._studentDataService = (IStudentDataService) Mvx.get_IoCProvider().Resolve<IStudentDataService>();
      this._uzenetDataService = (IUzenetDataService) Mvx.get_IoCProvider().Resolve<IUzenetDataService>();
      this._examDataService = (IExamDataService) Mvx.get_IoCProvider().Resolve<IExamDataService>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      this._globalMobileApi = (IGlobalMobileApi) Mvx.get_IoCProvider().Resolve<IGlobalMobileApi>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
    }

    public async Task<Profile> RefreshProfileAsync()
    {
      return await this.RefreshProfileAsync(this._profileDataService.GetActiveProfile(), false);
    }

    public async Task<Profile> RefreshProfileAsync(bool forceRefresh)
    {
      return await this.RefreshProfileAsync(this._profileDataService.GetActiveProfile(), forceRefresh);
    }

    public async Task<Profile> RefreshProfileAsync(Profile profile, bool forceRefresh = false)
    {
      Profile result1;
      try
      {
        try
        {
          if (profile == null)
            throw new ArgumentNullException(nameof (profile));
          TaskAwaiter<Institute> awaiter1 = this._globalMobileApi.GetInstituteAsync(profile.Institute).GetAwaiter();
          int num;
          if (!awaiter1.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<Institute> taskAwaiter = awaiter1;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Institute>, RefreshDataService.\u003CRefreshProfileAsync\u003Ed__16>(ref awaiter1, this);
            return;
          }
          Institute institute = awaiter1.GetResult();
          TaskAwaiter<Student> awaiter2 = this._mobileApi.GetStudentAsync(profile, new DateTime?(), new DateTime?(), forceRefresh).GetAwaiter();
          if (!awaiter2.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 1;
            TaskAwaiter<Student> taskAwaiter = awaiter2;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Student>, RefreshDataService.\u003CRefreshProfileAsync\u003Ed__16>(ref awaiter2, this);
            return;
          }
          Student student = awaiter2.GetResult();
          bool newProfile = profile.IsFirstLogin;
          if (student != null)
          {
            TaskAwaiter<IEnumerable<Event>> awaiter3 = this._mobileApi.GetEventsAsync(profile, new DateTime?(), new DateTime?(), forceRefresh).GetAwaiter();
            if (!awaiter3.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 2;
              TaskAwaiter<IEnumerable<Event>> taskAwaiter = awaiter3;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Event>>, RefreshDataService.\u003CRefreshProfileAsync\u003Ed__16>(ref awaiter3, this);
              return;
            }
            IEnumerable<Event> events = awaiter3.GetResult();
            DateTime fromDate = DateTime.Now.FirstDayOfWeek();
            DateTime toDate = DateTime.Now.LastDayOfWeek().AddDays(7.0);
            TaskAwaiter<IEnumerable<Lesson>> awaiter4 = this._mobileApi.GetLessonsAsync(profile, new DateTime?(fromDate), new DateTime?(toDate), forceRefresh).GetAwaiter();
            if (!awaiter4.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 3;
              TaskAwaiter<IEnumerable<Lesson>> taskAwaiter = awaiter4;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Lesson>>, RefreshDataService.\u003CRefreshProfileAsync\u003Ed__16>(ref awaiter4, this);
              return;
            }
            IEnumerable<Lesson> lessons = awaiter4.GetResult();
            TaskAwaiter<IEnumerable<Exam>> awaiter5 = this._mobileApi.GetExamsAsync(profile, new DateTime?(), new DateTime?(), forceRefresh).GetAwaiter();
            if (!awaiter5.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 4;
              TaskAwaiter<IEnumerable<Exam>> taskAwaiter = awaiter5;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Exam>>, RefreshDataService.\u003CRefreshProfileAsync\u003Ed__16>(ref awaiter5, this);
              return;
            }
            IEnumerable<Exam> result2 = awaiter5.GetResult();
            IEnumerable<Absence> absences = this._absenceDataService.GetAbsences(profile);
            Student student1 = student;
            IEnumerable<Absence> absences1 = student.Absences;
            IEnumerable<Absence> absences2 = absences1 != null ? absences1.Select<Absence, Absence>((Func<Absence, Absence>) (x =>
            {
              Absence absence = absences.FirstOrDefault<Absence>((Func<Absence, bool>) (y => y.AbsenceId == x.AbsenceId));
              x.SeenByUser = false;
              if (absence != null)
                x.SeenByUser = absence.SeenByUser;
              else if (newProfile)
                x.SeenByUser = true;
              return x;
            })) : (IEnumerable<Absence>) null;
            student1.Absences = absences2;
            this._absenceDataService.Delete(profile);
            this._absenceDataService.AddOrUpdate(profile, student.Absences);
            IEnumerable<Evaluation> evaluations = this._evaluationDataService.GetEvaluations(profile);
            Student student2 = student;
            IEnumerable<Evaluation> evaluations1 = student.Evaluations;
            List<Evaluation> evaluationList = evaluations1 != null ? evaluations1.Select<Evaluation, Evaluation>((Func<Evaluation, Evaluation>) (x =>
            {
              Evaluation evaluation = evaluations.FirstOrDefault<Evaluation>((Func<Evaluation, bool>) (y => y.EvaluationId == x.EvaluationId && y.EvaluationTitle == x.EvaluationTitle));
              x.SeenByUser = false;
              if (evaluation != null)
                x.SeenByUser = evaluation.SeenByUser;
              else if (newProfile)
                x.SeenByUser = true;
              return x;
            })).ToList<Evaluation>() : (List<Evaluation>) null;
            student2.Evaluations = (IEnumerable<Evaluation>) evaluationList;
            this._evaluationDataService.Delete(profile);
            this._evaluationDataService.AddOrUpdate(profile, student.Evaluations);
            IEnumerable<Note> notes = this._noteDataService.GetNotes(profile);
            Student student3 = student;
            IEnumerable<Note> notes1 = student.Notes;
            IEnumerable<Note> notes2 = notes1 != null ? notes1.Select<Note, Note>((Func<Note, Note>) (x =>
            {
              Note note = notes.FirstOrDefault<Note>((Func<Note, bool>) (y => y.NoteId == x.NoteId));
              x.SeenByUser = false;
              if (note != null)
                x.SeenByUser = note.SeenByUser;
              else if (newProfile)
                x.SeenByUser = true;
              return x;
            })) : (IEnumerable<Note>) null;
            student3.Notes = notes2;
            this._noteDataService.Delete(profile);
            this._noteDataService.AddOrUpdate(profile, student.Notes);
            IEnumerable<Event> storedEvents = this._eventDataService.GetEvents(profile);
            IEnumerable<Event> source1 = events;
            events = source1 != null ? source1.Select<Event, Event>((Func<Event, Event>) (x =>
            {
              Event @event = storedEvents.FirstOrDefault<Event>((Func<Event, bool>) (y => y.EventId == x.EventId && y.ProfileId == profile.Id));
              x.SeenByUser = false;
              if (@event != null)
              {
                x.SeenByUser = @event.GetHashCode() == x.GetHashCode() && @event.SeenByUser;
                x.Id = @event.Id;
              }
              else if (newProfile)
                x.SeenByUser = true;
              return x;
            })) : (IEnumerable<Event>) null;
            this._eventDataService.Delete(profile);
            this._eventDataService.AddOrUpdate(profile, events);
            IEnumerable<Exam> storedExams = this._examDataService.GetExams(profile);
            IEnumerable<Exam> exams = result2 != null ? result2.Select<Exam, Exam>((Func<Exam, Exam>) (x =>
            {
              Exam exam = storedExams.FirstOrDefault<Exam>((Func<Exam, bool>) (y => y.Uid == x.Uid && y.ProfileId == profile.Id));
              x.SeenByUser = false;
              if (exam != null)
                x.SeenByUser = exam.SeenByUser;
              else if (newProfile)
                x.SeenByUser = true;
              return x;
            })) : (IEnumerable<Exam>) null;
            this._examDataService.Delete(profile);
            this._examDataService.AddOrUpdate(profile, exams);
            this._subjectAverageDataService.Delete(profile);
            this._studentDataService.AddOrUpdate(profile, student);
            this._lessonDataService.OverrideLessons(profile, lessons, fromDate, toDate);
            Profile profile1 = profile;
            IEnumerable<Event> source2 = events;
            List<Event> eventList = source2 != null ? source2.ToList<Event>() : (List<Event>) null;
            profile1.Events = (IEnumerable<Event>) eventList;
            profile.Student = student;
            profile.Student.Lessons = lessons;
            profile.Exams = exams != null ? (IEnumerable<Exam>) exams.ToList<Exam>() : (IEnumerable<Exam>) null;
            profile.IsFirstLogin = false;
            this.CalculateNewsItemCount(profile, fromDate, toDate);
            profile.Institute = institute;
            events = (IEnumerable<Event>) null;
            lessons = (IEnumerable<Lesson>) null;
          }
          profile.PushSettings = this._profileDataService.GetActiveProfile().PushSettings;
          this._profileDataService.AddOrUpdate(profile);
          result1 = profile;
        }
        catch (Exception ex)
        {
          ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/RefreshDataService.cs", 226);
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, string.Format("RefreshDataService.RefreshProfileAsync({0})", (object) profile), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/RefreshDataService.cs", 211);
          throw;
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result1);
    }

    public async Task<Profile> UpdateStudentWithPushMessageAsync(
      Profile profile,
      PushMessage pushMessage,
      DateTime? fromDate = null,
      DateTime? toDate = null)
    {
      RefreshDataService refreshDataService = this;
      Profile result1;
      try
      {
        if (profile == null)
          throw new ArgumentNullException(nameof (profile));
        TaskAwaiter<Student> awaiter = refreshDataService._mobileApi.GetStudentAsync(profile, fromDate, toDate, true).GetAwaiter();
        if (!awaiter.IsCompleted)
        {
          int num;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 0;
          TaskAwaiter<Student> taskAwaiter = awaiter;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Student>, RefreshDataService.\u003CUpdateStudentWithPushMessageAsync\u003Ed__17>(ref awaiter, this);
          return;
        }
        Student result2 = awaiter.GetResult();
        if (result2 != null)
        {
          switch (pushMessage.NotificationType)
          {
            case NotificationMessageType.Evaluation:
              Evaluation evaluation = result2.Evaluations.FirstOrDefault<Evaluation>((Func<Evaluation, bool>) (x => x.EvaluationId == pushMessage.ItemId));
              if (evaluation == null)
              {
                result1 = profile;
                goto label_19;
              }
              else
              {
                refreshDataService._evaluationDataService.AddOrUpdate(profile, evaluation);
                break;
              }
            case NotificationMessageType.Absence:
              Absence absence = result2.Absences.FirstOrDefault<Absence>((Func<Absence, bool>) (x => x.AbsenceId == pushMessage.ItemId));
              if (absence == null)
              {
                result1 = profile;
                goto label_19;
              }
              else
              {
                refreshDataService._absenceDataService.AddOrUpdate(profile, absence);
                break;
              }
            case NotificationMessageType.Note:
              Note note = result2.Notes.FirstOrDefault<Note>((Func<Note, bool>) (x => x.NoteId == pushMessage.ItemId));
              if (note == null)
              {
                result1 = profile;
                goto label_19;
              }
              else
              {
                refreshDataService._noteDataService.AddOrUpdate(profile, note);
                break;
              }
          }
          refreshDataService._profileDataService.AddOrUpdate(profile);
          profile.Student = result2;
          refreshDataService._messenger.Publish<NewsItemsReceivedMessage>((M0) new NewsItemsReceivedMessage((object) refreshDataService, 1));
        }
        result1 = profile;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
label_19:
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result1);
    }

    public int GetProfileNewsItemCount(Profile profile)
    {
      int newItemCount1 = this._absenceDataService.GetNewItemCount(profile);
      int newItemCount2 = this._evaluationDataService.GetNewItemCount(profile);
      int newItemCount3 = this._eventDataService.GetNewItemCount(profile);
      int newItemCount4 = this._noteDataService.GetNewItemCount(profile);
      int newItemCount5 = this._uzenetDataService.GetNewItemCount(profile);
      int newItemCount6 = this._examDataService.GetNewItemCount(profile);
      int newItemCount7 = this._lessonDataService.GetNewItemCount(profile);
      int num = newItemCount2;
      return newItemCount1 + num + newItemCount3 + newItemCount4 + newItemCount5 + newItemCount6 + newItemCount7;
    }

    private int CalculateNewsItemCount(Profile profile, DateTime fromDate, DateTime toDate)
    {
      int num1 = this._absenceDataService.DiffWithStored(profile, profile.Student.Absences);
      int num2 = this._evaluationDataService.DiffWithStored(profile, profile.Student.Evaluations);
      int num3 = this._noteDataService.DiffWithStored(profile, profile.Student.Notes);
      int num4 = this._eventDataService.DiffWithStored(profile, profile.Events);
      int num5 = this._examDataService.DiffWithStored(profile, profile.Exams);
      int num6 = num2;
      return num1 + num6 + num3 + num4 + num5;
    }
  }
}
