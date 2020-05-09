package p289hu.ekreta.ellenorzo.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p211h.p258l.C3707j;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.AnnouncedTestItem;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.EvaluationItem;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.HomeworkItem;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.NoteItem;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.OmissionItem;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.notes.Note;
import p289hu.ekreta.ellenorzo.notes.NotesRepository;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository;
import p289hu.ekreta.ellenorzo.omission.Omission;
import p289hu.ekreta.ellenorzo.omission.OmissionRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B_\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u001f\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0002\u00105JL\u00106\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 9*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010808 9*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 9*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010808\u0018\u000107072\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0016J\u0010\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0016JL\u0010@\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 9*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010808 9*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 9*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010808\u0018\u000107072\u0006\u0010:\u001a\u00020;H\u0002J1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bCJ1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bEJ1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bGJ1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bIJ1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bKJ1\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020807*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L08072\u0006\u0010:\u001a\u00020;H\u0003¢\u0006\u0002\bMR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006N"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/HomeViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/home/ListItem;", "Lhu/ekreta/ellenorzo/home/HomeViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "notesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "announcedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "homeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "noticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Lhu/ekreta/ellenorzo/notes/NotesRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;)V", "getAnnouncedTestRepository", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "getContext", "()Landroid/content/Context;", "dashboardElementUpdateFinished", "Landroidx/databinding/ObservableBoolean;", "getDashboardElementUpdateFinished", "()Landroidx/databinding/ObservableBoolean;", "getEvaluationRepository", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "getHomeworkRepository", "()Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "getNotesRepository", "()Lhu/ekreta/ellenorzo/notes/NotesRepository;", "getNoticeBoardItemRepository", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "getOmissionRepository", "()Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "getProfileRepository", "()Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "getUpdateMethodByDashboardItem", "Lio/reactivex/Completable;", "dashboardItem", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "readByUser", "", "(Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;Ljava/lang/Boolean;)Lio/reactivex/Completable;", "observeLocalData", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateDashboardItemReadStateToOppositeByItem", "updateLocalData", "toDashboardItem", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "AnnouncedTestToDashboardItem", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "EvaluationToDashboardItem", "Lhu/ekreta/ellenorzo/homework/Homework;", "HomeworkToDashboardItem", "Lhu/ekreta/ellenorzo/notes/Note;", "NoteToDashboardItem", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "NoticeBoardItemToDashboardItem", "Lhu/ekreta/ellenorzo/omission/Omission;", "OmissionToDashboardItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl extends AuthenticatedListViewModel<ListItem> implements HomeViewModel {

    /* renamed from: s */
    public final C3707j f13347s = new C3707j(false);

    /* renamed from: t */
    public final Context f13348t;

    /* renamed from: u */
    public final EvaluationRepository f13349u;

    /* renamed from: v */
    public final NotesRepository f13350v;

    /* renamed from: w */
    public final OmissionRepository f13351w;

    /* renamed from: x */
    public final AnnouncedTestRepository f13352x;

    /* renamed from: y */
    public final HomeworkRepository f13353y;

    /* renamed from: z */
    public final NoticeBoardItemRepository f13354z;

    public HomeViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, Context context, EvaluationRepository evaluationRepository, NotesRepository notesRepository, OmissionRepository omissionRepository, AnnouncedTestRepository announcedTestRepository, HomeworkRepository homeworkRepository, ProfileRepository profileRepository, NoticeBoardItemRepository noticeBoardItemRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(notesRepository, "notesRepository");
        Intrinsics.checkParameterIsNotNull(omissionRepository, "omissionRepository");
        Intrinsics.checkParameterIsNotNull(announcedTestRepository, "announcedTestRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "homeworkRepository");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(noticeBoardItemRepository, "noticeBoardItemRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f13348t = context;
        this.f13349u = evaluationRepository;
        this.f13350v = notesRepository;
        this.f13351w = omissionRepository;
        this.f13352x = announcedTestRepository;
        this.f13353y = homeworkRepository;
        this.f13354z = noticeBoardItemRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return C5027n.m16887a((Iterable<? extends C5030q<? extends T>>) CollectionsKt__CollectionsKt.listOf(((HomeViewModelImpl) this.receiver).mo12837b(((HomeViewModelImpl) this.receiver).f13349u.mo12735C(profile), profile), ((HomeViewModelImpl) this.receiver).mo12840d(((HomeViewModelImpl) this.receiver).f13350v.mo13637A(profile), profile), ((HomeViewModelImpl) this.receiver).mo12842f(((HomeViewModelImpl) this.receiver).f13351w.mo13969F(profile), profile), ((HomeViewModelImpl) this.receiver).mo12836a(((HomeViewModelImpl) this.receiver).f13352x.mo11404i(profile), profile), ((HomeViewModelImpl) this.receiver).mo12839c(((HomeViewModelImpl) this.receiver).f13353y.mo13014j(profile), profile), ((HomeViewModelImpl) this.receiver).mo12841e(((HomeViewModelImpl) this.receiver).f13354z.mo13709y(profile), profile)), (C4675h<? super Object[], ? extends R>) HomeViewModelImpl$observeLocalData$1.INSTANCE).mo17246g(HomeViewModelImpl$observeLocalData$2.INSTANCE);
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(HomeViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, C5027n<List<? extends ListItem>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ListItem>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return C5027n.m16895b((Iterable<? extends C5030q<? extends T>>) CollectionsKt__CollectionsKt.listOf(((HomeViewModelImpl) this.receiver).mo12837b(((HomeViewModelImpl) this.receiver).f13349u.mo12737m(profile), profile), ((HomeViewModelImpl) this.receiver).mo12840d(((HomeViewModelImpl) this.receiver).f13350v.mo13639x(profile), profile), ((HomeViewModelImpl) this.receiver).mo12842f(((HomeViewModelImpl) this.receiver).f13351w.mo13972v(profile), profile), ((HomeViewModelImpl) this.receiver).mo12836a(((HomeViewModelImpl) this.receiver).f13352x.mo11403h(profile), profile), ((HomeViewModelImpl) this.receiver).mo12839c(((HomeViewModelImpl) this.receiver).f13353y.mo13013g(profile), profile), ((HomeViewModelImpl) this.receiver).mo12841e(((HomeViewModelImpl) this.receiver).f13354z.mo13708t(profile), profile)));
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(HomeViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, null);
    }

    /* renamed from: Q1 */
    public final Context mo12834Q1() {
        return this.f13348t;
    }

    /* renamed from: a */
    public void mo12832a(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        DashboardItem dashboardItem = (DashboardItem) listItem;
        boolean z = false;
        mo12833b0().mo10529b(false);
        Boolean h = dashboardItem.mo12866h();
        if (h == null ? !dashboardItem.mo12863g() : !h.booleanValue()) {
            z = true;
        }
        C4667b a = mo12835a(dashboardItem, Boolean.valueOf(z)).mo16975a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "getUpdateMethodByDashboa…dSchedulers.mainThread())");
        mo16413a(C4998b.m16838a(a, (Function1<? super Throwable, Unit>) new HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$3<Object,Unit>(this), (Function0<Unit>) new HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$2<Unit>(this)));
    }

    /* renamed from: b */
    public void onSelect(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        DashboardItem dashboardItem = (DashboardItem) listItem;
        mo16376b((Function1<? super Activity, ? extends Intent>) new HomeViewModelImpl$onSelect$1<Object,Object>(dashboardItem));
        mo16413a(C4998b.m16838a(mo12835a(dashboardItem, Boolean.valueOf(true)), (Function1<? super Throwable, Unit>) new HomeViewModelImpl$onSelect$3<Object,Unit>(this), (Function0<Unit>) new HomeViewModelImpl$onSelect$2<Unit>(this)));
    }

    /* renamed from: b0 */
    public C3707j mo12833b0() {
        return this.f13347s;
    }

    @JvmName(name = "HomeworkToDashboardItem")
    /* renamed from: c */
    public final C5027n<List<ListItem>> mo12839c(C5027n<List<Homework>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$5(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { homework ->\n      …)\n            }\n        }");
        return g;
    }

    @JvmName(name = "NoteToDashboardItem")
    /* renamed from: d */
    public final C5027n<List<ListItem>> mo12840d(C5027n<List<Note>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { notes ->\n         …)\n            }\n        }");
        return g;
    }

    @JvmName(name = "NoticeBoardItemToDashboardItem")
    /* renamed from: e */
    public final C5027n<List<ListItem>> mo12841e(C5027n<List<NoticeBoardItem>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$6(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { noticeBoardItem ->…)\n            }\n        }");
        return g;
    }

    @JvmName(name = "OmissionToDashboardItem")
    /* renamed from: f */
    public final C5027n<List<ListItem>> mo12842f(C5027n<List<Omission>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$3(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { omissions ->\n     …)\n            }\n        }");
        return g;
    }

    @JvmName(name = "EvaluationToDashboardItem")
    /* renamed from: b */
    public final C5027n<List<ListItem>> mo12837b(C5027n<List<Evaluation>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { evaluations ->\n   …)\n            }\n        }");
        return g;
    }

    /* renamed from: a */
    public final C4667b mo12835a(DashboardItem dashboardItem, Boolean bool) {
        DashboardItem dashboardItem2 = dashboardItem;
        if (dashboardItem2 instanceof EvaluationItem) {
            C4667b e = this.f13349u.mo12736a(Evaluation.copy$default(((EvaluationItem) dashboardItem2).mo12876j(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool, null, null, 0, 31457279, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e, "evaluationRepository.upd…        .ignoreElements()");
            return e;
        } else if (dashboardItem2 instanceof OmissionItem) {
            C4667b e2 = this.f13351w.mo13970a(Omission.copy$default(((OmissionItem) dashboardItem2).mo12896j(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool, 1048575, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "omissionRepository.updat…        .ignoreElements()");
            return e2;
        } else if (dashboardItem2 instanceof NoteItem) {
            C4667b e3 = this.f13350v.mo13638a(Note.copy$default(((NoteItem) dashboardItem2).mo12886j(), null, null, null, null, null, null, null, null, null, null, null, bool, 2047, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "notesRepository.updateNo…        .ignoreElements()");
            return e3;
        } else if (dashboardItem2 instanceof AnnouncedTestItem) {
            C4667b e4 = this.f13352x.mo11402a(AnnouncedTest.copy$default(((AnnouncedTestItem) dashboardItem2).mo12871j(), null, null, 0, null, null, null, null, null, null, null, bool, null, 3071, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "announcedTestRepository.…        .ignoreElements()");
            return e4;
        } else if (dashboardItem2 instanceof HomeworkItem) {
            C4667b e5 = this.f13353y.mo13010a(Homework.copy$default(((HomeworkItem) dashboardItem2).mo12881j(), null, null, null, null, false, null, null, null, null, false, bool, null, 3071, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "homeworkRepository.updat…        .ignoreElements()");
            return e5;
        } else if (dashboardItem2 instanceof DashboardItem.NoticeBoardItem) {
            C4667b e6 = this.f13354z.mo13707a(NoticeBoardItem.copy$default(((DashboardItem.NoticeBoardItem) dashboardItem2).mo12891j(), null, null, null, null, null, null, bool, 63, null)).mo17241e();
            Intrinsics.checkExpressionValueIsNotNull(e6, "noticeBoardItemRepositor…        .ignoreElements()");
            return e6;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmName(name = "AnnouncedTestToDashboardItem")
    /* renamed from: a */
    public final C5027n<List<ListItem>> mo12836a(C5027n<List<AnnouncedTest>> nVar, Profile profile) {
        C5027n<List<ListItem>> g = nVar.mo17246g(new HomeViewModelImpl$toDashboardItem$4(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "map { announcedTests ->\n…)\n            }\n        }");
        return g;
    }
}
