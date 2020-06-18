package hu.ekreta.ellenorzo.di;

import android.content.Context;
import android.content.pm.PackageInfo;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvidePackageInfoFactory implements c<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5344a;
    public final a<Context> b;

    public AppModule_ProvidePackageInfoFactory(AppModule appModule, a<Context> aVar) {
        this.f5344a = appModule;
        this.b = aVar;
    }

    public PackageInfo get() {
        PackageInfo d2 = this.f5344a.d(this.b.get());
        v.b(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
