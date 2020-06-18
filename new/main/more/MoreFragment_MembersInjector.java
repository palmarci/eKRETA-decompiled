package hu.ekreta.ellenorzo.main.more;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.main.MainViewModel;
import i.b;
import l.a.a;

public final class MoreFragment_MembersInjector implements b<MoreFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5753a;
    public final a<MainViewModel> b;

    /* renamed from: a */
    public void injectMembers(MoreFragment moreFragment) {
        moreFragment.Z = this.f5753a.get();
        moreFragment.a0 = this.b.get();
    }

    public static void a(MoreFragment moreFragment, MainViewModel mainViewModel) {
        moreFragment.a0 = mainViewModel;
    }
}
