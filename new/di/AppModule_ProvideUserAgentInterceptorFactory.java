package hu.ekreta.ellenorzo.di;

import i.d.c;
import l.a.a;
import m.v;

public final class AppModule_ProvideUserAgentInterceptorFactory implements c<v> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5349a;
    public final a<String> b;

    public v get() {
        v b2 = this.f5349a.b(this.b.get());
        h.w.v.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
