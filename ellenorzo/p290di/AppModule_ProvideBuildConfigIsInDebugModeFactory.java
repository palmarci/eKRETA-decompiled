package p289hu.ekreta.ellenorzo.p290di;

import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideBuildConfigIsInDebugModeFactory */
public final class AppModule_ProvideBuildConfigIsInDebugModeFactory implements C4463c<Boolean> {

    /* renamed from: a */
    public final AppModule f12576a;

    public AppModule_ProvideBuildConfigIsInDebugModeFactory(AppModule appModule) {
        this.f12576a = appModule;
    }

    public Boolean get() {
        return Boolean.valueOf(this.f12576a.mo12462c());
    }
}
