package hu.ekreta.ellenorzo.profile.detail;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class ProfileDetailViewModelImpl_Factory implements c<ProfileDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6044a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6045d;
    public final a<ProfileRepository> e;

    public ProfileDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5) {
        this.f6044a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6045d = aVar4;
        this.e = aVar5;
    }

    public ProfileDetailViewModelImpl get() {
        return new ProfileDetailViewModelImpl(this.f6044a.get(), this.b.get(), this.c.get(), this.f6045d.get(), this.e.get());
    }
}
