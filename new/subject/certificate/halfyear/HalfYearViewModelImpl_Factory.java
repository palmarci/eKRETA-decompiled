package hu.ekreta.ellenorzo.subject.certificate.halfyear;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class HalfYearViewModelImpl_Factory implements c<HalfYearViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6178a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6179d;
    public final a<ProfileRepository> e;
    public final a<EvaluationRepository> f;

    public HalfYearViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<EvaluationRepository> aVar6) {
        this.f6178a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6179d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public HalfYearViewModelImpl get() {
        return new HalfYearViewModelImpl(this.f6178a.get(), this.b.get(), this.c.get(), this.f6179d.get(), this.e.get(), this.f.get());
    }
}
