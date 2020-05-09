package p289hu.ekreta.ellenorzo.timetable;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragmentModule_ProvideViewModelFactory */
public final class TimeTableFragmentModule_ProvideViewModelFactory implements C4463c<TimeTableViewModel> {

    /* renamed from: a */
    public final TimeTableFragmentModule f15112a;

    /* renamed from: b */
    public final C5431a<TimeTableFragment> f15113b;

    /* renamed from: c */
    public final C5431a<TimeTableViewModelImpl> f15114c;

    public TimeTableFragmentModule_ProvideViewModelFactory(TimeTableFragmentModule timeTableFragmentModule, C5431a<TimeTableFragment> aVar, C5431a<TimeTableViewModelImpl> aVar2) {
        this.f15112a = timeTableFragmentModule;
        this.f15113b = aVar;
        this.f15114c = aVar2;
    }

    public TimeTableViewModel get() {
        TimeTableViewModel a = this.f15112a.mo15991a((TimeTableFragment) this.f15113b.get(), this.f15114c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
