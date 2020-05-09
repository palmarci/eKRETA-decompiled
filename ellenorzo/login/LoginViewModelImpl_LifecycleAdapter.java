package p289hu.ekreta.ellenorzo.login;

import p211h.p271p.C3807e;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3818m;
import p211h.p271p.C3823q;

/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl_LifecycleAdapter */
public class LoginViewModelImpl_LifecycleAdapter implements C3807e {

    /* renamed from: a */
    public final LoginViewModelImpl f13679a;

    public LoginViewModelImpl_LifecycleAdapter(LoginViewModelImpl loginViewModelImpl) {
        this.f13679a = loginViewModelImpl;
    }

    /* renamed from: a */
    public void mo10805a(C3818m mVar, C3811a aVar, boolean z, C3823q qVar) {
        boolean z2 = qVar != null;
        if (!z && aVar == C3811a.ON_CREATE && (!z2 || qVar.mo10816a("checkPowerSaverMode", 1))) {
            this.f13679a.checkPowerSaverMode();
        }
    }
}
