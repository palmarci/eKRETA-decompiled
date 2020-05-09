package p289hu.ekreta.ellenorzo.subject.certificate.endofyear;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment_MembersInjector */
public final class EndOfYearFragment_MembersInjector implements C4447b<EndOfYearFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14957a;

    /* renamed from: b */
    public final C5431a<EndOfYearViewModel> f14958b;

    /* renamed from: a */
    public void injectMembers(EndOfYearFragment endOfYearFragment) {
        endOfYearFragment.f15499Z = (DispatchingAndroidInjector) this.f14957a.get();
        endOfYearFragment.f14951a0 = (EndOfYearViewModel) this.f14958b.get();
    }

    /* renamed from: a */
    public static void m14273a(EndOfYearFragment endOfYearFragment, EndOfYearViewModel endOfYearViewModel) {
        endOfYearFragment.f14951a0 = endOfYearViewModel;
    }
}
