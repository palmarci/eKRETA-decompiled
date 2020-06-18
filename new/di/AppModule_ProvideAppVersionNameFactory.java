package hu.ekreta.ellenorzo.di;

import android.content.pm.PackageInfo;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideAppVersionNameFactory implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5323a;
    public final a<PackageInfo> b;

    public AppModule_ProvideAppVersionNameFactory(AppModule appModule, a<PackageInfo> aVar) {
        this.f5323a = appModule;
        this.b = aVar;
    }

    public String get() {
        String b2 = this.f5323a.b(this.b.get());
        v.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
