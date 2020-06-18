// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ListItemCreator
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Helpers
{
  public class ListItemCreator
  {
    private readonly Profile _profile;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly IEventDataService _eventDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly INoteDataService _noteDataService;
    private readonly IExamDataService _examDataService;

    public ListItemCreator(Profile profile)
    {
      this._profile = profile;
      this._absenceDataService = (IAbsenceDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDataService>();
      this._evaluationDataService = (IEvaluationDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDataService>();
      this._eventDataService = (IEventDataService) Mvx.get_IoCProvider().Resolve<IEventDataService>();
      this._lessonDataService = (ILessonDataService) Mvx.get_IoCProvider().Resolve<ILessonDataService>();
      this._noteDataService = (INoteDataService) Mvx.get_IoCProvider().Resolve<INoteDataService>();
      this._examDataService = (IExamDataService) Mvx.get_IoCProvider().Resolve<IExamDataService>();
    }

    public List<ListItem> CreateAbsenceListItems()
    {
      return this._absenceDataService.GetLatestAbsences(this._profile).Select<Absence, ListItem>((Func<Absence, ListItem>) (x => new ListItem()
      {
        Id = x.AbsenceId,
        Type = typeof (Absence),
        Title = x.TypeName,
        Subtitle = x.Subject,
        DateTitle = this.CreateDateTitle(x.LessonStartTime),
        Date = x.LessonStartTime,
        ImageSource = ImageMapping.GetImageSourceByJustificationType(x.JustificationState),
        CreatingTime = x.CreatingTime,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    public List<ListItem> CreateEvaluationListItems()
    {
      return this._evaluationDataService.GetLatestEvaluations(this._profile).Select<Evaluation, ListItem>((Func<Evaluation, ListItem>) (x => new ListItem()
      {
        Id = x.EvaluationId,
        StringId = EvaluationHelper.GetId(x),
        Type = typeof (Evaluation),
        Title = x.Value,
        Subtitle = x.EvaluationTitle,
        DateTitle = x.Type != "MidYear" ? x.TypeName : this.CreateDateTitle(x.Date),
        Date = x.Date,
        ImageSource = ImageMapping.GetImageSourceBySubjectName(x.SubjectCategoryName),
        CreatingTime = x.CreatingTime,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    public List<ListItem> CreateNoteListItems()
    {
      return this._noteDataService.GetLatestNotes(this._profile).Select<Note, ListItem>((Func<Note, ListItem>) (x => new ListItem()
      {
        Id = x.NoteId,
        Type = typeof (Note),
        Title = x.Title,
        Subtitle = x.Teacher,
        DateTitle = this.CreateDateTitle(x.Date),
        Date = x.Date,
        ImageSource = "Ekreta.Mobile.Core.Images.SubjectIcon65.png",
        CreatingTime = x.CreatingTime,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    public List<ListItem> CreateHomeWorkListItems()
    {
      return this._lessonDataService.GetLatestHomeWorks(this._profile).Select<Lesson, ListItem>((Func<Lesson, ListItem>) (x => new ListItem()
      {
        Id = x.TeacherHomeWorkId.Value,
        Type = typeof (Lesson),
        Title = "Házi feladat",
        Subtitle = x.Subject,
        DateTitle = this.CreateDateTitle(x.Date),
        Date = x.Date,
        ImageSource = "Ekreta.Mobile.Core.Images.Dashboard_Homework.png",
        CreatingTime = x.Date,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    public List<ListItem> CreateEventListItems()
    {
      return this._eventDataService.GetLatestEvents(this._profile).Select<Event, ListItem>((Func<Event, ListItem>) (x => new ListItem()
      {
        Id = x.EventId,
        StringId = x.Id,
        Type = typeof (Event),
        Title = "Faliújság",
        Subtitle = x.Content,
        DateTitle = this.CreateDateTitle(x.Date),
        Date = x.Date,
        ImageSource = "Ekreta.Mobile.Core.Images.SubjectIcon71.png",
        CreatingTime = x.Date,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    public List<ListItem> CreateExamsListItems()
    {
      return this._examDataService.GetLatest(this._profile).Select<Exam, ListItem>((Func<Exam, ListItem>) (x => new ListItem()
      {
        Id = x.ExamId,
        StringId = x.Id,
        Type = typeof (Exam),
        Title = x.SzamonkeresModja,
        Subtitle = x.Tantargy,
        DateTitle = this.CreateDateTitle(x.Datum),
        Date = x.BejelentesDatuma,
        ImageSource = "Ekreta.Mobile.Core.Images.menu_Szamonkeresek.png",
        CreatingTime = x.BejelentesDatuma,
        SeenByUser = x.SeenByUser
      })).ToList<ListItem>();
    }

    private bool GetNotSeenByUserFromId(string modelName, int id)
    {
      List<NewsItem> source;
      this._profile.NewItems.TryGetValue(modelName, out source);
      return source != null && source.Any<NewsItem>((Func<NewsItem, bool>) (x => x.Id == id));
    }

    private string CreateDateTitle(DateTime creatingTime)
    {
      return string.Format("{0:D}", (object) creatingTime);
    }
  }
}
