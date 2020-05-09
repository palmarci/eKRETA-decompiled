package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import p000a.p180n.p181a.C2723b;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideRootBeerFactory */
public final class AppModule_ProvideRootBeerFactory implements C4463c<C2723b> {

    /* renamed from: a */
    public final AppModule f12614a;

    /* renamed from: b */
    public final C5431a<Context> f12615b;

    public AppModule_ProvideRootBeerFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12614a = appModule;
        this.f12615b = aVar;
    }

    public C2723b get() {
        C2723b e = this.f12614a.mo12465e((Context) this.f12615b.get());
        C3984v.m10272b(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
