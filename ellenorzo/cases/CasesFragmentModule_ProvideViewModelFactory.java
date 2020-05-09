package p289hu.ekreta.ellenorzo.cases;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.CasesFragmentModule_ProvideViewModelFactory */
public final class CasesFragmentModule_ProvideViewModelFactory implements C4463c<CasesViewModel> {

    /* renamed from: a */
    public final CasesFragmentModule f11338a;

    /* renamed from: b */
    public final C5431a<CasesFragment> f11339b;

    /* renamed from: c */
    public final C5431a<CasesViewModelImpl> f11340c;

    public CasesFragmentModule_ProvideViewModelFactory(CasesFragmentModule casesFragmentModule, C5431a<CasesFragment> aVar, C5431a<CasesViewModelImpl> aVar2) {
        this.f11338a = casesFragmentModule;
        this.f11339b = aVar;
        this.f11340c = aVar2;
    }

    public CasesViewModel get() {
        CasesViewModel a = this.f11338a.mo11686a((CasesFragment) this.f11339b.get(), this.f11340c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
