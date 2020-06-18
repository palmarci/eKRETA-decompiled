package hu.ekreta.ellenorzo.subject.certificate.halfyear;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class HalfYearFragment_MembersInjector implements b<HalfYearFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6177a;
    public final a<HalfYearViewModel> b;

    /* renamed from: a */
    public void injectMembers(HalfYearFragment halfYearFragment) {
        halfYearFragment.Z = this.f6177a.get();
        halfYearFragment.a0 = this.b.get();
    }

    public static void a(HalfYearFragment halfYearFragment, HalfYearViewModel halfYearViewModel) {
        halfYearFragment.a0 = halfYearViewModel;
    }
}
