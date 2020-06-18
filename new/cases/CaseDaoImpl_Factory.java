package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import i.d.c;
import k.c.c0;
import l.a.a;

public final class CaseDaoImpl_Factory implements c<CaseDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5088a;
    public final a<CaseFactory> b;

    public CaseDaoImpl_Factory(a<c0> aVar, a<CaseFactory> aVar2) {
        this.f5088a = aVar;
        this.b = aVar2;
    }

    public CaseDaoImpl get() {
        return new CaseDaoImpl(this.f5088a.get(), this.b.get());
    }
}
