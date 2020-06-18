package hu.ekreta.ellenorzo.main;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import i.b;
import l.a.a;

public final class MainActivity_MembersInjector implements b<MainActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5733a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<MainViewModel> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<FirebaseContainer> f5734d;

    /* renamed from: a */
    public void injectMembers(MainActivity mainActivity) {
        mainActivity.v = this.f5733a.get();
        mainActivity.w = this.b.get();
        mainActivity.x = this.c.get();
        mainActivity.y = this.f5734d.get();
    }

    public static void a(MainActivity mainActivity, MainViewModel mainViewModel) {
        mainActivity.x = mainViewModel;
    }

    public static void a(MainActivity mainActivity, FirebaseContainer firebaseContainer) {
        mainActivity.y = firebaseContainer;
    }
}
