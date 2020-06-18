package hu.ekreta.ellenorzo.evaluation;

import h.w.v;
import i.d.c;
import l.a.a;

public final class EvaluationDetailsActivityModule_ProvideViewModelFactory implements c<EvaluationDetailsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final EvaluationDetailsActivityModule f5568a;
    public final a<EvaluationDetailsActivity> b;
    public final a<EvaluationDetailsViewModelImpl> c;

    public EvaluationDetailsActivityModule_ProvideViewModelFactory(EvaluationDetailsActivityModule evaluationDetailsActivityModule, a<EvaluationDetailsActivity> aVar, a<EvaluationDetailsViewModelImpl> aVar2) {
        this.f5568a = evaluationDetailsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public EvaluationDetailsViewModel get() {
        EvaluationDetailsViewModel a2 = this.f5568a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
