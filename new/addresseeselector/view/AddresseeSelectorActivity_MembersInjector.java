package hu.ekreta.ellenorzo.addresseeselector.view;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel;
import i.b;
import l.a.a;

public final class AddresseeSelectorActivity_MembersInjector implements b<AddresseeSelectorActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f4979a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<AddresseeSelectorViewModel> c;

    /* renamed from: a */
    public void injectMembers(AddresseeSelectorActivity addresseeSelectorActivity) {
        addresseeSelectorActivity.v = this.f4979a.get();
        addresseeSelectorActivity.w = this.b.get();
        addresseeSelectorActivity.x = this.c.get();
    }

    public static void a(AddresseeSelectorActivity addresseeSelectorActivity, AddresseeSelectorViewModel addresseeSelectorViewModel) {
        addresseeSelectorActivity.x = addresseeSelectorViewModel;
    }
}
