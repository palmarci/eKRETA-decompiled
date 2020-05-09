package p289hu.ekreta.ellenorzo.subject;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsViewModelImpl_Factory */
public final class SubjectsViewModelImpl_Factory implements C4463c<SubjectsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14893a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14894b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14895c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14896d;

    /* renamed from: e */
    public final C5431a<EvaluationRepository> f14897e;

    public SubjectsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<EvaluationRepository> aVar5) {
        this.f14893a = aVar;
        this.f14894b = aVar2;
        this.f14895c = aVar3;
        this.f14896d = aVar4;
        this.f14897e = aVar5;
    }

    public SubjectsViewModelImpl get() {
        SubjectsViewModelImpl subjectsViewModelImpl = new SubjectsViewModelImpl((ObservableImpl) this.f14893a.get(), (ExecuteOnceUiCommandSource) this.f14894b.get(), (AuthenticationService) this.f14895c.get(), (ProfileRepository) this.f14896d.get(), (EvaluationRepository) this.f14897e.get());
        return subjectsViewModelImpl;
    }
}
