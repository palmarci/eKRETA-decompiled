package p289hu.ekreta.ellenorzo.timetable.detail;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivityModule_ProvideViewModelFactory */
public final class TimeTableItemDetailActivityModule_ProvideViewModelFactory implements C4463c<TimeTableItemDetailViewModel> {

    /* renamed from: a */
    public final TimeTableItemDetailActivityModule f15215a;

    /* renamed from: b */
    public final C5431a<TimeTableItemDetailActivity> f15216b;

    /* renamed from: c */
    public final C5431a<TimeTableItemDetailViewModelImpl> f15217c;

    public TimeTableItemDetailActivityModule_ProvideViewModelFactory(TimeTableItemDetailActivityModule timeTableItemDetailActivityModule, C5431a<TimeTableItemDetailActivity> aVar, C5431a<TimeTableItemDetailViewModelImpl> aVar2) {
        this.f15215a = timeTableItemDetailActivityModule;
        this.f15216b = aVar;
        this.f15217c = aVar2;
    }

    public TimeTableItemDetailViewModel get() {
        TimeTableItemDetailViewModel a = this.f15215a.mo16141a((TimeTableItemDetailActivity) this.f15216b.get(), this.f15217c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
