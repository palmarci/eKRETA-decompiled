package hu.ekreta.ellenorzo.subject.averages;

import h.w.v;
import i.d.c;
import l.a.a;

public final class AveragesFragmentModule_ProvideViewModelFactory implements c<AveragesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final AveragesFragmentModule f6161a;
    public final a<AveragesFragment> b;
    public final a<AveragesViewModelImpl> c;

    public AveragesFragmentModule_ProvideViewModelFactory(AveragesFragmentModule averagesFragmentModule, a<AveragesFragment> aVar, a<AveragesViewModelImpl> aVar2) {
        this.f6161a = averagesFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public AveragesViewModel get() {
        AveragesViewModel a2 = this.f6161a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
