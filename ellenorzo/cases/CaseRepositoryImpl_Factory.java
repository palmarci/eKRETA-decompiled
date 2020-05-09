package p289hu.ekreta.ellenorzo.cases;

import p289hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl_Factory */
public final class CaseRepositoryImpl_Factory implements C4463c<CaseRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11327a;

    /* renamed from: b */
    public final C5431a<CaseDao> f11328b;

    /* renamed from: c */
    public final C5431a<CaseFactory> f11329c;

    public CaseRepositoryImpl_Factory(C5431a<EAdminApi> aVar, C5431a<CaseDao> aVar2, C5431a<CaseFactory> aVar3) {
        this.f11327a = aVar;
        this.f11328b = aVar2;
        this.f11329c = aVar3;
    }

    public CaseRepositoryImpl get() {
        return new CaseRepositoryImpl((EAdminApi) this.f11327a.get(), (CaseDao) this.f11328b.get(), (CaseFactory) this.f11329c.get());
    }
}
