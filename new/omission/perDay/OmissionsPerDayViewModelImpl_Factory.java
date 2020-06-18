package hu.ekreta.ellenorzo.omission.perDay;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class OmissionsPerDayViewModelImpl_Factory implements c<OmissionsPerDayViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5992a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5993d;
    public final a<ProfileRepository> e;
    public final a<OmissionRepository> f;

    public OmissionsPerDayViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<OmissionRepository> aVar6) {
        this.f5992a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5993d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public OmissionsPerDayViewModelImpl get() {
        return new OmissionsPerDayViewModelImpl(this.f5992a.get(), this.b.get(), this.c.get(), this.f5993d.get(), this.e.get(), this.f.get());
    }
}
