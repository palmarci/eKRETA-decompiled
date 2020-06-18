package hu.ekreta.ellenorzo.splash;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity;
import hu.ekreta.ellenorzo.login.LoginActivity;
import hu.ekreta.ellenorzo.main.MainActivity;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "", "()V", "finishIsNeeded", "", "getFinishIsNeeded", "()Z", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "NavigateToIntent", "NavigateToLoginScreen", "NavigateToMainActivity", "NavigateToNotSupportedActivity", "NavigateToRootedDeviceActivity", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToRootedDeviceActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToIntent;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToMainActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToNotSupportedActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToLoginScreen;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SplashScreenNavigation.kt */
public abstract class SplashScreenNavigationAction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToIntent;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getIntent", "activity", "Landroid/app/Activity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToIntent extends SplashScreenNavigationAction {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f6115a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavigateToIntent(Intent intent) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            this.f6115a = intent;
        }

        public Intent a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            return this.f6115a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToLoginScreen;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "finishIsNeeded", "", "getFinishIsNeeded", "()Z", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToLoginScreen extends SplashScreenNavigationAction {
        public static final NavigateToLoginScreen INSTANCE = new NavigateToLoginScreen();

        public NavigateToLoginScreen() {
            super((DefaultConstructorMarker) null);
        }

        public Intent a(Activity activity) {
            return a.a(activity, "activity", activity, LoginActivity.class);
        }

        public boolean a() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToMainActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToMainActivity extends SplashScreenNavigationAction {
        public static final NavigateToMainActivity INSTANCE = new NavigateToMainActivity();

        public NavigateToMainActivity() {
            super((DefaultConstructorMarker) null);
        }

        public Intent a(Activity activity) {
            return a.a(activity, "activity", activity, MainActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToNotSupportedActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToNotSupportedActivity extends SplashScreenNavigationAction {
        public static final NavigateToNotSupportedActivity INSTANCE = new NavigateToNotSupportedActivity();

        public NavigateToNotSupportedActivity() {
            super((DefaultConstructorMarker) null);
        }

        public Intent a(Activity activity) {
            return a.a(activity, "activity", activity, NotSupportedAppActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction$NavigateToRootedDeviceActivity;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "()V", "getIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SplashScreenNavigation.kt */
    public static final class NavigateToRootedDeviceActivity extends SplashScreenNavigationAction {
        public static final NavigateToRootedDeviceActivity INSTANCE = new NavigateToRootedDeviceActivity();

        public NavigateToRootedDeviceActivity() {
            super((DefaultConstructorMarker) null);
        }

        public Intent a(Activity activity) {
            return a.a(activity, "activity", activity, RootedDeviceDetectedActivity.class);
        }
    }

    public SplashScreenNavigationAction() {
    }

    public abstract Intent a(Activity activity);

    public boolean a() {
        return true;
    }

    public /* synthetic */ SplashScreenNavigationAction(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
