package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDaoImpl_Factory */
public final class SchoolYearCalendarDaoImpl_Factory implements C4463c<SchoolYearCalendarDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14712a;

    public SchoolYearCalendarDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14712a = aVar;
    }

    public SchoolYearCalendarDaoImpl get() {
        return new SchoolYearCalendarDaoImpl((C5061c0) this.f14712a.get());
    }
}
