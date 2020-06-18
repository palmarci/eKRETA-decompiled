package hu.ekreta.ellenorzo.splash;

import android.content.Context;
import android.content.SharedPreferences;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDevice;
import hu.ekreta.ellenorzo.util.realm.RealmWrapper;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class SplashViewModelImpl_Factory implements c<SplashViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6123a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<ProfileRepository> f6124d;
    public final a<DetectRootedDevice> e;
    public final a<ConfigurationProvider> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Boolean> f6125g;

    /* renamed from: h  reason: collision with root package name */
    public final a<RealmWrapper> f6126h;

    /* renamed from: i  reason: collision with root package name */
    public final a<SharedPreferences> f6127i;

    /* renamed from: j  reason: collision with root package name */
    public final a<Context> f6128j;

    public SplashViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<ProfileRepository> aVar4, a<DetectRootedDevice> aVar5, a<ConfigurationProvider> aVar6, a<Boolean> aVar7, a<RealmWrapper> aVar8, a<SharedPreferences> aVar9, a<Context> aVar10) {
        this.f6123a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6124d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f6125g = aVar7;
        this.f6126h = aVar8;
        this.f6127i = aVar9;
        this.f6128j = aVar10;
    }

    public SplashViewModelImpl get() {
        return new SplashViewModelImpl(this.f6123a.get(), this.b.get(), this.c.get(), this.f6124d.get(), this.e.get(), this.f.get(), this.f6125g.get().booleanValue(), this.f6126h.get(), this.f6127i.get(), this.f6128j.get());
    }
}
