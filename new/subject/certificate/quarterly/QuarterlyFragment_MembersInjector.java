package hu.ekreta.ellenorzo.subject.certificate.quarterly;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class QuarterlyFragment_MembersInjector implements b<QuarterlyFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6181a;
    public final a<QuarterlyViewModel> b;

    /* renamed from: a */
    public void injectMembers(QuarterlyFragment quarterlyFragment) {
        quarterlyFragment.Z = this.f6181a.get();
        quarterlyFragment.a0 = this.b.get();
    }

    public static void a(QuarterlyFragment quarterlyFragment, QuarterlyViewModel quarterlyViewModel) {
        quarterlyFragment.a0 = quarterlyViewModel;
    }
}
