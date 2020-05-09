package p289hu.ekreta.ellenorzo.subject.averages;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesFragment_MembersInjector */
public final class AveragesFragment_MembersInjector implements C4447b<AveragesFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14912a;

    /* renamed from: b */
    public final C5431a<AveragesViewModel> f14913b;

    /* renamed from: a */
    public void injectMembers(AveragesFragment averagesFragment) {
        averagesFragment.f15499Z = (DispatchingAndroidInjector) this.f14912a.get();
        averagesFragment.f14898a0 = (AveragesViewModel) this.f14913b.get();
    }

    /* renamed from: a */
    public static void m14220a(AveragesFragment averagesFragment, AveragesViewModel averagesViewModel) {
        averagesFragment.f14898a0 = averagesViewModel;
    }
}
