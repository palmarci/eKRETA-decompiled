package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;
import m.y;
import p.o;

public final class AppModule_ProvideMobileApiV3Factory implements c<MobileApiV3> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5340a;
    public final a<y.b> b;
    public final a<o.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5341d;

    public AppModule_ProvideMobileApiV3Factory(AppModule appModule, a<y.b> aVar, a<o.b> aVar2, a<AuthenticationService> aVar3) {
        this.f5340a = appModule;
        this.b = aVar;
        this.c = aVar2;
        this.f5341d = aVar3;
    }

    public MobileApiV3 get() {
        MobileApiV3 a2 = this.f5340a.a(this.b.get(), this.c.get(), this.f5341d);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
