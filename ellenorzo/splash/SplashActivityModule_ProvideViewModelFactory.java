package p289hu.ekreta.ellenorzo.splash;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.splash.SplashActivityModule_ProvideViewModelFactory */
public final class SplashActivityModule_ProvideViewModelFactory implements C4463c<SplashViewModel> {

    /* renamed from: a */
    public final SplashActivityModule f14794a;

    /* renamed from: b */
    public final C5431a<SplashActivity> f14795b;

    /* renamed from: c */
    public final C5431a<SplashViewModelImpl> f14796c;

    public SplashActivityModule_ProvideViewModelFactory(SplashActivityModule splashActivityModule, C5431a<SplashActivity> aVar, C5431a<SplashViewModelImpl> aVar2) {
        this.f14794a = splashActivityModule;
        this.f14795b = aVar;
        this.f14796c = aVar2;
    }

    public SplashViewModel get() {
        SplashViewModel a = this.f14794a.mo15666a((SplashActivity) this.f14795b.get(), this.f14796c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
