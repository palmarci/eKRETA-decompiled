package p289hu.ekreta.ellenorzo.subject.certificate.halfyear;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment_MembersInjector */
public final class HalfYearFragment_MembersInjector implements C4447b<HalfYearFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14971a;

    /* renamed from: b */
    public final C5431a<HalfYearViewModel> f14972b;

    /* renamed from: a */
    public void injectMembers(HalfYearFragment halfYearFragment) {
        halfYearFragment.f15499Z = (DispatchingAndroidInjector) this.f14971a.get();
        halfYearFragment.f14965a0 = (HalfYearViewModel) this.f14972b.get();
    }

    /* renamed from: a */
    public static void m14286a(HalfYearFragment halfYearFragment, HalfYearViewModel halfYearViewModel) {
        halfYearFragment.f14965a0 = halfYearViewModel;
    }
}
