package hu.ekreta.ellenorzo.cases;

import h.w.v;
import i.d.c;
import l.a.a;

public final class CasesFragmentModule_ProvideViewModelFactory implements c<CasesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final CasesFragmentModule f5105a;
    public final a<CasesFragment> b;
    public final a<CasesViewModelImpl> c;

    public CasesFragmentModule_ProvideViewModelFactory(CasesFragmentModule casesFragmentModule, a<CasesFragment> aVar, a<CasesViewModelImpl> aVar2) {
        this.f5105a = casesFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public CasesViewModel get() {
        CasesViewModel a2 = this.f5105a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
