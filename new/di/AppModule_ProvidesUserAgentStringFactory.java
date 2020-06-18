package hu.ekreta.ellenorzo.di;

import android.content.pm.PackageInfo;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvidesUserAgentStringFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5350a;
    public final a<PackageInfo> b;
    public final a<String> c;

    public AppModule_ProvidesUserAgentStringFactory(AppModule appModule, a<PackageInfo> aVar, a<String> aVar2) {
        this.f5350a = appModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public String get() {
        String a2 = this.f5350a.a(this.b.get(), this.c.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
