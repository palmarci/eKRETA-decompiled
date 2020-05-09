package p289hu.ekreta.ellenorzo.splash;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity;
import p289hu.ekreta.ellenorzo.login.LoginActivity;
import p289hu.ekreta.ellenorzo.main.MainActivity;
import p289hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "", "()V", "finishIsNeeded", "", "getFinishIsNeeded", "()Z", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "NavigateToGooglePlayStore", "NavigateToLoginScreen", "NavigateToMainActivity", "NavigateToNotSupportedActivity", "NavigateToRootedDeviceActivity", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToRootedDeviceActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToGooglePlayStore;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToMainActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToNotSupportedActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToLoginScreen;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction */
/* compiled from: SplashScreenNavigation.kt */
public abstract class SplashScreenNavigationAction {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToGooglePlayStore;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "storeUrl", "", "(Ljava/lang/String;)V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction$NavigateToGooglePlayStore */
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToGooglePlayStore extends SplashScreenNavigationAction {

        /* renamed from: a */
        public final String f14800a;

        public NavigateToGooglePlayStore(String str) {
            Intrinsics.checkParameterIsNotNull(str, "storeUrl");
            super(null);
            this.f14800a = str;
        }

        /* renamed from: a */
        public Intent mo15669a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            return new Intent("android.intent.action.VIEW", Uri.parse(this.f14800a));
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToLoginScreen;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "finishIsNeeded", "", "getFinishIsNeeded", "()Z", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction$NavigateToLoginScreen */
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToLoginScreen extends SplashScreenNavigationAction {
        public static final NavigateToLoginScreen INSTANCE = new NavigateToLoginScreen();

        public NavigateToLoginScreen() {
            super(null);
        }

        /* renamed from: a */
        public Intent mo15669a(Activity activity) {
            return C0082a.m88a(activity, "activity", activity, LoginActivity.class);
        }

        /* renamed from: a */
        public boolean mo15670a() {
            return false;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToMainActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction$NavigateToMainActivity */
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToMainActivity extends SplashScreenNavigationAction {
        public static final NavigateToMainActivity INSTANCE = new NavigateToMainActivity();

        public NavigateToMainActivity() {
            super(null);
        }

        /* renamed from: a */
        public Intent mo15669a(Activity activity) {
            return C0082a.m88a(activity, "activity", activity, MainActivity.class);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToNotSupportedActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction$NavigateToNotSupportedActivity */
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToNotSupportedActivity extends SplashScreenNavigationAction {
        public static final NavigateToNotSupportedActivity INSTANCE = new NavigateToNotSupportedActivity();

        public NavigateToNotSupportedActivity() {
            super(null);
        }

        /* renamed from: a */
        public Intent mo15669a(Activity activity) {
            return C0082a.m88a(activity, "activity", activity, NotSupportedAppActivity.class);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToRootedDeviceActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction$NavigateToRootedDeviceActivity */
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToRootedDeviceActivity extends SplashScreenNavigationAction {
        public static final NavigateToRootedDeviceActivity INSTANCE = new NavigateToRootedDeviceActivity();

        public NavigateToRootedDeviceActivity() {
            super(null);
        }

        /* renamed from: a */
        public Intent mo15669a(Activity activity) {
            return C0082a.m88a(activity, "activity", activity, RootedDeviceDetectedActivity.class);
        }
    }

    public SplashScreenNavigationAction() {
    }

    /* renamed from: a */
    public abstract Intent mo15669a(Activity activity);

    /* renamed from: a */
    public boolean mo15670a() {
        return true;
    }

    public /* synthetic */ SplashScreenNavigationAction(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
