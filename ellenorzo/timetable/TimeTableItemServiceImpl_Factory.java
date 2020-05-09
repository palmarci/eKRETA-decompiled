package p289hu.ekreta.ellenorzo.timetable;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemServiceImpl_Factory */
public final class TimeTableItemServiceImpl_Factory implements C4463c<TimeTableItemServiceImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f15192a;

    public TimeTableItemServiceImpl_Factory(C5431a<MobileApiV3> aVar) {
        this.f15192a = aVar;
    }

    public TimeTableItemServiceImpl get() {
        return new TimeTableItemServiceImpl((MobileApiV3) this.f15192a.get());
    }
}
