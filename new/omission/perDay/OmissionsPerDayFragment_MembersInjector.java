package hu.ekreta.ellenorzo.omission.perDay;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class OmissionsPerDayFragment_MembersInjector implements b<OmissionsPerDayFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5991a;
    public final a<OmissionsPerDayViewModel> b;

    /* renamed from: a */
    public void injectMembers(OmissionsPerDayFragment omissionsPerDayFragment) {
        omissionsPerDayFragment.Z = this.f5991a.get();
        omissionsPerDayFragment.a0 = this.b.get();
    }

    public static void a(OmissionsPerDayFragment omissionsPerDayFragment, OmissionsPerDayViewModel omissionsPerDayViewModel) {
        omissionsPerDayFragment.a0 = omissionsPerDayViewModel;
    }
}
