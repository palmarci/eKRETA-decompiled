package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepositoryImpl_Factory */
public final class SchoolYearCalendarRepositoryImpl_Factory implements C4463c<SchoolYearCalendarRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14759a;

    /* renamed from: b */
    public final C5431a<SchoolYearCalendarDao> f14760b;

    public SchoolYearCalendarRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<SchoolYearCalendarDao> aVar2) {
        this.f14759a = aVar;
        this.f14760b = aVar2;
    }

    public SchoolYearCalendarRepositoryImpl get() {
        return new SchoolYearCalendarRepositoryImpl((MobileApiV3) this.f14759a.get(), (SchoolYearCalendarDao) this.f14760b.get());
    }
}
