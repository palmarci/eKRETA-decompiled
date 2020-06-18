package hu.ekreta.ellenorzo.classmaster;

import h.w.v;
import i.d.c;
import l.a.a;

public final class ClassMastersFragmentModule_ProvideViewModelFactory implements c<ClassMastersViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final ClassMastersFragmentModule f5286a;
    public final a<ClassMastersFragment> b;
    public final a<ClassMastersViewModelImpl> c;

    public ClassMastersFragmentModule_ProvideViewModelFactory(ClassMastersFragmentModule classMastersFragmentModule, a<ClassMastersFragment> aVar, a<ClassMastersViewModelImpl> aVar2) {
        this.f5286a = classMastersFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public ClassMastersViewModel get() {
        ClassMastersViewModel a2 = this.f5286a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
