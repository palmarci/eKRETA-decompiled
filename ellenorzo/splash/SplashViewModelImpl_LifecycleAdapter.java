package p289hu.ekreta.ellenorzo.splash;

import p211h.p271p.C3807e;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3818m;
import p211h.p271p.C3823q;

/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl_LifecycleAdapter */
public class SplashViewModelImpl_LifecycleAdapter implements C3807e {

    /* renamed from: a */
    public final SplashViewModelImpl f14826a;

    public SplashViewModelImpl_LifecycleAdapter(SplashViewModelImpl splashViewModelImpl) {
        this.f14826a = splashViewModelImpl;
    }

    /* renamed from: a */
    public void mo10805a(C3818m mVar, C3811a aVar, boolean z, C3823q qVar) {
        boolean z2 = qVar != null;
        if (!z && aVar == C3811a.ON_RESUME && (!z2 || qVar.mo10816a("loginOrNavigateForward", 1))) {
            this.f14826a.loginOrNavigateForward();
        }
    }
}
