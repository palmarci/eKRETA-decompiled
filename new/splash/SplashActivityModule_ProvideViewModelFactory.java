package hu.ekreta.ellenorzo.splash;

import h.w.v;
import i.d.c;
import l.a.a;

public final class SplashActivityModule_ProvideViewModelFactory implements c<SplashViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final SplashActivityModule f6113a;
    public final a<SplashActivity> b;
    public final a<SplashViewModelImpl> c;

    public SplashActivityModule_ProvideViewModelFactory(SplashActivityModule splashActivityModule, a<SplashActivity> aVar, a<SplashViewModelImpl> aVar2) {
        this.f6113a = splashActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public SplashViewModel get() {
        SplashViewModel a2 = this.f6113a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
