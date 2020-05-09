package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p353m.C5575v;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideGeneralInterceptorFactory */
public final class AppModule_ProvideGeneralInterceptorFactory implements C4463c<C5575v> {

    /* renamed from: a */
    public final AppModule f12585a;

    public C5575v get() {
        C5575v e = this.f12585a.mo12466e();
        C3984v.m10272b(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
