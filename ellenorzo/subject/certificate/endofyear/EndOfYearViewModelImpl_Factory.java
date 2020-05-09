package p289hu.ekreta.ellenorzo.subject.certificate.endofyear;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearViewModelImpl_Factory */
public final class EndOfYearViewModelImpl_Factory implements C4463c<EndOfYearViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14960a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14961b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14962c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14963d;

    /* renamed from: e */
    public final C5431a<EvaluationRepository> f14964e;

    public EndOfYearViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<EvaluationRepository> aVar5) {
        this.f14960a = aVar;
        this.f14961b = aVar2;
        this.f14962c = aVar3;
        this.f14963d = aVar4;
        this.f14964e = aVar5;
    }

    public EndOfYearViewModelImpl get() {
        EndOfYearViewModelImpl endOfYearViewModelImpl = new EndOfYearViewModelImpl((ObservableImpl) this.f14960a.get(), (ExecuteOnceUiCommandSource) this.f14961b.get(), (AuthenticationService) this.f14962c.get(), (ProfileRepository) this.f14963d.get(), (EvaluationRepository) this.f14964e.get());
        return endOfYearViewModelImpl;
    }
}
