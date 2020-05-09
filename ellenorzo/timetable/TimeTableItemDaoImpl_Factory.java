package p289hu.ekreta.ellenorzo.timetable;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl_Factory */
public final class TimeTableItemDaoImpl_Factory implements C4463c<TimeTableItemDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f15150a;

    public TimeTableItemDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f15150a = aVar;
    }

    public TimeTableItemDaoImpl get() {
        return new TimeTableItemDaoImpl((C5061c0) this.f15150a.get());
    }
}
