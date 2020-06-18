package hu.ekreta.ellenorzo.home;

import android.content.Context;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.notes.NotesRepository;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class HomeViewModelImpl_Factory implements c<HomeViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5624a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5625d;
    public final a<Context> e;
    public final a<EvaluationRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<NotesRepository> f5626g;

    /* renamed from: h  reason: collision with root package name */
    public final a<OmissionRepository> f5627h;

    /* renamed from: i  reason: collision with root package name */
    public final a<AnnouncedTestRepository> f5628i;

    /* renamed from: j  reason: collision with root package name */
    public final a<HomeworkRepository> f5629j;

    /* renamed from: k  reason: collision with root package name */
    public final a<ProfileRepository> f5630k;

    /* renamed from: l  reason: collision with root package name */
    public final a<NoticeBoardItemRepository> f5631l;

    public HomeViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<EvaluationRepository> aVar6, a<NotesRepository> aVar7, a<OmissionRepository> aVar8, a<AnnouncedTestRepository> aVar9, a<HomeworkRepository> aVar10, a<ProfileRepository> aVar11, a<NoticeBoardItemRepository> aVar12) {
        this.f5624a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5625d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5626g = aVar7;
        this.f5627h = aVar8;
        this.f5628i = aVar9;
        this.f5629j = aVar10;
        this.f5630k = aVar11;
        this.f5631l = aVar12;
    }

    public HomeViewModelImpl get() {
        return new HomeViewModelImpl(this.f5624a.get(), this.b.get(), this.c.get(), this.f5625d.get(), this.e.get(), this.f.get(), this.f5626g.get(), this.f5627h.get(), this.f5628i.get(), this.f5629j.get(), this.f5630k.get(), this.f5631l.get());
    }
}
