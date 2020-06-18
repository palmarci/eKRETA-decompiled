package hu.ekreta.ellenorzo.di;

import android.content.Context;
import h.i.e.m;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideNotificationManagerFactory implements c<m> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5342a;
    public final a<Context> b;

    public AppModule_ProvideNotificationManagerFactory(AppModule appModule, a<Context> aVar) {
        this.f5342a = appModule;
        this.b = aVar;
    }

    public m get() {
        m c = this.f5342a.c(this.b.get());
        v.b(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
