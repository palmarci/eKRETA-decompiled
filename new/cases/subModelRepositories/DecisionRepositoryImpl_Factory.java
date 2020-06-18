package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class DecisionRepositoryImpl_Factory implements c<DecisionRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5155a;

    public DecisionRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5155a = aVar;
    }

    public DecisionRepositoryImpl get() {
        return new DecisionRepositoryImpl(this.f5155a.get());
    }
}
