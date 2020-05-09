package p289hu.ekreta.ellenorzo.subject.certificate.quarterly;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragment_MembersInjector */
public final class QuarterlyFragment_MembersInjector implements C4447b<QuarterlyFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14985a;

    /* renamed from: b */
    public final C5431a<QuarterlyViewModel> f14986b;

    /* renamed from: a */
    public void injectMembers(QuarterlyFragment quarterlyFragment) {
        quarterlyFragment.f15499Z = (DispatchingAndroidInjector) this.f14985a.get();
        quarterlyFragment.f14979a0 = (QuarterlyViewModel) this.f14986b.get();
    }

    /* renamed from: a */
    public static void m14299a(QuarterlyFragment quarterlyFragment, QuarterlyViewModel quarterlyViewModel) {
        quarterlyFragment.f14979a0 = quarterlyViewModel;
    }
}
