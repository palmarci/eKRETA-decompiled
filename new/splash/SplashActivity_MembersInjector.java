package hu.ekreta.ellenorzo.splash;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class SplashActivity_MembersInjector implements b<SplashActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6114a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<SplashViewModel> c;

    /* renamed from: a */
    public void injectMembers(SplashActivity splashActivity) {
        splashActivity.v = this.f6114a.get();
        splashActivity.w = this.b.get();
        splashActivity.x = this.c.get();
    }

    public static void a(SplashActivity splashActivity, SplashViewModel splashViewModel) {
        splashActivity.x = splashViewModel;
    }
}
