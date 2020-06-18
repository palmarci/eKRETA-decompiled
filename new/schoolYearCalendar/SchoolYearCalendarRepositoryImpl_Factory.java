package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class SchoolYearCalendarRepositoryImpl_Factory implements c<SchoolYearCalendarRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f6095a;
    public final a<SchoolYearCalendarDao> b;

    public SchoolYearCalendarRepositoryImpl_Factory(a<MobileApiV3> aVar, a<SchoolYearCalendarDao> aVar2) {
        this.f6095a = aVar;
        this.b = aVar2;
    }

    public SchoolYearCalendarRepositoryImpl get() {
        return new SchoolYearCalendarRepositoryImpl(this.f6095a.get(), this.b.get());
    }
}
