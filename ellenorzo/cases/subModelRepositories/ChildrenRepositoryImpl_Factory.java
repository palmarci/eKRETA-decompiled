package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepositoryImpl_Factory */
public final class ChildrenRepositoryImpl_Factory implements C4463c<ChildrenRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f11519a;

    public ChildrenRepositoryImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f11519a = aVar;
    }

    public ChildrenRepositoryImpl get() {
        return new ChildrenRepositoryImpl((EAdminApi) this.f11519a.get());
    }
}
