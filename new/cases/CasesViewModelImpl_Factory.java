package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class CasesViewModelImpl_Factory implements c<CasesViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5107a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5108d;
    public final a<ProfileRepository> e;
    public final a<CaseRepository> f;

    public CasesViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<CaseRepository> aVar6) {
        this.f5107a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5108d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public CasesViewModelImpl get() {
        return new CasesViewModelImpl(this.f5107a.get(), this.b.get(), this.c.get(), this.f5108d.get(), this.e.get(), this.f.get());
    }
}
