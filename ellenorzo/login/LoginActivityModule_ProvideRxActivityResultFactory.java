package p289hu.ekreta.ellenorzo.login;

import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.login.LoginActivityModule_ProvideRxActivityResultFactory */
public final class LoginActivityModule_ProvideRxActivityResultFactory implements C4463c<C2676c> {

    /* renamed from: a */
    public final LoginActivityModule f13620a;

    /* renamed from: b */
    public final C5431a<C3737d> f13621b;

    public LoginActivityModule_ProvideRxActivityResultFactory(LoginActivityModule loginActivityModule, C5431a<C3737d> aVar) {
        this.f13620a = loginActivityModule;
        this.f13621b = aVar;
    }

    public C2676c get() {
        C2676c a = this.f13620a.mo13101a((C3737d) this.f13621b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
