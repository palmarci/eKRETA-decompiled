package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import android.content.SharedPreferences;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideSharedPreferencesFactory */
public final class AppModule_ProvideSharedPreferencesFactory implements C4463c<SharedPreferences> {

    /* renamed from: a */
    public final AppModule f12616a;

    /* renamed from: b */
    public final C5431a<Context> f12617b;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12616a = appModule;
        this.f12617b = aVar;
    }

    public SharedPreferences get() {
        SharedPreferences f = this.f12616a.mo12467f((Context) this.f12617b.get());
        C3984v.m10272b(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
