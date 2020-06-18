package hu.ekreta.ellenorzo.subject;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class SubjectDaoImpl_Factory implements c<SubjectDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f6137a;

    public SubjectDaoImpl_Factory(a<c0> aVar) {
        this.f6137a = aVar;
    }

    public SubjectDaoImpl get() {
        return new SubjectDaoImpl(this.f6137a.get());
    }
}
