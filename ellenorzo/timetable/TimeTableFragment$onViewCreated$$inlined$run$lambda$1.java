package p289hu.ekreta.ellenorzo.timetable;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p000a.p175l.p176a.C2707o;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "<anonymous parameter 2>", "", "onDateSelected", "hu/ekreta/ellenorzo/timetable/TimeTableFragment$onViewCreated$1$3"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$onViewCreated$$inlined$run$lambda$1 */
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$$inlined$run$lambda$1 implements C2707o {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarView f15107a;

    /* renamed from: b */
    public final /* synthetic */ TimeTableFragment f15108b;

    public TimeTableFragment$onViewCreated$$inlined$run$lambda$1(MaterialCalendarView materialCalendarView, TimeTableFragment timeTableFragment) {
        this.f15107a = materialCalendarView;
        this.f15108b = timeTableFragment;
    }

    /* renamed from: a */
    public final void mo5140a(MaterialCalendarView materialCalendarView, C2682b bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(materialCalendarView, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        if ((!Intrinsics.areEqual((Object) this.f15108b.mo15985C0().mo16131t0(), (Object) bVar)) && (Intrinsics.areEqual((Object) this.f15108b.mo15985C0().mo16131t0(), (Object) C2682b.m5589d()) || Intrinsics.areEqual((Object) bVar, (Object) C2682b.m5589d()))) {
            this.f15107a.mo8477h();
        }
        this.f15108b.mo15985C0().mo16130a(bVar);
    }
}
