package hu.ekreta.ellenorzo.main.more;

import h.w.v;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.main.MainViewModelImpl;
import i.d.c;
import l.a.a;

public final class MoreFragmentModule_ProvideViewModelFactory implements c<MainViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final MoreFragmentModule f5752a;
    public final a<MoreFragment> b;
    public final a<MainViewModelImpl> c;

    public MoreFragmentModule_ProvideViewModelFactory(MoreFragmentModule moreFragmentModule, a<MoreFragment> aVar, a<MainViewModelImpl> aVar2) {
        this.f5752a = moreFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a2 = this.f5752a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
