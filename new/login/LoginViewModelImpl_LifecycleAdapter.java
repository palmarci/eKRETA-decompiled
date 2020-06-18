package hu.ekreta.ellenorzo.login;

import h.p.e;
import h.p.h;
import h.p.m;
import h.p.q;

public class LoginViewModelImpl_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    public final LoginViewModelImpl f5729a;

    public LoginViewModelImpl_LifecycleAdapter(LoginViewModelImpl loginViewModelImpl) {
        this.f5729a = loginViewModelImpl;
    }

    public void a(m mVar, h.a aVar, boolean z, q qVar) {
        boolean z2 = qVar != null;
        if (!z) {
            if (aVar == h.a.ON_START) {
                if (!z2 || qVar.a("onStartActivity", 1)) {
                    this.f5729a.onStartActivity();
                }
            } else if (aVar != h.a.ON_CREATE) {
            } else {
                if (!z2 || qVar.a("checkPowerSaverMode", 1)) {
                    this.f5729a.checkPowerSaverMode();
                }
            }
        }
    }
}
