package p289hu.ekreta.ellenorzo.cases;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.CasesViewModelImpl_Factory */
public final class CasesViewModelImpl_Factory implements C4463c<CasesViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11346a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11347b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11348c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f11349d;

    /* renamed from: e */
    public final C5431a<CaseRepository> f11350e;

    public CasesViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<CaseRepository> aVar5) {
        this.f11346a = aVar;
        this.f11347b = aVar2;
        this.f11348c = aVar3;
        this.f11349d = aVar4;
        this.f11350e = aVar5;
    }

    public CasesViewModelImpl get() {
        CasesViewModelImpl casesViewModelImpl = new CasesViewModelImpl((ObservableImpl) this.f11346a.get(), (ExecuteOnceUiCommandSource) this.f11347b.get(), (AuthenticationService) this.f11348c.get(), (ProfileRepository) this.f11349d.get(), (CaseRepository) this.f11350e.get());
        return casesViewModelImpl;
    }
}
