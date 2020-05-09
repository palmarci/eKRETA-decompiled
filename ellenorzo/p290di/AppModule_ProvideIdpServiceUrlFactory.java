package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideIdpServiceUrlFactory */
public final class AppModule_ProvideIdpServiceUrlFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12597a;

    public AppModule_ProvideIdpServiceUrlFactory(AppModule appModule) {
        this.f12597a = appModule;
    }

    public String get() {
        String h = this.f12597a.mo12470h();
        C3984v.m10272b(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
