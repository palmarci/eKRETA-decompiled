package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5581y.C5583b;
import p380p.C5788o.C5790b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideGlobalMobileApiFactory */
public final class AppModule_ProvideGlobalMobileApiFactory implements C4463c<GlobalMobileApi> {

    /* renamed from: a */
    public final AppModule f12587a;

    /* renamed from: b */
    public final C5431a<String> f12588b;

    /* renamed from: c */
    public final C5431a<C5790b> f12589c;

    /* renamed from: d */
    public final C5431a<C5583b> f12590d;

    /* renamed from: e */
    public final C5431a<AuthenticationService> f12591e;

    public AppModule_ProvideGlobalMobileApiFactory(AppModule appModule, C5431a<String> aVar, C5431a<C5790b> aVar2, C5431a<C5583b> aVar3, C5431a<AuthenticationService> aVar4) {
        this.f12587a = appModule;
        this.f12588b = aVar;
        this.f12589c = aVar2;
        this.f12590d = aVar3;
        this.f12591e = aVar4;
    }

    public GlobalMobileApi get() {
        GlobalMobileApi b = this.f12587a.mo12456b((String) this.f12588b.get(), (C5790b) this.f12589c.get(), (C5583b) this.f12590d.get(), this.f12591e);
        C3984v.m10272b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
