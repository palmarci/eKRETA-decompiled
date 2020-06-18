package hu.ekreta.ellenorzo.cases.detail;

import h.p.e;
import h.p.h;
import h.p.m;
import h.p.q;

public class CaseDetailsViewModelImpl_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    public final CaseDetailsViewModelImpl f5144a;

    public CaseDetailsViewModelImpl_LifecycleAdapter(CaseDetailsViewModelImpl caseDetailsViewModelImpl) {
        this.f5144a = caseDetailsViewModelImpl;
    }

    public void a(m mVar, h.a aVar, boolean z, q qVar) {
        boolean z2 = qVar != null;
        if (z || aVar != h.a.ON_RESUME) {
            return;
        }
        if (!z2 || qVar.a("loadCaseById", 1)) {
            this.f5144a.loadCaseById();
        }
    }
}
