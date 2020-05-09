package p289hu.ekreta.ellenorzo.cases.detail;

import p211h.p271p.C3807e;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3818m;
import p211h.p271p.C3823q;

/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl_LifecycleAdapter */
public class CaseDetailsViewModelImpl_LifecycleAdapter implements C3807e {

    /* renamed from: a */
    public final CaseDetailsViewModelImpl f11510a;

    public CaseDetailsViewModelImpl_LifecycleAdapter(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.f11510a = caseDetailsViewModelImpl;
    }

    /* renamed from: a */
    public void mo10805a(C3818m mVar, C3811a aVar, boolean z, C3823q qVar) {
        boolean z2 = qVar != null;
        if (!z && aVar == C3811a.ON_RESUME && (!z2 || qVar.mo10816a("loadCaseById", 1))) {
            this.f11510a.loadCaseById();
        }
    }
}
