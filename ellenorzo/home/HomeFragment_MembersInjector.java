package p289hu.ekreta.ellenorzo.home;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.home.HomeFragment_MembersInjector */
public final class HomeFragment_MembersInjector implements C4447b<HomeFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13345a;

    /* renamed from: b */
    public final C5431a<HomeViewModel> f13346b;

    /* renamed from: a */
    public void injectMembers(HomeFragment homeFragment) {
        homeFragment.f15499Z = (DispatchingAndroidInjector) this.f13345a.get();
        homeFragment.f13329a0 = (HomeViewModel) this.f13346b.get();
    }

    /* renamed from: a */
    public static void m12392a(HomeFragment homeFragment, HomeViewModel homeViewModel) {
        homeFragment.f13329a0 = homeViewModel;
    }
}
