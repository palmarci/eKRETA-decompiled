package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;

public final class AppModule_ProvideIdpServiceUrlFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5338a;

    public AppModule_ProvideIdpServiceUrlFactory(AppModule appModule) {
        this.f5338a = appModule;
    }

    public String get() {
        String h2 = this.f5338a.h();
        v.b(h2, "Cannot return null from a non-@Nullable @Provides method");
        return h2;
    }
}
