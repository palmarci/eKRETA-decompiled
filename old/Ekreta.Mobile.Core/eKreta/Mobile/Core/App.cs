// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.App
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.DataServices;
using Ekreta.Mobile.Core.Repository.DataServices.Login;
using Ekreta.Mobile.Core.Repository.DataServices.Uzenetek;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Profile;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Uzenetek;
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
using Ekreta.Mobile.Core.Services;
using Ekreta.Mobile.Core.Services.UzenetKuldes;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Commands;
using MvvmCross.Localization;
using MvvmCross.Plugin.ResxLocalization;
using MvvmCross.ViewModels;
using Plugin.Connectivity;
using Plugin.Connectivity.Abstractions;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Reflection;
using System.Resources;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core
{
  public class App : MvxApplication
  {
    public virtual void Initialize()
    {
      try
      {
        Mvx.get_IoCProvider().RegisterType<ISystemInfo, SystemInfo>();
        Mvx.get_IoCProvider().RegisterType<IGlobalMobileApi, GlobalMobileApi>();
        Mvx.get_IoCProvider().RegisterType<IMobileApi, MobileApi>();
        Mvx.get_IoCProvider().RegisterType<IDbMobileApi, DbMobileApi>();
        Mvx.get_IoCProvider().RegisterType<IEugyintezesApi, EugyintezesApi>();
        Mvx.get_IoCProvider().RegisterType<IWebNavigation, WebNavigation>();
        Mvx.get_IoCProvider().RegisterType<IPushNotificationService, PushNotificationService>();
        Mvx.get_IoCProvider().RegisterType<IMvxCommandHelper, MvxStrongCommandHelper>();
        CultureInfo cultureInfo = new CultureInfo("hu");
        MvxResxTextProvider resxTextProvider = new MvxResxTextProvider(new ResourceManager("Ekreta.Mobile.Core.Resources.AppResources", typeof (App).GetTypeInfo().Assembly));
        resxTextProvider.set_CurrentLanguage(cultureInfo);
        Mvx.get_IoCProvider().RegisterSingleton<IMvxTextProvider>((M0) resxTextProvider);
        Mvx.get_IoCProvider().RegisterSingleton<IKeyStore>((Func<M0>) (() => (IKeyStore) DependencyService.Get<IKeyStore>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<ISecureStore>((M0) new SecureStore());
        ((ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>()).MigrateOldStore();
        Mvx.get_IoCProvider().RegisterSingleton<IAbsenceRepository>((M0) new AbsenceRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IAbsenceDbRepository>((M0) new AbsenceRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IEvaluationRepository>((M0) new EvaluationRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IEvaluationDbRepository>((M0) new EvaluationRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IEventRepository>((M0) new EventRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IFormTeacherRepository>((M0) new FormTeacherRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IFormTeacherDbRepository>((M0) new FormTeacherRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ILessonRepository>((M0) new LessonRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ILessonDbRepository>((M0) new LessonRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<INoteRepository>((M0) new NoteRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<INoteDbRepository>((M0) new NoteDbRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IParsedMessageRepository>((M0) new ParsedMessageRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IProfileRepository>((M0) new ProfileRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IProfileDbRepository>((M0) new ProfileRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IPushSettingsRepository>((M0) new PushSettingsRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IPushSettingsDbRepository>((M0) new PushSettingsRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITokenInfoRepository>((M0) new TokenInfoRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITokenInfoDbRepository>((M0) new TokenInfoRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentRepository>((M0) new StudentRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentDbRepository>((M0) new StudentRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ISubjectAverageRepository>((M0) new SubjectAverageRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ISubjectAverageDbRepository>((M0) new SubjectAverageRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITutelaryRepository>((M0) new TutelaryRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITutelaryDbRepository>((M0) new TutelaryRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentHomeWorkRepository>((M0) new StudentHomeWorkRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentHomeWorkDbRepository>((M0) new StudentHomeWorkRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITeacherHomeWorkRepository>((M0) new TeacherHomeWorkRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ITeacherHomeWorkDbRepository>((M0) new TeacherHomeWorkRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ISettingRepository>((M0) new SettingRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ISettingDbRepository>((M0) new SettingRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IInstituteRepository>((M0) new InstituteRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ICacheDataRepository>((M0) new CacheDataRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IExamRepository>((M0) new ExamRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IExamDbRepository>((M0) new ExamRealmDbRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IRatingRepository>((M0) new RatingRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ICredentialRealmRepository>((M0) new CredentialRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ICimzettRepository>((M0) new CimzettRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ICimzettTipusAdatSzotarElemRealmRepository>((M0) new CimzettTipusAdatSzotarElemRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<ICsatolmanyRepository>((M0) new CsatolmanyRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IPostaladaElemRepository>((M0) new PostaladaElemRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IPostaladaElemTipusAdatSzotarElemRepository>((M0) new PostaladaElemTipusAdatSzotarElemRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IUzenetRepository>((M0) new UzenetRealmRepository());
        Mvx.get_IoCProvider().RegisterSingleton<IPushNotificationHandler>((Func<M0>) (() => (IPushNotificationHandler) DependencyService.Get<IPushNotificationHandler>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<IPlatformStyleProvider>((Func<M0>) (() => (IPlatformStyleProvider) DependencyService.Get<IPlatformStyleProvider>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<IDataViewer>((Func<M0>) (() => (IDataViewer) DependencyService.Get<IDataViewer>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<IPermissionManager>((Func<M0>) (() => (IPermissionManager) DependencyService.Get<IPermissionManager>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<IPackageInfo>((Func<M0>) (() => (IPackageInfo) DependencyService.Get<IPackageInfo>((DependencyFetchTarget) 0)));
        Mvx.get_IoCProvider().RegisterSingleton<IMvxMainThreadDispatcher>((Func<M0>) (() => MvxSingleton<IMvxMainThreadDispatcher>.get_Instance()));
        Mvx.get_IoCProvider().RegisterSingleton<IConnectivity>((Func<M0>) (() => CrossConnectivity.get_Current()));
        Mvx.get_IoCProvider().RegisterSingleton<ISettingsDataService>((M0) new SettingsDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ISettingsDbDataService>((M0) new SettingsDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IUserAgentService>((M0) new UserAgentService());
        Mvx.get_IoCProvider().RegisterType<ISingleNavigation, SingleNavigation>();
        Mvx.get_IoCProvider().RegisterSingleton<ITokenValidator>((M0) new TokenValidator());
        Mvx.get_IoCProvider().RegisterSingleton<ITokenValidatorDb>((M0) new TokenValidatorDb());
        Mvx.get_IoCProvider().RegisterSingleton<IAppVersionService>((Func<M0>) (() => (IAppVersionService) new AppVersionService()));
        Mvx.get_IoCProvider().RegisterSingleton<IConfigurationService>((M0) new ConfigurationService());
        Mvx.get_IoCProvider().RegisterSingleton<ICacheDataService>((M0) new CacheDataService());
        Mvx.get_IoCProvider().RegisterSingleton<INoteDataService>((M0) new NoteDataService());
        Mvx.get_IoCProvider().RegisterSingleton<INoteDbDataService>((M0) new NoteDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IAbsenceDataService>((M0) new AbsenceDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IAbsenceDbDataService>((M0) new AbsenceDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IEvaluationDataService>((M0) new EvaluationDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IEvaluationDbDataService>((M0) new EvaluationDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ISubjectAverageDataService>((M0) new SubjectAverageDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ISubjectAverageDbDataService>((M0) new SubjectAverageDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IParsedMessageDataService>((M0) new ParsedMessageDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IProfileDataService>((M0) new ProfileDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IProfileDbDataService>((M0) new ProfileDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentDataService>((M0) new StudentDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentDbDataService>((M0) new StudentDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IEventDataService>((M0) new EventDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ILessonDataService>((M0) new LessonDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ILessonDbDataService>((M0) new LessonDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentHomeWorkDataService>((M0) new StudentHomeWorkDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IStudentHomeWorkDbDataService>((M0) new StudentHomeWorkDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ITeacherHomeWorkDataService>((M0) new TeacherHomeWorkDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ITeacherHomeWorkDbDataService>((M0) new TeacherHomeWorkDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IInstituteDataService>((M0) new InstituteDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ITutelaryDataService>((M0) new TutelaryDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ITutelaryDbDataService>((M0) new TutelaryDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IFormTeacherDataService>((M0) new FormTeacherDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IFormTeacherDbDataService>((M0) new FormTeacherDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IUzenetDataService>((M0) new UzenetDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IExamDataService>((M0) new ExamDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IExamDbDataService>((M0) new ExamDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IRatingDataService>((M0) new RatingDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IMailService>((M0) new MailService());
        Mvx.get_IoCProvider().RegisterSingleton<ICredentialsDataService>((M0) new CredentialsDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IRefreshDataService>((M0) new RefreshDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IAuthDataService>((M0) new AuthDataService());
        Mvx.get_IoCProvider().RegisterSingleton<IAuthDbDataService>((M0) new AuthDbDataService());
        Mvx.get_IoCProvider().RegisterSingleton<ISettingsMigration>((M0) new Migration());
        Mvx.get_IoCProvider().RegisterSingleton<IApplicationSettings>((M0) new Ekreta.Mobile.Core.Helpers.Settings());
        Mvx.get_IoCProvider().RegisterSingleton<ISecurityService>((Func<M0>) (() => (ISecurityService) DependencyService.Get<ISecurityService>((DependencyFetchTarget) 0)));
        ConfigurationRepository.SetEnvironment("ekreta://PROD");
        Ekreta.Mobile.Core.Helpers.Settings.Environment = ConfigurationRepository.EnvironmentSetting.Environment;
        Mvx.get_IoCProvider().RegisterSingleton<IRemoteConfigurationService>((M0) new RemoteConfigurationService());
        Mvx.get_IoCProvider().RegisterSingleton<IModalDialog>((M0) new ModalDialog());
        CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("hu-HU");
        this.RegisterCustomAppStart<AppStartLogic>();
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Initialize), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/App.cs", 228);
        ErrorHandler.Current.HandleError(ex);
      }
    }

    public App()
    {
      base.\u002Ector();
    }
  }
}
