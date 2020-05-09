package p289hu.ekreta.ellenorzo.subject.certificate.quarterly;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragmentModule_ProvideViewModelFactory */
public final class QuarterlyFragmentModule_ProvideViewModelFactory implements C4463c<QuarterlyViewModel> {

    /* renamed from: a */
    public final QuarterlyFragmentModule f14982a;

    /* renamed from: b */
    public final C5431a<QuarterlyFragment> f14983b;

    /* renamed from: c */
    public final C5431a<QuarterlyViewModelImpl> f14984c;

    public QuarterlyFragmentModule_ProvideViewModelFactory(QuarterlyFragmentModule quarterlyFragmentModule, C5431a<QuarterlyFragment> aVar, C5431a<QuarterlyViewModelImpl> aVar2) {
        this.f14982a = quarterlyFragmentModule;
        this.f14983b = aVar;
        this.f14984c = aVar2;
    }

    public QuarterlyViewModel get() {
        QuarterlyViewModel a = this.f14982a.mo15857a((QuarterlyFragment) this.f14983b.get(), this.f14984c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
