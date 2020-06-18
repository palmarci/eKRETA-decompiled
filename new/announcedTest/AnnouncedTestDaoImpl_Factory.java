package hu.ekreta.ellenorzo.announcedTest;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class AnnouncedTestDaoImpl_Factory implements c<AnnouncedTestDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5013a;

    public AnnouncedTestDaoImpl_Factory(a<c0> aVar) {
        this.f5013a = aVar;
    }

    public AnnouncedTestDaoImpl get() {
        return new AnnouncedTestDaoImpl(this.f5013a.get());
    }
}
