package p289hu.ekreta.ellenorzo.subject;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsFragmentModule_ProvideViewModelFactory */
public final class SubjectsFragmentModule_ProvideViewModelFactory implements C4463c<SubjectsViewModel> {

    /* renamed from: a */
    public final SubjectsFragmentModule f14853a;

    /* renamed from: b */
    public final C5431a<SubjectsFragment> f14854b;

    /* renamed from: c */
    public final C5431a<SubjectsViewModelImpl> f14855c;

    public SubjectsFragmentModule_ProvideViewModelFactory(SubjectsFragmentModule subjectsFragmentModule, C5431a<SubjectsFragment> aVar, C5431a<SubjectsViewModelImpl> aVar2) {
        this.f14853a = subjectsFragmentModule;
        this.f14854b = aVar;
        this.f14855c = aVar2;
    }

    public SubjectsViewModel get() {
        SubjectsViewModel a = this.f14853a.mo15739a((SubjectsFragment) this.f14854b.get(), this.f14855c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
