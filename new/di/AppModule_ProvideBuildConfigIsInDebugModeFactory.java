package hu.ekreta.ellenorzo.di;

import i.d.c;

public final class AppModule_ProvideBuildConfigIsInDebugModeFactory implements c<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5326a;

    public AppModule_ProvideBuildConfigIsInDebugModeFactory(AppModule appModule) {
        this.f5326a = appModule;
    }

    public Boolean get() {
        return Boolean.valueOf(this.f5326a.c());
    }
}
