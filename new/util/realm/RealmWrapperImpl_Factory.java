package hu.ekreta.ellenorzo.util.realm;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class RealmWrapperImpl_Factory implements c<RealmWrapperImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f6322a;

    public RealmWrapperImpl_Factory(a<c0> aVar) {
        this.f6322a = aVar;
    }

    public RealmWrapperImpl get() {
        return new RealmWrapperImpl(this.f6322a.get());
    }
}
