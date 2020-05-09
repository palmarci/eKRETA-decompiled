package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5581y.C5583b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideOkHttpClientBuilderFactory */
public final class AppModule_ProvideOkHttpClientBuilderFactory implements C4463c<C5583b> {

    /* renamed from: a */
    public final AppModule f12606a;

    /* renamed from: b */
    public final C5431a<String> f12607b;

    public AppModule_ProvideOkHttpClientBuilderFactory(AppModule appModule, C5431a<String> aVar) {
        this.f12606a = appModule;
        this.f12607b = aVar;
    }

    public C5583b get() {
        C5583b a = this.f12606a.mo12455a((String) this.f12607b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
