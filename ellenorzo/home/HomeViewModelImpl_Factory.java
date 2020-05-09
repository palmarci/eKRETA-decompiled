package p289hu.ekreta.ellenorzo.home;

import android.content.Context;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.notes.NotesRepository;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepository;
import p289hu.ekreta.ellenorzo.omission.OmissionRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl_Factory */
public final class HomeViewModelImpl_Factory implements C4463c<HomeViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13372a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13373b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f13374c;

    /* renamed from: d */
    public final C5431a<Context> f13375d;

    /* renamed from: e */
    public final C5431a<EvaluationRepository> f13376e;

    /* renamed from: f */
    public final C5431a<NotesRepository> f13377f;

    /* renamed from: g */
    public final C5431a<OmissionRepository> f13378g;

    /* renamed from: h */
    public final C5431a<AnnouncedTestRepository> f13379h;

    /* renamed from: i */
    public final C5431a<HomeworkRepository> f13380i;

    /* renamed from: j */
    public final C5431a<ProfileRepository> f13381j;

    /* renamed from: k */
    public final C5431a<NoticeBoardItemRepository> f13382k;

    public HomeViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<EvaluationRepository> aVar5, C5431a<NotesRepository> aVar6, C5431a<OmissionRepository> aVar7, C5431a<AnnouncedTestRepository> aVar8, C5431a<HomeworkRepository> aVar9, C5431a<ProfileRepository> aVar10, C5431a<NoticeBoardItemRepository> aVar11) {
        this.f13372a = aVar;
        this.f13373b = aVar2;
        this.f13374c = aVar3;
        this.f13375d = aVar4;
        this.f13376e = aVar5;
        this.f13377f = aVar6;
        this.f13378g = aVar7;
        this.f13379h = aVar8;
        this.f13380i = aVar9;
        this.f13381j = aVar10;
        this.f13382k = aVar11;
    }

    public HomeViewModelImpl get() {
        HomeViewModelImpl homeViewModelImpl = new HomeViewModelImpl((ObservableImpl) this.f13372a.get(), (ExecuteOnceUiCommandSource) this.f13373b.get(), (AuthenticationService) this.f13374c.get(), (Context) this.f13375d.get(), (EvaluationRepository) this.f13376e.get(), (NotesRepository) this.f13377f.get(), (OmissionRepository) this.f13378g.get(), (AnnouncedTestRepository) this.f13379h.get(), (HomeworkRepository) this.f13380i.get(), (ProfileRepository) this.f13381j.get(), (NoticeBoardItemRepository) this.f13382k.get());
        return homeViewModelImpl;
    }
}
