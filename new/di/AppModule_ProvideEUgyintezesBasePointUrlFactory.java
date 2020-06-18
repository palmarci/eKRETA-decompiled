package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;

public final class AppModule_ProvideEUgyintezesBasePointUrlFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5330a;

    public AppModule_ProvideEUgyintezesBasePointUrlFactory(AppModule appModule) {
        this.f5330a = appModule;
    }

    public String get() {
        String d2 = this.f5330a.d();
        v.b(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
