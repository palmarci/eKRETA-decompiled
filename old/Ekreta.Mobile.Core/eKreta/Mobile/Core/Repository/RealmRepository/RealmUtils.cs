// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.RealmUtils
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using Ekreta.Mobile.Core.Repository.RealmRepository.Event;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using Ekreta.Mobile.Core.Repository.RealmRepository.Student;
using Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using Microsoft.CSharp.RuntimeBinder;
using MvvmCross;
using Newtonsoft.Json;
using Realms;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.CompilerServices;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public class RealmUtils
  {
    public static readonly RealmConfiguration RealmConfiguration;
    private const string DatabaseName = "kretaellenorzo.realm";

    static RealmUtils()
    {
      // ISSUE: object of a compiler-generated type is created
      // ISSUE: variable of a compiler-generated type
      RealmUtils.\u003C\u003Ec__DisplayClass2_0 cDisplayClass20 = new RealmUtils.\u003C\u003Ec__DisplayClass2_0();
      // ISSUE: reference to a compiler-generated field
      cDisplayClass20.secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      RealmConfiguration realmConfiguration = new RealmConfiguration("kretaellenorzo.realm");
      ((RealmConfigurationBase) realmConfiguration).set_SchemaVersion(44UL);
      // ISSUE: reference to a compiler-generated field
      ((RealmConfigurationBase) realmConfiguration).set_EncryptionKey(cDisplayClass20.secureStore.GetEncryptionKey());
      // ISSUE: method pointer
      realmConfiguration.set_MigrationCallback(new RealmConfiguration.MigrationCallbackDelegate((object) cDisplayClass20, __methodptr(\u003C\u002Ecctor\u003Eb__0)));
      RealmUtils.RealmConfiguration = realmConfiguration;
    }

    private static void Migration40(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 40UL)
        return;
      foreach (EvaluationRealm evaluationRealm in (IEnumerable<EvaluationRealm>) migration.get_NewRealm().All<EvaluationRealm>())
        evaluationRealm.EvaluationNatureRealm = (EvaluationNatureRealm) null;
    }

    private static void Migration2(
      ulong oldSchemaVersion,
      IQueryable<StudentRealm> newStudents,
      IQueryable<object> oldStudents,
      Migration migration,
      IQueryable<ProfileRealm> profiles,
      ISecureStore secureStore)
    {
      if (oldSchemaVersion >= 2UL)
        return;
      List<StudentRealm> source1 = new List<StudentRealm>();
      for (int index = 0; index < newStudents.Count<StudentRealm>(); ++index)
      {
        object obj = oldStudents.ElementAt<object>(index);
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__4.\u003C\u003Ep__0 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__4.\u003C\u003Ep__0 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Id", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        string str = RealmUtils.\u003C\u003Eo__4.\u003C\u003Ep__0.Target((CallSite) RealmUtils.\u003C\u003Eo__4.\u003C\u003Ep__0, obj) as string;
        StudentRealm studentRealm1 = newStudents.ElementAt<StudentRealm>(index);
        StudentRealm studentRealm2 = new StudentRealm()
        {
          StudentId = str,
          SchoolYearId = studentRealm1.SchoolYearId,
          ProfileId = studentRealm1.ProfileId,
          Name = studentRealm1.Name,
          FormTeacher = studentRealm1.FormTeacher,
          InstituteCode = studentRealm1.InstituteCode,
          InstituteName = studentRealm1.InstituteName
        };
        foreach (TutelaryRealm tutelary in (IEnumerable<TutelaryRealm>) studentRealm1.Tutelaries)
          studentRealm2.Tutelaries.Add(tutelary);
        source1.Add(studentRealm2);
      }
      migration.get_NewRealm().RemoveAll<StudentRealm>();
      for (int index = 0; index < source1.Count<StudentRealm>(); ++index)
        migration.get_NewRealm().Add<StudentRealm>((M0) source1.ElementAt<StudentRealm>(index), false);
      List<ProfileRealm> source2 = new List<ProfileRealm>();
      for (int index = 0; index < profiles.Count<ProfileRealm>(); ++index)
      {
        ProfileRealm profileRealm1 = profiles.ElementAt<ProfileRealm>(index);
        InstituteRealm institute = profileRealm1.Institute;
        TokenInfoRealm tokenInfo = profileRealm1.TokenInfo;
        PushSettingsRealm pushSettings = profileRealm1.PushSettings;
        int role = tokenInfo.Role;
        string newProfileId1 = string.Format("{0}-{1}", (object) institute.InstituteCode, (object) tokenInfo.InstituteUserId);
        string newProfileId2 = string.Format("{0}-{1}_{2}", (object) institute.InstituteCode, (object) tokenInfo.InstituteUserId, (object) role);
        ProfileRealm profileRealm2 = new ProfileRealm()
        {
          Id = newProfileId2,
          TokenInfo = tokenInfo,
          PushSettings = pushSettings,
          IsActive = profileRealm1.IsActive,
          Institute = institute
        };
        source2.Add(profileRealm2);
        secureStore.MigrateProfileId(profileRealm1.Id, newProfileId2);
        RealmUtils.MigrateData(migration, profileRealm1.Id, newProfileId1);
      }
      migration.get_NewRealm().RemoveAll<ProfileRealm>();
      for (int index = 0; index < source2.Count<ProfileRealm>(); ++index)
        migration.get_NewRealm().Add<ProfileRealm>((M0) source2.ElementAt<ProfileRealm>(index), false);
    }

    private static void Migration6(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 6UL)
        return;
      IQueryable<object> source1 = migration.get_OldRealm().All("TeacherHomeWorkRealm");
      IQueryable<TeacherHomeWorkRealm> source2 = (IQueryable<TeacherHomeWorkRealm>) migration.get_NewRealm().All<TeacherHomeWorkRealm>();
      for (int index = 0; index < source2.Count<TeacherHomeWorkRealm>(); ++index)
      {
        object obj1 = source1.ElementAt<object>(index);
        TeacherHomeWorkRealm teacherHomeWorkRealm = source2.ElementAt<TeacherHomeWorkRealm>(index);
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__1 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__1 = CallSite<Func<CallSite, object, int>>.Create(Binder.Convert(CSharpBinderFlags.ConvertExplicit, typeof (int), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, int> target = RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__1.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, int>> p1 = RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__0 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__0 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "TanitasiOraId", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj2 = RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__0.Target((CallSite) RealmUtils.\u003C\u003Eo__5.\u003C\u003Ep__0, obj1);
        int? nullable = new int?(target((CallSite) p1, obj2));
        teacherHomeWorkRealm.TanitasiOraId = nullable;
      }
    }

    private static void Migration7(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 7UL)
        return;
      IQueryable<LessonRealm> source1 = (IQueryable<LessonRealm>) migration.get_NewRealm().All<LessonRealm>();
      List<LessonRealm> source2 = new List<LessonRealm>();
      for (int index = 0; index < source1.Count<LessonRealm>(); ++index)
      {
        LessonRealm lessonRealm1 = source1.ElementAt<LessonRealm>(index);
        LessonRealm lessonRealm2 = new LessonRealm()
        {
          Id = Guid.NewGuid().ToString(),
          CalendarOraType = lessonRealm1.CalendarOraType,
          ClassGroup = lessonRealm1.ClassGroup,
          ClassRoom = lessonRealm1.ClassRoom,
          Count = lessonRealm1.Count,
          CreatedDate = lessonRealm1.CreatedDate,
          Date = lessonRealm1.Date,
          DeputyTeacher = lessonRealm1.DeputyTeacher,
          EndTime = lessonRealm1.EndTime,
          Homework = lessonRealm1.Homework,
          IsTanuloHaziFeladatEnabled = lessonRealm1.IsTanuloHaziFeladatEnabled,
          LessonId = lessonRealm1.LessonId,
          PresenceType = lessonRealm1.PresenceType,
          PresenceTypeName = lessonRealm1.PresenceTypeName,
          ProfileId = lessonRealm1.ProfileId,
          SeenByUser = lessonRealm1.SeenByUser,
          StartTime = lessonRealm1.StartTime,
          State = lessonRealm1.State,
          StateName = lessonRealm1.StateName,
          Subject = lessonRealm1.Subject,
          SubjectCategory = lessonRealm1.SubjectCategory,
          SubjectCategoryName = lessonRealm1.SubjectCategoryName,
          Teacher = lessonRealm1.Teacher,
          TeacherHomeWorkId = lessonRealm1.TeacherHomeWorkId,
          Theme = lessonRealm1.Theme
        };
        source2.Add(lessonRealm2);
      }
      migration.get_NewRealm().RemoveAll<LessonRealm>();
      for (int index = 0; index < source2.Count<LessonRealm>(); ++index)
        migration.get_NewRealm().Add<LessonRealm>((M0) source2.ElementAt<LessonRealm>(index), false);
    }

    private static void Migration8(
      ulong oldSchemaVersion,
      IQueryable<ProfileRealm> profiles,
      ISecureStore secureStore,
      Migration migration)
    {
      if (oldSchemaVersion >= 8UL)
        return;
      ITokenValidator tokenValidator = (ITokenValidator) Mvx.get_IoCProvider().Resolve<ITokenValidator>();
      TokenInfoRealmMapper tokenInfoRealmMapper = new TokenInfoRealmMapper();
      List<ProfileRealm> source = new List<ProfileRealm>();
      for (int index = 0; index < profiles.Count<ProfileRealm>(); ++index)
      {
        ProfileRealm profileRealm1 = profiles.ElementAt<ProfileRealm>(index);
        InstituteRealm institute = profileRealm1.Institute;
        TokenInfoRealm tokenInfo = profileRealm1.TokenInfo;
        PushSettingsRealm pushSettings = profileRealm1.PushSettings;
        if (institute != null && tokenInfo != null)
        {
          int role = tokenInfo.Role;
          string.Format("{0}-{1}", (object) institute.InstituteCode, (object) tokenInfo.InstituteUserId);
          string profileIdFromTokenData = tokenValidator.GetProfileIdFromTokenData(tokenInfoRealmMapper.From(tokenInfo));
          ProfileRealm profileRealm2 = new ProfileRealm()
          {
            Id = profileIdFromTokenData,
            TokenInfo = tokenInfo,
            PushSettings = pushSettings,
            IsActive = profileRealm1.IsActive,
            Institute = institute
          };
          source.Add(profileRealm2);
          secureStore.MigrateProfileId(profileRealm1.Id, profileIdFromTokenData);
        }
      }
      List<ProfileRealm> list = source.GroupBy<ProfileRealm, string>((Func<ProfileRealm, string>) (x => x.Id)).Select<IGrouping<string, ProfileRealm>, ProfileRealm>((Func<IGrouping<string, ProfileRealm>, ProfileRealm>) (g => g.First<ProfileRealm>())).ToList<ProfileRealm>();
      migration.get_NewRealm().RemoveAll<ProfileRealm>();
      for (int index = 0; index < list.Count<ProfileRealm>(); ++index)
        migration.get_NewRealm().Add<ProfileRealm>((M0) list.ElementAt<ProfileRealm>(index), false);
    }

    private static void Migration10(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 10UL)
        return;
      foreach (PushSettingsRealm pushSettingsRealm in (IEnumerable<PushSettingsRealm>) migration.get_NewRealm().All<PushSettingsRealm>())
        pushSettingsRealm.UpdateEugyintezes = false;
    }

    private static void Migration11(
      ulong oldSchemaVersion,
      IQueryable<StudentRealm> newStudents,
      IQueryable<object> oldStudents)
    {
      if (oldSchemaVersion >= 11UL)
        return;
      for (int index = 0; index < newStudents.Count<StudentRealm>(); ++index)
      {
        oldStudents.ElementAt<object>(index);
        newStudents.ElementAt<StudentRealm>(index).TanuloAktualisOktatasNevelesiKategoriaja = "0";
      }
    }

    private static void Migration31(
      ulong oldSchemaVersion,
      Migration migration,
      IQueryable<StudentRealm> newStudents)
    {
      if (oldSchemaVersion >= 31UL)
        return;
      IQueryable<M0> queryable1 = migration.get_NewRealm().All<AbsenceRealm>();
      IQueryable<EvaluationRealm> queryable2 = (IQueryable<EvaluationRealm>) migration.get_NewRealm().All<EvaluationRealm>();
      IQueryable<LessonRealm> queryable3 = (IQueryable<LessonRealm>) migration.get_NewRealm().All<LessonRealm>();
      IQueryable<NoteRealm> queryable4 = (IQueryable<NoteRealm>) migration.get_NewRealm().All<NoteRealm>();
      IQueryable<SubjectAverageRealm> queryable5 = (IQueryable<SubjectAverageRealm>) migration.get_NewRealm().All<SubjectAverageRealm>();
      foreach (AbsenceRealm absenceRealm in (IEnumerable<AbsenceRealm>) queryable1)
        absenceRealm.OsztalyCsoportUid = string.Empty;
      foreach (EvaluationRealm evaluationRealm in (IEnumerable<EvaluationRealm>) queryable2)
        evaluationRealm.OsztalyCsoportUid = string.Empty;
      foreach (LessonRealm lessonRealm in (IEnumerable<LessonRealm>) queryable3)
        lessonRealm.OsztalyCsoportId = string.Empty;
      foreach (NoteRealm noteRealm in (IEnumerable<NoteRealm>) queryable4)
        noteRealm.OsztalyCsoportUid = string.Empty;
      foreach (StudentRealm newStudent in (IEnumerable<StudentRealm>) newStudents)
      {
        IList<ClassGroupRealm> osztalyCsoportok = newStudent.OsztalyCsoportok;
        if (osztalyCsoportok != null)
          osztalyCsoportok.Count<ClassGroupRealm>();
        IList<FormMasterRealm> osztalyfonokok = newStudent.Osztalyfonokok;
        if (osztalyfonokok != null)
          osztalyfonokok.Count<FormMasterRealm>();
      }
      foreach (SubjectAverageRealm subjectAverageRealm in (IEnumerable<SubjectAverageRealm>) queryable5)
      {
        subjectAverageRealm.SubjectUid = string.Empty;
        subjectAverageRealm.SortIndex = 0;
        subjectAverageRealm.Value = subjectAverageRealm.Value;
      }
    }

    private static void Migration33(
      ulong oldSchemaVersion,
      IQueryable<ProfileRealm> profiles,
      ISecureStore secureStore,
      Migration migration)
    {
      if (oldSchemaVersion >= 33UL)
        return;
      List<ProfileRealm> source = new List<ProfileRealm>();
      for (int index = 0; index < profiles.Count<ProfileRealm>(); ++index)
      {
        ProfileRealm profileRealm1 = profiles.ElementAt<ProfileRealm>(index);
        InstituteRealm institute = profileRealm1.Institute;
        TokenInfoRealm tokenInfo1 = profileRealm1.TokenInfo;
        if (institute != null && tokenInfo1 != null)
        {
          Ekreta.Mobile.Core.Models.TokenInfo tokenInfo2 = (Ekreta.Mobile.Core.Models.TokenInfo) JsonConvert.DeserializeObject<Ekreta.Mobile.Core.Models.TokenInfo>(TokenDecoder.Decode(secureStore.GetTokenData(profileRealm1.Id).AccessToken));
          string id = TokenInfoRealmMapper.GetId(tokenInfo2.InstituteUserId, (int) tokenInfo2.Role, tokenInfo2.TutelaryId);
          TokenInfoRealm tokenInfoRealm = new TokenInfoRealm()
          {
            Id = id,
            InstituteCode = tokenInfo2.InstituteCode,
            InstituteUserId = tokenInfo2.InstituteUserId,
            Role = (int) tokenInfo2.Role,
            SchoolYearId = tokenInfo2.SchoolYearId,
            TutelaryId = tokenInfo2.TutelaryId,
            UserId = tokenInfo2.UserId.ToString()
          };
          ProfileRealm profileRealm2 = new ProfileRealm()
          {
            Id = profileRealm1.Id,
            TokenInfo = tokenInfoRealm,
            PushSettings = profileRealm1.PushSettings,
            IsActive = profileRealm1.IsActive,
            Institute = institute
          };
          source.Add(profileRealm2);
        }
      }
      migration.get_NewRealm().RemoveAll<TokenInfoRealm>();
      List<ProfileRealm> list = source.GroupBy<ProfileRealm, string>((Func<ProfileRealm, string>) (x => x.Id)).Select<IGrouping<string, ProfileRealm>, ProfileRealm>((Func<IGrouping<string, ProfileRealm>, ProfileRealm>) (g => g.First<ProfileRealm>())).GroupBy<ProfileRealm, string>((Func<ProfileRealm, string>) (x => x.TokenInfo.Id)).Select<IGrouping<string, ProfileRealm>, ProfileRealm>((Func<IGrouping<string, ProfileRealm>, ProfileRealm>) (g => g.Last<ProfileRealm>())).ToList<ProfileRealm>();
      migration.get_NewRealm().RemoveAll<ProfileRealm>();
      for (int index = 0; index < list.Count<ProfileRealm>(); ++index)
        migration.get_NewRealm().Add<ProfileRealm>((M0) list.ElementAt<ProfileRealm>(index), false);
    }

    private static void Migration34(
      ulong oldSchemaVersion,
      IQueryable<ProfileRealm> profiles,
      Migration migration)
    {
      if (oldSchemaVersion >= 34UL)
        return;
      List<ProfileRealm> source = new List<ProfileRealm>();
      foreach (ProfileRealm profile in (IEnumerable<ProfileRealm>) profiles)
      {
        if (profile.Institute != null && profile.TokenInfo != null)
        {
          ProfileRealm profileRealm = new ProfileRealm()
          {
            Id = profile.Id,
            TokenInfo = profile.TokenInfo,
            PushSettings = profile.PushSettings,
            IsActive = profile.IsActive,
            Institute = profile.Institute
          };
          source.Add(profileRealm);
        }
      }
      List<ProfileRealm> list = source.GroupBy<ProfileRealm, string>((Func<ProfileRealm, string>) (x => x.Id)).Select<IGrouping<string, ProfileRealm>, ProfileRealm>((Func<IGrouping<string, ProfileRealm>, ProfileRealm>) (g => g.First<ProfileRealm>())).ToList<ProfileRealm>();
      migration.get_NewRealm().RemoveAll<ProfileRealm>();
      foreach (ProfileRealm profileRealm in list)
        migration.get_NewRealm().Add<ProfileRealm>((M0) profileRealm, false);
    }

    private static void Migration35(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 35UL)
        return;
      IQueryable<object> source1 = migration.get_OldRealm().All("AbsenceRealm");
      IQueryable<AbsenceRealm> source2 = (IQueryable<AbsenceRealm>) migration.get_NewRealm().All<AbsenceRealm>();
      for (int index = 0; index < source2.Count<AbsenceRealm>(); ++index)
      {
        object obj1 = source1.ElementAt<object>(index);
        AbsenceRealm absenceRealm = source2.ElementAt<AbsenceRealm>(index);
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__1 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__1 = CallSite<Func<CallSite, object, byte?>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (byte?), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, byte?> target = RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__1.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, byte?>> p1 = RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__0 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__0 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "DelayTimeMinutes", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj2 = RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__0.Target((CallSite) RealmUtils.\u003C\u003Eo__13.\u003C\u003Ep__0, obj1);
        byte? nullable = target((CallSite) p1, obj2);
        absenceRealm.DelayTimeMinutes = nullable;
      }
    }

    private static void Migration36(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 36UL)
        return;
      foreach (PushSettingsRealm pushSettingsRealm in (IEnumerable<PushSettingsRealm>) migration.get_NewRealm().All<PushSettingsRealm>())
        pushSettingsRealm.FirstTimePushRun = false;
    }

    private static void Migration37(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 37UL)
        return;
      IQueryable<object> queryable = migration.get_OldRealm().All("EventRealm");
      List<EventRealm> eventRealmList1 = new List<EventRealm>();
      foreach (object obj1 in (IEnumerable<object>) queryable)
      {
        List<EventRealm> eventRealmList2 = eventRealmList1;
        EventRealm eventRealm1 = new EventRealm();
        eventRealm1.Id = Guid.NewGuid().ToString();
        EventRealm eventRealm2 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__1 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__1 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, string> target1 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__1.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, string>> p1 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__0 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__0 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Id", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj2 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__0.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__0, obj1);
        string str1 = target1((CallSite) p1, obj2);
        eventRealm2.EventId = str1;
        EventRealm eventRealm3 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__3 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__3 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, string> target2 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__3.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, string>> p3 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__3;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__2 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__2 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Content", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj3 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__2.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__2, obj1);
        string str2 = target2((CallSite) p3, obj3);
        eventRealm3.Content = str2;
        EventRealm eventRealm4 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__5 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__5 = CallSite<Func<CallSite, object, DateTimeOffset>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (DateTimeOffset), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, DateTimeOffset> target3 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__5.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, DateTimeOffset>> p5 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__5;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__4 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__4 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "CreatedDate", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj4 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__4.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__4, obj1);
        DateTimeOffset dateTimeOffset1 = target3((CallSite) p5, obj4);
        eventRealm4.CreatedDate = dateTimeOffset1;
        EventRealm eventRealm5 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__7 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__7 = CallSite<Func<CallSite, object, DateTimeOffset>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (DateTimeOffset), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, DateTimeOffset> target4 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__7.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, DateTimeOffset>> p7 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__7;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__6 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__6 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Date", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj5 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__6.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__6, obj1);
        DateTimeOffset dateTimeOffset2 = target4((CallSite) p7, obj5);
        eventRealm5.Date = dateTimeOffset2;
        EventRealm eventRealm6 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__9 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__9 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, string> target5 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__9.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, string>> p9 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__9;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__8 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__8 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "ProfileId", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj6 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__8.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__8, obj1);
        string str3 = target5((CallSite) p9, obj6);
        eventRealm6.ProfileId = str3;
        EventRealm eventRealm7 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__11 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__11 = CallSite<Func<CallSite, object, bool>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (bool), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, bool> target6 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__11.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, bool>> p11 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__11;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__10 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__10 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "SeenByUser", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj7 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__10.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__10, obj1);
        int num = target6((CallSite) p11, obj7) ? 1 : 0;
        eventRealm7.SeenByUser = num != 0;
        EventRealm eventRealm8 = eventRealm1;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__13 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__13 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
        }
        // ISSUE: reference to a compiler-generated field
        Func<CallSite, object, string> target7 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__13.Target;
        // ISSUE: reference to a compiler-generated field
        CallSite<Func<CallSite, object, string>> p13 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__13;
        // ISSUE: reference to a compiler-generated field
        if (RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__12 == null)
        {
          // ISSUE: reference to a compiler-generated field
          RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__12 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Title", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
          {
            CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
          }));
        }
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        object obj8 = RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__12.Target((CallSite) RealmUtils.\u003C\u003Eo__15.\u003C\u003Ep__12, obj1);
        string str4 = target7((CallSite) p13, obj8);
        eventRealm8.Title = str4;
        EventRealm eventRealm9 = eventRealm1;
        eventRealmList2.Add(eventRealm9);
      }
      migration.get_NewRealm().RemoveAll<EventRealm>();
      foreach (EventRealm eventRealm in eventRealmList1)
        migration.get_NewRealm().Add<EventRealm>((M0) eventRealm, false);
    }

    private static void Migration38(
      ulong oldSchemaVersion,
      IQueryable<ProfileRealm> profiles,
      Migration migration)
    {
      if (oldSchemaVersion >= 38UL)
        return;
      IQueryable<object> queryable = migration.get_OldRealm().All("ExamRealm");
      List<ExamRealm> examRealmList1 = new List<ExamRealm>();
      List<Ekreta.Mobile.Core.Models.Profile> profileList = new List<Ekreta.Mobile.Core.Models.Profile>();
      ProfileRealmMapper profileRealmMapper = new ProfileRealmMapper();
      foreach (ProfileRealm profile in (IEnumerable<ProfileRealm>) profiles)
        profileList.Add(profileRealmMapper.From(profile));
      foreach (object obj1 in (IEnumerable<object>) queryable)
      {
        foreach (Ekreta.Mobile.Core.Models.Profile profile in profileList)
        {
          // ISSUE: reference to a compiler-generated field
          if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__2 == null)
          {
            // ISSUE: reference to a compiler-generated field
            RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__2 = CallSite<Func<CallSite, object, bool>>.Create(Binder.UnaryOperation(CSharpBinderFlags.None, ExpressionType.IsTrue, typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
            {
              CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
            }));
          }
          // ISSUE: reference to a compiler-generated field
          Func<CallSite, object, bool> target1 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__2.Target;
          // ISSUE: reference to a compiler-generated field
          CallSite<Func<CallSite, object, bool>> p2 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__2;
          // ISSUE: reference to a compiler-generated field
          if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__1 == null)
          {
            // ISSUE: reference to a compiler-generated field
            RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__1 = CallSite<Func<CallSite, object, string, object>>.Create(Binder.BinaryOperation(CSharpBinderFlags.None, ExpressionType.Equal, typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[2]
            {
              CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null),
              CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.UseCompileTimeType, (string) null)
            }));
          }
          // ISSUE: reference to a compiler-generated field
          Func<CallSite, object, string, object> target2 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__1.Target;
          // ISSUE: reference to a compiler-generated field
          CallSite<Func<CallSite, object, string, object>> p1 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__1;
          // ISSUE: reference to a compiler-generated field
          if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__0 == null)
          {
            // ISSUE: reference to a compiler-generated field
            RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__0 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "ProfileId", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
            {
              CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
            }));
          }
          // ISSUE: reference to a compiler-generated field
          // ISSUE: reference to a compiler-generated field
          object obj2 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__0.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__0, obj1);
          string rolelessId = profile.RolelessId;
          object obj3 = target2((CallSite) p1, obj2, rolelessId);
          if (target1((CallSite) p2, obj3))
          {
            List<ExamRealm> examRealmList2 = examRealmList1;
            ExamRealm examRealm1 = new ExamRealm();
            examRealm1.Id = Guid.NewGuid().ToString();
            ExamRealm examRealm2 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__4 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__4 = CallSite<Func<CallSite, object, DateTimeOffset>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (DateTimeOffset), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, DateTimeOffset> target3 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__4.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, DateTimeOffset>> p4 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__4;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__3 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__3 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "BejelentesDatuma", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj4 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__3.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__3, obj1);
            DateTimeOffset dateTimeOffset1 = target3((CallSite) p4, obj4);
            examRealm2.BejelentesDatuma = dateTimeOffset1;
            ExamRealm examRealm3 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__6 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__6 = CallSite<Func<CallSite, object, DateTimeOffset>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (DateTimeOffset), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, DateTimeOffset> target4 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__6.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, DateTimeOffset>> p6 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__6;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__5 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__5 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Datum", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj5 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__5.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__5, obj1);
            DateTimeOffset dateTimeOffset2 = target4((CallSite) p6, obj5);
            examRealm3.Datum = dateTimeOffset2;
            ExamRealm examRealm4 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__8 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__8 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target5 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__8.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p8 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__8;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__7 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__7 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "HetNapja", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj6 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__7.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__7, obj1);
            string str1 = target5((CallSite) p8, obj6);
            examRealm4.HetNapja = str1;
            ExamRealm examRealm5 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__11 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__11 = CallSite<Func<CallSite, object, int>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (int), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, int> target6 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__11.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, int>> p11 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__11;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__10 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__10 = CallSite<Func<CallSite, Type, object, object>>.Create(Binder.InvokeMember(CSharpBinderFlags.None, "ToInt32", (IEnumerable<Type>) null, typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[2]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.UseCompileTimeType | CSharpArgumentInfoFlags.IsStaticType, (string) null),
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, Type, object, object> target7 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__10.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, Type, object, object>> p10 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__10;
            Type type1 = typeof (Convert);
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__9 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__9 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Id", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj7 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__9.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__9, obj1);
            object obj8 = target7((CallSite) p10, type1, obj7);
            int num1 = target6((CallSite) p11, obj8);
            examRealm5.ExamId = num1;
            ExamRealm examRealm6 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__14 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__14 = CallSite<Func<CallSite, object, int>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (int), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, int> target8 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__14.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, int>> p14 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__14;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__13 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__13 = CallSite<Func<CallSite, Type, object, object>>.Create(Binder.InvokeMember(CSharpBinderFlags.None, "ToInt32", (IEnumerable<Type>) null, typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[2]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.UseCompileTimeType | CSharpArgumentInfoFlags.IsStaticType, (string) null),
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, Type, object, object> target9 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__13.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, Type, object, object>> p13 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__13;
            Type type2 = typeof (Convert);
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__12 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__12 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Oraszam", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj9 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__12.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__12, obj1);
            object obj10 = target9((CallSite) p13, type2, obj9);
            int num2 = target8((CallSite) p14, obj10);
            examRealm6.Oraszam = num2;
            examRealm1.ProfileId = profile.Id;
            ExamRealm examRealm7 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__16 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__16 = CallSite<Func<CallSite, object, bool>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (bool), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, bool> target10 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__16.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, bool>> p16 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__16;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__15 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__15 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "SeenByUser", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj11 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__15.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__15, obj1);
            int num3 = target10((CallSite) p16, obj11) ? 1 : 0;
            examRealm7.SeenByUser = num3 != 0;
            ExamRealm examRealm8 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__18 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__18 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target11 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__18.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p18 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__18;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__17 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__17 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "SzamonkeresMegnevezese", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj12 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__17.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__17, obj1);
            string str2 = target11((CallSite) p18, obj12);
            examRealm8.SzamonkeresMegnevezese = str2;
            ExamRealm examRealm9 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__20 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__20 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target12 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__20.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p20 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__20;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__19 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__19 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "SzamonkeresModja", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj13 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__19.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__19, obj1);
            string str3 = target12((CallSite) p20, obj13);
            examRealm9.SzamonkeresModja = str3;
            ExamRealm examRealm10 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__22 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__22 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target13 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__22.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p22 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__22;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__21 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__21 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Tanar", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj14 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__21.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__21, obj1);
            string str4 = target13((CallSite) p22, obj14);
            examRealm10.Tanar = str4;
            ExamRealm examRealm11 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__24 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__24 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target14 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__24.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p24 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__24;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__23 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__23 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Tantargy", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj15 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__23.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__23, obj1);
            string str5 = target14((CallSite) p24, obj15);
            examRealm11.Tantargy = str5;
            ExamRealm examRealm12 = examRealm1;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__26 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__26 = CallSite<Func<CallSite, object, string>>.Create(Binder.Convert(CSharpBinderFlags.None, typeof (string), typeof (RealmUtils)));
            }
            // ISSUE: reference to a compiler-generated field
            Func<CallSite, object, string> target15 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__26.Target;
            // ISSUE: reference to a compiler-generated field
            CallSite<Func<CallSite, object, string>> p26 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__26;
            // ISSUE: reference to a compiler-generated field
            if (RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__25 == null)
            {
              // ISSUE: reference to a compiler-generated field
              RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__25 = CallSite<Func<CallSite, object, object>>.Create(Binder.GetMember(CSharpBinderFlags.None, "Uid", typeof (RealmUtils), (IEnumerable<CSharpArgumentInfo>) new CSharpArgumentInfo[1]
              {
                CSharpArgumentInfo.Create(CSharpArgumentInfoFlags.None, (string) null)
              }));
            }
            // ISSUE: reference to a compiler-generated field
            // ISSUE: reference to a compiler-generated field
            object obj16 = RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__25.Target((CallSite) RealmUtils.\u003C\u003Eo__16.\u003C\u003Ep__25, obj1);
            string str6 = target15((CallSite) p26, obj16);
            examRealm12.Uid = str6;
            ExamRealm examRealm13 = examRealm1;
            examRealmList2.Add(examRealm13);
          }
        }
      }
      migration.get_NewRealm().RemoveAll<ExamRealm>();
      foreach (ExamRealm examRealm in examRealmList1)
        migration.get_NewRealm().Add<ExamRealm>((M0) examRealm, false);
    }

    private static void Migration39(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 39UL)
        return;
      foreach (InstituteRealm instituteRealm in (IEnumerable<InstituteRealm>) migration.get_NewRealm().All<InstituteRealm>())
      {
        instituteRealm.InformationImageUrl = string.Empty;
        instituteRealm.InformationUrl = string.Empty;
      }
    }

    private static void Migration41(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 41UL)
        return;
      foreach (LessonRealm lessonRealm in (IEnumerable<LessonRealm>) migration.get_NewRealm().All<LessonRealm>())
        lessonRealm.IsHomeworkDone = false;
    }

    private static void Migration44(ulong oldSchemaVersion, Migration migration)
    {
      if (oldSchemaVersion >= 44UL)
        return;
      IQueryable<M0> queryable = migration.get_NewRealm().All<NoteRealm>();
      List<NoteRealm> noteRealmList = new List<NoteRealm>();
      foreach (NoteRealm noteRealm1 in (IEnumerable<NoteRealm>) queryable)
      {
        NoteRealm noteRealm2 = new NoteRealm()
        {
          PrimaryId = noteRealm1.Id + "-" + noteRealm1.ProfileId,
          Id = noteRealm1.Id,
          Content = noteRealm1.Content,
          CreatedDate = noteRealm1.CreatedDate,
          CreatingTime = noteRealm1.CreatingTime,
          Date = noteRealm1.Date,
          OsztalyCsoportUid = noteRealm1.OsztalyCsoportUid,
          ProfileId = noteRealm1.ProfileId,
          SeenByUser = noteRealm1.SeenByUser,
          Teacher = noteRealm1.Teacher,
          Title = noteRealm1.Title,
          Type = noteRealm1.Type
        };
        noteRealmList.Add(noteRealm2);
      }
      migration.get_NewRealm().RemoveAll<NoteRealm>();
      foreach (NoteRealm noteRealm in noteRealmList)
        migration.get_NewRealm().Add<NoteRealm>((M0) noteRealm, false);
    }

    private static void MigrateData(Migration migration, string oldProfileId, string newProfileId)
    {
      IQueryable<AbsenceRealm> source1 = ((IQueryable<AbsenceRealm>) migration.get_NewRealm().All<AbsenceRealm>()).Where<AbsenceRealm>((Expression<Func<AbsenceRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num1 = source1.Count<AbsenceRealm>();
      for (int index = 0; index < num1; ++index)
        source1.ElementAt<AbsenceRealm>(index).ProfileId = newProfileId;
      IQueryable<EvaluationRealm> source2 = ((IQueryable<EvaluationRealm>) migration.get_NewRealm().All<EvaluationRealm>()).Where<EvaluationRealm>((Expression<Func<EvaluationRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num2 = source2.Count<EvaluationRealm>();
      for (int index = 0; index < num2; ++index)
        source2.ElementAt<EvaluationRealm>(index).ProfileId = newProfileId;
      IQueryable<NoteRealm> source3 = ((IQueryable<NoteRealm>) migration.get_NewRealm().All<NoteRealm>()).Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num3 = source3.Count<NoteRealm>();
      for (int index = 0; index < num3; ++index)
        source3.ElementAt<NoteRealm>(index).ProfileId = newProfileId;
      IQueryable<LessonRealm> source4 = ((IQueryable<LessonRealm>) migration.get_NewRealm().All<LessonRealm>()).Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num4 = source4.Count<LessonRealm>();
      for (int index = 0; index < num4; ++index)
        source4.ElementAt<LessonRealm>(index).ProfileId = newProfileId;
      IQueryable<SubjectAverageRealm> source5 = ((IQueryable<SubjectAverageRealm>) migration.get_NewRealm().All<SubjectAverageRealm>()).Where<SubjectAverageRealm>((Expression<Func<SubjectAverageRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num5 = source5.Count<SubjectAverageRealm>();
      for (int index = 0; index < num5; ++index)
        source5.ElementAt<SubjectAverageRealm>(index).ProfileId = newProfileId;
      IQueryable<TeacherHomeWorkRealm> source6 = ((IQueryable<TeacherHomeWorkRealm>) migration.get_NewRealm().All<TeacherHomeWorkRealm>()).Where<TeacherHomeWorkRealm>((Expression<Func<TeacherHomeWorkRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num6 = source6.Count<TeacherHomeWorkRealm>();
      for (int index = 0; index < num6; ++index)
        source6.ElementAt<TeacherHomeWorkRealm>(index).ProfileId = newProfileId;
      IQueryable<StudentHomeWorkRealm> source7 = ((IQueryable<StudentHomeWorkRealm>) migration.get_NewRealm().All<StudentHomeWorkRealm>()).Where<StudentHomeWorkRealm>((Expression<Func<StudentHomeWorkRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num7 = source7.Count<StudentHomeWorkRealm>();
      for (int index = 0; index < num7; ++index)
        source7.ElementAt<StudentHomeWorkRealm>(index).ProfileId = newProfileId;
      IQueryable<EventRealm> source8 = ((IQueryable<EventRealm>) migration.get_NewRealm().All<EventRealm>()).Where<EventRealm>((Expression<Func<EventRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num8 = source8.Count<EventRealm>();
      for (int index = 0; index < num8; ++index)
        source8.ElementAt<EventRealm>(index).ProfileId = newProfileId;
      IQueryable<StudentRealm> source9 = ((IQueryable<StudentRealm>) migration.get_NewRealm().All<StudentRealm>()).Where<StudentRealm>((Expression<Func<StudentRealm, bool>>) (x => x.ProfileId == oldProfileId));
      int num9 = source9.Count<StudentRealm>();
      for (int index = 0; index < num9; ++index)
        source9.ElementAt<StudentRealm>(index).ProfileId = newProfileId;
    }
  }
}
