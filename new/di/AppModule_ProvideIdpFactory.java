package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.rest.Idp;
import i.d.c;
import l.a.a;
import m.y;
import p.o;

public final class AppModule_ProvideIdpFactory implements c<Idp> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5336a;
    public final a<String> b;
    public final a<o.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<y.b> f5337d;

    public AppModule_ProvideIdpFactory(AppModule appModule, a<String> aVar, a<o.b> aVar2, a<y.b> aVar3) {
        this.f5336a = appModule;
        this.b = aVar;
        this.c = aVar2;
        this.f5337d = aVar3;
    }

    public Idp get() {
        Idp a2 = this.f5336a.a(this.b.get(), this.c.get(), this.f5337d.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
