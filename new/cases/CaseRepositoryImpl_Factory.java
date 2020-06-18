package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class CaseRepositoryImpl_Factory implements c<CaseRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5103a;
    public final a<CaseDao> b;
    public final a<CaseFactory> c;

    public CaseRepositoryImpl_Factory(a<EAdminApi> aVar, a<CaseDao> aVar2, a<CaseFactory> aVar3) {
        this.f5103a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public CaseRepositoryImpl get() {
        return new CaseRepositoryImpl(this.f5103a.get(), this.b.get(), this.c.get());
    }
}
