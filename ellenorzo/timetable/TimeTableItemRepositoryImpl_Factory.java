package p289hu.ekreta.ellenorzo.timetable;

import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl_Factory */
public final class TimeTableItemRepositoryImpl_Factory implements C4463c<TimeTableItemRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<TimeTableItemDao> f15185a;

    /* renamed from: b */
    public final C5431a<TimeTableItemService> f15186b;

    public TimeTableItemRepositoryImpl_Factory(C5431a<TimeTableItemDao> aVar, C5431a<TimeTableItemService> aVar2) {
        this.f15185a = aVar;
        this.f15186b = aVar2;
    }

    public TimeTableItemRepositoryImpl get() {
        return new TimeTableItemRepositoryImpl((TimeTableItemDao) this.f15185a.get(), (TimeTableItemService) this.f15186b.get());
    }
}
