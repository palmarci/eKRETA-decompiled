package p289hu.ekreta.ellenorzo.cases;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.CasesFragment_MembersInjector */
public final class CasesFragment_MembersInjector implements C4447b<CasesFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11341a;

    /* renamed from: b */
    public final C5431a<CasesViewModel> f11342b;

    /* renamed from: a */
    public void injectMembers(CasesFragment casesFragment) {
        casesFragment.f15499Z = (DispatchingAndroidInjector) this.f11341a.get();
        casesFragment.f11330a0 = (CasesViewModel) this.f11342b.get();
    }

    /* renamed from: a */
    public static void m10815a(CasesFragment casesFragment, CasesViewModel casesViewModel) {
        casesFragment.f11330a0 = casesViewModel;
    }
}
