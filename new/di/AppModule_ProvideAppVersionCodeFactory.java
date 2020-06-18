package hu.ekreta.ellenorzo.di;

import android.content.pm.PackageInfo;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideAppVersionCodeFactory implements c<Long> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5322a;
    public final a<PackageInfo> b;

    public AppModule_ProvideAppVersionCodeFactory(AppModule appModule, a<PackageInfo> aVar) {
        this.f5322a = appModule;
        this.b = aVar;
    }

    public Long get() {
        return Long.valueOf(this.f5322a.a(this.b.get()));
    }
}
