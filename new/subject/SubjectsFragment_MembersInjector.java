package hu.ekreta.ellenorzo.subject;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class SubjectsFragment_MembersInjector implements b<SubjectsFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6148a;
    public final a<SubjectsViewModel> b;

    /* renamed from: a */
    public void injectMembers(SubjectsFragment subjectsFragment) {
        subjectsFragment.Z = this.f6148a.get();
        subjectsFragment.a0 = this.b.get();
    }

    public static void a(SubjectsFragment subjectsFragment, SubjectsViewModel subjectsViewModel) {
        subjectsFragment.a0 = subjectsViewModel;
    }
}
