package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class TimeTableItemServiceImpl_Factory implements c<TimeTableItemServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f6251a;

    public TimeTableItemServiceImpl_Factory(a<MobileApiV3> aVar) {
        this.f6251a = aVar;
    }

    public TimeTableItemServiceImpl get() {
        return new TimeTableItemServiceImpl(this.f6251a.get());
    }
}
