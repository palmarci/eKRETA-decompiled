package p289hu.ekreta.ellenorzo.timetable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p000a.p175l.p176a.C2699i;
import p000a.p175l.p176a.C2700j;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TodayDayViewDecorator;", "Lcom/prolificinteractive/materialcalendarview/DayViewDecorator;", "calendar", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V", "backgroundRes", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getBackgroundRes", "()Landroid/graphics/drawable/Drawable;", "today", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "getToday", "()Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "decorate", "", "view", "Lcom/prolificinteractive/materialcalendarview/DayViewFacade;", "shouldDecorate", "", "day", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TodayDayViewDecorator */
/* compiled from: TodayDayViewDecorator.kt */
public final class TodayDayViewDecorator implements C2699i {

    /* renamed from: a */
    public final C2682b f15208a;

    /* renamed from: b */
    public final Drawable f15209b;

    /* renamed from: c */
    public final MaterialCalendarView f15210c;

    public TodayDayViewDecorator(MaterialCalendarView materialCalendarView) {
        Intrinsics.checkParameterIsNotNull(materialCalendarView, "calendar");
        this.f15210c = materialCalendarView;
        C2682b d = C2682b.m5589d();
        Intrinsics.checkExpressionValueIsNotNull(d, "CalendarDay.today()");
        this.f15208a = d;
        Context context = this.f15210c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "calendar.context");
        this.f15209b = context.getResources().getDrawable(C4014R.C4015drawable.circle_calendar_today, null);
    }

    /* renamed from: a */
    public boolean mo5137a(C2682b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "day");
        return Intrinsics.areEqual((Object) bVar, (Object) this.f15208a) && (Intrinsics.areEqual((Object) bVar, (Object) this.f15210c.getSelectedDate()) ^ true);
    }

    /* renamed from: a */
    public void mo5136a(C2700j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "view");
        jVar.mo5138a(this.f15209b);
    }
}
