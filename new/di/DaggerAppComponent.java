package hu.ekreta.ellenorzo.di;

import a.k.a.c;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import h.i.e.m;
import h.w.v;
import hu.ekreta.ellenorzo.about.AboutFragment;
import hu.ekreta.ellenorzo.about.AboutFragmentModule;
import hu.ekreta.ellenorzo.about.AboutFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.about.AboutFragment_MembersInjector;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeSelectorService;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeSelectorServiceImpl;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeSelectorServiceImpl_Factory;
import hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorActivity;
import hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorActivity_MembersInjector;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorModule;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModelImpl;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModelImpl_Factory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDao;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDaoImpl;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDaoImpl_Factory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivityModule;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModel;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModelImpl;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragmentModule;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment_MembersInjector;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl;
import hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl_Factory;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl;
import hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl_Factory;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.cases.CaseDao;
import hu.ekreta.ellenorzo.cases.CaseDaoImpl;
import hu.ekreta.ellenorzo.cases.CaseDaoImpl_Factory;
import hu.ekreta.ellenorzo.cases.CaseRepository;
import hu.ekreta.ellenorzo.cases.CaseRepositoryImpl;
import hu.ekreta.ellenorzo.cases.CaseRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.CasesFragment;
import hu.ekreta.ellenorzo.cases.CasesFragmentModule;
import hu.ekreta.ellenorzo.cases.CasesFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.cases.CasesFragment_MembersInjector;
import hu.ekreta.ellenorzo.cases.CasesViewModel;
import hu.ekreta.ellenorzo.cases.CasesViewModelImpl;
import hu.ekreta.ellenorzo.cases.CasesViewModelImpl_Factory;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivityModule;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivity;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivityModule;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivity_MembersInjector;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import hu.ekreta.ellenorzo.cases.factory.CaseFactoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepositoryImpl;
import hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormActivity;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragment;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragmentModule;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragment_MembersInjector;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModel;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl_Factory;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiRepository;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiRepositoryImpl;
import hu.ekreta.ellenorzo.cases.tmgi.TmgiRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.classmaster.ClassMasterActivity;
import hu.ekreta.ellenorzo.classmaster.ClassMasterActivityModule;
import hu.ekreta.ellenorzo.classmaster.ClassMasterActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.classmaster.ClassMasterActivity_MembersInjector;
import hu.ekreta.ellenorzo.classmaster.ClassMasterDao;
import hu.ekreta.ellenorzo.classmaster.ClassMasterDaoImpl;
import hu.ekreta.ellenorzo.classmaster.ClassMasterDaoImpl_Factory;
import hu.ekreta.ellenorzo.classmaster.ClassMasterRepository;
import hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl;
import hu.ekreta.ellenorzo.classmaster.ClassMasterRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.classmaster.ClassMasterViewModel;
import hu.ekreta.ellenorzo.classmaster.ClassMasterViewModelImpl;
import hu.ekreta.ellenorzo.classmaster.ClassMasterViewModelImpl_Factory;
import hu.ekreta.ellenorzo.classmaster.ClassMastersFragment;
import hu.ekreta.ellenorzo.classmaster.ClassMastersFragmentModule;
import hu.ekreta.ellenorzo.classmaster.ClassMastersFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.classmaster.ClassMastersFragment_MembersInjector;
import hu.ekreta.ellenorzo.classmaster.ClassMastersViewModel;
import hu.ekreta.ellenorzo.classmaster.ClassMastersViewModelImpl;
import hu.ekreta.ellenorzo.classmaster.ClassMastersViewModelImpl_Factory;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider_Factory;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivityModule;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity_MembersInjector;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModel;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModelImpl;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModelImpl_Factory;
import hu.ekreta.ellenorzo.di.AppComponent;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeAddresseSelectorActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeCaseDetailsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeCasesActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeDailyOmissionsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeEvaluationDetailsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeExamDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeHomeworkCommentActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeHomeworkDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeInstitutePickerActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeLessonDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeLoginActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeMainActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeMessageDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeNewMessageActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeNotSupportedAppActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeNoteDetailsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeOmissionDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeProfileDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeProfileListActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeRectificationActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeSenderActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeSettingsActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeSplashActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeSubjectDetailActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeActivityModule_ContributeTgmiFormActivityInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeAboutFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeAveragesFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeClassMastersFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeEndOfYearFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeHalfYearFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeHomeFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeHomeworksFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeMessagesFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeMoreFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeNotesFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeNoticeBoardFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeQuarterlyFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeRemindersFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeSubjectsFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeTimeTableFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeFragmentModule_ContributeTmgiFormFragmentInjector;
import hu.ekreta.ellenorzo.di.ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService;
import hu.ekreta.ellenorzo.eKretaApp;
import hu.ekreta.ellenorzo.evaluation.EvaluationDao;
import hu.ekreta.ellenorzo.evaluation.EvaluationDaoImpl;
import hu.ekreta.ellenorzo.evaluation.EvaluationDaoImpl_Factory;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivityModule;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsActivity_MembersInjector;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModel;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.file.FileAdapter;
import hu.ekreta.ellenorzo.file.FileAdapterImpl_Factory;
import hu.ekreta.ellenorzo.group.GroupDao;
import hu.ekreta.ellenorzo.group.GroupDaoImpl;
import hu.ekreta.ellenorzo.group.GroupDaoImpl_Factory;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.group.GroupRepositoryImpl;
import hu.ekreta.ellenorzo.group.GroupRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.home.HomeFragment;
import hu.ekreta.ellenorzo.home.HomeFragmentModule;
import hu.ekreta.ellenorzo.home.HomeFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.home.HomeFragment_MembersInjector;
import hu.ekreta.ellenorzo.home.HomeViewModel;
import hu.ekreta.ellenorzo.home.HomeViewModelImpl;
import hu.ekreta.ellenorzo.home.HomeViewModelImpl_Factory;
import hu.ekreta.ellenorzo.homework.HomeworkDao;
import hu.ekreta.ellenorzo.homework.HomeworkDaoImpl;
import hu.ekreta.ellenorzo.homework.HomeworkDaoImpl_Factory;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivityModule;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel;
import hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl;
import hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl;
import hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.homework.HomeworksFragment;
import hu.ekreta.ellenorzo.homework.HomeworksFragmentModule;
import hu.ekreta.ellenorzo.homework.HomeworksFragmentModule_ProvideReminderRepositoriesFactory;
import hu.ekreta.ellenorzo.homework.HomeworksFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.homework.HomeworksFragment_MembersInjector;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentActivityModule;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity_MembersInjector;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModel;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl_Factory;
import hu.ekreta.ellenorzo.institute.InstitutePickerActivity;
import hu.ekreta.ellenorzo.institute.InstitutePickerActivityModule;
import hu.ekreta.ellenorzo.institute.InstitutePickerActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.institute.InstitutePickerActivity_MembersInjector;
import hu.ekreta.ellenorzo.institute.InstitutePickerViewModel;
import hu.ekreta.ellenorzo.institute.InstitutePickerViewModelImpl;
import hu.ekreta.ellenorzo.institute.InstitutePickerViewModelImpl_Factory;
import hu.ekreta.ellenorzo.institute.InstituteRepository;
import hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl;
import hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.login.LoginActivity;
import hu.ekreta.ellenorzo.login.LoginActivityModule;
import hu.ekreta.ellenorzo.login.LoginActivityModule_ProvideRxActivityResultFactory;
import hu.ekreta.ellenorzo.login.LoginActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.login.LoginActivity_MembersInjector;
import hu.ekreta.ellenorzo.login.LoginViewModel;
import hu.ekreta.ellenorzo.login.LoginViewModelImpl;
import hu.ekreta.ellenorzo.login.LoginViewModelImpl_Factory;
import hu.ekreta.ellenorzo.main.MainActivity;
import hu.ekreta.ellenorzo.main.MainActivityModule;
import hu.ekreta.ellenorzo.main.MainActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.main.MainActivity_MembersInjector;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.main.MainViewModelImpl;
import hu.ekreta.ellenorzo.main.MainViewModelImpl_Factory;
import hu.ekreta.ellenorzo.main.more.MoreFragment;
import hu.ekreta.ellenorzo.main.more.MoreFragmentModule;
import hu.ekreta.ellenorzo.main.more.MoreFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.main.more.MoreFragment_MembersInjector;
import hu.ekreta.ellenorzo.message.MessageDao;
import hu.ekreta.ellenorzo.message.MessageDaoImpl;
import hu.ekreta.ellenorzo.message.MessageDaoImpl_Factory;
import hu.ekreta.ellenorzo.message.MessageDetailActivity;
import hu.ekreta.ellenorzo.message.MessageDetailActivityModule;
import hu.ekreta.ellenorzo.message.MessageDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.message.MessageDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.message.MessageDetailViewModel;
import hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl;
import hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.message.MessageRepository;
import hu.ekreta.ellenorzo.message.MessageRepositoryImpl;
import hu.ekreta.ellenorzo.message.MessageRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.message.MessagesFragment;
import hu.ekreta.ellenorzo.message.MessagesFragmentModule;
import hu.ekreta.ellenorzo.message.MessagesFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.message.MessagesFragment_MembersInjector;
import hu.ekreta.ellenorzo.message.MessagesService;
import hu.ekreta.ellenorzo.message.MessagesServiceImpl;
import hu.ekreta.ellenorzo.message.MessagesServiceImpl_Factory;
import hu.ekreta.ellenorzo.message.MessagesViewModel;
import hu.ekreta.ellenorzo.message.MessagesViewModelImpl;
import hu.ekreta.ellenorzo.message.MessagesViewModelImpl_Factory;
import hu.ekreta.ellenorzo.newmessage.model.NewMessageService;
import hu.ekreta.ellenorzo.newmessage.model.NewMessageServiceImpl;
import hu.ekreta.ellenorzo.newmessage.model.NewMessageServiceImpl_Factory;
import hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity;
import hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity_MembersInjector;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl_Factory;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessagesModule;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessagesModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.notes.NoteDao;
import hu.ekreta.ellenorzo.notes.NoteDaoImpl;
import hu.ekreta.ellenorzo.notes.NoteDaoImpl_Factory;
import hu.ekreta.ellenorzo.notes.NoteDetailsActivity;
import hu.ekreta.ellenorzo.notes.NoteDetailsActivityModule;
import hu.ekreta.ellenorzo.notes.NoteDetailsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.notes.NoteDetailsActivity_MembersInjector;
import hu.ekreta.ellenorzo.notes.NoteDetailsViewModel;
import hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl;
import hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.notes.NotesFragment;
import hu.ekreta.ellenorzo.notes.NotesFragmentModule;
import hu.ekreta.ellenorzo.notes.NotesFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.notes.NotesFragment_MembersInjector;
import hu.ekreta.ellenorzo.notes.NotesRepository;
import hu.ekreta.ellenorzo.notes.NotesRepositoryImpl;
import hu.ekreta.ellenorzo.notes.NotesRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.notes.NotesViewModel;
import hu.ekreta.ellenorzo.notes.NotesViewModelImpl;
import hu.ekreta.ellenorzo.notes.NotesViewModelImpl_Factory;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragmentModule;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment_MembersInjector;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDao;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDaoImpl;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDaoImpl_Factory;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepositoryImpl;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModelImpl;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModelImpl_Factory;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailActivity;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModel;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModelImpl;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailsActivityModule;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.notification.EllenorzoFirebaseMessagingService;
import hu.ekreta.ellenorzo.notification.EllenorzoFirebaseMessagingService_MembersInjector;
import hu.ekreta.ellenorzo.notification.NotificationDao;
import hu.ekreta.ellenorzo.notification.NotificationDaoImpl;
import hu.ekreta.ellenorzo.notification.NotificationDaoImpl_Factory;
import hu.ekreta.ellenorzo.notification.NotificationRepository;
import hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl;
import hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.notification.NotificationStrategy;
import hu.ekreta.ellenorzo.notification.NotificationStrategyImpl;
import hu.ekreta.ellenorzo.notification.NotificationStrategyImpl_Factory;
import hu.ekreta.ellenorzo.omission.OmissionDao;
import hu.ekreta.ellenorzo.omission.OmissionDaoImpl;
import hu.ekreta.ellenorzo.omission.OmissionDaoImpl_Factory;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl;
import hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsActivity;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsActivityModule;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsActivity_MembersInjector;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsViewModel;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsViewModelImpl;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailActivity;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailActivityModule;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModel;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModelImpl;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayFragment;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayFragmentModule;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayFragment_MembersInjector;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayViewModel;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayViewModelImpl;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayViewModelImpl_Factory;
import hu.ekreta.ellenorzo.profile.DeleteProfileStrategy;
import hu.ekreta.ellenorzo.profile.DeleteProfileStrategyImpl;
import hu.ekreta.ellenorzo.profile.DeleteProfileStrategyImpl_Factory;
import hu.ekreta.ellenorzo.profile.GuardianDao;
import hu.ekreta.ellenorzo.profile.GuardianDaoImpl;
import hu.ekreta.ellenorzo.profile.GuardianDaoImpl_Factory;
import hu.ekreta.ellenorzo.profile.ProfileDao;
import hu.ekreta.ellenorzo.profile.ProfileDaoImpl;
import hu.ekreta.ellenorzo.profile.ProfileDaoImpl_Factory;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl;
import hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.profile.ProfileService;
import hu.ekreta.ellenorzo.profile.ProfileServiceImpl;
import hu.ekreta.ellenorzo.profile.ProfileServiceImpl_Factory;
import hu.ekreta.ellenorzo.profile.UpdateProfileStrategy;
import hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl;
import hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl_Factory;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivityModule;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivity;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivityModule;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.profile.list.ProfileListActivity_MembersInjector;
import hu.ekreta.ellenorzo.profile.list.ProfileListViewModel;
import hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl;
import hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl_Factory;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import hu.ekreta.ellenorzo.reminder.RemindersFragment;
import hu.ekreta.ellenorzo.reminder.RemindersFragmentModule;
import hu.ekreta.ellenorzo.reminder.RemindersFragmentModule_ProvideReminderRepositoriesFactory;
import hu.ekreta.ellenorzo.reminder.RemindersFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.reminder.RemindersFragment_MembersInjector;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl_Factory;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.rest.Idp;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDevice;
import hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDeviceImpl;
import hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDeviceImpl_Factory;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivityModule;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity_MembersInjector;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModel;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModelImpl;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModelImpl_Factory;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDao;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDaoImpl;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDaoImpl_Factory;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepositoryImpl;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.secure.KeyStoreAdapter;
import hu.ekreta.ellenorzo.secure.RealmSecureStore;
import hu.ekreta.ellenorzo.secure.RealmSecureStoreImpl;
import hu.ekreta.ellenorzo.secure.RealmSecureStoreImpl_Factory;
import hu.ekreta.ellenorzo.settings.SettingsActivity;
import hu.ekreta.ellenorzo.settings.SettingsActivityModule;
import hu.ekreta.ellenorzo.settings.SettingsActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.settings.SettingsActivity_MembersInjector;
import hu.ekreta.ellenorzo.settings.SettingsViewModel;
import hu.ekreta.ellenorzo.settings.SettingsViewModelImpl;
import hu.ekreta.ellenorzo.settings.SettingsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.splash.SplashActivity;
import hu.ekreta.ellenorzo.splash.SplashActivityModule;
import hu.ekreta.ellenorzo.splash.SplashActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.splash.SplashActivity_MembersInjector;
import hu.ekreta.ellenorzo.splash.SplashViewModel;
import hu.ekreta.ellenorzo.splash.SplashViewModelImpl;
import hu.ekreta.ellenorzo.splash.SplashViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.SubjectDao;
import hu.ekreta.ellenorzo.subject.SubjectDaoImpl;
import hu.ekreta.ellenorzo.subject.SubjectDaoImpl_Factory;
import hu.ekreta.ellenorzo.subject.SubjectsFragment;
import hu.ekreta.ellenorzo.subject.SubjectsFragmentModule;
import hu.ekreta.ellenorzo.subject.SubjectsFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.SubjectsFragment_MembersInjector;
import hu.ekreta.ellenorzo.subject.SubjectsRepository;
import hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl;
import hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.subject.SubjectsViewModel;
import hu.ekreta.ellenorzo.subject.SubjectsViewModelImpl;
import hu.ekreta.ellenorzo.subject.SubjectsViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragment;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragmentModule;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragment_MembersInjector;
import hu.ekreta.ellenorzo.subject.averages.AveragesViewModel;
import hu.ekreta.ellenorzo.subject.averages.AveragesViewModelImpl;
import hu.ekreta.ellenorzo.subject.averages.AveragesViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragmentModule;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment_MembersInjector;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearViewModel;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearViewModelImpl;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragmentModule;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment_MembersInjector;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearViewModel;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearViewModelImpl;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragment;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragmentModule;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragment_MembersInjector;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModel;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl_Factory;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivityModule;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.timetable.TimeTableFragment;
import hu.ekreta.ellenorzo.timetable.TimeTableFragmentModule;
import hu.ekreta.ellenorzo.timetable.TimeTableFragmentModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.timetable.TimeTableFragment_MembersInjector;
import hu.ekreta.ellenorzo.timetable.TimeTableItemDao;
import hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl;
import hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl_Factory;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl_Factory;
import hu.ekreta.ellenorzo.timetable.TimeTableItemService;
import hu.ekreta.ellenorzo.timetable.TimeTableItemServiceImpl;
import hu.ekreta.ellenorzo.timetable.TimeTableItemServiceImpl_Factory;
import hu.ekreta.ellenorzo.timetable.TimeTableViewModel;
import hu.ekreta.ellenorzo.timetable.TimeTableViewModelImpl;
import hu.ekreta.ellenorzo.timetable.TimeTableViewModelImpl_Factory;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivity;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivityModule;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivityModule_ProvideViewModelFactory;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivity_MembersInjector;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl_Factory;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactoryImpl_Factory;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl_Factory;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverChecker;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverCheckerImpl;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverCheckerImpl_Factory;
import hu.ekreta.ellenorzo.util.realm.RealmWrapper;
import hu.ekreta.ellenorzo.util.realm.RealmWrapperImpl;
import hu.ekreta.ellenorzo.util.realm.RealmWrapperImpl_Factory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.systemexit.SystemExitImpl_Factory;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource_Factory;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl_Factory;
import i.c.a;
import i.d.b;
import i.d.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.c.c0;
import l.a.a;
import m.y;
import p.o;

