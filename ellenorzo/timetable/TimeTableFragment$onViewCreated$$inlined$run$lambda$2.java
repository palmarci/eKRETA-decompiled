package p289hu.ekreta.ellenorzo.timetable;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import kotlin.Metadata;
import p000a.p175l.p176a.C2682b;
import p000a.p175l.p176a.C2708p;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "kotlin.jvm.PlatformType", "date", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "onMonthChanged", "hu/ekreta/ellenorzo/timetable/TimeTableFragment$onViewCreated$1$4"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$onViewCreated$$inlined$run$lambda$2 */
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$$inlined$run$lambda$2 implements C2708p {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarView f15109a;

    /* renamed from: b */
    public final /* synthetic */ TimeTableFragment f15110b;

    public TimeTableFragment$onViewCreated$$inlined$run$lambda$2(MaterialCalendarView materialCalendarView, TimeTableFragment timeTableFragment) {
        this.f15109a = materialCalendarView;
        this.f15110b = timeTableFragment;
    }

    /* renamed from: a */
    public final void mo5141a(MaterialCalendarView materialCalendarView, C2682b bVar) {
        this.f15109a.setSelectedDate(bVar);
        this.f15110b.mo15985C0().mo16130a(bVar);
    }
}
