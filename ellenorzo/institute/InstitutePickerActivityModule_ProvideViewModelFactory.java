package p289hu.ekreta.ellenorzo.institute;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerActivityModule_ProvideViewModelFactory */
public final class InstitutePickerActivityModule_ProvideViewModelFactory implements C4463c<InstitutePickerViewModel> {

    /* renamed from: a */
    public final InstitutePickerActivityModule f13588a;

    /* renamed from: b */
    public final C5431a<InstitutePickerActivity> f13589b;

    /* renamed from: c */
    public final C5431a<InstitutePickerViewModelImpl> f13590c;

    public InstitutePickerActivityModule_ProvideViewModelFactory(InstitutePickerActivityModule institutePickerActivityModule, C5431a<InstitutePickerActivity> aVar, C5431a<InstitutePickerViewModelImpl> aVar2) {
        this.f13588a = institutePickerActivityModule;
        this.f13589b = aVar;
        this.f13590c = aVar2;
    }

    public InstitutePickerViewModel get() {
        InstitutePickerViewModel a = this.f13588a.mo13079a((InstitutePickerActivity) this.f13589b.get(), this.f13590c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
