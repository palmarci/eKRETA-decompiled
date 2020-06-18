package hu.ekreta.ellenorzo.subject;

import h.w.v;
import i.d.c;
import l.a.a;

public final class SubjectsFragmentModule_ProvideViewModelFactory implements c<SubjectsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final SubjectsFragmentModule f6147a;
    public final a<SubjectsFragment> b;
    public final a<SubjectsViewModelImpl> c;

    public SubjectsFragmentModule_ProvideViewModelFactory(SubjectsFragmentModule subjectsFragmentModule, a<SubjectsFragment> aVar, a<SubjectsViewModelImpl> aVar2) {
        this.f6147a = subjectsFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public SubjectsViewModel get() {
        SubjectsViewModel a2 = this.f6147a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
