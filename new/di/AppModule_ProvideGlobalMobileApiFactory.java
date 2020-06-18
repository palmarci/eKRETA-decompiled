package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import i.d.c;
import l.a.a;
import m.y;
import p.o;

public final class AppModule_ProvideGlobalMobileApiFactory implements c<GlobalMobileApi> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5333a;
    public final a<String> b;
    public final a<o.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<y.b> f5334d;
    public final a<AuthenticationService> e;

    public AppModule_ProvideGlobalMobileApiFactory(AppModule appModule, a<String> aVar, a<o.b> aVar2, a<y.b> aVar3, a<AuthenticationService> aVar4) {
        this.f5333a = appModule;
        this.b = aVar;
        this.c = aVar2;
        this.f5334d = aVar3;
        this.e = aVar4;
    }

    public GlobalMobileApi get() {
        GlobalMobileApi b2 = this.f5333a.b(this.b.get(), this.c.get(), this.f5334d.get(), this.e);
        v.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
