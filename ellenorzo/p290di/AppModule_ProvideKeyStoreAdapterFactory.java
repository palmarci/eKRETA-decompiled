package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.secure.KeyStoreAdapter;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideKeyStoreAdapterFactory */
public final class AppModule_ProvideKeyStoreAdapterFactory implements C4463c<KeyStoreAdapter> {

    /* renamed from: a */
    public final AppModule f12598a;

    /* renamed from: b */
    public final C5431a<Context> f12599b;

    public AppModule_ProvideKeyStoreAdapterFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12598a = appModule;
        this.f12599b = aVar;
    }

    public KeyStoreAdapter get() {
        KeyStoreAdapter b = this.f12598a.mo12457b((Context) this.f12599b.get());
        C3984v.m10272b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
