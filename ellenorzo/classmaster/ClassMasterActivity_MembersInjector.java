package p289hu.ekreta.ellenorzo.classmaster;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterActivity_MembersInjector */
public final class ClassMasterActivity_MembersInjector implements C4447b<ClassMasterActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f11803a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f11804b;

    /* renamed from: c */
    public final C5431a<ClassMasterViewModel> f11805c;

    /* renamed from: a */
    public void injectMembers(ClassMasterActivity classMasterActivity) {
        classMasterActivity.f15496v = (DispatchingAndroidInjector) this.f11803a.get();
        classMasterActivity.f15497w = (DispatchingAndroidInjector) this.f11804b.get();
        classMasterActivity.f11798x = (ClassMasterViewModel) this.f11805c.get();
    }

    /* renamed from: a */
    public static void m11339a(ClassMasterActivity classMasterActivity, ClassMasterViewModel classMasterViewModel) {
        classMasterActivity.f11798x = classMasterViewModel;
    }
}
