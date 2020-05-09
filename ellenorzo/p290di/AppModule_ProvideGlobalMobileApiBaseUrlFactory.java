package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideGlobalMobileApiBaseUrlFactory */
public final class AppModule_ProvideGlobalMobileApiBaseUrlFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12586a;

    public AppModule_ProvideGlobalMobileApiBaseUrlFactory(AppModule appModule) {
        this.f12586a = appModule;
    }

    public String get() {
        String f = this.f12586a.mo12468f();
        C3984v.m10272b(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
