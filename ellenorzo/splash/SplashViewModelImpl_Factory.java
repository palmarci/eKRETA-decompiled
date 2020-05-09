package p289hu.ekreta.ellenorzo.splash;

import android.content.SharedPreferences;
import p289hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDevice;
import p289hu.ekreta.ellenorzo.util.realm.RealmWrapper;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl_Factory */
public final class SplashViewModelImpl_Factory implements C4463c<SplashViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14818a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14819b;

    /* renamed from: c */
    public final C5431a<ProfileRepository> f14820c;

    /* renamed from: d */
    public final C5431a<DetectRootedDevice> f14821d;

    /* renamed from: e */
    public final C5431a<ConfigurationProvider> f14822e;

    /* renamed from: f */
    public final C5431a<Boolean> f14823f;

    /* renamed from: g */
    public final C5431a<RealmWrapper> f14824g;

    /* renamed from: h */
    public final C5431a<SharedPreferences> f14825h;

    public SplashViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<ProfileRepository> aVar3, C5431a<DetectRootedDevice> aVar4, C5431a<ConfigurationProvider> aVar5, C5431a<Boolean> aVar6, C5431a<RealmWrapper> aVar7, C5431a<SharedPreferences> aVar8) {
        this.f14818a = aVar;
        this.f14819b = aVar2;
        this.f14820c = aVar3;
        this.f14821d = aVar4;
        this.f14822e = aVar5;
        this.f14823f = aVar6;
        this.f14824g = aVar7;
        this.f14825h = aVar8;
    }

    public SplashViewModelImpl get() {
        SplashViewModelImpl splashViewModelImpl = new SplashViewModelImpl((ObservableImpl) this.f14818a.get(), (ExecuteOnceUiCommandSource) this.f14819b.get(), (ProfileRepository) this.f14820c.get(), (DetectRootedDevice) this.f14821d.get(), (ConfigurationProvider) this.f14822e.get(), ((Boolean) this.f14823f.get()).booleanValue(), (RealmWrapper) this.f14824g.get(), (SharedPreferences) this.f14825h.get());
        return splashViewModelImpl;
    }
}
