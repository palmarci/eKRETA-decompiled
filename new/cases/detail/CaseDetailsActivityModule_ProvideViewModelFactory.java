package hu.ekreta.ellenorzo.cases.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class CaseDetailsActivityModule_ProvideViewModelFactory implements c<CaseDetailsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final CaseDetailsActivityModule f5131a;
    public final a<CaseDetailsActivity> b;
    public final a<CaseDetailsViewModelImpl> c;

    public CaseDetailsActivityModule_ProvideViewModelFactory(CaseDetailsActivityModule caseDetailsActivityModule, a<CaseDetailsActivity> aVar, a<CaseDetailsViewModelImpl> aVar2) {
        this.f5131a = caseDetailsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public CaseDetailsViewModel get() {
        CaseDetailsViewModel a2 = this.f5131a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
