package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import h.w.v;
import hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorActivity;
import i.d.c;
import l.a.a;

public final class AddresseeSelectorModule_ProvideViewModelFactory implements c<AddresseeSelectorViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final AddresseeSelectorModule f4987a;
    public final a<AddresseeSelectorActivity> b;
    public final a<AddresseeSelectorViewModelImpl> c;

    public AddresseeSelectorModule_ProvideViewModelFactory(AddresseeSelectorModule addresseeSelectorModule, a<AddresseeSelectorActivity> aVar, a<AddresseeSelectorViewModelImpl> aVar2) {
        this.f4987a = addresseeSelectorModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public AddresseeSelectorViewModel get() {
        AddresseeSelectorViewModel a2 = this.f4987a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
