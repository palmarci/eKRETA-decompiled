package p289hu.ekreta.ellenorzo.main;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.main.MainActivityModule_ProvideViewModelFactory */
public final class MainActivityModule_ProvideViewModelFactory implements C4463c<MainViewModel> {

    /* renamed from: a */
    public final MainActivityModule f13693a;

    /* renamed from: b */
    public final C5431a<MainActivity> f13694b;

    /* renamed from: c */
    public final C5431a<MainViewModelImpl> f13695c;

    public MainActivityModule_ProvideViewModelFactory(MainActivityModule mainActivityModule, C5431a<MainActivity> aVar, C5431a<MainViewModelImpl> aVar2) {
        this.f13693a = mainActivityModule;
        this.f13694b = aVar;
        this.f13695c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a = this.f13693a.mo13166a((MainActivity) this.f13694b.get(), this.f13695c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
