package hu.ekreta.ellenorzo.di;

import android.content.Context;
import android.content.SharedPreferences;
import h.w.v;
import i.d.c;
import l.a.a;

public final class AppModule_ProvideSharedPreferencesFactory implements c<SharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5348a;
    public final a<Context> b;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, a<Context> aVar) {
        this.f5348a = appModule;
        this.b = aVar;
    }

    public SharedPreferences get() {
        SharedPreferences f = this.f5348a.f(this.b.get());
        v.b(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
