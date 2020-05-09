package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideAppVersionNumberFactory */
public final class AppModule_ProvideAppVersionNumberFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12572a;

    /* renamed from: b */
    public final C5431a<String> f12573b;

    /* renamed from: c */
    public final C5431a<Long> f12574c;

    public AppModule_ProvideAppVersionNumberFactory(AppModule appModule, C5431a<String> aVar, C5431a<Long> aVar2) {
        this.f12572a = appModule;
        this.f12573b = aVar;
        this.f12574c = aVar2;
    }

    public String get() {
        String a = this.f12572a.mo12453a((String) this.f12573b.get(), ((Long) this.f12574c.get()).longValue());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
