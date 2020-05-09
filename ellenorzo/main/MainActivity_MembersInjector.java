package p289hu.ekreta.ellenorzo.main;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.main.MainActivity_MembersInjector */
public final class MainActivity_MembersInjector implements C4447b<MainActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13696a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13697b;

    /* renamed from: c */
    public final C5431a<MainViewModel> f13698c;

    /* renamed from: d */
    public final C5431a<FirebaseContainer> f13699d;

    /* renamed from: a */
    public void injectMembers(MainActivity mainActivity) {
        mainActivity.f15496v = (DispatchingAndroidInjector) this.f13696a.get();
        mainActivity.f15497w = (DispatchingAndroidInjector) this.f13697b.get();
        mainActivity.f13683x = (MainViewModel) this.f13698c.get();
        mainActivity.f13684y = (FirebaseContainer) this.f13699d.get();
    }

    /* renamed from: a */
    public static void m12793a(MainActivity mainActivity, MainViewModel mainViewModel) {
        mainActivity.f13683x = mainViewModel;
    }

    /* renamed from: a */
    public static void m12794a(MainActivity mainActivity, FirebaseContainer firebaseContainer) {
        mainActivity.f13684y = firebaseContainer;
    }
}
