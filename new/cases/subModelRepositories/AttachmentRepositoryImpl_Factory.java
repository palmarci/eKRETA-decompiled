package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class AttachmentRepositoryImpl_Factory implements c<AttachmentRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5149a;
    public final a<MobileApiV3> b;

    public AttachmentRepositoryImpl_Factory(a<EAdminApi> aVar, a<MobileApiV3> aVar2) {
        this.f5149a = aVar;
        this.b = aVar2;
    }

    public AttachmentRepositoryImpl get() {
        return new AttachmentRepositoryImpl(this.f5149a.get(), this.b.get());
    }
}
