package p289hu.ekreta.ellenorzo.cases;

import p289hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.CaseDaoImpl_Factory */
public final class CaseDaoImpl_Factory implements C4463c<CaseDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f11289a;

    /* renamed from: b */
    public final C5431a<CaseFactory> f11290b;

    public CaseDaoImpl_Factory(C5431a<C5061c0> aVar, C5431a<CaseFactory> aVar2) {
        this.f11289a = aVar;
        this.f11290b = aVar2;
    }

    public CaseDaoImpl get() {
        return new CaseDaoImpl((C5061c0) this.f11289a.get(), (CaseFactory) this.f11290b.get());
    }
}
