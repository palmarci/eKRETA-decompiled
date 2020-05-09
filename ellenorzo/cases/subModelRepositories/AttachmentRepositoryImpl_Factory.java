package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepositoryImpl_Factory */
public final class AttachmentRepositoryImpl_Factory implements C4463c<AttachmentRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11515a;

    public AttachmentRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11515a = aVar;
    }

    public AttachmentRepositoryImpl get() {
        return new AttachmentRepositoryImpl((EAdminApi) this.f11515a.get());
    }
}
