package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideApiKeyFactory */
public final class AppModule_ProvideApiKeyFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12567a;

    public AppModule_ProvideApiKeyFactory(AppModule appModule) {
        this.f12567a = appModule;
    }

    public String get() {
        String a = this.f12567a.mo12451a();
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
