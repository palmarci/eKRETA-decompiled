package hu.ekreta.ellenorzo.main;

import h.w.v;
import i.d.c;
import l.a.a;

public final class MainActivityModule_ProvideViewModelFactory implements c<MainViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final MainActivityModule f5732a;
    public final a<MainActivity> b;
    public final a<MainViewModelImpl> c;

    public MainActivityModule_ProvideViewModelFactory(MainActivityModule mainActivityModule, a<MainActivity> aVar, a<MainViewModelImpl> aVar2) {
        this.f5732a = mainActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a2 = this.f5732a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
