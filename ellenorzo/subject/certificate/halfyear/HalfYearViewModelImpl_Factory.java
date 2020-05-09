package p289hu.ekreta.ellenorzo.subject.certificate.halfyear;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearViewModelImpl_Factory */
public final class HalfYearViewModelImpl_Factory implements C4463c<HalfYearViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14974a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14975b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14976c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14977d;

    /* renamed from: e */
    public final C5431a<EvaluationRepository> f14978e;

    public HalfYearViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<EvaluationRepository> aVar5) {
        this.f14974a = aVar;
        this.f14975b = aVar2;
        this.f14976c = aVar3;
        this.f14977d = aVar4;
        this.f14978e = aVar5;
    }

    public HalfYearViewModelImpl get() {
        HalfYearViewModelImpl halfYearViewModelImpl = new HalfYearViewModelImpl((ObservableImpl) this.f14974a.get(), (ExecuteOnceUiCommandSource) this.f14975b.get(), (AuthenticationService) this.f14976c.get(), (ProfileRepository) this.f14977d.get(), (EvaluationRepository) this.f14978e.get());
        return halfYearViewModelImpl;
    }
}
