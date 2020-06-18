package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;

public final class AppModule_ProvideApiKeyFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5321a;

    public AppModule_ProvideApiKeyFactory(AppModule appModule) {
        this.f5321a = appModule;
    }

    public String get() {
        String a2 = this.f5321a.a();
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
