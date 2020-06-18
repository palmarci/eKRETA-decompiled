package hu.ekreta.ellenorzo.timetable.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class TimeTableItemDetailActivityModule_ProvideViewModelFactory implements c<TimeTableItemDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final TimeTableItemDetailActivityModule f6256a;
    public final a<TimeTableItemDetailActivity> b;
    public final a<TimeTableItemDetailViewModelImpl> c;

    public TimeTableItemDetailActivityModule_ProvideViewModelFactory(TimeTableItemDetailActivityModule timeTableItemDetailActivityModule, a<TimeTableItemDetailActivity> aVar, a<TimeTableItemDetailViewModelImpl> aVar2) {
        this.f6256a = timeTableItemDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public TimeTableItemDetailViewModel get() {
        TimeTableItemDetailViewModel a2 = this.f6256a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
