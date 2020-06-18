package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;
import l.a.a;
import m.y;

public final class AppModule_ProvideOkHttpClientBuilderFactory implements c<y.b> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5343a;
    public final a<String> b;

    public AppModule_ProvideOkHttpClientBuilderFactory(AppModule appModule, a<String> aVar) {
        this.f5343a = appModule;
        this.b = aVar;
    }

    public y.b get() {
        y.b a2 = this.f5343a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
