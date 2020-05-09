package p289hu.ekreta.ellenorzo.classmaster;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment_MembersInjector */
public final class ClassMastersFragment_MembersInjector implements C4447b<ClassMastersFragment> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11867a;

    /* renamed from: b */
    public final C5431a<ClassMastersViewModel> f11868b;

    /* renamed from: a */
    public void injectMembers(ClassMastersFragment classMastersFragment) {
        classMastersFragment.f15499Z = (DispatchingAndroidInjector) this.f11867a.get();
        classMastersFragment.f11846a0 = (ClassMastersViewModel) this.f11868b.get();
    }

    /* renamed from: a */
    public static void m11406a(ClassMastersFragment classMastersFragment, ClassMastersViewModel classMastersViewModel) {
        classMastersFragment.f11846a0 = classMastersViewModel;
    }
}
