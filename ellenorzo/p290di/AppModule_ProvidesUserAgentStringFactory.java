package p289hu.ekreta.ellenorzo.p290di;

import android.content.pm.PackageInfo;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvidesUserAgentStringFactory */
public final class AppModule_ProvidesUserAgentStringFactory implements C4463c<String> {

    /* renamed from: a */
    public final AppModule f12620a;

    /* renamed from: b */
    public final C5431a<PackageInfo> f12621b;

    /* renamed from: c */
    public final C5431a<String> f12622c;

    public AppModule_ProvidesUserAgentStringFactory(AppModule appModule, C5431a<PackageInfo> aVar, C5431a<String> aVar2) {
        this.f12620a = appModule;
        this.f12621b = aVar;
        this.f12622c = aVar2;
    }

    public String get() {
        String a = this.f12620a.mo12452a((PackageInfo) this.f12621b.get(), (String) this.f12622c.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
