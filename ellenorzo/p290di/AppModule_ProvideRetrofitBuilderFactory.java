package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p380p.C5788o.C5790b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideRetrofitBuilderFactory */
public final class AppModule_ProvideRetrofitBuilderFactory implements C4463c<C5790b> {

    /* renamed from: a */
    public final AppModule f12613a;

    public AppModule_ProvideRetrofitBuilderFactory(AppModule appModule) {
        this.f12613a = appModule;
    }

    public C5790b get() {
        C5790b i = this.f12613a.mo12471i();
        C3984v.m10272b(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
