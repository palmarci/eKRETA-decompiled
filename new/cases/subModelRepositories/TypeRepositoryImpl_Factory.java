package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class TypeRepositoryImpl_Factory implements c<TypeRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5160a;

    public TypeRepositoryImpl get() {
        return new TypeRepositoryImpl(this.f5160a.get());
    }
}
