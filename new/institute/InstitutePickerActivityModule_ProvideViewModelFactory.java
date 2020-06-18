package hu.ekreta.ellenorzo.institute;

import h.w.v;
import i.d.c;
import l.a.a;

public final class InstitutePickerActivityModule_ProvideViewModelFactory implements c<InstitutePickerViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final InstitutePickerActivityModule f5698a;
    public final a<InstitutePickerActivity> b;
    public final a<InstitutePickerViewModelImpl> c;

    public InstitutePickerActivityModule_ProvideViewModelFactory(InstitutePickerActivityModule institutePickerActivityModule, a<InstitutePickerActivity> aVar, a<InstitutePickerViewModelImpl> aVar2) {
        this.f5698a = institutePickerActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public InstitutePickerViewModel get() {
        InstitutePickerViewModel a2 = this.f5698a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
