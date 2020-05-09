package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepositoryImpl_Factory */
public final class SignerRepositoryImpl_Factory implements C4463c<SignerRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11523a;

    public SignerRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11523a = aVar;
    }

    public SignerRepositoryImpl get() {
        return new SignerRepositoryImpl((EAdminApi) this.f11523a.get());
    }
}
