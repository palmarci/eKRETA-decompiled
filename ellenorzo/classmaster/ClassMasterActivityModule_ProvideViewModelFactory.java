package p289hu.ekreta.ellenorzo.classmaster;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterActivityModule_ProvideViewModelFactory */
public final class ClassMasterActivityModule_ProvideViewModelFactory implements C4463c<ClassMasterViewModel> {

    /* renamed from: a */
    public final ClassMasterActivityModule f11800a;

    /* renamed from: b */
    public final C5431a<ClassMasterActivity> f11801b;

    /* renamed from: c */
    public final C5431a<ClassMasterViewModelImpl> f11802c;

    public ClassMasterActivityModule_ProvideViewModelFactory(ClassMasterActivityModule classMasterActivityModule, C5431a<ClassMasterActivity> aVar, C5431a<ClassMasterViewModelImpl> aVar2) {
        this.f11800a = classMasterActivityModule;
        this.f11801b = aVar;
        this.f11802c = aVar2;
    }

    public ClassMasterViewModel get() {
        ClassMasterViewModel a = this.f11800a.mo12231a((ClassMasterActivity) this.f11801b.get(), this.f11802c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
