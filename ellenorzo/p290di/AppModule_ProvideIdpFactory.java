package p289hu.ekreta.ellenorzo.p290di;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.rest.Idp;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;
import p353m.C5581y.C5583b;
import p380p.C5788o.C5790b;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideIdpFactory */
public final class AppModule_ProvideIdpFactory implements C4463c<Idp> {

    /* renamed from: a */
    public final AppModule f12593a;

    /* renamed from: b */
    public final C5431a<String> f12594b;

    /* renamed from: c */
    public final C5431a<C5790b> f12595c;

    /* renamed from: d */
    public final C5431a<C5583b> f12596d;

    public AppModule_ProvideIdpFactory(AppModule appModule, C5431a<String> aVar, C5431a<C5790b> aVar2, C5431a<C5583b> aVar3) {
        this.f12593a = appModule;
        this.f12594b = aVar;
        this.f12595c = aVar2;
        this.f12596d = aVar3;
    }

    public Idp get() {
        Idp a = this.f12593a.mo12449a((String) this.f12594b.get(), (C5790b) this.f12595c.get(), (C5583b) this.f12596d.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
