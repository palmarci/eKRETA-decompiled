package p289hu.ekreta.ellenorzo.login;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.login.LoginActivityModule_ProvideViewModelFactory */
public final class LoginActivityModule_ProvideViewModelFactory implements C4463c<LoginViewModel> {

    /* renamed from: a */
    public final LoginActivityModule f13622a;

    /* renamed from: b */
    public final C5431a<LoginActivity> f13623b;

    /* renamed from: c */
    public final C5431a<LoginViewModelImpl> f13624c;

    public LoginActivityModule_ProvideViewModelFactory(LoginActivityModule loginActivityModule, C5431a<LoginActivity> aVar, C5431a<LoginViewModelImpl> aVar2) {
        this.f13622a = loginActivityModule;
        this.f13623b = aVar;
        this.f13624c = aVar2;
    }

    public LoginViewModel get() {
        LoginViewModel a = this.f13622a.mo13102a((LoginActivity) this.f13623b.get(), this.f13624c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
