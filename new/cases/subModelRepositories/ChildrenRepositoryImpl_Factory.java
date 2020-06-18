package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class ChildrenRepositoryImpl_Factory implements c<ChildrenRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5153a;

    public ChildrenRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5153a = aVar;
    }

    public ChildrenRepositoryImpl get() {
        return new ChildrenRepositoryImpl(this.f5153a.get());
    }
}
