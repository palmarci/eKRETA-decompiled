package hu.ekreta.ellenorzo.di;

import i.d.c;
import m.v;

public final class AppModule_ProvideGeneralInterceptorFactory implements c<v> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5331a;

    public v get() {
        v e = this.f5331a.e();
        h.w.v.b(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
