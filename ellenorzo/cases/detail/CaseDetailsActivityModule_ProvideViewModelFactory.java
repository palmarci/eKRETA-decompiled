package p289hu.ekreta.ellenorzo.cases.detail;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsActivityModule_ProvideViewModelFactory */
public final class CaseDetailsActivityModule_ProvideViewModelFactory implements C4463c<CaseDetailsViewModel> {

    /* renamed from: a */
    public final CaseDetailsActivityModule f11443a;

    /* renamed from: b */
    public final C5431a<CaseDetailsActivity> f11444b;

    /* renamed from: c */
    public final C5431a<CaseDetailsViewModelImpl> f11445c;

    public CaseDetailsActivityModule_ProvideViewModelFactory(CaseDetailsActivityModule caseDetailsActivityModule, C5431a<CaseDetailsActivity> aVar, C5431a<CaseDetailsViewModelImpl> aVar2) {
        this.f11443a = caseDetailsActivityModule;
        this.f11444b = aVar;
        this.f11445c = aVar2;
    }

    public CaseDetailsViewModel get() {
        CaseDetailsViewModel a = this.f11443a.mo11782a((CaseDetailsActivity) this.f11444b.get(), this.f11445c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
