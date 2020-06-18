package hu.ekreta.ellenorzo.subject.certificate.halfyear;

import h.w.v;
import i.d.c;
import l.a.a;

public final class HalfYearFragmentModule_ProvideViewModelFactory implements c<HalfYearViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final HalfYearFragmentModule f6176a;
    public final a<HalfYearFragment> b;
    public final a<HalfYearViewModelImpl> c;

    public HalfYearFragmentModule_ProvideViewModelFactory(HalfYearFragmentModule halfYearFragmentModule, a<HalfYearFragment> aVar, a<HalfYearViewModelImpl> aVar2) {
        this.f6176a = halfYearFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public HalfYearViewModel get() {
        HalfYearViewModel a2 = this.f6176a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
