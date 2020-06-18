package hu.ekreta.ellenorzo.subject.certificate.endofyear;

import h.w.v;
import i.d.c;
import l.a.a;

public final class EndOfYearFragmentModule_ProvideViewModelFactory implements c<EndOfYearViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final EndOfYearFragmentModule f6172a;
    public final a<EndOfYearFragment> b;
    public final a<EndOfYearViewModelImpl> c;

    public EndOfYearFragmentModule_ProvideViewModelFactory(EndOfYearFragmentModule endOfYearFragmentModule, a<EndOfYearFragment> aVar, a<EndOfYearViewModelImpl> aVar2) {
        this.f6172a = endOfYearFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public EndOfYearViewModel get() {
        EndOfYearViewModel a2 = this.f6172a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
