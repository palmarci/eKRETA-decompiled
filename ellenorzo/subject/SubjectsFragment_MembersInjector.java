package p289hu.ekreta.ellenorzo.subject;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsFragment_MembersInjector */
public final class SubjectsFragment_MembersInjector implements C4447b<SubjectsFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14856a;

    /* renamed from: b */
    public final C5431a<SubjectsViewModel> f14857b;

    /* renamed from: a */
    public void injectMembers(SubjectsFragment subjectsFragment) {
        subjectsFragment.f15499Z = (DispatchingAndroidInjector) this.f14856a.get();
        subjectsFragment.f14849a0 = (SubjectsViewModel) this.f14857b.get();
    }

    /* renamed from: a */
    public static void m14174a(SubjectsFragment subjectsFragment, SubjectsViewModel subjectsViewModel) {
        subjectsFragment.f14849a0 = subjectsViewModel;
    }
}
