package hu.ekreta.ellenorzo.splash;

import h.p.e;
import h.p.h;
import h.p.m;
import h.p.q;

public class SplashViewModelImpl_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    public final SplashViewModelImpl f6129a;

    public SplashViewModelImpl_LifecycleAdapter(SplashViewModelImpl splashViewModelImpl) {
        this.f6129a = splashViewModelImpl;
    }

    public void a(m mVar, h.a aVar, boolean z, q qVar) {
        boolean z2 = qVar != null;
        if (z || aVar != h.a.ON_RESUME) {
            return;
        }
        if (!z2 || qVar.a("loginOrNavigateForward", 1)) {
            this.f6129a.loginOrNavigateForward();
        }
    }
}
