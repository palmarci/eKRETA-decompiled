package hu.ekreta.ellenorzo.di;

import android.content.Context;
import h.w.v;
import hu.ekreta.ellenorzo.secure.KeyStoreAdapter;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideKeyStoreAdapterFactory implements c<KeyStoreAdapter> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5339a;
    public final a<Context> b;

    public AppModule_ProvideKeyStoreAdapterFactory(AppModule appModule, a<Context> aVar) {
        this.f5339a = appModule;
        this.b = aVar;
    }

    public KeyStoreAdapter get() {
        KeyStoreAdapter b2 = this.f5339a.b(this.b.get());
        v.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
