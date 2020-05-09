package p289hu.ekreta.ellenorzo.classmaster;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragmentModule_ProvideViewModelFactory */
public final class ClassMastersFragmentModule_ProvideViewModelFactory implements C4463c<ClassMastersViewModel> {

    /* renamed from: a */
    public final ClassMastersFragmentModule f11864a;

    /* renamed from: b */
    public final C5431a<ClassMastersFragment> f11865b;

    /* renamed from: c */
    public final C5431a<ClassMastersViewModelImpl> f11866c;

    public ClassMastersFragmentModule_ProvideViewModelFactory(ClassMastersFragmentModule classMastersFragmentModule, C5431a<ClassMastersFragment> aVar, C5431a<ClassMastersViewModelImpl> aVar2) {
        this.f11864a = classMastersFragmentModule;
        this.f11865b = aVar;
        this.f11866c = aVar2;
    }

    public ClassMastersViewModel get() {
        ClassMastersViewModel a = this.f11864a.mo12295a((ClassMastersFragment) this.f11865b.get(), this.f11866c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
