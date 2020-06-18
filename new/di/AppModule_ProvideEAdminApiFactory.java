package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;
import m.y;
import p.o;

public final class AppModule_ProvideEAdminApiFactory implements c<EAdminApi> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5328a;
    public final a<String> b;
    public final a<o.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<y.b> f5329d;
    public final a<AuthenticationService> e;

    public AppModule_ProvideEAdminApiFactory(AppModule appModule, a<String> aVar, a<o.b> aVar2, a<y.b> aVar3, a<AuthenticationService> aVar4) {
        this.f5328a = appModule;
        this.b = aVar;
        this.c = aVar2;
        this.f5329d = aVar3;
        this.e = aVar4;
    }

    public EAdminApi get() {
        EAdminApi a2 = this.f5328a.a(this.b.get(), this.c.get(), this.f5329d.get(), this.e);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
