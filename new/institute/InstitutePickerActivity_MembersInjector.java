package hu.ekreta.ellenorzo.institute;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class InstitutePickerActivity_MembersInjector implements b<InstitutePickerActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f5699a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<InstitutePickerViewModel> c;

    /* renamed from: a */
    public void injectMembers(InstitutePickerActivity institutePickerActivity) {
        institutePickerActivity.v = this.f5699a.get();
        institutePickerActivity.w = this.b.get();
        institutePickerActivity.x = this.c.get();
    }

    public static void a(InstitutePickerActivity institutePickerActivity, InstitutePickerViewModel institutePickerViewModel) {
        institutePickerActivity.x = institutePickerViewModel;
    }
}
