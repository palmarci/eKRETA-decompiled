package hu.ekreta.ellenorzo.timetable;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class TimeTableItemDaoImpl_Factory implements c<TimeTableItemDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f6235a;

    public TimeTableItemDaoImpl_Factory(a<c0> aVar) {
        this.f6235a = aVar;
    }

    public TimeTableItemDaoImpl get() {
        return new TimeTableItemDaoImpl(this.f6235a.get());
    }
}
