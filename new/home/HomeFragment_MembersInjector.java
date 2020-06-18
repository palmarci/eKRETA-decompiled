package hu.ekreta.ellenorzo.home;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class HomeFragment_MembersInjector implements b<HomeFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5623a;
    public final a<HomeViewModel> b;

    /* renamed from: a */
    public void injectMembers(HomeFragment homeFragment) {
        homeFragment.Z = this.f5623a.get();
        homeFragment.a0 = this.b.get();
    }

    public static void a(HomeFragment homeFragment, HomeViewModel homeViewModel) {
        homeFragment.a0 = homeViewModel;
    }
}
