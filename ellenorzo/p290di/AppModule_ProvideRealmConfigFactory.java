package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.secure.RealmSecureStore;
import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideRealmConfigFactory */
public final class AppModule_ProvideRealmConfigFactory implements C4463c<C5061c0> {

    /* renamed from: a */
    public final AppModule f12610a;

    /* renamed from: b */
    public final C5431a<Context> f12611b;

    /* renamed from: c */
    public final C5431a<RealmSecureStore> f12612c;

    public AppModule_ProvideRealmConfigFactory(AppModule appModule, C5431a<Context> aVar, C5431a<RealmSecureStore> aVar2) {
        this.f12610a = appModule;
        this.f12611b = aVar;
        this.f12612c = aVar2;
    }

    public C5061c0 get() {
        C5061c0 a = this.f12610a.mo12454a((Context) this.f12611b.get(), (RealmSecureStore) this.f12612c.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
