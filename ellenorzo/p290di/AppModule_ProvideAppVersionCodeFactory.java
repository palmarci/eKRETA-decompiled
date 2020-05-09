package p289hu.ekreta.ellenorzo.p290di;

import android.content.pm.PackageInfo;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideAppVersionCodeFactory */
public final class AppModule_ProvideAppVersionCodeFactory implements C4463c<Long> {

    /* renamed from: a */
    public final AppModule f12568a;

    /* renamed from: b */
    public final C5431a<PackageInfo> f12569b;

    public AppModule_ProvideAppVersionCodeFactory(AppModule appModule, C5431a<PackageInfo> aVar) {
        this.f12568a = appModule;
        this.f12569b = aVar;
    }

    public Long get() {
        return Long.valueOf(this.f12568a.mo12446a((PackageInfo) this.f12569b.get()));
    }
}
