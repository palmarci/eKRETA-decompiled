package hu.ekreta.ellenorzo.timetable.detail;

import h.m.d.d;
import h.w.v;
import i.d.c;
import l.a.a;

public final class TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory implements c<a.k.a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final TimeTableItemDetailActivityModule f6255a;
    public final a<d> b;

    public TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory(TimeTableItemDetailActivityModule timeTableItemDetailActivityModule, a<d> aVar) {
        this.f6255a = timeTableItemDetailActivityModule;
        this.b = aVar;
    }

    public a.k.a.c get() {
        a.k.a.c a2 = this.f6255a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
