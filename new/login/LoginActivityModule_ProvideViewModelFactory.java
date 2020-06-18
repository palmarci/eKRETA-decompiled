package hu.ekreta.ellenorzo.login;

import h.w.v;
import i.d.c;
import l.a.a;

public final class LoginActivityModule_ProvideViewModelFactory implements c<LoginViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final LoginActivityModule f5712a;
    public final a<LoginActivity> b;
    public final a<LoginViewModelImpl> c;

    public LoginActivityModule_ProvideViewModelFactory(LoginActivityModule loginActivityModule, a<LoginActivity> aVar, a<LoginViewModelImpl> aVar2) {
        this.f5712a = loginActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public LoginViewModel get() {
        LoginViewModel a2 = this.f5712a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
