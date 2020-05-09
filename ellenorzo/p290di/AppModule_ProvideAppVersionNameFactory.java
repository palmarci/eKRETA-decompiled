package p289hu.ekreta.ellenorzo.p290di;

import android.content.pm.PackageInfo;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideAppVersionNameFactory */
public final class AppModule_ProvideAppVersionNameFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12570a;

    /* renamed from: b */
    public final C5431a<PackageInfo> f12571b;

    public AppModule_ProvideAppVersionNameFactory(AppModule appModule, C5431a<PackageInfo> aVar) {
        this.f12570a = appModule;
        this.f12571b = aVar;
    }

    public String get() {
        String b = this.f12570a.mo12458b((PackageInfo) this.f12571b.get());
        C3984v.m10272b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
