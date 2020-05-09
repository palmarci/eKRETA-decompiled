package p289hu.ekreta.ellenorzo.splash;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3826t;
import p289hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rootedDeviceDetected.DetectRootedDevice;
import p289hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction.NavigateToRootedDeviceActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.realm.RealmWrapper;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\"\u001a\u00020#H\u0017J\b\u0010$\u001a\u00020\u000eH\u0002R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "detectRootedDevice", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "configurationProvider", "Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "buildConfigIsInDebugMode", "", "realmWrapper", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;ZLhu/ekreta/ellenorzo/util/realm/RealmWrapper;Landroid/content/SharedPreferences;)V", "getBuildConfigIsInDebugMode", "()Z", "getDetectRootedDevice", "()Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "navigationActionSingle", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "<set-?>", "rebirthTriggered", "getRebirthTriggered", "setRebirthTriggered", "(Z)V", "rebirthTriggered$delegate", "Lkotlin/properties/ReadWriteProperty;", "loginOrNavigateForward", "", "shouldNavigateToRootedDeviceActivity", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl */
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl extends DataBindingViewModel implements SplashViewModel {

    /* renamed from: p */
    public static final /* synthetic */ KProperty[] f14801p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SplashViewModelImpl.class), "rebirthTriggered", "getRebirthTriggered()Z"))};

    /* renamed from: j */
    public final ReadWriteProperty f14802j;

    /* renamed from: k */
    public final C5036u<SplashScreenNavigationAction> f14803k;

    /* renamed from: l */
    public final ProfileRepository f14804l;

    /* renamed from: m */
    public final DetectRootedDevice f14805m;

    /* renamed from: n */
    public final boolean f14806n;

    /* renamed from: o */
    public final RealmWrapper f14807o;

    public SplashViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, ProfileRepository profileRepository, DetectRootedDevice detectRootedDevice, ConfigurationProvider configurationProvider, boolean z, RealmWrapper realmWrapper, SharedPreferences sharedPreferences) {
        C5036u<SplashScreenNavigationAction> uVar;
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(detectRootedDevice, "detectRootedDevice");
        Intrinsics.checkParameterIsNotNull(configurationProvider, "configurationProvider");
        Intrinsics.checkParameterIsNotNull(realmWrapper, "realmWrapper");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14804l = profileRepository;
        this.f14805m = detectRootedDevice;
        this.f14806n = z;
        this.f14807o = realmWrapper;
        this.f14802j = ExtensionsKt.m14635a(sharedPreferences, "rebirthTriggered", false);
        if (mo15671P1().mo15580a() && (!this.f14806n)) {
            uVar = C5036u.m16978b(NavigateToRootedDeviceActivity.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(uVar, "Single.just(NavigateToRootedDeviceActivity)");
        } else {
            uVar = configurationProvider.mo12318c().mo17259a((C4675h<? super T, ? extends C5040y<? extends R>>) new SplashViewModelImpl$navigationActionSingle$1<Object,Object>(this)).mo17270f(new SplashViewModelImpl$navigationActionSingle$2(this));
            Intrinsics.checkExpressionValueIsNotNull(uVar, "configurationProvider.ge…creen }\n                }");
        }
        this.f14803k = uVar;
    }

    /* renamed from: P1 */
    public DetectRootedDevice mo15671P1() {
        return this.f14805m;
    }

    @C3826t(C3811a.ON_RESUME)
    public void loginOrNavigateForward() {
        mo16413a(C4998b.m16843a(this.f14803k, (Function1<? super Throwable, Unit>) new SplashViewModelImpl$loginOrNavigateForward$2<Object,Unit>(this), (Function1<? super T, Unit>) new SplashViewModelImpl$loginOrNavigateForward$1<Object,Unit>(this)));
    }
}
