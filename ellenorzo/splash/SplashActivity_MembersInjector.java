package p289hu.ekreta.ellenorzo.splash;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.splash.SplashActivity_MembersInjector */
public final class SplashActivity_MembersInjector implements C4447b<SplashActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14797a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14798b;

    /* renamed from: c */
    public final C5431a<SplashViewModel> f14799c;

    /* renamed from: a */
    public void injectMembers(SplashActivity splashActivity) {
        splashActivity.f15496v = (DispatchingAndroidInjector) this.f14797a.get();
        splashActivity.f15497w = (DispatchingAndroidInjector) this.f14798b.get();
        splashActivity.f14793x = (SplashViewModel) this.f14799c.get();
    }

    /* renamed from: a */
    public static void m14099a(SplashActivity splashActivity, SplashViewModel splashViewModel) {
        splashActivity.f14793x = splashViewModel;
    }
}
