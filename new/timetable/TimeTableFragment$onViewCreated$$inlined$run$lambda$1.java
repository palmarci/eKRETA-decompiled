package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import a.l.a.o;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "<anonymous parameter 2>", "", "onDateSelected", "hu/ekreta/ellenorzo/timetable/TimeTableFragment$onViewCreated$1$3"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$$inlined$run$lambda$1 implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarView f6219a;
    public final /* synthetic */ TimeTableFragment b;

    public TimeTableFragment$onViewCreated$$inlined$run$lambda$1(MaterialCalendarView materialCalendarView, TimeTableFragment timeTableFragment) {
        this.f6219a = materialCalendarView;
        this.b = timeTableFragment;
    }

    public final void a(MaterialCalendarView materialCalendarView, b bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(materialCalendarView, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        if ((!Intrinsics.areEqual((Object) this.b.C0().u0(), (Object) bVar)) && (Intrinsics.areEqual((Object) this.b.C0().u0(), (Object) b.d()) || Intrinsics.areEqual((Object) bVar, (Object) b.d()))) {
            this.f6219a.h();
        }
        this.b.C0().a(bVar);
    }
}
