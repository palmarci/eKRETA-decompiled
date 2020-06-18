package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class OmissionRepositoryImpl_Factory implements c<OmissionRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5964a;
    public final a<OmissionDao> b;

    public OmissionRepositoryImpl_Factory(a<MobileApiV3> aVar, a<OmissionDao> aVar2) {
        this.f5964a = aVar;
        this.b = aVar2;
    }

    public OmissionRepositoryImpl get() {
        return new OmissionRepositoryImpl(this.f5964a.get(), this.b.get());
    }
}
