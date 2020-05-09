package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepositoryImpl_Factory */
public final class DecisionRepositoryImpl_Factory implements C4463c<DecisionRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11521a;

    public DecisionRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11521a = aVar;
    }

    public DecisionRepositoryImpl get() {
        return new DecisionRepositoryImpl((EAdminApi) this.f11521a.get());
    }
}
