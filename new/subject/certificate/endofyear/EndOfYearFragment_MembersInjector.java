package hu.ekreta.ellenorzo.subject.certificate.endofyear;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class EndOfYearFragment_MembersInjector implements b<EndOfYearFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6173a;
    public final a<EndOfYearViewModel> b;

    /* renamed from: a */
    public void injectMembers(EndOfYearFragment endOfYearFragment) {
        endOfYearFragment.Z = this.f6173a.get();
        endOfYearFragment.a0 = this.b.get();
    }

    public static void a(EndOfYearFragment endOfYearFragment, EndOfYearViewModel endOfYearViewModel) {
        endOfYearFragment.a0 = endOfYearViewModel;
    }
}
