package hu.ekreta.ellenorzo.login;

import h.m.d.d;
import h.w.v;
import i.d.c;
import l.a.a;

public final class LoginActivityModule_ProvideRxActivityResultFactory implements c<a.k.a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final LoginActivityModule f5711a;
    public final a<d> b;

    public LoginActivityModule_ProvideRxActivityResultFactory(LoginActivityModule loginActivityModule, a<d> aVar) {
        this.f5711a = loginActivityModule;
        this.b = aVar;
    }

    public a.k.a.c get() {
        a.k.a.c a2 = this.f5711a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