public final class DaggerAppComponent implements AppComponent {
    public a<ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent.Builder> A = new a<ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent.Builder get() {
            return new AddresseeSelectorActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GroupDao> A0;
    public a<AnnouncedTestDaoImpl> A1;
    public a<NotificationStrategyImpl> A2;
    public a<ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent.Builder> B = new a<ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent.Builder get() {
            return new MoreFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GroupRepositoryImpl> B0;
    public a<AnnouncedTestDao> B1;
    public a<NotificationStrategy> B2;
    public a<ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent.Builder> C = new a<ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent.Builder get() {
            return new AveragesFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GroupRepository> C0;
    public a<AnnouncedTestRepositoryImpl> C1;
    public a<ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent.Builder> D = new a<ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent.Builder get() {
            return new SubjectsFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<NotificationRepository> D0;
    public a<AnnouncedTestRepository> D1;
    public a<ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent.Builder> E = new a<ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent.Builder get() {
            return new HalfYearFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<DeleteProfileStrategy> E0;
    public a<TimeTableItemDaoImpl> E1;
    public a<ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent.Builder> F = new a<ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent.Builder get() {
            return new EndOfYearFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<UpdateProfileStrategyImpl> F0;
    public a<TimeTableItemDao> F1;
    public a<ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent.Builder> G = new a<ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent.Builder get() {
            return new QuarterlyFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<UpdateProfileStrategy> G0;
    public a<TimeTableItemServiceImpl> G1;
    public a<ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent.Builder> H = new a<ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent.Builder get() {
            return new TimeTableFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<DateTimeFactory> H0;
    public a<TimeTableItemService> H1;
    public a<ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent.Builder> I = new a<ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent.Builder get() {
            return new NotesFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<List<SupportedRole>> I0;
    public a<TimeTableItemRepositoryImpl> I1;
    public a<ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent.Builder> J = new a<ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent.Builder get() {
            return new RemindersFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<FirebaseContainerImpl> J0;
    public a<TimeTableItemRepository> J1;
    public a<ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent.Builder> K = new a<ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent.Builder get() {
            return new OmissionsPerDayFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<FirebaseContainer> K0;
    public a<FileAdapter> K1;
    public a<ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent.Builder> L = new a<ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent.Builder get() {
            return new MessagesFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<AuthenticationServiceImpl> L0;
    public a<AttachmentServiceImpl> L1;
    public a<ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent.Builder> M = new a<ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent.Builder get() {
            return new NoticeBoardFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GlobalMobileApi> M0;
    public a<AttachmentService> M1;
    public a<ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent.Builder> N = new a<ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent.Builder get() {
            return new HomeFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<NotificationDaoImpl> N0;
    public a<ClassMasterDaoImpl> N1;
    public a<ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent.Builder> O = new a<ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent.Builder get() {
            return new AboutFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<NotificationDao> O0;
    public a<ClassMasterDao> O1;
    public a<ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent.Builder> P = new a<ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent.Builder get() {
            return new HomeworksFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> P0;
    public a<ClassMasterRepositoryImpl> P1;
    public a<ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent.Builder> Q = new a<ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent.Builder get() {
            return new AnnouncedTestsFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<NotificationRepositoryImpl> Q0;
    public a<ClassMasterRepository> Q1;
    public a<ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent.Builder> R = new a<ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent.Builder get() {
            return new TmgiFormFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<DeleteProfileStrategyImpl> R0;
    public a<CaseFactory> R1;
    public a<ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent.Builder> S = new a<ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent.Builder>() {
        public ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent.Builder get() {
            return new ClassMastersFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileRepositoryImpl> S0;
    public a<CaseDaoImpl> S1;
    public a<ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent.Builder> T = new a<ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent.Builder>() {
        public ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent.Builder get() {
            return new EllenorzoFirebaseMessagingServiceSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<InstituteRepositoryImpl> T0;
    public a<CaseDao> T1;
    public a<SystemExit> U = b.a(SystemExitImpl_Factory.f6323a);
    public a<InstituteRepository> U0;
    public a<CaseRepositoryImpl> U1;
    public a<eKretaApp> V;
    public a<Long> V0;
    public a<CaseRepository> V1;
    public a<Application> W;
    public a<String> W0;
    public a<SignerRepositoryImpl> W1;
    public a<KeyStoreAdapter> X;
    public a<ConfigurationProvider> X0;
    public a<SignerRepository> X1;
    public a<SharedPreferences> Y;
    public a<PowerSaverCheckerImpl> Y0;
    public a<ContentResolver> Y1;
    public a<RealmSecureStoreImpl> Z;
    public a<PowerSaverChecker> Z0;
    public a<AttachmentRepositoryImpl> Z1;

    /* renamed from: a  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent.Builder> f5351a = new a<ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<RealmSecureStore> a0;
    public a<a.n.a.b> a1;
    public a<AttachmentRepository> a2;
    public a<ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent.Builder> b = new a<ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent.Builder get() {
            return new InstitutePickerActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<c0> b0;
    public a<DetectRootedDeviceImpl> b1;
    public a<DecisionRepositoryImpl> b2;
    public a<ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent.Builder> c = new a<ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent.Builder get() {
            return new SplashActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileDaoImpl> c0;
    public a<DetectRootedDevice> c1;
    public a<DecisionRepository> c2;

    /* renamed from: d  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent.Builder> f5352d = new a<ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileDao> d0;
    public a<Boolean> d1;
    public a<CaseTypeRepositoryImpl> d2;
    public a<ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent.Builder> e = new a<ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent.Builder get() {
            return new ProfileListActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GuardianDaoImpl> e0;
    public a<RealmWrapperImpl> e1;
    public a<CaseTypeRepository> e2;
    public a<ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent.Builder> f = new a<ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent.Builder get() {
            return new ProfileDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GuardianDao> f0;
    public a<RealmWrapper> f1;
    public a<NewMessageServiceImpl> f2;

    /* renamed from: g  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent.Builder> f5353g = new a<ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent.Builder get() {
            return new SettingsActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> g0;
    public a<OmissionDaoImpl> g1;
    public a<NewMessageService> g2;

    /* renamed from: h  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent.Builder> f5354h = new a<ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent.Builder get() {
            return new SubjectDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<o.b> h0;
    public a<OmissionDao> h1;
    public a<AddresseeSelectorServiceImpl> h2;

    /* renamed from: i  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent.Builder> f5355i = new a<ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent.Builder get() {
            return new EvaluationDetailsActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<PackageInfo> i0;
    public a<OmissionRepositoryImpl> i1;
    public a<AddresseeSelectorService> i2;

    /* renamed from: j  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent.Builder> f5356j = new a<ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent.Builder get() {
            return new TimeTableItemDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> j0;
    public a<OmissionRepository> j1;
    public a<NoteDaoImpl> j2;

    /* renamed from: k  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent.Builder> f5357k = new a<ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent.Builder get() {
            return new MessageDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> k0;
    public a<MessageDaoImpl> k1;
    public a<NoteDao> k2;

    /* renamed from: l  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent.Builder> f5358l = new a<ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent.Builder get() {
            return new NoteDetailsActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<y.b> l0;
    public a<MessageDao> l1;
    public a<NotesRepositoryImpl> l2;

    /* renamed from: m  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent.Builder> f5359m = new a<ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent.Builder get() {
            return new NoticeBoardItemDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> m0;
    public a<MessageRepositoryImpl> m1;
    public a<NotesRepository> m2;

    /* renamed from: n  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent.Builder> f5360n = new a<ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent.Builder get() {
            return new DailyOmissionsActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<Idp> n0;
    public a<MessageRepository> n1;
    public a<MessagesServiceImpl> n2;

    /* renamed from: o  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent.Builder> f5361o = new a<ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent.Builder get() {
            return new OmissionDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileRepository> o0;
    public a<SubjectDaoImpl> o1;
    public a<MessagesService> o2;

    /* renamed from: p  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent.Builder> f5362p = new a<ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent.Builder get() {
            return new HomeworkCommentFormActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<AuthenticationService> p0;
    public a<SubjectDao> p1;
    public a<NoticeBoardItemDaoImpl> p2;

    /* renamed from: q  reason: collision with root package name */
    public a<ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent.Builder> f5363q = new a<ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent.Builder get() {
            return new ClassMasterActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<MobileApiV3> q0;
    public a<SubjectsRepositoryImpl> q1;
    public a<NoticeBoardItemDao> q2;
    public a<ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent.Builder> r = new a<ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent.Builder get() {
            return new HomeworkDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<SchoolYearCalendarDaoImpl> r0;
    public a<SubjectsRepository> r1;
    public a<NoticeBoardItemRepositoryImpl> r2;
    public a<ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent.Builder> s = new a<ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent.Builder get() {
            return new AnnouncedTestDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<SchoolYearCalendarDao> s0;
    public a<EvaluationDaoImpl> s1;
    public a<NoticeBoardItemRepository> s2;
    public a<ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent.Builder> t = new a<ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent.Builder get() {
            return new RootedDeviceDetectedActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<SchoolYearCalendarRepositoryImpl> t0;
    public a<EvaluationDao> t1;
    public a<TmgiCaseTypeRepositoryImpl> t2;
    public a<ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent.Builder> u = new a<ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent.Builder get() {
            return new NotSupportedAppActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<SchoolYearCalendarRepository> u0;
    public a<EvaluationRepositoryImpl> u1;
    public a<TmgiCaseTypeRepository> u2;
    public a<ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent.Builder> v = new a<ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent.Builder>() {
        public ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent.Builder get() {
            return new CasesFragmentSubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<String> v0;
    public a<EvaluationRepository> v1;
    public a<ChildrenRepositoryImpl> v2;
    public a<ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent.Builder> w = new a<ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent.Builder get() {
            return new CaseDetailsActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<EAdminApi> w0;
    public a<HomeworkDaoImpl> w1;
    public a<ChildrenRepository> w2;
    public a<ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent.Builder> x = new a<ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent.Builder get() {
            return new TmgiFormActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileServiceImpl> x0;
    public a<HomeworkDao> x1;
    public a<TmgiRepositoryImpl> x2;
    public a<ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent.Builder> y = new a<ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent.Builder get() {
            return new DecisionDetailActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<ProfileService> y0;
    public a<HomeworkRepositoryImpl> y1;
    public a<TmgiRepository> y2;
    public a<ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent.Builder> z = new a<ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent.Builder>() {
        public ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent.Builder get() {
            return new NewMessageActivitySubcomponentBuilder((AnonymousClass1) null);
        }
    };
    public a<GroupDaoImpl> z0;
    public a<HomeworkRepository> z1;
    public a<m> z2;

    public final class AboutFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AboutFragmentModule f5410a;
        public AboutFragment b;

        public /* synthetic */ AboutFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(AboutFragment aboutFragment) {
            if (aboutFragment != null) {
                this.b = aboutFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent build() {
            if (this.f5410a == null) {
                this.f5410a = new AboutFragmentModule();
            }
            v.a(this.b, AboutFragment.class);
            return new AboutFragmentSubcomponentImpl(this.f5410a, this.b, (AnonymousClass1) null);
        }
    }

    public final class AboutFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeAboutFragmentInjector.AboutFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<AboutFragment> f5411a;
        public a<MainViewModelImpl> b;
        public a<MainViewModel> c;

        public /* synthetic */ AboutFragmentSubcomponentImpl(AboutFragmentModule aboutFragmentModule, AboutFragment aboutFragment, AnonymousClass1 r14) {
            this.f5411a = d.a(aboutFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = MainViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.o0, daggerAppComponent.j1, daggerAppComponent.n1, daggerAppComponent.w0, daggerAppComponent.W0);
            this.c = b.a(new AboutFragmentModule_ProvideViewModelFactory(aboutFragmentModule, this.f5411a, this.b));
        }

        /* renamed from: a */
        public void inject(AboutFragment aboutFragment) {
            aboutFragment.Z = DaggerAppComponent.this.b();
            AboutFragment_MembersInjector.a(aboutFragment, this.c.get());
        }
    }

    public final class AddresseeSelectorActivitySubcomponentBuilder extends ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AddresseeSelectorModule f5413a;
        public AddresseeSelectorActivity b;

        public /* synthetic */ AddresseeSelectorActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(AddresseeSelectorActivity addresseeSelectorActivity) {
            if (addresseeSelectorActivity != null) {
                this.b = addresseeSelectorActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent build() {
            if (this.f5413a == null) {
                this.f5413a = new AddresseeSelectorModule();
            }
            v.a(this.b, AddresseeSelectorActivity.class);
            return new AddresseeSelectorActivitySubcomponentImpl(this.f5413a, this.b, (AnonymousClass1) null);
        }
    }

    public final class AddresseeSelectorActivitySubcomponentImpl implements ContributeActivityModule_ContributeAddresseSelectorActivityInjector.AddresseeSelectorActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<AddresseeSelectorActivity> f5414a;
        public a<AddresseeSelectorViewModelImpl> b;
        public a<AddresseeSelectorViewModel> c;

        public /* synthetic */ AddresseeSelectorActivitySubcomponentImpl(AddresseeSelectorModule addresseeSelectorModule, AddresseeSelectorActivity addresseeSelectorActivity, AnonymousClass1 r12) {
            this.f5414a = d.a(addresseeSelectorActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new AddresseeSelectorViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.i2, daggerAppComponent.W);
            this.c = b.a(new AddresseeSelectorModule_ProvideViewModelFactory(addresseeSelectorModule, this.f5414a, this.b));
        }

        /* renamed from: a */
        public void inject(AddresseeSelectorActivity addresseeSelectorActivity) {
            addresseeSelectorActivity.v = DaggerAppComponent.this.b();
            addresseeSelectorActivity.w = DaggerAppComponent.this.a();
            AddresseeSelectorActivity_MembersInjector.a(addresseeSelectorActivity, this.c.get());
        }
    }

    public final class AnnouncedTestDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AnnouncedTestDetailActivityModule f5416a;
        public AnnouncedTestDetailActivity b;

        public /* synthetic */ AnnouncedTestDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(AnnouncedTestDetailActivity announcedTestDetailActivity) {
            if (announcedTestDetailActivity != null) {
                this.b = announcedTestDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent build() {
            if (this.f5416a == null) {
                this.f5416a = new AnnouncedTestDetailActivityModule();
            }
            v.a(this.b, AnnouncedTestDetailActivity.class);
            return new AnnouncedTestDetailActivitySubcomponentImpl(this.f5416a, this.b, (AnonymousClass1) null);
        }
    }

    public final class AnnouncedTestDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeExamDetailActivityInjector.AnnouncedTestDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<AnnouncedTestDetailActivity> f5417a;
        public a<AnnouncedTestDetailViewModelImpl> b;
        public a<AnnouncedTestDetailViewModel> c;

        public /* synthetic */ AnnouncedTestDetailActivitySubcomponentImpl(AnnouncedTestDetailActivityModule announcedTestDetailActivityModule, AnnouncedTestDetailActivity announcedTestDetailActivity, AnonymousClass1 r11) {
            this.f5417a = d.a(announcedTestDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new AnnouncedTestDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.C0);
            this.c = b.a(new AnnouncedTestDetailActivityModule_ProvideViewModelFactory(announcedTestDetailActivityModule, this.f5417a, this.b));
        }

        /* renamed from: a */
        public void inject(AnnouncedTestDetailActivity announcedTestDetailActivity) {
            announcedTestDetailActivity.v = DaggerAppComponent.this.b();
            announcedTestDetailActivity.w = DaggerAppComponent.this.a();
            AnnouncedTestDetailActivity_MembersInjector.a(announcedTestDetailActivity, this.c.get());
        }
    }

    public final class AnnouncedTestsFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AnnouncedTestsFragmentModule f5419a;
        public AnnouncedTestsFragment b;

        public /* synthetic */ AnnouncedTestsFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(AnnouncedTestsFragment announcedTestsFragment) {
            if (announcedTestsFragment != null) {
                this.b = announcedTestsFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent build() {
            if (this.f5419a == null) {
                this.f5419a = new AnnouncedTestsFragmentModule();
            }
            v.a(this.b, AnnouncedTestsFragment.class);
            return new AnnouncedTestsFragmentSubcomponentImpl(this.f5419a, this.b, (AnonymousClass1) null);
        }
    }

    public final class AnnouncedTestsFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeAnnouncedTestsFragmentInjector.AnnouncedTestsFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<AnnouncedTestsFragment> f5420a;
        public a<ArrayList<ReminderRepository>> b;
        public a<RemindersViewModelImpl> c;

        /* renamed from: d  reason: collision with root package name */
        public a<RemindersViewModel> f5421d;

        public /* synthetic */ AnnouncedTestsFragmentSubcomponentImpl(AnnouncedTestsFragmentModule announcedTestsFragmentModule, AnnouncedTestsFragment announcedTestsFragment, AnonymousClass1 r12) {
            this.f5420a = d.a(announcedTestsFragment);
            this.b = new AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory(announcedTestsFragmentModule, DaggerAppComponent.this.D1);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.c = RemindersViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, this.b, daggerAppComponent.H0, daggerAppComponent.W);
            this.f5421d = b.a(new AnnouncedTestsFragmentModule_ProvideViewModelFactory(announcedTestsFragmentModule, this.f5420a, this.c));
        }

        /* renamed from: a */
        public void inject(AnnouncedTestsFragment announcedTestsFragment) {
            announcedTestsFragment.Z = DaggerAppComponent.this.b();
            AnnouncedTestsFragment_MembersInjector.a(announcedTestsFragment, this.f5421d.get());
        }
    }

    public final class AveragesFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AveragesFragmentModule f5422a;
        public AveragesFragment b;

        public /* synthetic */ AveragesFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(AveragesFragment averagesFragment) {
            if (averagesFragment != null) {
                this.b = averagesFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent build() {
            if (this.f5422a == null) {
                this.f5422a = new AveragesFragmentModule();
            }
            v.a(this.b, AveragesFragment.class);
            return new AveragesFragmentSubcomponentImpl(this.f5422a, this.b, (AnonymousClass1) null);
        }
    }

    public final class AveragesFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeAveragesFragmentInjector.AveragesFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<AveragesFragment> f5423a;
        public a<AveragesViewModelImpl> b;
        public a<AveragesViewModel> c;

        public /* synthetic */ AveragesFragmentSubcomponentImpl(AveragesFragmentModule averagesFragmentModule, AveragesFragment averagesFragment, AnonymousClass1 r11) {
            this.f5423a = d.a(averagesFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new AveragesViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.r1);
            this.c = b.a(new AveragesFragmentModule_ProvideViewModelFactory(averagesFragmentModule, this.f5423a, this.b));
        }

        /* renamed from: a */
        public void inject(AveragesFragment averagesFragment) {
            averagesFragment.Z = DaggerAppComponent.this.b();
            AveragesFragment_MembersInjector.a(averagesFragment, this.c.get());
        }
    }

    public static final class Builder extends AppComponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public AppModule f5425a;
        public eKretaApp b;

        public Builder() {
        }

        /* renamed from: a */
        public void seedInstance(eKretaApp ekretaapp) {
            if (ekretaapp != null) {
                this.b = ekretaapp;
                return;
            }
            throw new NullPointerException();
        }

        public /* synthetic */ Builder(AnonymousClass1 r1) {
        }

        public AppComponent build() {
            if (this.f5425a == null) {
                this.f5425a = new AppModule();
            }
            v.a(this.b, eKretaApp.class);
            return new DaggerAppComponent(this.f5425a, this.b, (AnonymousClass1) null);
        }
    }

    public final class CaseDetailsActivitySubcomponentBuilder extends ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public CaseDetailsActivityModule f5426a;
        public CaseDetailsActivity b;

        public /* synthetic */ CaseDetailsActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(CaseDetailsActivity caseDetailsActivity) {
            if (caseDetailsActivity != null) {
                this.b = caseDetailsActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent build() {
            if (this.f5426a == null) {
                this.f5426a = new CaseDetailsActivityModule();
            }
            v.a(this.b, CaseDetailsActivity.class);
            return new CaseDetailsActivitySubcomponentImpl(this.f5426a, this.b, (AnonymousClass1) null);
        }
    }

    public final class CaseDetailsActivitySubcomponentImpl implements ContributeActivityModule_ContributeCaseDetailsActivityInjector.CaseDetailsActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<CaseDetailsActivity> f5427a;
        public a<CaseDetailsViewModelImpl> b;
        public a<CaseDetailsViewModel> c;

        public /* synthetic */ CaseDetailsActivitySubcomponentImpl(CaseDetailsActivityModule caseDetailsActivityModule, CaseDetailsActivity caseDetailsActivity, AnonymousClass1 r13) {
            this.f5427a = d.a(caseDetailsActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new CaseDetailsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.o0, daggerAppComponent.V1, DaggerAppComponent.this.M1);
            this.c = b.a(new CaseDetailsActivityModule_ProvideViewModelFactory(caseDetailsActivityModule, this.f5427a, this.b));
        }

        /* renamed from: a */
        public void inject(CaseDetailsActivity caseDetailsActivity) {
            caseDetailsActivity.v = DaggerAppComponent.this.b();
            caseDetailsActivity.w = DaggerAppComponent.this.a();
            CaseDetailsActivity_MembersInjector.a(caseDetailsActivity, this.c.get());
        }
    }

    public final class CasesFragmentSubcomponentBuilder extends ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public CasesFragmentModule f5429a;
        public CasesFragment b;

        public /* synthetic */ CasesFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(CasesFragment casesFragment) {
            if (casesFragment != null) {
                this.b = casesFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent build() {
            if (this.f5429a == null) {
                this.f5429a = new CasesFragmentModule();
            }
            v.a(this.b, CasesFragment.class);
            return new CasesFragmentSubcomponentImpl(this.f5429a, this.b, (AnonymousClass1) null);
        }
    }

    public final class CasesFragmentSubcomponentImpl implements ContributeActivityModule_ContributeCasesActivityInjector.CasesFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<CasesFragment> f5430a;
        public a<CasesViewModelImpl> b;
        public a<CasesViewModel> c;

        public /* synthetic */ CasesFragmentSubcomponentImpl(CasesFragmentModule casesFragmentModule, CasesFragment casesFragment, AnonymousClass1 r11) {
            this.f5430a = d.a(casesFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new CasesViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.V1);
            this.c = b.a(new CasesFragmentModule_ProvideViewModelFactory(casesFragmentModule, this.f5430a, this.b));
        }

        /* renamed from: a */
        public void inject(CasesFragment casesFragment) {
            casesFragment.Z = DaggerAppComponent.this.b();
            CasesFragment_MembersInjector.a(casesFragment, this.c.get());
        }
    }

    public final class ClassMasterActivitySubcomponentBuilder extends ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ClassMasterActivityModule f5432a;
        public ClassMasterActivity b;

        public /* synthetic */ ClassMasterActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(ClassMasterActivity classMasterActivity) {
            if (classMasterActivity != null) {
                this.b = classMasterActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent build() {
            if (this.f5432a == null) {
                this.f5432a = new ClassMasterActivityModule();
            }
            v.a(this.b, ClassMasterActivity.class);
            return new ClassMasterActivitySubcomponentImpl(this.f5432a, this.b, (AnonymousClass1) null);
        }
    }

    public final class ClassMasterActivitySubcomponentImpl implements ContributeActivityModule_ContributeSenderActivityInjector.ClassMasterActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<ClassMasterActivity> f5433a;
        public a<ClassMasterViewModelImpl> b;
        public a<ClassMasterViewModel> c;

        public /* synthetic */ ClassMasterActivitySubcomponentImpl(ClassMasterActivityModule classMasterActivityModule, ClassMasterActivity classMasterActivity, AnonymousClass1 r12) {
            this.f5433a = d.a(classMasterActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new ClassMasterViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.W, daggerAppComponent.Q1);
            this.c = b.a(new ClassMasterActivityModule_ProvideViewModelFactory(classMasterActivityModule, this.f5433a, this.b));
        }

        /* renamed from: a */
        public void inject(ClassMasterActivity classMasterActivity) {
            classMasterActivity.v = DaggerAppComponent.this.b();
            classMasterActivity.w = DaggerAppComponent.this.a();
            ClassMasterActivity_MembersInjector.a(classMasterActivity, this.c.get());
        }
    }

    public final class ClassMastersFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ClassMastersFragmentModule f5435a;
        public ClassMastersFragment b;

        public /* synthetic */ ClassMastersFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(ClassMastersFragment classMastersFragment) {
            if (classMastersFragment != null) {
                this.b = classMastersFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent build() {
            if (this.f5435a == null) {
                this.f5435a = new ClassMastersFragmentModule();
            }
            v.a(this.b, ClassMastersFragment.class);
            return new ClassMastersFragmentSubcomponentImpl(this.f5435a, this.b, (AnonymousClass1) null);
        }
    }

    public final class ClassMastersFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeClassMastersFragmentInjector.ClassMastersFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<ClassMastersFragment> f5436a;
        public a<ClassMastersViewModelImpl> b;
        public a<ClassMastersViewModel> c;

        public /* synthetic */ ClassMastersFragmentSubcomponentImpl(ClassMastersFragmentModule classMastersFragmentModule, ClassMastersFragment classMastersFragment, AnonymousClass1 r12) {
            this.f5436a = d.a(classMastersFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new ClassMastersViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.C0, daggerAppComponent.Q1);
            this.c = b.a(new ClassMastersFragmentModule_ProvideViewModelFactory(classMastersFragmentModule, this.f5436a, this.b));
        }

        /* renamed from: a */
        public void inject(ClassMastersFragment classMastersFragment) {
            classMastersFragment.Z = DaggerAppComponent.this.b();
            ClassMastersFragment_MembersInjector.a(classMastersFragment, this.c.get());
        }
    }

    public final class DailyOmissionsActivitySubcomponentBuilder extends ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public DailyOmissionsActivityModule f5438a;
        public DailyOmissionsActivity b;

        public /* synthetic */ DailyOmissionsActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(DailyOmissionsActivity dailyOmissionsActivity) {
            if (dailyOmissionsActivity != null) {
                this.b = dailyOmissionsActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent build() {
            if (this.f5438a == null) {
                this.f5438a = new DailyOmissionsActivityModule();
            }
            v.a(this.b, DailyOmissionsActivity.class);
            return new DailyOmissionsActivitySubcomponentImpl(this.f5438a, this.b, (AnonymousClass1) null);
        }
    }

    public final class DailyOmissionsActivitySubcomponentImpl implements ContributeActivityModule_ContributeDailyOmissionsActivityInjector.DailyOmissionsActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<DailyOmissionsActivity> f5439a;
        public a<DailyOmissionsViewModelImpl> b;
        public a<DailyOmissionsViewModel> c;

        public /* synthetic */ DailyOmissionsActivitySubcomponentImpl(DailyOmissionsActivityModule dailyOmissionsActivityModule, DailyOmissionsActivity dailyOmissionsActivity, AnonymousClass1 r6) {
            this.f5439a = d.a(dailyOmissionsActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new DailyOmissionsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.W);
            this.c = b.a(new DailyOmissionsActivityModule_ProvideViewModelFactory(dailyOmissionsActivityModule, this.f5439a, this.b));
        }

        /* renamed from: a */
        public void inject(DailyOmissionsActivity dailyOmissionsActivity) {
            dailyOmissionsActivity.v = DaggerAppComponent.this.b();
            dailyOmissionsActivity.w = DaggerAppComponent.this.a();
            DailyOmissionsActivity_MembersInjector.a(dailyOmissionsActivity, this.c.get());
        }
    }

    public final class DecisionDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public DecisionDetailActivityModule f5441a;
        public DecisionDetailActivity b;

        public /* synthetic */ DecisionDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(DecisionDetailActivity decisionDetailActivity) {
            if (decisionDetailActivity != null) {
                this.b = decisionDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent build() {
            if (this.f5441a == null) {
                this.f5441a = new DecisionDetailActivityModule();
            }
            v.a(this.b, DecisionDetailActivity.class);
            return new DecisionDetailActivitySubcomponentImpl(DaggerAppComponent.this, this.f5441a, this.b, (AnonymousClass1) null);
        }
    }

    public final class DecisionDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeRectificationActivityInjector.DecisionDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<DecisionDetailActivity> f5442a;
        public a<DecisionDetailViewModelImpl> b;
        public a<DecisionDetailViewModel> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DaggerAppComponent f5443d;

        public /* synthetic */ DecisionDetailActivitySubcomponentImpl(DaggerAppComponent daggerAppComponent, DecisionDetailActivityModule decisionDetailActivityModule, DecisionDetailActivity decisionDetailActivity, AnonymousClass1 r19) {
            this.f5443d = daggerAppComponent;
            this.f5442a = d.a(decisionDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent2 = this.f5443d;
            this.b = new DecisionDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent2.U, daggerAppComponent2.p0, daggerAppComponent2.W, daggerAppComponent2.o0, daggerAppComponent2.X1, daggerAppComponent2.M1, daggerAppComponent2.Y1, daggerAppComponent2.a2, daggerAppComponent2.c2, daggerAppComponent2.e2);
            this.c = b.a(new DecisionDetailActivityModule_ProvideViewModelFactory(decisionDetailActivityModule, this.f5442a, this.b));
        }

        /* renamed from: a */
        public void inject(DecisionDetailActivity decisionDetailActivity) {
            decisionDetailActivity.v = this.f5443d.b();
            decisionDetailActivity.w = this.f5443d.a();
            DecisionDetailActivity_MembersInjector.a(decisionDetailActivity, this.c.get());
        }
    }

    public final class EllenorzoFirebaseMessagingServiceSubcomponentBuilder extends ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public EllenorzoFirebaseMessagingService f5444a;

        public /* synthetic */ EllenorzoFirebaseMessagingServiceSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService) {
            if (ellenorzoFirebaseMessagingService != null) {
                this.f5444a = ellenorzoFirebaseMessagingService;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent build() {
            v.a(this.f5444a, EllenorzoFirebaseMessagingService.class);
            return new EllenorzoFirebaseMessagingServiceSubcomponentImpl(this.f5444a);
        }
    }

    public final class EllenorzoFirebaseMessagingServiceSubcomponentImpl implements ContributeServiceModule_ContributeEllenorzoFirebaseMessagingService.EllenorzoFirebaseMessagingServiceSubcomponent {
        public /* synthetic */ EllenorzoFirebaseMessagingServiceSubcomponentImpl(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService) {
        }

        /* renamed from: a */
        public void inject(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService) {
            EllenorzoFirebaseMessagingService_MembersInjector.a(ellenorzoFirebaseMessagingService, DaggerAppComponent.this.B2.get());
        }
    }

    public final class EndOfYearFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public EndOfYearFragmentModule f5446a;
        public EndOfYearFragment b;

        public /* synthetic */ EndOfYearFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(EndOfYearFragment endOfYearFragment) {
            if (endOfYearFragment != null) {
                this.b = endOfYearFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent build() {
            if (this.f5446a == null) {
                this.f5446a = new EndOfYearFragmentModule();
            }
            v.a(this.b, EndOfYearFragment.class);
            return new EndOfYearFragmentSubcomponentImpl(this.f5446a, this.b, (AnonymousClass1) null);
        }
    }

    public final class EndOfYearFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeEndOfYearFragmentInjector.EndOfYearFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<EndOfYearFragment> f5447a;
        public a<EndOfYearViewModelImpl> b;
        public a<EndOfYearViewModel> c;

        public /* synthetic */ EndOfYearFragmentSubcomponentImpl(EndOfYearFragmentModule endOfYearFragmentModule, EndOfYearFragment endOfYearFragment, AnonymousClass1 r11) {
            this.f5447a = d.a(endOfYearFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new EndOfYearViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.v1);
            this.c = b.a(new EndOfYearFragmentModule_ProvideViewModelFactory(endOfYearFragmentModule, this.f5447a, this.b));
        }

        /* renamed from: a */
        public void inject(EndOfYearFragment endOfYearFragment) {
            endOfYearFragment.Z = DaggerAppComponent.this.b();
            EndOfYearFragment_MembersInjector.a(endOfYearFragment, this.c.get());
        }
    }

    public final class EvaluationDetailsActivitySubcomponentBuilder extends ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public EvaluationDetailsActivityModule f5449a;
        public EvaluationDetailsActivity b;

        public /* synthetic */ EvaluationDetailsActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(EvaluationDetailsActivity evaluationDetailsActivity) {
            if (evaluationDetailsActivity != null) {
                this.b = evaluationDetailsActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent build() {
            if (this.f5449a == null) {
                this.f5449a = new EvaluationDetailsActivityModule();
            }
            v.a(this.b, EvaluationDetailsActivity.class);
            return new EvaluationDetailsActivitySubcomponentImpl(this.f5449a, this.b, (AnonymousClass1) null);
        }
    }

    public final class EvaluationDetailsActivitySubcomponentImpl implements ContributeActivityModule_ContributeEvaluationDetailsActivityInjector.EvaluationDetailsActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<EvaluationDetailsActivity> f5450a;
        public a<EvaluationDetailsViewModelImpl> b;
        public a<EvaluationDetailsViewModel> c;

        public /* synthetic */ EvaluationDetailsActivitySubcomponentImpl(EvaluationDetailsActivityModule evaluationDetailsActivityModule, EvaluationDetailsActivity evaluationDetailsActivity, AnonymousClass1 r10) {
            this.f5450a = d.a(evaluationDetailsActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new EvaluationDetailsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.W, daggerAppComponent.C0);
            this.c = b.a(new EvaluationDetailsActivityModule_ProvideViewModelFactory(evaluationDetailsActivityModule, this.f5450a, this.b));
        }

        /* renamed from: a */
        public void inject(EvaluationDetailsActivity evaluationDetailsActivity) {
            evaluationDetailsActivity.v = DaggerAppComponent.this.b();
            evaluationDetailsActivity.w = DaggerAppComponent.this.a();
            EvaluationDetailsActivity_MembersInjector.a(evaluationDetailsActivity, this.c.get());
        }
    }

    public final class HalfYearFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public HalfYearFragmentModule f5452a;
        public HalfYearFragment b;

        public /* synthetic */ HalfYearFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(HalfYearFragment halfYearFragment) {
            if (halfYearFragment != null) {
                this.b = halfYearFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent build() {
            if (this.f5452a == null) {
                this.f5452a = new HalfYearFragmentModule();
            }
            v.a(this.b, HalfYearFragment.class);
            return new HalfYearFragmentSubcomponentImpl(this.f5452a, this.b, (AnonymousClass1) null);
        }
    }

    public final class HalfYearFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeHalfYearFragmentInjector.HalfYearFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<HalfYearFragment> f5453a;
        public a<HalfYearViewModelImpl> b;
        public a<HalfYearViewModel> c;

        public /* synthetic */ HalfYearFragmentSubcomponentImpl(HalfYearFragmentModule halfYearFragmentModule, HalfYearFragment halfYearFragment, AnonymousClass1 r11) {
            this.f5453a = d.a(halfYearFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new HalfYearViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.v1);
            this.c = b.a(new HalfYearFragmentModule_ProvideViewModelFactory(halfYearFragmentModule, this.f5453a, this.b));
        }

        /* renamed from: a */
        public void inject(HalfYearFragment halfYearFragment) {
            halfYearFragment.Z = DaggerAppComponent.this.b();
            HalfYearFragment_MembersInjector.a(halfYearFragment, this.c.get());
        }
    }

    public final class HomeFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public HomeFragmentModule f5455a;
        public HomeFragment b;

        public /* synthetic */ HomeFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(HomeFragment homeFragment) {
            if (homeFragment != null) {
                this.b = homeFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent build() {
            if (this.f5455a == null) {
                this.f5455a = new HomeFragmentModule();
            }
            v.a(this.b, HomeFragment.class);
            return new HomeFragmentSubcomponentImpl(DaggerAppComponent.this, this.f5455a, this.b, (AnonymousClass1) null);
        }
    }

    public final class HomeFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeHomeFragmentInjector.HomeFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<HomeFragment> f5456a;
        public a<HomeViewModelImpl> b;
        public a<HomeViewModel> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DaggerAppComponent f5457d;

        public /* synthetic */ HomeFragmentSubcomponentImpl(DaggerAppComponent daggerAppComponent, HomeFragmentModule homeFragmentModule, HomeFragment homeFragment, AnonymousClass1 r19) {
            this.f5457d = daggerAppComponent;
            this.f5456a = d.a(homeFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent2 = this.f5457d;
            a<SystemExit> aVar = daggerAppComponent2.U;
            a<AuthenticationService> aVar2 = daggerAppComponent2.p0;
            a<Application> aVar3 = daggerAppComponent2.W;
            a<EvaluationRepository> aVar4 = daggerAppComponent2.v1;
            a b2 = daggerAppComponent2.m2;
            DaggerAppComponent daggerAppComponent3 = this.f5457d;
            this.b = new HomeViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, aVar, aVar2, aVar3, aVar4, b2, daggerAppComponent3.j1, daggerAppComponent3.D1, daggerAppComponent3.z1, daggerAppComponent3.o0, daggerAppComponent3.s2);
            this.c = b.a(new HomeFragmentModule_ProvideViewModelFactory(homeFragmentModule, this.f5456a, this.b));
        }

        /* renamed from: a */
        public void inject(HomeFragment homeFragment) {
            homeFragment.Z = this.f5457d.b();
            HomeFragment_MembersInjector.a(homeFragment, this.c.get());
        }
    }

    public final class HomeworkCommentFormActivitySubcomponentBuilder extends ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public HomeworkCommentActivityModule f5458a;
        public HomeworkCommentFormActivity b;

        public /* synthetic */ HomeworkCommentFormActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(HomeworkCommentFormActivity homeworkCommentFormActivity) {
            if (homeworkCommentFormActivity != null) {
                this.b = homeworkCommentFormActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent build() {
            if (this.f5458a == null) {
                this.f5458a = new HomeworkCommentActivityModule();
            }
            v.a(this.b, HomeworkCommentFormActivity.class);
            return new HomeworkCommentFormActivitySubcomponentImpl(this.f5458a, this.b, (AnonymousClass1) null);
        }
    }

    public final class HomeworkCommentFormActivitySubcomponentImpl implements ContributeActivityModule_ContributeHomeworkCommentActivityInjector.HomeworkCommentFormActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<HomeworkCommentFormActivity> f5459a;
        public a<HomeworkCommentFormViewModelImpl> b;
        public a<HomeworkCommentFormViewModel> c;

        public /* synthetic */ HomeworkCommentFormActivitySubcomponentImpl(HomeworkCommentActivityModule homeworkCommentActivityModule, HomeworkCommentFormActivity homeworkCommentFormActivity, AnonymousClass1 r12) {
            this.f5459a = d.a(homeworkCommentFormActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new HomeworkCommentFormViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.z1, daggerAppComponent.H0);
            this.c = b.a(new HomeworkCommentActivityModule_ProvideViewModelFactory(homeworkCommentActivityModule, this.f5459a, this.b));
        }

        /* renamed from: a */
        public void inject(HomeworkCommentFormActivity homeworkCommentFormActivity) {
            homeworkCommentFormActivity.v = DaggerAppComponent.this.b();
            homeworkCommentFormActivity.w = DaggerAppComponent.this.a();
            HomeworkCommentFormActivity_MembersInjector.a(homeworkCommentFormActivity, this.c.get());
        }
    }

    public final class HomeworkDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public HomeworkDetailActivityModule f5461a;
        public HomeworkDetailActivity b;

        public /* synthetic */ HomeworkDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(HomeworkDetailActivity homeworkDetailActivity) {
            if (homeworkDetailActivity != null) {
                this.b = homeworkDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent build() {
            if (this.f5461a == null) {
                this.f5461a = new HomeworkDetailActivityModule();
            }
            v.a(this.b, HomeworkDetailActivity.class);
            return new HomeworkDetailActivitySubcomponentImpl(this.f5461a, this.b, (AnonymousClass1) null);
        }
    }

    public final class HomeworkDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeHomeworkDetailActivityInjector.HomeworkDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<HomeworkDetailActivity> f5462a;
        public a<HomeworkDetailViewModelImpl> b;
        public a<HomeworkDetailViewModel> c;

        public /* synthetic */ HomeworkDetailActivitySubcomponentImpl(HomeworkDetailActivityModule homeworkDetailActivityModule, HomeworkDetailActivity homeworkDetailActivity, AnonymousClass1 r13) {
            this.f5462a = d.a(homeworkDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new HomeworkDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.z1, daggerAppComponent.W, daggerAppComponent.C0);
            this.c = b.a(new HomeworkDetailActivityModule_ProvideViewModelFactory(homeworkDetailActivityModule, this.f5462a, this.b));
        }

        /* renamed from: a */
        public void inject(HomeworkDetailActivity homeworkDetailActivity) {
            homeworkDetailActivity.v = DaggerAppComponent.this.b();
            homeworkDetailActivity.w = DaggerAppComponent.this.a();
            HomeworkDetailActivity_MembersInjector.a(homeworkDetailActivity, this.c.get());
        }
    }

    public final class HomeworksFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public HomeworksFragmentModule f5464a;
        public HomeworksFragment b;

        public /* synthetic */ HomeworksFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(HomeworksFragment homeworksFragment) {
            if (homeworksFragment != null) {
                this.b = homeworksFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent build() {
            if (this.f5464a == null) {
                this.f5464a = new HomeworksFragmentModule();
            }
            v.a(this.b, HomeworksFragment.class);
            return new HomeworksFragmentSubcomponentImpl(this.f5464a, this.b, (AnonymousClass1) null);
        }
    }

    public final class HomeworksFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeHomeworksFragmentInjector.HomeworksFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<HomeworksFragment> f5465a;
        public a<ArrayList<ReminderRepository>> b;
        public a<RemindersViewModelImpl> c;

        /* renamed from: d  reason: collision with root package name */
        public a<RemindersViewModel> f5466d;

        public /* synthetic */ HomeworksFragmentSubcomponentImpl(HomeworksFragmentModule homeworksFragmentModule, HomeworksFragment homeworksFragment, AnonymousClass1 r12) {
            this.f5465a = d.a(homeworksFragment);
            this.b = new HomeworksFragmentModule_ProvideReminderRepositoriesFactory(homeworksFragmentModule, DaggerAppComponent.this.z1);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.c = RemindersViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, this.b, daggerAppComponent.H0, daggerAppComponent.W);
            this.f5466d = b.a(new HomeworksFragmentModule_ProvideViewModelFactory(homeworksFragmentModule, this.f5465a, this.c));
        }

        /* renamed from: a */
        public void inject(HomeworksFragment homeworksFragment) {
            homeworksFragment.Z = DaggerAppComponent.this.b();
            HomeworksFragment_MembersInjector.a(homeworksFragment, this.f5466d.get());
        }
    }

    public final class InstitutePickerActivitySubcomponentBuilder extends ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public InstitutePickerActivityModule f5467a;
        public InstitutePickerActivity b;

        public /* synthetic */ InstitutePickerActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(InstitutePickerActivity institutePickerActivity) {
            if (institutePickerActivity != null) {
                this.b = institutePickerActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent build() {
            if (this.f5467a == null) {
                this.f5467a = new InstitutePickerActivityModule();
            }
            v.a(this.b, InstitutePickerActivity.class);
            return new InstitutePickerActivitySubcomponentImpl(this.f5467a, this.b, (AnonymousClass1) null);
        }
    }

    public final class InstitutePickerActivitySubcomponentImpl implements ContributeActivityModule_ContributeInstitutePickerActivityInjector.InstitutePickerActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<InstitutePickerActivity> f5468a;
        public a<InstitutePickerViewModelImpl> b;
        public a<InstitutePickerViewModel> c;

        public /* synthetic */ InstitutePickerActivitySubcomponentImpl(InstitutePickerActivityModule institutePickerActivityModule, InstitutePickerActivity institutePickerActivity, AnonymousClass1 r6) {
            this.f5468a = d.a(institutePickerActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new InstitutePickerViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.U0);
            this.c = b.a(new InstitutePickerActivityModule_ProvideViewModelFactory(institutePickerActivityModule, this.f5468a, this.b));
        }

        /* renamed from: a */
        public void inject(InstitutePickerActivity institutePickerActivity) {
            institutePickerActivity.v = DaggerAppComponent.this.b();
            institutePickerActivity.w = DaggerAppComponent.this.a();
            InstitutePickerActivity_MembersInjector.a(institutePickerActivity, this.c.get());
        }
    }

    public final class LoginActivitySubcomponentBuilder extends ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public LoginActivityModule f5470a;
        public LoginActivity b;

        public /* synthetic */ LoginActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(LoginActivity loginActivity) {
            if (loginActivity != null) {
                this.b = loginActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent build() {
            if (this.f5470a == null) {
                this.f5470a = new LoginActivityModule();
            }
            v.a(this.b, LoginActivity.class);
            return new LoginActivitySubcomponentImpl(this.f5470a, this.b, (AnonymousClass1) null);
        }
    }

    public final class LoginActivitySubcomponentImpl implements ContributeActivityModule_ContributeLoginActivityInjector.LoginActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<LoginActivity> f5471a;
        public a<c> b;
        public a<LoginViewModelImpl> c;

        /* renamed from: d  reason: collision with root package name */
        public a<LoginViewModel> f5472d;

        public /* synthetic */ LoginActivitySubcomponentImpl(LoginActivityModule loginActivityModule, LoginActivity loginActivity, AnonymousClass1 r15) {
            this.f5471a = d.a(loginActivity);
            this.b = new LoginActivityModule_ProvideRxActivityResultFactory(loginActivityModule, this.f5471a);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            a<SystemExit> aVar = daggerAppComponent.U;
            a<Application> aVar2 = daggerAppComponent.W;
            a<ProfileRepository> aVar3 = daggerAppComponent.o0;
            a d2 = daggerAppComponent.U0;
            DaggerAppComponent daggerAppComponent2 = DaggerAppComponent.this;
            this.c = new LoginViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, aVar, aVar2, aVar3, d2, daggerAppComponent2.p0, daggerAppComponent2.W0, daggerAppComponent2.Z0, this.b);
            this.f5472d = b.a(new LoginActivityModule_ProvideViewModelFactory(loginActivityModule, this.f5471a, this.c));
        }

        /* renamed from: a */
        public void inject(LoginActivity loginActivity) {
            loginActivity.v = DaggerAppComponent.this.b();
            loginActivity.w = DaggerAppComponent.this.a();
            LoginActivity_MembersInjector.a(loginActivity, this.f5472d.get());
        }
    }

    public final class MainActivitySubcomponentBuilder extends ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public MainActivityModule f5473a;
        public MainActivity b;

        public /* synthetic */ MainActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(MainActivity mainActivity) {
            if (mainActivity != null) {
                this.b = mainActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent build() {
            if (this.f5473a == null) {
                this.f5473a = new MainActivityModule();
            }
            v.a(this.b, MainActivity.class);
            return new MainActivitySubcomponentImpl(this.f5473a, this.b, (AnonymousClass1) null);
        }
    }

    public final class MainActivitySubcomponentImpl implements ContributeActivityModule_ContributeMainActivityInjector.MainActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<MainActivity> f5474a;
        public a<MainViewModelImpl> b;
        public a<MainViewModel> c;

        public /* synthetic */ MainActivitySubcomponentImpl(MainActivityModule mainActivityModule, MainActivity mainActivity, AnonymousClass1 r14) {
            this.f5474a = d.a(mainActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = MainViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.o0, daggerAppComponent.j1, daggerAppComponent.n1, daggerAppComponent.w0, daggerAppComponent.W0);
            this.c = b.a(new MainActivityModule_ProvideViewModelFactory(mainActivityModule, this.f5474a, this.b));
        }

        /* renamed from: a */
        public void inject(MainActivity mainActivity) {
            mainActivity.v = DaggerAppComponent.this.b();
            mainActivity.w = DaggerAppComponent.this.a();
            MainActivity_MembersInjector.a(mainActivity, this.c.get());
            MainActivity_MembersInjector.a(mainActivity, DaggerAppComponent.this.K0.get());
        }
    }

    public final class MessageDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public MessageDetailActivityModule f5476a;
        public MessageDetailActivity b;

        public /* synthetic */ MessageDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(MessageDetailActivity messageDetailActivity) {
            if (messageDetailActivity != null) {
                this.b = messageDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent build() {
            if (this.f5476a == null) {
                this.f5476a = new MessageDetailActivityModule();
            }
            v.a(this.b, MessageDetailActivity.class);
            return new MessageDetailActivitySubcomponentImpl(this.f5476a, this.b, (AnonymousClass1) null);
        }
    }

    public final class MessageDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeMessageDetailActivityInjector.MessageDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<MessageDetailActivity> f5477a;
        public a<MessageDetailViewModelImpl> b;
        public a<MessageDetailViewModel> c;

        public /* synthetic */ MessageDetailActivitySubcomponentImpl(MessageDetailActivityModule messageDetailActivityModule, MessageDetailActivity messageDetailActivity, AnonymousClass1 r12) {
            this.f5477a = d.a(messageDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new MessageDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.M1, daggerAppComponent.n1, daggerAppComponent.o0);
            this.c = b.a(new MessageDetailActivityModule_ProvideViewModelFactory(messageDetailActivityModule, this.f5477a, this.b));
        }

        /* renamed from: a */
        public void inject(MessageDetailActivity messageDetailActivity) {
            messageDetailActivity.v = DaggerAppComponent.this.b();
            messageDetailActivity.w = DaggerAppComponent.this.a();
            MessageDetailActivity_MembersInjector.a(messageDetailActivity, this.c.get());
        }
    }

    public final class MessagesFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public MessagesFragmentModule f5479a;
        public MessagesFragment b;

        public /* synthetic */ MessagesFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(MessagesFragment messagesFragment) {
            if (messagesFragment != null) {
                this.b = messagesFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent build() {
            if (this.f5479a == null) {
                this.f5479a = new MessagesFragmentModule();
            }
            v.a(this.b, MessagesFragment.class);
            return new MessagesFragmentSubcomponentImpl(this.f5479a, this.b, (AnonymousClass1) null);
        }
    }

    public final class MessagesFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeMessagesFragmentInjector.MessagesFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<MessagesFragment> f5480a;
        public a<MessagesViewModelImpl> b;
        public a<MessagesViewModel> c;

        public /* synthetic */ MessagesFragmentSubcomponentImpl(MessagesFragmentModule messagesFragmentModule, MessagesFragment messagesFragment, AnonymousClass1 r12) {
            this.f5480a = d.a(messagesFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new MessagesViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.n1, daggerAppComponent.o2);
            this.c = b.a(new MessagesFragmentModule_ProvideViewModelFactory(messagesFragmentModule, this.f5480a, this.b));
        }

        /* renamed from: a */
        public void inject(MessagesFragment messagesFragment) {
            messagesFragment.Z = DaggerAppComponent.this.b();
            MessagesFragment_MembersInjector.a(messagesFragment, this.c.get());
        }
    }

    public final class MoreFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public MoreFragmentModule f5482a;
        public MoreFragment b;

        public /* synthetic */ MoreFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(MoreFragment moreFragment) {
            if (moreFragment != null) {
                this.b = moreFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent build() {
            if (this.f5482a == null) {
                this.f5482a = new MoreFragmentModule();
            }
            v.a(this.b, MoreFragment.class);
            return new MoreFragmentSubcomponentImpl(this.f5482a, this.b, (AnonymousClass1) null);
        }
    }

    public final class MoreFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeMoreFragmentInjector.MoreFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<MoreFragment> f5483a;
        public a<MainViewModelImpl> b;
        public a<MainViewModel> c;

        public /* synthetic */ MoreFragmentSubcomponentImpl(MoreFragmentModule moreFragmentModule, MoreFragment moreFragment, AnonymousClass1 r14) {
            this.f5483a = d.a(moreFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = MainViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.o0, daggerAppComponent.j1, daggerAppComponent.n1, daggerAppComponent.w0, daggerAppComponent.W0);
            this.c = b.a(new MoreFragmentModule_ProvideViewModelFactory(moreFragmentModule, this.f5483a, this.b));
        }

        /* renamed from: a */
        public void inject(MoreFragment moreFragment) {
            moreFragment.Z = DaggerAppComponent.this.b();
            MoreFragment_MembersInjector.a(moreFragment, this.c.get());
        }
    }

    public final class NewMessageActivitySubcomponentBuilder extends ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NewMessagesModule f5485a;
        public NewMessageActivity b;

        public /* synthetic */ NewMessageActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NewMessageActivity newMessageActivity) {
            if (newMessageActivity != null) {
                this.b = newMessageActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent build() {
            if (this.f5485a == null) {
                this.f5485a = new NewMessagesModule();
            }
            v.a(this.b, NewMessageActivity.class);
            return new NewMessageActivitySubcomponentImpl(DaggerAppComponent.this, this.f5485a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NewMessageActivitySubcomponentImpl implements ContributeActivityModule_ContributeNewMessageActivityInjector.NewMessageActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NewMessageActivity> f5486a;
        public a<NewMessageViewModelImpl> b;
        public a<NewMessageViewModel> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DaggerAppComponent f5487d;

        public /* synthetic */ NewMessageActivitySubcomponentImpl(DaggerAppComponent daggerAppComponent, NewMessagesModule newMessagesModule, NewMessageActivity newMessageActivity, AnonymousClass1 r18) {
            this.f5487d = daggerAppComponent;
            this.f5486a = d.a(newMessageActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent2 = this.f5487d;
            this.b = new NewMessageViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent2.U, daggerAppComponent2.p0, daggerAppComponent2.o0, daggerAppComponent2.g2, daggerAppComponent2.H0, daggerAppComponent2.a2, daggerAppComponent2.M1, daggerAppComponent2.Y1, daggerAppComponent2.W);
            this.c = b.a(new NewMessagesModule_ProvideViewModelFactory(newMessagesModule, this.f5486a, this.b));
        }

        /* renamed from: a */
        public void inject(NewMessageActivity newMessageActivity) {
            newMessageActivity.v = this.f5487d.b();
            newMessageActivity.w = this.f5487d.a();
            NewMessageActivity_MembersInjector.a(newMessageActivity, this.c.get());
        }
    }

    public final class NotSupportedAppActivitySubcomponentBuilder extends ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NotSupportedAppActivityModule f5488a;
        public NotSupportedAppActivity b;

        public /* synthetic */ NotSupportedAppActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NotSupportedAppActivity notSupportedAppActivity) {
            if (notSupportedAppActivity != null) {
                this.b = notSupportedAppActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent build() {
            if (this.f5488a == null) {
                this.f5488a = new NotSupportedAppActivityModule();
            }
            v.a(this.b, NotSupportedAppActivity.class);
            return new NotSupportedAppActivitySubcomponentImpl(this.f5488a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NotSupportedAppActivitySubcomponentImpl implements ContributeActivityModule_ContributeNotSupportedAppActivityInjector.NotSupportedAppActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NotSupportedAppActivity> f5489a;
        public a<NotSupportedAppViewModelImpl> b = new NotSupportedAppViewModelImpl_Factory(ObservableImpl_Factory.f6336a, ExecuteOnceUiCommandSource_Factory.f6335a, DaggerAppComponent.this.U);
        public a<NotSupportedAppViewModel> c;

        public /* synthetic */ NotSupportedAppActivitySubcomponentImpl(NotSupportedAppActivityModule notSupportedAppActivityModule, NotSupportedAppActivity notSupportedAppActivity, AnonymousClass1 r5) {
            this.f5489a = d.a(notSupportedAppActivity);
            this.c = b.a(new NotSupportedAppActivityModule_ProvideViewModelFactory(notSupportedAppActivityModule, this.f5489a, this.b));
        }

        /* renamed from: a */
        public void inject(NotSupportedAppActivity notSupportedAppActivity) {
            notSupportedAppActivity.v = DaggerAppComponent.this.b();
            notSupportedAppActivity.w = DaggerAppComponent.this.a();
            NotSupportedAppActivity_MembersInjector.a(notSupportedAppActivity, this.c.get());
        }
    }

    public final class NoteDetailsActivitySubcomponentBuilder extends ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NoteDetailsActivityModule f5491a;
        public NoteDetailsActivity b;

        public /* synthetic */ NoteDetailsActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NoteDetailsActivity noteDetailsActivity) {
            if (noteDetailsActivity != null) {
                this.b = noteDetailsActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent build() {
            if (this.f5491a == null) {
                this.f5491a = new NoteDetailsActivityModule();
            }
            v.a(this.b, NoteDetailsActivity.class);
            return new NoteDetailsActivitySubcomponentImpl(this.f5491a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NoteDetailsActivitySubcomponentImpl implements ContributeActivityModule_ContributeNoteDetailsActivityInjector.NoteDetailsActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NoteDetailsActivity> f5492a;
        public a<NoteDetailsViewModelImpl> b;
        public a<NoteDetailsViewModel> c;

        public /* synthetic */ NoteDetailsActivitySubcomponentImpl(NoteDetailsActivityModule noteDetailsActivityModule, NoteDetailsActivity noteDetailsActivity, AnonymousClass1 r6) {
            this.f5492a = d.a(noteDetailsActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new NoteDetailsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.C0);
            this.c = b.a(new NoteDetailsActivityModule_ProvideViewModelFactory(noteDetailsActivityModule, this.f5492a, this.b));
        }

        /* renamed from: a */
        public void inject(NoteDetailsActivity noteDetailsActivity) {
            noteDetailsActivity.v = DaggerAppComponent.this.b();
            noteDetailsActivity.w = DaggerAppComponent.this.a();
            NoteDetailsActivity_MembersInjector.a(noteDetailsActivity, this.c.get());
        }
    }

    public final class NotesFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NotesFragmentModule f5494a;
        public NotesFragment b;

        public /* synthetic */ NotesFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NotesFragment notesFragment) {
            if (notesFragment != null) {
                this.b = notesFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent build() {
            if (this.f5494a == null) {
                this.f5494a = new NotesFragmentModule();
            }
            v.a(this.b, NotesFragment.class);
            return new NotesFragmentSubcomponentImpl(this.f5494a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NotesFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeNotesFragmentInjector.NotesFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NotesFragment> f5495a;
        public a<NotesViewModelImpl> b;
        public a<NotesViewModel> c;

        public /* synthetic */ NotesFragmentSubcomponentImpl(NotesFragmentModule notesFragmentModule, NotesFragment notesFragment, AnonymousClass1 r12) {
            this.f5495a = d.a(notesFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new NotesViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.m2, DaggerAppComponent.this.W);
            this.c = b.a(new NotesFragmentModule_ProvideViewModelFactory(notesFragmentModule, this.f5495a, this.b));
        }

        /* renamed from: a */
        public void inject(NotesFragment notesFragment) {
            notesFragment.Z = DaggerAppComponent.this.b();
            NotesFragment_MembersInjector.a(notesFragment, this.c.get());
        }
    }

    public final class NoticeBoardFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NoticeBoardFragmentModule f5497a;
        public NoticeBoardFragment b;

        public /* synthetic */ NoticeBoardFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NoticeBoardFragment noticeBoardFragment) {
            if (noticeBoardFragment != null) {
                this.b = noticeBoardFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent build() {
            if (this.f5497a == null) {
                this.f5497a = new NoticeBoardFragmentModule();
            }
            v.a(this.b, NoticeBoardFragment.class);
            return new NoticeBoardFragmentSubcomponentImpl(this.f5497a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NoticeBoardFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeNoticeBoardFragmentInjector.NoticeBoardFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NoticeBoardFragment> f5498a;
        public a<NoticeBoardViewModelImpl> b;
        public a<NoticeBoardViewModel> c;

        public /* synthetic */ NoticeBoardFragmentSubcomponentImpl(NoticeBoardFragmentModule noticeBoardFragmentModule, NoticeBoardFragment noticeBoardFragment, AnonymousClass1 r11) {
            this.f5498a = d.a(noticeBoardFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new NoticeBoardViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.s2);
            this.c = b.a(new NoticeBoardFragmentModule_ProvideViewModelFactory(noticeBoardFragmentModule, this.f5498a, this.b));
        }

        /* renamed from: a */
        public void inject(NoticeBoardFragment noticeBoardFragment) {
            noticeBoardFragment.Z = DaggerAppComponent.this.b();
            NoticeBoardFragment_MembersInjector.a(noticeBoardFragment, this.c.get());
        }
    }

    public final class NoticeBoardItemDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NoticeBoardItemDetailsActivityModule f5500a;
        public NoticeBoardItemDetailActivity b;

        public /* synthetic */ NoticeBoardItemDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity) {
            if (noticeBoardItemDetailActivity != null) {
                this.b = noticeBoardItemDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent build() {
            if (this.f5500a == null) {
                this.f5500a = new NoticeBoardItemDetailsActivityModule();
            }
            v.a(this.b, NoticeBoardItemDetailActivity.class);
            return new NoticeBoardItemDetailActivitySubcomponentImpl(this.f5500a, this.b, (AnonymousClass1) null);
        }
    }

    public final class NoticeBoardItemDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeNoticeBoardItemDetailsActivityInjector.NoticeBoardItemDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<NoticeBoardItemDetailActivity> f5501a;
        public a<NoticeBoardItemDetailViewModelImpl> b = new NoticeBoardItemDetailViewModelImpl_Factory(ObservableImpl_Factory.f6336a, ExecuteOnceUiCommandSource_Factory.f6335a, DaggerAppComponent.this.U);
        public a<NoticeBoardItemDetailViewModel> c;

        public /* synthetic */ NoticeBoardItemDetailActivitySubcomponentImpl(NoticeBoardItemDetailsActivityModule noticeBoardItemDetailsActivityModule, NoticeBoardItemDetailActivity noticeBoardItemDetailActivity, AnonymousClass1 r5) {
            this.f5501a = d.a(noticeBoardItemDetailActivity);
            this.c = b.a(new NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory(noticeBoardItemDetailsActivityModule, this.f5501a, this.b));
        }

        /* renamed from: a */
        public void inject(NoticeBoardItemDetailActivity noticeBoardItemDetailActivity) {
            noticeBoardItemDetailActivity.v = DaggerAppComponent.this.b();
            noticeBoardItemDetailActivity.w = DaggerAppComponent.this.a();
            NoticeBoardItemDetailActivity_MembersInjector.a(noticeBoardItemDetailActivity, this.c.get());
        }
    }

    public final class OmissionDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public OmissionDetailActivityModule f5503a;
        public OmissionDetailActivity b;

        public /* synthetic */ OmissionDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(OmissionDetailActivity omissionDetailActivity) {
            if (omissionDetailActivity != null) {
                this.b = omissionDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent build() {
            if (this.f5503a == null) {
                this.f5503a = new OmissionDetailActivityModule();
            }
            v.a(this.b, OmissionDetailActivity.class);
            return new OmissionDetailActivitySubcomponentImpl(this.f5503a, this.b, (AnonymousClass1) null);
        }
    }

    public final class OmissionDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeOmissionDetailActivityInjector.OmissionDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<OmissionDetailActivity> f5504a;
        public a<OmissionDetailViewModelImpl> b;
        public a<OmissionDetailViewModel> c;

        public /* synthetic */ OmissionDetailActivitySubcomponentImpl(OmissionDetailActivityModule omissionDetailActivityModule, OmissionDetailActivity omissionDetailActivity, AnonymousClass1 r10) {
            this.f5504a = d.a(omissionDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new OmissionDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.W, daggerAppComponent.C0);
            this.c = b.a(new OmissionDetailActivityModule_ProvideViewModelFactory(omissionDetailActivityModule, this.f5504a, this.b));
        }

        /* renamed from: a */
        public void inject(OmissionDetailActivity omissionDetailActivity) {
            omissionDetailActivity.v = DaggerAppComponent.this.b();
            omissionDetailActivity.w = DaggerAppComponent.this.a();
            OmissionDetailActivity_MembersInjector.a(omissionDetailActivity, this.c.get());
        }
    }

    public final class OmissionsPerDayFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public OmissionsPerDayFragmentModule f5506a;
        public OmissionsPerDayFragment b;

        public /* synthetic */ OmissionsPerDayFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(OmissionsPerDayFragment omissionsPerDayFragment) {
            if (omissionsPerDayFragment != null) {
                this.b = omissionsPerDayFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent build() {
            if (this.f5506a == null) {
                this.f5506a = new OmissionsPerDayFragmentModule();
            }
            v.a(this.b, OmissionsPerDayFragment.class);
            return new OmissionsPerDayFragmentSubcomponentImpl(this.f5506a, this.b, (AnonymousClass1) null);
        }
    }

    public final class OmissionsPerDayFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeOmissionsPerDayFragmentInjector.OmissionsPerDayFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<OmissionsPerDayFragment> f5507a;
        public a<OmissionsPerDayViewModelImpl> b;
        public a<OmissionsPerDayViewModel> c;

        public /* synthetic */ OmissionsPerDayFragmentSubcomponentImpl(OmissionsPerDayFragmentModule omissionsPerDayFragmentModule, OmissionsPerDayFragment omissionsPerDayFragment, AnonymousClass1 r11) {
            this.f5507a = d.a(omissionsPerDayFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new OmissionsPerDayViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.j1);
            this.c = b.a(new OmissionsPerDayFragmentModule_ProvideViewModelFactory(omissionsPerDayFragmentModule, this.f5507a, this.b));
        }

        /* renamed from: a */
        public void inject(OmissionsPerDayFragment omissionsPerDayFragment) {
            omissionsPerDayFragment.Z = DaggerAppComponent.this.b();
            OmissionsPerDayFragment_MembersInjector.a(omissionsPerDayFragment, this.c.get());
        }
    }

    public final class ProfileDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ProfileDetailActivityModule f5509a;
        public ProfileDetailActivity b;

        public /* synthetic */ ProfileDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(ProfileDetailActivity profileDetailActivity) {
            if (profileDetailActivity != null) {
                this.b = profileDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent build() {
            if (this.f5509a == null) {
                this.f5509a = new ProfileDetailActivityModule();
            }
            v.a(this.b, ProfileDetailActivity.class);
            return new ProfileDetailActivitySubcomponentImpl(this.f5509a, this.b, (AnonymousClass1) null);
        }
    }

    public final class ProfileDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeProfileDetailActivityInjector.ProfileDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<ProfileDetailActivity> f5510a;
        public a<ProfileDetailViewModelImpl> b;
        public a<ProfileDetailViewModel> c;

        public /* synthetic */ ProfileDetailActivitySubcomponentImpl(ProfileDetailActivityModule profileDetailActivityModule, ProfileDetailActivity profileDetailActivity, AnonymousClass1 r10) {
            this.f5510a = d.a(profileDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new ProfileDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0);
            this.c = b.a(new ProfileDetailActivityModule_ProvideViewModelFactory(profileDetailActivityModule, this.f5510a, this.b));
        }

        /* renamed from: a */
        public void inject(ProfileDetailActivity profileDetailActivity) {
            profileDetailActivity.v = DaggerAppComponent.this.b();
            profileDetailActivity.w = DaggerAppComponent.this.a();
            ProfileDetailActivity_MembersInjector.a(profileDetailActivity, this.c.get());
        }
    }

    public final class ProfileListActivitySubcomponentBuilder extends ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ProfileListActivityModule f5512a;
        public ProfileListActivity b;

        public /* synthetic */ ProfileListActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(ProfileListActivity profileListActivity) {
            if (profileListActivity != null) {
                this.b = profileListActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent build() {
            if (this.f5512a == null) {
                this.f5512a = new ProfileListActivityModule();
            }
            v.a(this.b, ProfileListActivity.class);
            return new ProfileListActivitySubcomponentImpl(this.f5512a, this.b, (AnonymousClass1) null);
        }
    }

    public final class ProfileListActivitySubcomponentImpl implements ContributeActivityModule_ContributeProfileListActivityInjector.ProfileListActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<ProfileListActivity> f5513a;
        public a<ProfileListViewModelImpl> b;
        public a<ProfileListViewModel> c;

        public /* synthetic */ ProfileListActivitySubcomponentImpl(ProfileListActivityModule profileListActivityModule, ProfileListActivity profileListActivity, AnonymousClass1 r11) {
            this.f5513a = d.a(profileListActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new ProfileListViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.W);
            this.c = b.a(new ProfileListActivityModule_ProvideViewModelFactory(profileListActivityModule, this.f5513a, this.b));
        }

        /* renamed from: a */
        public void inject(ProfileListActivity profileListActivity) {
            profileListActivity.v = DaggerAppComponent.this.b();
            profileListActivity.w = DaggerAppComponent.this.a();
            ProfileListActivity_MembersInjector.a(profileListActivity, this.c.get());
        }
    }

    public final class QuarterlyFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public QuarterlyFragmentModule f5515a;
        public QuarterlyFragment b;

        public /* synthetic */ QuarterlyFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(QuarterlyFragment quarterlyFragment) {
            if (quarterlyFragment != null) {
                this.b = quarterlyFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent build() {
            if (this.f5515a == null) {
                this.f5515a = new QuarterlyFragmentModule();
            }
            v.a(this.b, QuarterlyFragment.class);
            return new QuarterlyFragmentSubcomponentImpl(this.f5515a, this.b, (AnonymousClass1) null);
        }
    }

    public final class QuarterlyFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeQuarterlyFragmentInjector.QuarterlyFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<QuarterlyFragment> f5516a;
        public a<QuarterlyViewModelImpl> b;
        public a<QuarterlyViewModel> c;

        public /* synthetic */ QuarterlyFragmentSubcomponentImpl(QuarterlyFragmentModule quarterlyFragmentModule, QuarterlyFragment quarterlyFragment, AnonymousClass1 r12) {
            this.f5516a = d.a(quarterlyFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new QuarterlyViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.v1, daggerAppComponent.W);
            this.c = b.a(new QuarterlyFragmentModule_ProvideViewModelFactory(quarterlyFragmentModule, this.f5516a, this.b));
        }

        /* renamed from: a */
        public void inject(QuarterlyFragment quarterlyFragment) {
            quarterlyFragment.Z = DaggerAppComponent.this.b();
            QuarterlyFragment_MembersInjector.a(quarterlyFragment, this.c.get());
        }
    }

    public final class RemindersFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public RemindersFragmentModule f5518a;
        public RemindersFragment b;

        public /* synthetic */ RemindersFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(RemindersFragment remindersFragment) {
            if (remindersFragment != null) {
                this.b = remindersFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent build() {
            if (this.f5518a == null) {
                this.f5518a = new RemindersFragmentModule();
            }
            v.a(this.b, RemindersFragment.class);
            return new RemindersFragmentSubcomponentImpl(this.f5518a, this.b, (AnonymousClass1) null);
        }
    }

    public final class RemindersFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeRemindersFragmentInjector.RemindersFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<RemindersFragment> f5519a;
        public a<ArrayList<ReminderRepository>> b;
        public a<RemindersViewModelImpl> c;

        /* renamed from: d  reason: collision with root package name */
        public a<RemindersViewModel> f5520d;

        public /* synthetic */ RemindersFragmentSubcomponentImpl(RemindersFragmentModule remindersFragmentModule, RemindersFragment remindersFragment, AnonymousClass1 r12) {
            this.f5519a = d.a(remindersFragment);
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new RemindersFragmentModule_ProvideReminderRepositoriesFactory(remindersFragmentModule, daggerAppComponent.z1, daggerAppComponent.D1);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent2 = DaggerAppComponent.this;
            this.c = RemindersViewModelImpl_Factory.a(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent2.U, daggerAppComponent2.p0, daggerAppComponent2.o0, this.b, daggerAppComponent2.H0, daggerAppComponent2.W);
            this.f5520d = b.a(new RemindersFragmentModule_ProvideViewModelFactory(remindersFragmentModule, this.f5519a, this.c));
        }

        /* renamed from: a */
        public void inject(RemindersFragment remindersFragment) {
            remindersFragment.Z = DaggerAppComponent.this.b();
            RemindersFragment_MembersInjector.a(remindersFragment, this.f5520d.get());
        }
    }

    public final class RootedDeviceDetectedActivitySubcomponentBuilder extends ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public RootedDeviceDetectedActivityModule f5521a;
        public RootedDeviceDetectedActivity b;

        public /* synthetic */ RootedDeviceDetectedActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(RootedDeviceDetectedActivity rootedDeviceDetectedActivity) {
            if (rootedDeviceDetectedActivity != null) {
                this.b = rootedDeviceDetectedActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent build() {
            if (this.f5521a == null) {
                this.f5521a = new RootedDeviceDetectedActivityModule();
            }
            v.a(this.b, RootedDeviceDetectedActivity.class);
            return new RootedDeviceDetectedActivitySubcomponentImpl(this.f5521a, this.b, (AnonymousClass1) null);
        }
    }

    public final class RootedDeviceDetectedActivitySubcomponentImpl implements ContributeActivityModule_ContributeRootedDeviceDetectedActivityInjector.RootedDeviceDetectedActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<RootedDeviceDetectedActivity> f5522a;
        public a<RootedDeviceDetectedViewModelImpl> b = new RootedDeviceDetectedViewModelImpl_Factory(ObservableImpl_Factory.f6336a, ExecuteOnceUiCommandSource_Factory.f6335a, DaggerAppComponent.this.U);
        public a<RootedDeviceDetectedViewModel> c;

        public /* synthetic */ RootedDeviceDetectedActivitySubcomponentImpl(RootedDeviceDetectedActivityModule rootedDeviceDetectedActivityModule, RootedDeviceDetectedActivity rootedDeviceDetectedActivity, AnonymousClass1 r5) {
            this.f5522a = d.a(rootedDeviceDetectedActivity);
            this.c = b.a(new RootedDeviceDetectedActivityModule_ProvideViewModelFactory(rootedDeviceDetectedActivityModule, this.f5522a, this.b));
        }

        /* renamed from: a */
        public void inject(RootedDeviceDetectedActivity rootedDeviceDetectedActivity) {
            rootedDeviceDetectedActivity.v = DaggerAppComponent.this.b();
            rootedDeviceDetectedActivity.w = DaggerAppComponent.this.a();
            RootedDeviceDetectedActivity_MembersInjector.a(rootedDeviceDetectedActivity, this.c.get());
        }
    }

    public final class SettingsActivitySubcomponentBuilder extends ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public SettingsActivityModule f5524a;
        public SettingsActivity b;

        public /* synthetic */ SettingsActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(SettingsActivity settingsActivity) {
            if (settingsActivity != null) {
                this.b = settingsActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent build() {
            if (this.f5524a == null) {
                this.f5524a = new SettingsActivityModule();
            }
            v.a(this.b, SettingsActivity.class);
            return new SettingsActivitySubcomponentImpl(this.f5524a, this.b, (AnonymousClass1) null);
        }
    }

    public final class SettingsActivitySubcomponentImpl implements ContributeActivityModule_ContributeSettingsActivityInjector.SettingsActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<SettingsActivity> f5525a;
        public a<SettingsViewModelImpl> b;
        public a<SettingsViewModel> c;

        public /* synthetic */ SettingsActivitySubcomponentImpl(SettingsActivityModule settingsActivityModule, SettingsActivity settingsActivity, AnonymousClass1 r10) {
            this.f5525a = d.a(settingsActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new SettingsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.W0, daggerAppComponent.W);
            this.c = b.a(new SettingsActivityModule_ProvideViewModelFactory(settingsActivityModule, this.f5525a, this.b));
        }

        /* renamed from: a */
        public void inject(SettingsActivity settingsActivity) {
            settingsActivity.v = DaggerAppComponent.this.b();
            settingsActivity.w = DaggerAppComponent.this.a();
            SettingsActivity_MembersInjector.a(settingsActivity, this.c.get());
        }
    }

    public final class SplashActivitySubcomponentBuilder extends ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public SplashActivityModule f5527a;
        public SplashActivity b;

        public /* synthetic */ SplashActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(SplashActivity splashActivity) {
            if (splashActivity != null) {
                this.b = splashActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent build() {
            if (this.f5527a == null) {
                this.f5527a = new SplashActivityModule();
            }
            v.a(this.b, SplashActivity.class);
            return new SplashActivitySubcomponentImpl(this.f5527a, this.b, (AnonymousClass1) null);
        }
    }

    public final class SplashActivitySubcomponentImpl implements ContributeActivityModule_ContributeSplashActivityInjector.SplashActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<SplashActivity> f5528a;
        public a<SplashViewModelImpl> b;
        public a<SplashViewModel> c;

        public /* synthetic */ SplashActivitySubcomponentImpl(SplashActivityModule splashActivityModule, SplashActivity splashActivity, AnonymousClass1 r15) {
            this.f5528a = d.a(splashActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new SplashViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.o0, daggerAppComponent.c1, daggerAppComponent.X0, daggerAppComponent.d1, daggerAppComponent.f1, daggerAppComponent.Y, daggerAppComponent.W);
            this.c = b.a(new SplashActivityModule_ProvideViewModelFactory(splashActivityModule, this.f5528a, this.b));
        }

        /* renamed from: a */
        public void inject(SplashActivity splashActivity) {
            splashActivity.v = DaggerAppComponent.this.b();
            splashActivity.w = DaggerAppComponent.this.a();
            SplashActivity_MembersInjector.a(splashActivity, this.c.get());
        }
    }

    public final class SubjectDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public SubjectDetailActivityModule f5530a;
        public SubjectDetailActivity b;

        public /* synthetic */ SubjectDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(SubjectDetailActivity subjectDetailActivity) {
            if (subjectDetailActivity != null) {
                this.b = subjectDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent build() {
            if (this.f5530a == null) {
                this.f5530a = new SubjectDetailActivityModule();
            }
            v.a(this.b, SubjectDetailActivity.class);
            return new SubjectDetailActivitySubcomponentImpl(this.f5530a, this.b, (AnonymousClass1) null);
        }
    }

    public final class SubjectDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeSubjectDetailActivityInjector.SubjectDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<SubjectDetailActivity> f5531a;
        public a<SubjectDetailViewModelImpl> b;
        public a<SubjectDetailViewModel> c;

        public /* synthetic */ SubjectDetailActivitySubcomponentImpl(SubjectDetailActivityModule subjectDetailActivityModule, SubjectDetailActivity subjectDetailActivity, AnonymousClass1 r15) {
            this.f5531a = d.a(subjectDetailActivity);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            a<SystemExit> aVar = daggerAppComponent.U;
            a<AuthenticationService> aVar2 = daggerAppComponent.p0;
            a<ProfileRepository> aVar3 = daggerAppComponent.o0;
            a<Application> aVar4 = daggerAppComponent.W;
            a e = daggerAppComponent.r1;
            DaggerAppComponent daggerAppComponent2 = DaggerAppComponent.this;
            this.b = new SubjectDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, aVar, aVar2, aVar3, aVar4, e, daggerAppComponent2.H0, daggerAppComponent2.v1, daggerAppComponent2.u0);
            this.c = b.a(new SubjectDetailActivityModule_ProvideViewModelFactory(subjectDetailActivityModule, this.f5531a, this.b));
        }

        /* renamed from: a */
        public void inject(SubjectDetailActivity subjectDetailActivity) {
            subjectDetailActivity.v = DaggerAppComponent.this.b();
            subjectDetailActivity.w = DaggerAppComponent.this.a();
            SubjectDetailActivity_MembersInjector.a(subjectDetailActivity, this.c.get());
        }
    }

    public final class SubjectsFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public SubjectsFragmentModule f5533a;
        public SubjectsFragment b;

        public /* synthetic */ SubjectsFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(SubjectsFragment subjectsFragment) {
            if (subjectsFragment != null) {
                this.b = subjectsFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent build() {
            if (this.f5533a == null) {
                this.f5533a = new SubjectsFragmentModule();
            }
            v.a(this.b, SubjectsFragment.class);
            return new SubjectsFragmentSubcomponentImpl(this.f5533a, this.b, (AnonymousClass1) null);
        }
    }

    public final class SubjectsFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeSubjectsFragmentInjector.SubjectsFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<SubjectsFragment> f5534a;
        public a<SubjectsViewModelImpl> b;
        public a<SubjectsViewModel> c;

        public /* synthetic */ SubjectsFragmentSubcomponentImpl(SubjectsFragmentModule subjectsFragmentModule, SubjectsFragment subjectsFragment, AnonymousClass1 r11) {
            this.f5534a = d.a(subjectsFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new SubjectsViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.v1);
            this.c = b.a(new SubjectsFragmentModule_ProvideViewModelFactory(subjectsFragmentModule, this.f5534a, this.b));
        }

        /* renamed from: a */
        public void inject(SubjectsFragment subjectsFragment) {
            subjectsFragment.Z = DaggerAppComponent.this.b();
            SubjectsFragment_MembersInjector.a(subjectsFragment, this.c.get());
        }
    }

    public final class TimeTableFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public TimeTableFragmentModule f5536a;
        public TimeTableFragment b;

        public /* synthetic */ TimeTableFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(TimeTableFragment timeTableFragment) {
            if (timeTableFragment != null) {
                this.b = timeTableFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent build() {
            if (this.f5536a == null) {
                this.f5536a = new TimeTableFragmentModule();
            }
            v.a(this.b, TimeTableFragment.class);
            return new TimeTableFragmentSubcomponentImpl(this.f5536a, this.b, (AnonymousClass1) null);
        }
    }

    public final class TimeTableFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeTimeTableFragmentInjector.TimeTableFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<TimeTableFragment> f5537a;
        public a<TimeTableViewModelImpl> b;
        public a<TimeTableViewModel> c;

        public /* synthetic */ TimeTableFragmentSubcomponentImpl(TimeTableFragmentModule timeTableFragmentModule, TimeTableFragment timeTableFragment, AnonymousClass1 r11) {
            this.f5537a = d.a(timeTableFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.b = new TimeTableViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.o0, daggerAppComponent.J1);
            this.c = b.a(new TimeTableFragmentModule_ProvideViewModelFactory(timeTableFragmentModule, this.f5537a, this.b));
        }

        /* renamed from: a */
        public void inject(TimeTableFragment timeTableFragment) {
            timeTableFragment.Z = DaggerAppComponent.this.b();
            TimeTableFragment_MembersInjector.a(timeTableFragment, this.c.get());
        }
    }

    public final class TimeTableItemDetailActivitySubcomponentBuilder extends ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public TimeTableItemDetailActivityModule f5539a;
        public TimeTableItemDetailActivity b;

        public /* synthetic */ TimeTableItemDetailActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(TimeTableItemDetailActivity timeTableItemDetailActivity) {
            if (timeTableItemDetailActivity != null) {
                this.b = timeTableItemDetailActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent build() {
            if (this.f5539a == null) {
                this.f5539a = new TimeTableItemDetailActivityModule();
            }
            v.a(this.b, TimeTableItemDetailActivity.class);
            return new TimeTableItemDetailActivitySubcomponentImpl(this.f5539a, this.b, (AnonymousClass1) null);
        }
    }

    public final class TimeTableItemDetailActivitySubcomponentImpl implements ContributeActivityModule_ContributeLessonDetailActivityInjector.TimeTableItemDetailActivitySubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<TimeTableItemDetailActivity> f5540a;
        public a<c> b;
        public a<TimeTableItemDetailViewModelImpl> c;

        /* renamed from: d  reason: collision with root package name */
        public a<TimeTableItemDetailViewModel> f5541d;

        public /* synthetic */ TimeTableItemDetailActivitySubcomponentImpl(TimeTableItemDetailActivityModule timeTableItemDetailActivityModule, TimeTableItemDetailActivity timeTableItemDetailActivity, AnonymousClass1 r15) {
            this.f5540a = d.a(timeTableItemDetailActivity);
            this.b = new TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory(timeTableItemDetailActivityModule, this.f5540a);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent = DaggerAppComponent.this;
            this.c = new TimeTableItemDetailViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, daggerAppComponent.U, daggerAppComponent.p0, daggerAppComponent.W, daggerAppComponent.o0, daggerAppComponent.z1, daggerAppComponent.D1, daggerAppComponent.J1, this.b);
            this.f5541d = b.a(new TimeTableItemDetailActivityModule_ProvideViewModelFactory(timeTableItemDetailActivityModule, this.f5540a, this.c));
        }

        /* renamed from: a */
        public void inject(TimeTableItemDetailActivity timeTableItemDetailActivity) {
            timeTableItemDetailActivity.v = DaggerAppComponent.this.b();
            timeTableItemDetailActivity.w = DaggerAppComponent.this.a();
            TimeTableItemDetailActivity_MembersInjector.a(timeTableItemDetailActivity, this.f5541d.get());
        }
    }

    public final class TmgiFormActivitySubcomponentBuilder extends ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public TmgiFormActivity f5542a;

        public /* synthetic */ TmgiFormActivitySubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(TmgiFormActivity tmgiFormActivity) {
            if (tmgiFormActivity != null) {
                this.f5542a = tmgiFormActivity;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent build() {
            v.a(this.f5542a, TmgiFormActivity.class);
            return new TmgiFormActivitySubcomponentImpl(this.f5542a);
        }
    }

    public final class TmgiFormActivitySubcomponentImpl implements ContributeActivityModule_ContributeTgmiFormActivityInjector.TmgiFormActivitySubcomponent {
        public /* synthetic */ TmgiFormActivitySubcomponentImpl(TmgiFormActivity tmgiFormActivity) {
        }

        /* renamed from: a */
        public void inject(TmgiFormActivity tmgiFormActivity) {
            tmgiFormActivity.v = DaggerAppComponent.this.b();
            tmgiFormActivity.w = DaggerAppComponent.this.a();
        }
    }

    public final class TmgiFormFragmentSubcomponentBuilder extends ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public TmgiFormFragmentModule f5544a;
        public TmgiFormFragment b;

        public /* synthetic */ TmgiFormFragmentSubcomponentBuilder(AnonymousClass1 r2) {
        }

        /* renamed from: a */
        public void seedInstance(TmgiFormFragment tmgiFormFragment) {
            if (tmgiFormFragment != null) {
                this.b = tmgiFormFragment;
                return;
            }
            throw new NullPointerException();
        }

        public ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent build() {
            if (this.f5544a == null) {
                this.f5544a = new TmgiFormFragmentModule();
            }
            v.a(this.b, TmgiFormFragment.class);
            return new TmgiFormFragmentSubcomponentImpl(DaggerAppComponent.this, this.f5544a, this.b, (AnonymousClass1) null);
        }
    }

    public final class TmgiFormFragmentSubcomponentImpl implements ContributeFragmentModule_ContributeTmgiFormFragmentInjector.TmgiFormFragmentSubcomponent {

        /* renamed from: a  reason: collision with root package name */
        public a<TmgiFormFragment> f5545a;
        public a<TmgiFormViewModelImpl> b;
        public a<TmgiFormViewModel> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DaggerAppComponent f5546d;

        public /* synthetic */ TmgiFormFragmentSubcomponentImpl(DaggerAppComponent daggerAppComponent, TmgiFormFragmentModule tmgiFormFragmentModule, TmgiFormFragment tmgiFormFragment, AnonymousClass1 r20) {
            this.f5546d = daggerAppComponent;
            this.f5545a = d.a(tmgiFormFragment);
            ObservableImpl_Factory observableImpl_Factory = ObservableImpl_Factory.f6336a;
            ExecuteOnceUiCommandSource_Factory executeOnceUiCommandSource_Factory = ExecuteOnceUiCommandSource_Factory.f6335a;
            DaggerAppComponent daggerAppComponent2 = this.f5546d;
            a<SystemExit> aVar = daggerAppComponent2.U;
            a<AuthenticationService> aVar2 = daggerAppComponent2.p0;
            a a2 = daggerAppComponent2.e2;
            DaggerAppComponent daggerAppComponent3 = this.f5546d;
            this.b = new TmgiFormViewModelImpl_Factory(observableImpl_Factory, executeOnceUiCommandSource_Factory, aVar, aVar2, a2, daggerAppComponent3.u2, daggerAppComponent3.w2, daggerAppComponent3.o0, daggerAppComponent3.y2, daggerAppComponent3.a2, daggerAppComponent3.M1, daggerAppComponent3.Y1, daggerAppComponent3.H0);
            this.c = b.a(new TmgiFormFragmentModule_ProvideViewModelFactory(tmgiFormFragmentModule, this.f5545a, this.b));
        }

        /* renamed from: a */
        public void inject(TmgiFormFragment tmgiFormFragment) {
            tmgiFormFragment.Z = this.f5546d.b();
            TmgiFormFragment_MembersInjector.a(tmgiFormFragment, this.c.get());
        }
    }

    public /* synthetic */ DaggerAppComponent(AppModule appModule, eKretaApp ekretaapp, AnonymousClass1 r12) {
        this.V = d.a(ekretaapp);
        this.W = b.a(this.V);
        this.X = b.a(new AppModule_ProvideKeyStoreAdapterFactory(appModule, this.W));
        this.Y = b.a(new AppModule_ProvideSharedPreferencesFactory(appModule, this.W));
        this.Z = new RealmSecureStoreImpl_Factory(this.X, this.Y);
        this.a0 = b.a(this.Z);
        this.b0 = b.a(new AppModule_ProvideRealmConfigFactory(appModule, this.W, this.a0));
        this.c0 = new ProfileDaoImpl_Factory(this.b0);
        this.d0 = b.a(this.c0);
        this.e0 = new GuardianDaoImpl_Factory(this.b0);
        this.f0 = b.a(this.e0);
        this.g0 = new AppModule_ProvideGlobalMobileApiBaseUrlFactory(appModule);
        this.h0 = new AppModule_ProvideRetrofitBuilderFactory(appModule);
        this.i0 = b.a(new AppModule_ProvidePackageInfoFactory(appModule, this.W));
        this.j0 = b.a(new AppModule_ProvideAppVersionNameFactory(appModule, this.i0));
        this.k0 = b.a(new AppModule_ProvidesUserAgentStringFactory(appModule, this.i0, this.j0));
        this.l0 = new AppModule_ProvideOkHttpClientBuilderFactory(appModule, this.k0);
        this.m0 = new AppModule_ProvideIdpServiceUrlFactory(appModule);
        this.n0 = b.a(new AppModule_ProvideIdpFactory(appModule, this.m0, this.h0, this.l0));
        this.o0 = new i.d.a();
        this.p0 = new i.d.a();
        this.q0 = b.a(new AppModule_ProvideMobileApiV3Factory(appModule, this.l0, this.h0, this.p0));
        this.r0 = new SchoolYearCalendarDaoImpl_Factory(this.b0);
        this.s0 = b.a(this.r0);
        this.t0 = new SchoolYearCalendarRepositoryImpl_Factory(this.q0, this.s0);
        this.u0 = b.a(this.t0);
        this.v0 = new AppModule_ProvideEUgyintezesBasePointUrlFactory(appModule);
        this.w0 = b.a(new AppModule_ProvideEAdminApiFactory(appModule, this.v0, this.h0, this.l0, this.p0));
        this.x0 = new ProfileServiceImpl_Factory(this.q0, this.w0);
        this.y0 = b.a(this.x0);
        this.z0 = new GroupDaoImpl_Factory(this.b0);
        this.A0 = b.a(this.z0);
        this.B0 = new GroupRepositoryImpl_Factory(this.A0, this.y0);
        this.C0 = b.a(this.B0);
        this.D0 = new i.d.a();
        this.E0 = new i.d.a();
        this.F0 = new UpdateProfileStrategyImpl_Factory(this.o0, this.C0, this.D0, this.E0);
        this.G0 = b.a(this.F0);
        this.H0 = b.a(DateTimeFactoryImpl_Factory.f6308a);
        this.I0 = new AppModule_ProvideAuthorizedRolesFactory(appModule);
        this.J0 = new FirebaseContainerImpl_Factory(this.W);
        this.K0 = b.a(this.J0);
        this.L0 = new AuthenticationServiceImpl_Factory(this.n0, this.o0, this.u0, this.y0, this.G0, this.H0, this.I0, this.K0);
        i.d.a.a(this.p0, b.a(this.L0));
        this.M0 = b.a(new AppModule_ProvideGlobalMobileApiFactory(appModule, this.g0, this.h0, this.l0, this.p0));
        this.N0 = new NotificationDaoImpl_Factory(this.b0);
        this.O0 = b.a(this.N0);
        this.P0 = new AppModule_ProvideApiKeyFactory(appModule);
        this.Q0 = new NotificationRepositoryImpl_Factory(this.M0, this.O0, this.K0, this.P0);
        i.d.a.a(this.D0, b.a(this.Q0));
        this.R0 = new DeleteProfileStrategyImpl_Factory(this.D0, this.d0);
        i.d.a.a(this.E0, b.a(this.R0));
        this.S0 = new ProfileRepositoryImpl_Factory(this.d0, this.f0, this.E0);
        a(appModule);
    }

    public final Map<Class<?>, a<a.b<?>>> c() {
        LinkedHashMap c3 = v.c(46);
        c3.put(LoginActivity.class, this.f5351a);
        c3.put(InstitutePickerActivity.class, this.b);
        c3.put(SplashActivity.class, this.c);
        c3.put(MainActivity.class, this.f5352d);
        c3.put(ProfileListActivity.class, this.e);
        c3.put(ProfileDetailActivity.class, this.f);
        c3.put(SettingsActivity.class, this.f5353g);
        c3.put(SubjectDetailActivity.class, this.f5354h);
        c3.put(EvaluationDetailsActivity.class, this.f5355i);
        c3.put(TimeTableItemDetailActivity.class, this.f5356j);
        c3.put(MessageDetailActivity.class, this.f5357k);
        c3.put(NoteDetailsActivity.class, this.f5358l);
        c3.put(NoticeBoardItemDetailActivity.class, this.f5359m);
        c3.put(DailyOmissionsActivity.class, this.f5360n);
        c3.put(OmissionDetailActivity.class, this.f5361o);
        c3.put(HomeworkCommentFormActivity.class, this.f5362p);
        c3.put(ClassMasterActivity.class, this.f5363q);
        c3.put(HomeworkDetailActivity.class, this.r);
        c3.put(AnnouncedTestDetailActivity.class, this.s);
        c3.put(RootedDeviceDetectedActivity.class, this.t);
        c3.put(NotSupportedAppActivity.class, this.u);
        c3.put(CasesFragment.class, this.v);
        c3.put(CaseDetailsActivity.class, this.w);
        c3.put(TmgiFormActivity.class, this.x);
        c3.put(DecisionDetailActivity.class, this.y);
        c3.put(NewMessageActivity.class, this.z);
        c3.put(AddresseeSelectorActivity.class, this.A);
        c3.put(MoreFragment.class, this.B);
        c3.put(AveragesFragment.class, this.C);
        c3.put(SubjectsFragment.class, this.D);
        c3.put(HalfYearFragment.class, this.E);
        c3.put(EndOfYearFragment.class, this.F);
        c3.put(QuarterlyFragment.class, this.G);
        c3.put(TimeTableFragment.class, this.H);
        c3.put(NotesFragment.class, this.I);
        c3.put(RemindersFragment.class, this.J);
        c3.put(OmissionsPerDayFragment.class, this.K);
        c3.put(MessagesFragment.class, this.L);
        c3.put(NoticeBoardFragment.class, this.M);
        c3.put(HomeFragment.class, this.N);
        c3.put(AboutFragment.class, this.O);
        c3.put(HomeworksFragment.class, this.P);
        c3.put(AnnouncedTestsFragment.class, this.Q);
        c3.put(TmgiFormFragment.class, this.R);
        c3.put(ClassMastersFragment.class, this.S);
        c3.put(EllenorzoFirebaseMessagingService.class, this.T);
        if (c3.size() != 0) {
            return Collections.unmodifiableMap(c3);
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public void inject(eKretaApp ekretaapp) {
        v.a((i.c.b) ekretaapp, (DispatchingAndroidInjector<Activity>) new DispatchingAndroidInjector(c(), Collections.emptyMap()));
        v.b((i.c.b) ekretaapp, (DispatchingAndroidInjector<BroadcastReceiver>) new DispatchingAndroidInjector(c(), Collections.emptyMap()));
        v.d((i.c.b) ekretaapp, a());
        v.e((i.c.b) ekretaapp, (DispatchingAndroidInjector<Service>) new DispatchingAndroidInjector(c(), Collections.emptyMap()));
        v.c((i.c.b) ekretaapp, (DispatchingAndroidInjector<ContentProvider>) new DispatchingAndroidInjector(c(), Collections.emptyMap()));
        v.a((i.c.b) ekretaapp);
        v.a((i.c.h.b) ekretaapp, b());
    }

    public final DispatchingAndroidInjector<Fragment> b() {
        return new DispatchingAndroidInjector<>(c(), Collections.emptyMap());
    }

    public final DispatchingAndroidInjector<android.app.Fragment> a() {
        return new DispatchingAndroidInjector<>(c(), Collections.emptyMap());
    }

    public final void a(AppModule appModule) {
        i.d.a.a(this.o0, b.a(this.S0));
        this.T0 = new InstituteRepositoryImpl_Factory(this.M0, this.P0);
        this.U0 = b.a(this.T0);
        this.V0 = b.a(new AppModule_ProvideAppVersionCodeFactory(appModule, this.i0));
        this.W0 = new AppModule_ProvideAppVersionNumberFactory(appModule, this.j0, this.V0);
        this.X0 = new ConfigurationProvider_Factory(this.j0, this.V0);
        this.Y0 = new PowerSaverCheckerImpl_Factory(this.W, this.Y, this.X0);
        this.Z0 = b.a(this.Y0);
        this.a1 = b.a(new AppModule_ProvideRootBeerFactory(appModule, this.W));
        this.b1 = new DetectRootedDeviceImpl_Factory(this.a1);
        this.c1 = b.a(this.b1);
        this.d1 = new AppModule_ProvideBuildConfigIsInDebugModeFactory(appModule);
        this.e1 = new RealmWrapperImpl_Factory(this.b0);
        this.f1 = b.a(this.e1);
        this.g1 = new OmissionDaoImpl_Factory(this.b0);
        this.h1 = b.a(this.g1);
        this.i1 = new OmissionRepositoryImpl_Factory(this.q0, this.h1);
        this.j1 = b.a(this.i1);
        this.k1 = new MessageDaoImpl_Factory(this.b0);
        this.l1 = b.a(this.k1);
        this.m1 = new MessageRepositoryImpl_Factory(this.w0, this.l1);
        this.n1 = b.a(this.m1);
        this.o1 = new SubjectDaoImpl_Factory(this.b0);
        this.p1 = b.a(this.o1);
        this.q1 = new SubjectsRepositoryImpl_Factory(this.q0, this.p1, this.o0, this.C0);
        this.r1 = b.a(this.q1);
        this.s1 = new EvaluationDaoImpl_Factory(this.b0);
        this.t1 = b.a(this.s1);
        this.u1 = new EvaluationRepositoryImpl_Factory(this.q0, this.t1);
        this.v1 = b.a(this.u1);
        this.w1 = new HomeworkDaoImpl_Factory(this.b0);
        this.x1 = b.a(this.w1);
        this.y1 = new HomeworkRepositoryImpl_Factory(this.q0, this.H0, this.x1);
        this.z1 = b.a(this.y1);
        this.A1 = new AnnouncedTestDaoImpl_Factory(this.b0);
        this.B1 = b.a(this.A1);
        this.C1 = new AnnouncedTestRepositoryImpl_Factory(this.q0, this.B1, this.H0);
        this.D1 = b.a(this.C1);
        this.E1 = new TimeTableItemDaoImpl_Factory(this.b0);
        this.F1 = b.a(this.E1);
        this.G1 = new TimeTableItemServiceImpl_Factory(this.q0);
        this.H1 = b.a(this.G1);
        this.I1 = new TimeTableItemRepositoryImpl_Factory(this.F1, this.H1);
        this.J1 = b.a(this.I1);
        this.K1 = b.a(FileAdapterImpl_Factory.f5594a);
        this.L1 = new AttachmentServiceImpl_Factory(this.K1, this.w0);
        this.M1 = b.a(this.L1);
        this.N1 = new ClassMasterDaoImpl_Factory(this.b0);
        this.O1 = b.a(this.N1);
        this.P1 = new ClassMasterRepositoryImpl_Factory(this.O1, this.A0, this.q0);
        this.Q1 = b.a(this.P1);
        this.R1 = b.a(CaseFactoryImpl_Factory.f5146a);
        this.S1 = new CaseDaoImpl_Factory(this.b0, this.R1);
        this.T1 = b.a(this.S1);
        this.U1 = new CaseRepositoryImpl_Factory(this.w0, this.T1, this.R1);
        this.V1 = b.a(this.U1);
        this.W1 = new SignerRepositoryImpl_Factory(this.w0);
        this.X1 = b.a(this.W1);
        this.Y1 = b.a(new AppModule_ProvideContentResolverFactory(appModule, this.W));
        this.Z1 = new AttachmentRepositoryImpl_Factory(this.w0, this.q0);
        this.a2 = b.a(this.Z1);
        this.b2 = new DecisionRepositoryImpl_Factory(this.w0);
        this.c2 = b.a(this.b2);
        this.d2 = new CaseTypeRepositoryImpl_Factory(this.w0);
        this.e2 = b.a(this.d2);
        this.f2 = new NewMessageServiceImpl_Factory(this.w0);
        this.g2 = b.a(this.f2);
        this.h2 = new AddresseeSelectorServiceImpl_Factory(this.w0);
        this.i2 = b.a(this.h2);
        this.j2 = new NoteDaoImpl_Factory(this.b0);
        this.k2 = b.a(this.j2);
        this.l2 = new NotesRepositoryImpl_Factory(this.q0, this.k2);
        this.m2 = b.a(this.l2);
        this.n2 = new MessagesServiceImpl_Factory(this.w0);
        this.o2 = b.a(this.n2);
        this.p2 = new NoticeBoardItemDaoImpl_Factory(this.b0);
        this.q2 = b.a(this.p2);
        this.r2 = new NoticeBoardItemRepositoryImpl_Factory(this.q0, this.q2);
        this.s2 = b.a(this.r2);
        this.t2 = new TmgiCaseTypeRepositoryImpl_Factory(this.w0);
        this.u2 = b.a(this.t2);
        this.v2 = new ChildrenRepositoryImpl_Factory(this.w0);
        this.w2 = b.a(this.v2);
        this.x2 = new TmgiRepositoryImpl_Factory(this.w0);
        this.y2 = b.a(this.x2);
        this.z2 = b.a(new AppModule_ProvideNotificationManagerFactory(appModule, this.W));
        this.A2 = new NotificationStrategyImpl_Factory(this.o0, this.D0, this.W, this.z2, this.K0);
        this.B2 = b.a(this.A2);
    }
}
