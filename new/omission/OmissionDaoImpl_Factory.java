package hu.ekreta.ellenorzo.omission;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class OmissionDaoImpl_Factory implements c<OmissionDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5949a;

    public OmissionDaoImpl_Factory(a<c0> aVar) {
        this.f5949a = aVar;
    }

    public OmissionDaoImpl get() {
        return new OmissionDaoImpl(this.f5949a.get());
    }
}
