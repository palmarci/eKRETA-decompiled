package hu.ekreta.ellenorzo.di;

import android.content.Context;
import h.w.v;
import hu.ekreta.ellenorzo.secure.RealmSecureStore;
import i.d.c;
import k.c.c0;
import l.a.a;

public final class AppModule_ProvideRealmConfigFactory implements c<c0> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5345a;
    public final a<Context> b;
    public final a<RealmSecureStore> c;

    public AppModule_ProvideRealmConfigFactory(AppModule appModule, a<Context> aVar, a<RealmSecureStore> aVar2) {
        this.f5345a = appModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public c0 get() {
        c0 a2 = this.f5345a.a(this.b.get(), this.c.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
