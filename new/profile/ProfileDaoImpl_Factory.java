package hu.ekreta.ellenorzo.profile;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class ProfileDaoImpl_Factory implements c<ProfileDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f6014a;

    public ProfileDaoImpl_Factory(a<c0> aVar) {
        this.f6014a = aVar;
    }

    public ProfileDaoImpl get() {
        return new ProfileDaoImpl(this.f6014a.get());
    }
}
