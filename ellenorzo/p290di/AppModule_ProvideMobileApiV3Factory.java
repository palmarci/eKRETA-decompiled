package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5581y.C5583b;
import p380p.C5788o.C5790b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideMobileApiV3Factory */
public final class AppModule_ProvideMobileApiV3Factory implements C4463c<MobileApiV3> {

    /* renamed from: a */
    public final AppModule f12600a;

    /* renamed from: b */
    public final C5431a<C5583b> f12601b;

    /* renamed from: c */
    public final C5431a<C5790b> f12602c;

    /* renamed from: d */
    public final C5431a<AuthenticationService> f12603d;

    public AppModule_ProvideMobileApiV3Factory(AppModule appModule, C5431a<C5583b> aVar, C5431a<C5790b> aVar2, C5431a<AuthenticationService> aVar3) {
        this.f12600a = appModule;
        this.f12601b = aVar;
        this.f12602c = aVar2;
        this.f12603d = aVar3;
    }

    public MobileApiV3 get() {
        MobileApiV3 a = this.f12600a.mo12450a((C5583b) this.f12601b.get(), (C5790b) this.f12602c.get(), this.f12603d);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
