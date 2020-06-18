package hu.ekreta.ellenorzo.splash;

import android.content.Context;
import android.content.SharedPreferences;
import h.p.h;
import h.p.t;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDevice;
import hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.realm.RealmWrapper;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import k.b.f0.b;
import k.b.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010&\u001a\u00020'H\u0017J\b\u0010(\u001a\u00020\u0010H\u0002R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108B@BX\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "detectRootedDevice", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "configurationProvider", "Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "buildConfigIsInDebugMode", "", "realmWrapper", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;ZLhu/ekreta/ellenorzo/util/realm/RealmWrapper;Landroid/content/SharedPreferences;Landroid/content/Context;)V", "getBuildConfigIsInDebugMode", "()Z", "getDetectRootedDevice", "()Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "navigationActionSingle", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "<set-?>", "rebirthTriggered", "getRebirthTriggered", "setRebirthTriggered", "(Z)V", "rebirthTriggered$delegate", "Lkotlin/properties/ReadWriteProperty;", "loginOrNavigateForward", "", "shouldNavigateToRootedDeviceActivity", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl extends DataBindingViewModel implements SplashViewModel {
    public static final /* synthetic */ KProperty[] r = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SplashViewModelImpl.class), "rebirthTriggered", "getRebirthTriggered()Z"))};

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f6116k;

    /* renamed from: l  reason: collision with root package name */
    public final u<SplashScreenNavigationAction> f6117l;

    /* renamed from: m  reason: collision with root package name */
    public final ProfileRepository f6118m;

    /* renamed from: n  reason: collision with root package name */
    public final DetectRootedDevice f6119n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6120o;

    /* renamed from: p  reason: collision with root package name */
    public final RealmWrapper f6121p;

    /* renamed from: q  reason: collision with root package name */
    public final Context f6122q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, ProfileRepository profileRepository, DetectRootedDevice detectRootedDevice, ConfigurationProvider configurationProvider, boolean z, RealmWrapper realmWrapper, SharedPreferences sharedPreferences, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        u<R> uVar;
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(detectRootedDevice, "detectRootedDevice");
        Intrinsics.checkParameterIsNotNull(configurationProvider, "configurationProvider");
        Intrinsics.checkParameterIsNotNull(realmWrapper, "realmWrapper");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f6118m = profileRepository;
        this.f6119n = detectRootedDevice;
        this.f6120o = z;
        this.f6121p = realmWrapper;
        this.f6122q = context;
        this.f6116k = ExtensionsKt.a(sharedPreferences, "rebirthTriggered", false);
        if (Z1().a() && (!this.f6120o)) {
            uVar = u.b(SplashScreenNavigationAction.NavigateToRootedDeviceActivity.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(uVar, "Single.just(NavigateToRootedDeviceActivity)");
        } else {
            uVar = configurationProvider.c().a(new SplashViewModelImpl$navigationActionSingle$1(this)).f(new SplashViewModelImpl$navigationActionSingle$2(this));
            Intrinsics.checkExpressionValueIsNotNull(uVar, "configurationProvider.ge…creen }\n                }");
        }
        this.f6117l = uVar;
    }

    public DetectRootedDevice Z1() {
        return this.f6119n;
    }

    @t(h.a.ON_RESUME)
    public void loginOrNavigateForward() {
        a(b.a(this.f6117l, (Function1<? super Throwable, Unit>) new SplashViewModelImpl$loginOrNavigateForward$2(this), new SplashViewModelImpl$loginOrNavigateForward$1(this)));
    }
}
