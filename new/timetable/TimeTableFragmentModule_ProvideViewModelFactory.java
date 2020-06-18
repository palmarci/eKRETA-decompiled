package hu.ekreta.ellenorzo.timetable;

import h.w.v;
import i.d.c;
import l.a.a;

public final class TimeTableFragmentModule_ProvideViewModelFactory implements c<TimeTableViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final TimeTableFragmentModule f6221a;
    public final a<TimeTableFragment> b;
    public final a<TimeTableViewModelImpl> c;

    public TimeTableFragmentModule_ProvideViewModelFactory(TimeTableFragmentModule timeTableFragmentModule, a<TimeTableFragment> aVar, a<TimeTableViewModelImpl> aVar2) {
        this.f6221a = timeTableFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public TimeTableViewModel get() {
        TimeTableViewModel a2 = this.f6221a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
