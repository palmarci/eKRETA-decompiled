package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepositoryImpl_Factory */
public final class TmgiCaseTypeRepositoryImpl_Factory implements C4463c<TmgiCaseTypeRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11525a;

    public TmgiCaseTypeRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11525a = aVar;
    }

    public TmgiCaseTypeRepositoryImpl get() {
        return new TmgiCaseTypeRepositoryImpl((EAdminApi) this.f11525a.get());
    }
}
