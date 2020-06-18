package hu.ekreta.ellenorzo.cases;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class CasesFragment_MembersInjector implements b<CasesFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5106a;
    public final a<CasesViewModel> b;

    /* renamed from: a */
    public void injectMembers(CasesFragment casesFragment) {
        casesFragment.Z = this.f5106a.get();
        casesFragment.a0 = this.b.get();
    }

    public static void a(CasesFragment casesFragment, CasesViewModel casesViewModel) {
        casesFragment.a0 = casesViewModel;
    }
}
