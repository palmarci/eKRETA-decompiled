package hu.ekreta.ellenorzo.homework;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class HomeworkDaoImpl_Factory implements c<HomeworkDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5657a;

    public HomeworkDaoImpl_Factory(a<c0> aVar) {
        this.f5657a = aVar;
    }

    public HomeworkDaoImpl get() {
        return new HomeworkDaoImpl(this.f5657a.get());
    }
}
