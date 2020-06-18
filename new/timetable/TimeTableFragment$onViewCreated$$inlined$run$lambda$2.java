package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import a.l.a.p;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "kotlin.jvm.PlatformType", "date", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "onMonthChanged", "hu/ekreta/ellenorzo/timetable/TimeTableFragment$onViewCreated$1$4"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$$inlined$run$lambda$2 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarView f6220a;
    public final /* synthetic */ TimeTableFragment b;

    public TimeTableFragment$onViewCreated$$inlined$run$lambda$2(MaterialCalendarView materialCalendarView, TimeTableFragment timeTableFragment) {
        this.f6220a = materialCalendarView;
        this.b = timeTableFragment;
    }

    public final void a(MaterialCalendarView materialCalendarView, b bVar) {
        this.f6220a.setSelectedDate(bVar);
        this.b.C0().a(bVar);
    }
}
