package hu.ekreta.ellenorzo.subject.averages;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.subject.SubjectsRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class AveragesViewModelImpl_Factory implements c<AveragesViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6168a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6169d;
    public final a<ProfileRepository> e;
    public final a<SubjectsRepository> f;

    public AveragesViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<SubjectsRepository> aVar6) {
        this.f6168a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6169d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public AveragesViewModelImpl get() {
        return new AveragesViewModelImpl(this.f6168a.get(), this.b.get(), this.c.get(), this.f6169d.get(), this.e.get(), this.f.get());
    }
}
