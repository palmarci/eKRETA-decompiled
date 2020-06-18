package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class SignerRepositoryImpl_Factory implements c<SignerRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5157a;

    public SignerRepositoryImpl_Factory(a<EAdminApi> aVar) {
        this.f5157a = aVar;
    }

    public SignerRepositoryImpl get() {
        return new SignerRepositoryImpl(this.f5157a.get());
    }
}
