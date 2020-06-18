package hu.ekreta.ellenorzo.di;

import a.n.a.b;
import android.content.Context;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideRootBeerFactory implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5347a;
    public final a<Context> b;

    public AppModule_ProvideRootBeerFactory(AppModule appModule, a<Context> aVar) {
        this.f5347a = appModule;
        this.b = aVar;
    }

    public b get() {
        b e = this.f5347a.e(this.b.get());
        v.b(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
