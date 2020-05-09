package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5575v;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideUserAgentInterceptorFactory */
public final class AppModule_ProvideUserAgentInterceptorFactory implements C4463c<C5575v> {

    /* renamed from: a */
    public final AppModule f12618a;

    /* renamed from: b */
    public final C5431a<String> f12619b;

    public C5575v get() {
        C5575v b = this.f12618a.mo12460b((String) this.f12619b.get());
        C3984v.m10272b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
