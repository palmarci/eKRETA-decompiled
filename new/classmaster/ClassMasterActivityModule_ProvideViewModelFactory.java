package hu.ekreta.ellenorzo.classmaster;

import h.w.v;
import i.d.c;
import l.a.a;

public final class ClassMasterActivityModule_ProvideViewModelFactory implements c<ClassMasterViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final ClassMasterActivityModule f5269a;
    public final a<ClassMasterActivity> b;
    public final a<ClassMasterViewModelImpl> c;

    public ClassMasterActivityModule_ProvideViewModelFactory(ClassMasterActivityModule classMasterActivityModule, a<ClassMasterActivity> aVar, a<ClassMasterViewModelImpl> aVar2) {
        this.f5269a = classMasterActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public ClassMasterViewModel get() {
        ClassMasterViewModel a2 = this.f5269a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
