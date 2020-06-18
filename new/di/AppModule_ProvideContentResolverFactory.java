package hu.ekreta.ellenorzo.di;

import android.content.ContentResolver;
import android.content.Context;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideContentResolverFactory implements c<ContentResolver> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5327a;
    public final a<Context> b;

    public AppModule_ProvideContentResolverFactory(AppModule appModule, a<Context> aVar) {
        this.f5327a = appModule;
        this.b = aVar;
    }

    public ContentResolver get() {
        ContentResolver a2 = this.f5327a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
