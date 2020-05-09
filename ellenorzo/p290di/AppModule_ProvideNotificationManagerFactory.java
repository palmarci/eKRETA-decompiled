package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import p211h.p238i.p239e.C3535m;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideNotificationManagerFactory */
public final class AppModule_ProvideNotificationManagerFactory implements C4463c<C3535m> {

    /* renamed from: a */
    public final AppModule f12604a;

    /* renamed from: b */
    public final C5431a<Context> f12605b;

    public AppModule_ProvideNotificationManagerFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12604a = appModule;
        this.f12605b = aVar;
    }

    public C3535m get() {
        C3535m c = this.f12604a.mo12461c((Context) this.f12605b.get());
        C3984v.m10272b(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
