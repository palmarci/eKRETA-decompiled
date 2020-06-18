package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class CaseTypeRepositoryImpl_Factory implements c<CaseTypeRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5151a;

    public CaseTypeRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5151a = aVar;
    }

    public CaseTypeRepositoryImpl get() {
        return new CaseTypeRepositoryImpl(this.f5151a.get());
    }
}
