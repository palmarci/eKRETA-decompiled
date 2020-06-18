package hu.ekreta.ellenorzo.timetable;

import i.d.c;
import l.a.a;

public final class TimeTableItemRepositoryImpl_Factory implements c<TimeTableItemRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<TimeTableItemDao> f6249a;
    public final a<TimeTableItemService> b;

    public TimeTableItemRepositoryImpl_Factory(a<TimeTableItemDao> aVar, a<TimeTableItemService> aVar2) {
        this.f6249a = aVar;
        this.b = aVar2;
    }

    public TimeTableItemRepositoryImpl get() {
        return new TimeTableItemRepositoryImpl(this.f6249a.get(), this.b.get());
    }
}
