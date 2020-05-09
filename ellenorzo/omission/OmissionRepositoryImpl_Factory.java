package p289hu.ekreta.ellenorzo.omission;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl_Factory */
public final class OmissionRepositoryImpl_Factory implements C4463c<OmissionRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14425a;

    /* renamed from: b */
    public final C5431a<OmissionDao> f14426b;

    public OmissionRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<OmissionDao> aVar2) {
        this.f14425a = aVar;
        this.f14426b = aVar2;
    }

    public OmissionRepositoryImpl get() {
        return new OmissionRepositoryImpl((MobileApiV3) this.f14425a.get(), (OmissionDao) this.f14426b.get());
    }
}
