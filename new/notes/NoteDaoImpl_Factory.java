package hu.ekreta.ellenorzo.notes;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class NoteDaoImpl_Factory implements c<NoteDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5852a;

    public NoteDaoImpl_Factory(a<c0> aVar) {
        this.f5852a = aVar;
    }

    public NoteDaoImpl get() {
        return new NoteDaoImpl(this.f5852a.get());
    }
}
