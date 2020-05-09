package p289hu.ekreta.ellenorzo.cases.decision;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailActivityModule_ProvideViewModelFactory */
public final class DecisionDetailActivityModule_ProvideViewModelFactory implements C4463c<DecisionDetailViewModel> {

    /* renamed from: a */
    public final DecisionDetailActivityModule f11361a;

    /* renamed from: b */
    public final C5431a<DecisionDetailActivity> f11362b;

    /* renamed from: c */
    public final C5431a<DecisionDetailViewModelImpl> f11363c;

    public DecisionDetailActivityModule_ProvideViewModelFactory(DecisionDetailActivityModule decisionDetailActivityModule, C5431a<DecisionDetailActivity> aVar, C5431a<DecisionDetailViewModelImpl> aVar2) {
        this.f11361a = decisionDetailActivityModule;
        this.f11362b = aVar;
        this.f11363c = aVar2;
    }

    public DecisionDetailViewModel get() {
        DecisionDetailViewModel a = this.f11361a.mo11715a((DecisionDetailActivity) this.f11362b.get(), this.f11363c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
