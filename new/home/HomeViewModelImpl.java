package hu.ekreta.ellenorzo.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.l.j;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.notes.Note;
import hu.ekreta.ellenorzo.notes.NotesRepository;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import java.util.Calendar;
import java.util.List;
import k.b.b;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bg\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u001f\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0002\u00107JL\u00108\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 ;*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010:0: ;*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 ;*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010:0:\u0018\u000109092\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0002H\u0016J\u0010\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0002H\u0016JL\u0010B\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 ;*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010:0: ;*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 ;*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010:0:\u0018\u000109092\u0006\u0010<\u001a\u00020=H\u0002J1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bEJ1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bGJ1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bIJ1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bKJ1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bMJ1\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:09*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0:092\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\bOR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006P"}, d2 = {"Lhu/ekreta/ellenorzo/home/HomeViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/home/ListItem;", "Lhu/ekreta/ellenorzo/home/HomeViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "notesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "announcedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "homeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "noticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Lhu/ekreta/ellenorzo/notes/NotesRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;)V", "getAnnouncedTestRepository", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "getContext", "()Landroid/content/Context;", "dashboardElementUpdateFinished", "Landroidx/databinding/ObservableBoolean;", "getDashboardElementUpdateFinished", "()Landroidx/databinding/ObservableBoolean;", "getEvaluationRepository", "()Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "getHomeworkRepository", "()Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "getNotesRepository", "()Lhu/ekreta/ellenorzo/notes/NotesRepository;", "getNoticeBoardItemRepository", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "getOmissionRepository", "()Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "getProfileRepository", "()Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "getUpdateMethodByDashboardItem", "Lio/reactivex/Completable;", "dashboardItem", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "readByUser", "", "(Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;Ljava/lang/Boolean;)Lio/reactivex/Completable;", "observeLocalData", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "onSelect", "", "item", "updateDashboardItemReadStateToOppositeByItem", "updateLocalData", "toDashboardItem", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "AnnouncedTestToDashboardItem", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "EvaluationToDashboardItem", "Lhu/ekreta/ellenorzo/homework/Homework;", "HomeworkToDashboardItem", "Lhu/ekreta/ellenorzo/notes/Note;", "NoteToDashboardItem", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "NoticeBoardItemToDashboardItem", "Lhu/ekreta/ellenorzo/omission/Omission;", "OmissionToDashboardItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl extends AuthenticatedListViewModel<ListItem> implements HomeViewModel {
    public final NoticeBoardItemRepository A;
    public final j t = new j(false);
    public final Context u;
    public final EvaluationRepository v;
    public final NotesRepository w;
    public final OmissionRepository x;
    public final AnnouncedTestRepository y;
    public final HomeworkRepository z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HomeViewModelImpl(hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl r15, hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource r16, hu.ekreta.ellenorzo.util.systemexit.SystemExit r17, hu.ekreta.ellenorzo.authentication.AuthenticationService r18, android.content.Context r19, hu.ekreta.ellenorzo.evaluation.EvaluationRepository r20, hu.ekreta.ellenorzo.notes.NotesRepository r21, hu.ekreta.ellenorzo.omission.OmissionRepository r22, hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository r23, hu.ekreta.ellenorzo.homework.HomeworkRepository r24, hu.ekreta.ellenorzo.profile.ProfileRepository r25, hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository r26) {
        /*
            r14 = this;
            r6 = r14
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r26
            java.lang.String r0 = "observable"
            r1 = r15
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            java.lang.String r0 = "uiCommandSource"
            r2 = r16
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "systemExit"
            r3 = r17
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "authenticationService"
            r4 = r18
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "evaluationRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "notesRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "omissionRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "announcedTestRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "homeworkRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "profileRepository"
            r5 = r25
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "noticeBoardItemRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.u = r7
            r6.v = r8
            r6.w = r9
            r6.x = r10
            r6.y = r11
            r6.z = r12
            r6.A = r13
            h.l.j r0 = new h.l.j
            r1 = 0
            r0.<init>(r1)
            r6.t = r0
            hu.ekreta.ellenorzo.home.HomeViewModelImpl$1 r0 = new hu.ekreta.ellenorzo.home.HomeViewModelImpl$1
            r0.<init>(r14)
            hu.ekreta.ellenorzo.home.HomeViewModelImpl$2 r1 = new hu.ekreta.ellenorzo.home.HomeViewModelImpl$2
            r1.<init>(r14)
            r2 = 0
            r3 = 4
            r4 = 0
            r15 = r14
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel.start$default(r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.home.HomeViewModelImpl.<init>(hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl, hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource, hu.ekreta.ellenorzo.util.systemexit.SystemExit, hu.ekreta.ellenorzo.authentication.AuthenticationService, android.content.Context, hu.ekreta.ellenorzo.evaluation.EvaluationRepository, hu.ekreta.ellenorzo.notes.NotesRepository, hu.ekreta.ellenorzo.omission.OmissionRepository, hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository, hu.ekreta.ellenorzo.homework.HomeworkRepository, hu.ekreta.ellenorzo.profile.ProfileRepository, hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository):void");
    }

    public void a(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        ListItem.DashboardItem dashboardItem = (ListItem.DashboardItem) listItem;
        boolean z2 = false;
        b0().c(false);
        Boolean h2 = dashboardItem.h();
        if (h2 == null ? !dashboardItem.g() : !h2.booleanValue()) {
            z2 = true;
        }
        b a2 = a(dashboardItem, Boolean.valueOf(z2)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "getUpdateMethodByDashboa…dSchedulers.mainThread())");
        a(k.b.f0.b.a(a2, (Function1<? super Throwable, Unit>) new HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$3(this), (Function0<Unit>) new HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$2(this)));
    }

    public final Context a2() {
        return this.u;
    }

    /* renamed from: b */
    public void onSelect(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        ListItem.DashboardItem dashboardItem = (ListItem.DashboardItem) listItem;
        b((Function1<? super Activity, ? extends Intent>) new HomeViewModelImpl$onSelect$1(dashboardItem));
        a(k.b.f0.b.a(a(dashboardItem, (Boolean) true), (Function1<? super Throwable, Unit>) new HomeViewModelImpl$onSelect$3(this), (Function0<Unit>) new HomeViewModelImpl$onSelect$2(this)));
    }

    public j b0() {
        return this.t;
    }

    @JvmName(name = "HomeworkToDashboardItem")
    public final n<List<ListItem>> c(n<List<Homework>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$5(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { homework ->\n      …)\n            }\n        }");
        return g2;
    }

    @JvmName(name = "NoteToDashboardItem")
    public final n<List<ListItem>> d(n<List<Note>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { notes ->\n         …)\n            }\n        }");
        return g2;
    }

    @JvmName(name = "NoticeBoardItemToDashboardItem")
    public final n<List<ListItem>> e(n<List<NoticeBoardItem>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$6(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { noticeBoardItem ->…)\n            }\n        }");
        return g2;
    }

    @JvmName(name = "OmissionToDashboardItem")
    public final n<List<ListItem>> f(n<List<Omission>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$3(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { omissions ->\n     …)\n            }\n        }");
        return g2;
    }

    @JvmName(name = "EvaluationToDashboardItem")
    public final n<List<ListItem>> b(n<List<Evaluation>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { evaluations ->\n   …)\n            }\n        }");
        return g2;
    }

    public final b a(ListItem.DashboardItem dashboardItem, Boolean bool) {
        ListItem.DashboardItem dashboardItem2 = dashboardItem;
        if (dashboardItem2 instanceof ListItem.DashboardItem.EvaluationItem) {
            b e = this.v.a(Evaluation.copy$default(((ListItem.DashboardItem.EvaluationItem) dashboardItem2).j(), (String) null, (String) null, (String) null, (String) null, (String) null, (Evaluation.Type) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Calendar) null, (String) null, (Calendar) null, (Calendar) null, (Evaluation.FormType) null, bool, (String) null, (String) null, 0, 31457279, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e, "evaluationRepository.upd…        .ignoreElements()");
            return e;
        } else if (dashboardItem2 instanceof ListItem.DashboardItem.OmissionItem) {
            b e2 = this.x.a(Omission.copy$default(((ListItem.DashboardItem.OmissionItem) dashboardItem2).j(), (String) null, (String) null, (Omission.Type) null, (String) null, (String) null, (String) null, (String) null, (Omission.LessonType) null, (String) null, (Integer) null, (String) null, (Calendar) null, (Calendar) null, (Integer) null, (Calendar) null, (Omission.JustificationState) null, (String) null, (String) null, (Calendar) null, (String) null, bool, 1048575, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "omissionRepository.updat…        .ignoreElements()");
            return e2;
        } else if (dashboardItem2 instanceof ListItem.DashboardItem.NoteItem) {
            b e3 = this.w.a(Note.copy$default(((ListItem.DashboardItem.NoteItem) dashboardItem2).j(), (String) null, (String) null, (String) null, (String) null, (String) null, (Calendar) null, (String) null, (Calendar) null, (Calendar) null, (String) null, (String) null, bool, 2047, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "notesRepository.updateNo…        .ignoreElements()");
            return e3;
        } else if (dashboardItem2 instanceof ListItem.DashboardItem.AnnouncedTestItem) {
            b e4 = this.y.a(AnnouncedTest.copy$default(((ListItem.DashboardItem.AnnouncedTestItem) dashboardItem2).j(), (String) null, (Calendar) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (Calendar) null, (String) null, bool, (String) null, 3071, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e4, "announcedTestRepository.…        .ignoreElements()");
            return e4;
        } else if (dashboardItem2 instanceof ListItem.DashboardItem.HomeworkItem) {
            b e5 = this.z.a(Homework.copy$default(((ListItem.DashboardItem.HomeworkItem) dashboardItem2).j(), (String) null, (String) null, (String) null, (String) null, false, (String) null, (Calendar) null, (Calendar) null, (Calendar) null, false, false, bool, (String) null, 6143, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e5, "homeworkRepository.updat…        .ignoreElements()");
            return e5;
        } else if (dashboardItem2 instanceof ListItem.DashboardItem.NoticeBoardItem) {
            b e6 = this.A.a(NoticeBoardItem.copy$default(((ListItem.DashboardItem.NoticeBoardItem) dashboardItem2).j(), (String) null, (Calendar) null, (Calendar) null, (String) null, (String) null, (String) null, bool, 63, (Object) null)).e();
            Intrinsics.checkExpressionValueIsNotNull(e6, "noticeBoardItemRepositor…        .ignoreElements()");
            return e6;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmName(name = "AnnouncedTestToDashboardItem")
    public final n<List<ListItem>> a(n<List<AnnouncedTest>> nVar, Profile profile) {
        n<R> g2 = nVar.g(new HomeViewModelImpl$toDashboardItem$4(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "map { announcedTests ->\n…)\n            }\n        }");
        return g2;
    }
}
