package hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class QuarterlyViewModelImpl_Factory implements c<QuarterlyViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6183a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6184d;
    public final a<ProfileRepository> e;
    public final a<EvaluationRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Context> f6185g;

    public QuarterlyViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<EvaluationRepository> aVar6, a<Context> aVar7) {
        this.f6183a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6184d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f6185g = aVar7;
    }

    public QuarterlyViewModelImpl get() {
        return new QuarterlyViewModelImpl(this.f6183a.get(), this.b.get(), this.c.get(), this.f6184d.get(), this.e.get(), this.f.get(), this.f6185g.get());
    }
}
