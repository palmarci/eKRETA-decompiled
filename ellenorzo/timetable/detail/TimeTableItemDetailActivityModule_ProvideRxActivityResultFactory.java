package p289hu.ekreta.ellenorzo.timetable.detail;

import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory */
public final class TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory implements C4463c<C2676c> {

    /* renamed from: a */
    public final TimeTableItemDetailActivityModule f15213a;

    /* renamed from: b */
    public final C5431a<C3737d> f15214b;

    public TimeTableItemDetailActivityModule_ProvideRxActivityResultFactory(TimeTableItemDetailActivityModule timeTableItemDetailActivityModule, C5431a<C3737d> aVar) {
        this.f15213a = timeTableItemDetailActivityModule;
        this.f15214b = aVar;
    }

    public C2676c get() {
        C2676c a = this.f15213a.mo16140a((C3737d) this.f15214b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
