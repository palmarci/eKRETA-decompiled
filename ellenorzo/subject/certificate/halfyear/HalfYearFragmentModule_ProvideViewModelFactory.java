package p289hu.ekreta.ellenorzo.subject.certificate.halfyear;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragmentModule_ProvideViewModelFactory */
public final class HalfYearFragmentModule_ProvideViewModelFactory implements C4463c<HalfYearViewModel> {

    /* renamed from: a */
    public final HalfYearFragmentModule f14968a;

    /* renamed from: b */
    public final C5431a<HalfYearFragment> f14969b;

    /* renamed from: c */
    public final C5431a<HalfYearViewModelImpl> f14970c;

    public HalfYearFragmentModule_ProvideViewModelFactory(HalfYearFragmentModule halfYearFragmentModule, C5431a<HalfYearFragment> aVar, C5431a<HalfYearViewModelImpl> aVar2) {
        this.f14968a = halfYearFragmentModule;
        this.f14969b = aVar;
        this.f14970c = aVar2;
    }

    public HalfYearViewModel get() {
        HalfYearViewModel a = this.f14968a.mo15848a((HalfYearFragment) this.f14969b.get(), this.f14970c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
