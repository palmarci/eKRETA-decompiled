package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5581y.C5583b;
import p380p.C5788o.C5790b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideEAdminApiFactory */
public final class AppModule_ProvideEAdminApiFactory implements C4463c<EAdminApi> {

    /* renamed from: a */
    public final AppModule f12579a;

    /* renamed from: b */
    public final C5431a<String> f12580b;

    /* renamed from: c */
    public final C5431a<C5790b> f12581c;

    /* renamed from: d */
    public final C5431a<C5583b> f12582d;

    /* renamed from: e */
    public final C5431a<AuthenticationService> f12583e;

    public AppModule_ProvideEAdminApiFactory(AppModule appModule, C5431a<String> aVar, C5431a<C5790b> aVar2, C5431a<C5583b> aVar3, C5431a<AuthenticationService> aVar4) {
        this.f12579a = appModule;
        this.f12580b = aVar;
        this.f12581c = aVar2;
        this.f12582d = aVar3;
        this.f12583e = aVar4;
    }

    public EAdminApi get() {
        EAdminApi a = this.f12579a.mo12448a((String) this.f12580b.get(), (C5790b) this.f12581c.get(), (C5583b) this.f12582d.get(), this.f12583e);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
