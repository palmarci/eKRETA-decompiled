package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;
import p.o;

public final class AppModule_ProvideRetrofitBuilderFactory implements c<o.b> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5346a;

    public AppModule_ProvideRetrofitBuilderFactory(AppModule appModule) {
        this.f5346a = appModule;
    }

    public o.b get() {
        o.b i2 = this.f5346a.i();
        v.b(i2, "Cannot return null from a non-@Nullable @Provides method");
        return i2;
    }
}
