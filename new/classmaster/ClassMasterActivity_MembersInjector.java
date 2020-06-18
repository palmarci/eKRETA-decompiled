package hu.ekreta.ellenorzo.classmaster;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class ClassMasterActivity_MembersInjector implements b<ClassMasterActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5270a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<ClassMasterViewModel> c;

    /* renamed from: a */
    public void injectMembers(ClassMasterActivity classMasterActivity) {
        classMasterActivity.v = this.f5270a.get();
        classMasterActivity.w = this.b.get();
        classMasterActivity.x = this.c.get();
    }

    public static void a(ClassMasterActivity classMasterActivity, ClassMasterViewModel classMasterViewModel) {
        classMasterActivity.x = classMasterViewModel;
    }
}
