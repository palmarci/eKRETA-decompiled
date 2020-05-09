package p289hu.ekreta.ellenorzo.omission;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayFragment_MembersInjector */
public final class OmissionsPerDayFragment_MembersInjector implements C4447b<OmissionsPerDayFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14441a;

    /* renamed from: b */
    public final C5431a<OmissionsPerDayViewModel> f14442b;

    /* renamed from: a */
    public void injectMembers(OmissionsPerDayFragment omissionsPerDayFragment) {
        omissionsPerDayFragment.f15499Z = (DispatchingAndroidInjector) this.f14441a.get();
        omissionsPerDayFragment.f14433a0 = (OmissionsPerDayViewModel) this.f14442b.get();
    }

    /* renamed from: a */
    public static void m13652a(OmissionsPerDayFragment omissionsPerDayFragment, OmissionsPerDayViewModel omissionsPerDayViewModel) {
        omissionsPerDayFragment.f14433a0 = omissionsPerDayViewModel;
    }
}
