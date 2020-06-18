package hu.ekreta.ellenorzo.home;

import h.w.v;
import i.d.c;
import l.a.a;

public final class HomeFragmentModule_ProvideViewModelFactory implements c<HomeViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final HomeFragmentModule f5622a;
    public final a<HomeFragment> b;
    public final a<HomeViewModelImpl> c;

    public HomeFragmentModule_ProvideViewModelFactory(HomeFragmentModule homeFragmentModule, a<HomeFragment> aVar, a<HomeViewModelImpl> aVar2) {
        this.f5622a = homeFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public HomeViewModel get() {
        HomeViewModel a2 = this.f5622a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
