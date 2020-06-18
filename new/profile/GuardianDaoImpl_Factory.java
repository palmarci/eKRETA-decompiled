package hu.ekreta.ellenorzo.profile;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class GuardianDaoImpl_Factory implements c<GuardianDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5998a;

    public GuardianDaoImpl_Factory(a<c0> aVar) {
        this.f5998a = aVar;
    }

    public GuardianDaoImpl get() {
        return new GuardianDaoImpl(this.f5998a.get());
    }
}
