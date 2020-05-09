package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideEUgyintezesBasePointUrlFactory */
public final class AppModule_ProvideEUgyintezesBasePointUrlFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12584a;

    public AppModule_ProvideEUgyintezesBasePointUrlFactory(AppModule appModule) {
        this.f12584a = appModule;
    }

    public String get() {
        String d = this.f12584a.mo12464d();
        C3984v.m10272b(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
