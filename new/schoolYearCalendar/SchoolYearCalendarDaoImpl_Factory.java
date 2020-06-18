package hu.ekreta.ellenorzo.schoolYearCalendar;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class SchoolYearCalendarDaoImpl_Factory implements c<SchoolYearCalendarDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f6074a;

    public SchoolYearCalendarDaoImpl_Factory(a<c0> aVar) {
        this.f6074a = aVar;
    }

    public SchoolYearCalendarDaoImpl get() {
        return new SchoolYearCalendarDaoImpl(this.f6074a.get());
    }
}
