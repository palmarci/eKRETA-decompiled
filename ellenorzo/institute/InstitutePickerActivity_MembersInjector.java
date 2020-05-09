package p289hu.ekreta.ellenorzo.institute;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerActivity_MembersInjector */
public final class InstitutePickerActivity_MembersInjector implements C4447b<InstitutePickerActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f13591a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f13592b;

    /* renamed from: c */
    public final C5431a<InstitutePickerViewModel> f13593c;

    /* renamed from: a */
    public void injectMembers(InstitutePickerActivity institutePickerActivity) {
        institutePickerActivity.f15496v = (DispatchingAndroidInjector) this.f13591a.get();
        institutePickerActivity.f15497w = (DispatchingAndroidInjector) this.f13592b.get();
        institutePickerActivity.f13580x = (InstitutePickerViewModel) this.f13593c.get();
    }

    /* renamed from: a */
    public static void m12689a(InstitutePickerActivity institutePickerActivity, InstitutePickerViewModel institutePickerViewModel) {
        institutePickerActivity.f13580x = institutePickerViewModel;
    }
}
