package hu.ekreta.ellenorzo.cases.decision;

import h.w.v;
import i.d.c;
import l.a.a;

public final class DecisionDetailActivityModule_ProvideViewModelFactory implements c<DecisionDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final DecisionDetailActivityModule f5114a;
    public final a<DecisionDetailActivity> b;
    public final a<DecisionDetailViewModelImpl> c;

    public DecisionDetailActivityModule_ProvideViewModelFactory(DecisionDetailActivityModule decisionDetailActivityModule, a<DecisionDetailActivity> aVar, a<DecisionDetailViewModelImpl> aVar2) {
        this.f5114a = decisionDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public DecisionDetailViewModel get() {
        DecisionDetailViewModel a2 = this.f5114a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
