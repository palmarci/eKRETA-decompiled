package p289hu.ekreta.ellenorzo.p290di;

import android.content.Context;
import android.content.pm.PackageInfo;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvidePackageInfoFactory */
public final class AppModule_ProvidePackageInfoFactory implements C4463c<PackageInfo> {

    /* renamed from: a */
    public final AppModule f12608a;

    /* renamed from: b */
    public final C5431a<Context> f12609b;

    public AppModule_ProvidePackageInfoFactory(AppModule appModule, C5431a<Context> aVar) {
        this.f12608a = appModule;
        this.f12609b = aVar;
    }

    public PackageInfo get() {
        PackageInfo d = this.f12608a.mo12463d((Context) this.f12609b.get());
        C3984v.m10272b(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
