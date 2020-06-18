// Decompiled with JetBrains decompiler
// Type: RealmModuleInitializer
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using Ekreta.Mobile.Core.Repository.RealmRepository.Cache;
using Ekreta.Mobile.Core.Repository.RealmRepository.Credentials;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using Ekreta.Mobile.Core.Repository.RealmRepository.Event;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using Ekreta.Mobile.Core.Repository.RealmRepository.ParsedMessage;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using Ekreta.Mobile.Core.Repository.RealmRepository.Rating;
using Ekreta.Mobile.Core.Repository.RealmRepository.Settings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElemTipusAdatSzotarElem;
using Realms.Schema;
using System;
using System.Collections.Generic;

internal class RealmModuleInitializer
{
  public static void Initialize()
  {
    RealmSchema.AddDefaultTypes((IEnumerable<Type>) new Type[36]
    {
      typeof (ClassGroupRealm),
      typeof (EducationTaskRealm),
      typeof (EmailAddressRealm),
      typeof (EmployeeRealm),
      typeof (FormMasterRealm),
      typeof (PhoneNumberRealm),
      typeof (TeacherRealm),
      typeof (UzenetRealm),
      typeof (PostaladaElemTipusAdatSzotarElemRealm),
      typeof (PostaladaElemRealm),
      typeof (CsatolmanyRealm),
      typeof (CimzettTipusAdatSzotarElemRealm),
      typeof (CimzettRealm),
      typeof (TutelaryRealm),
      typeof (TeacherHomeWorkRealm),
      typeof (SubjectAverageRealm),
      typeof (StudentHomeWorkRealm),
      typeof (StudentRealm),
      typeof (SettingRealm),
      typeof (RatingRealm),
      typeof (ProfileRealm),
      typeof (TokenInfoRealm),
      typeof (PushSettingsRealm),
      typeof (ParsedMessageRealm),
      typeof (NoteRealm),
      typeof (LessonRealm),
      typeof (FeatureToggleSet),
      typeof (InstituteRealm),
      typeof (FormTeacherRealm),
      typeof (ExamRealm),
      typeof (EventRealm),
      typeof (EvaluationNatureRealm),
      typeof (EvaluationRealm),
      typeof (CredentialRealm),
      typeof (CacheDataRealm),
      typeof (AbsenceRealm)
    });
  }
}
