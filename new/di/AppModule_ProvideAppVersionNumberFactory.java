package hu.ekreta.ellenorzo.di;

import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideAppVersionNumberFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5324a;
    public final a<String> b;
    public final a<Long> c;

    public AppModule_ProvideAppVersionNumberFactory(AppModule appModule, a<String> aVar, a<Long> aVar2) {
        this.f5324a = appModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public String get() {
        String a2 = this.f5324a.a(this.b.get(), this.c.get().longValue());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
