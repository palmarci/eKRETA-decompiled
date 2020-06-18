package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;

public final class AppModule_ProvideGlobalMobileApiBaseUrlFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5332a;

    public AppModule_ProvideGlobalMobileApiBaseUrlFactory(AppModule appModule) {
        this.f5332a = appModule;
    }

    public String get() {
        String f = this.f5332a.f();
        v.b(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
