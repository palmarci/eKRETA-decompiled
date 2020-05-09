package p289hu.ekreta.ellenorzo.subject.certificate.endofyear;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragmentModule_ProvideViewModelFactory */
public final class EndOfYearFragmentModule_ProvideViewModelFactory implements C4463c<EndOfYearViewModel> {

    /* renamed from: a */
    public final EndOfYearFragmentModule f14954a;

    /* renamed from: b */
    public final C5431a<EndOfYearFragment> f14955b;

    /* renamed from: c */
    public final C5431a<EndOfYearViewModelImpl> f14956c;

    public EndOfYearFragmentModule_ProvideViewModelFactory(EndOfYearFragmentModule endOfYearFragmentModule, C5431a<EndOfYearFragment> aVar, C5431a<EndOfYearViewModelImpl> aVar2) {
        this.f14954a = endOfYearFragmentModule;
        this.f14955b = aVar;
        this.f14956c = aVar2;
    }

    public EndOfYearViewModel get() {
        EndOfYearViewModel a = this.f14954a.mo15839a((EndOfYearFragment) this.f14955b.get(), this.f14956c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
