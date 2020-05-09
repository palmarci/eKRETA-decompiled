package p289hu.ekreta.ellenorzo.main.more;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment_MembersInjector */
public final class MoreFragment_MembersInjector implements C4447b<MoreFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13768a;

    /* renamed from: b */
    public final C5431a<MainViewModel> f13769b;

    /* renamed from: a */
    public void injectMembers(MoreFragment moreFragment) {
        moreFragment.f15499Z = (DispatchingAndroidInjector) this.f13768a.get();
        moreFragment.f13754a0 = (MainViewModel) this.f13769b.get();
    }

    /* renamed from: a */
    public static void m12855a(MoreFragment moreFragment, MainViewModel mainViewModel) {
        moreFragment.f13754a0 = mainViewModel;
    }
}
