package p289hu.ekreta.ellenorzo.p290di;

import android.content.ContentResolver;
import android.content.Context;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideContentResolverFactory */
public final class AppModule_ProvideContentResolverFactory implements C4463c<ContentResolver> {

    /* renamed from: a */
    public final AppModule f12577a;

    /* renamed from: b */
    public final C5431a<Context> f12578b;

    public AppModule_ProvideContentResolverFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12577a = appModule;
        this.f12578b = aVar;
    }

    public ContentResolver get() {
        ContentResolver a = this.f12577a.mo12447a((Context) this.f12578b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
