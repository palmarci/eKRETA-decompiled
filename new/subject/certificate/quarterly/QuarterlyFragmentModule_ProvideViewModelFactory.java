package hu.ekreta.ellenorzo.subject.certificate.quarterly;

import h.w.v;
import i.d.c;
import l.a.a;

public final class QuarterlyFragmentModule_ProvideViewModelFactory implements c<QuarterlyViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final QuarterlyFragmentModule f6180a;
    public final a<QuarterlyFragment> b;
    public final a<QuarterlyViewModelImpl> c;

    public QuarterlyFragmentModule_ProvideViewModelFactory(QuarterlyFragmentModule quarterlyFragmentModule, a<QuarterlyFragment> aVar, a<QuarterlyViewModelImpl> aVar2) {
        this.f6180a = quarterlyFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public QuarterlyViewModel get() {
        QuarterlyViewModel a2 = this.f6180a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
