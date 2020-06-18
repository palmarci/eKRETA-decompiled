package hu.ekreta.ellenorzo.classmaster;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class ClassMastersFragment_MembersInjector implements b<ClassMastersFragment> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5287a;
    public final a<ClassMastersViewModel> b;

    /* renamed from: a */
    public void injectMembers(ClassMastersFragment classMastersFragment) {
        classMastersFragment.Z = this.f5287a.get();
        classMastersFragment.a0 = this.b.get();
    }

    public static void a(ClassMastersFragment classMastersFragment, ClassMastersViewModel classMastersViewModel) {
        classMastersFragment.a0 = classMastersViewModel;
    }
}
