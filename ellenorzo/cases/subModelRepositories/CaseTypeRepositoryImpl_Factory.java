package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepositoryImpl_Factory */
public final class CaseTypeRepositoryImpl_Factory implements C4463c<CaseTypeRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11517a;

    public CaseTypeRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11517a = aVar;
    }

    public CaseTypeRepositoryImpl get() {
        return new CaseTypeRepositoryImpl((EAdminApi) this.f11517a.get());
    }
}
