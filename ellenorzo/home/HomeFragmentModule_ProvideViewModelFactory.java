package p289hu.ekreta.ellenorzo.home;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.home.HomeFragmentModule_ProvideViewModelFactory */
public final class HomeFragmentModule_ProvideViewModelFactory implements C4463c<HomeViewModel> {

    /* renamed from: a */
    public final HomeFragmentModule f13342a;

    /* renamed from: b */
    public final C5431a<HomeFragment> f13343b;

    /* renamed from: c */
    public final C5431a<HomeViewModelImpl> f13344c;

    public HomeFragmentModule_ProvideViewModelFactory(HomeFragmentModule homeFragmentModule, C5431a<HomeFragment> aVar, C5431a<HomeViewModelImpl> aVar2) {
        this.f13342a = homeFragmentModule;
        this.f13343b = aVar;
        this.f13344c = aVar2;
    }

    public HomeViewModel get() {
        HomeViewModel a = this.f13342a.mo12829a((HomeFragment) this.f13343b.get(), this.f13344c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
