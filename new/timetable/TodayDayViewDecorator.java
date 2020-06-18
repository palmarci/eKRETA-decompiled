package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import a.l.a.i;
import a.l.a.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TodayDayViewDecorator;", "Lcom/prolificinteractive/materialcalendarview/DayViewDecorator;", "calendar", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V", "backgroundRes", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getBackgroundRes", "()Landroid/graphics/drawable/Drawable;", "today", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "getToday", "()Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "decorate", "", "view", "Lcom/prolificinteractive/materialcalendarview/DayViewFacade;", "shouldDecorate", "", "day", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TodayDayViewDecorator.kt */
public final class TodayDayViewDecorator implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b f6254a;
    public final Drawable b;
    public final MaterialCalendarView c;

    public TodayDayViewDecorator(MaterialCalendarView materialCalendarView) {
        Intrinsics.checkParameterIsNotNull(materialCalendarView, "calendar");
        this.c = materialCalendarView;
        b d2 = b.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "CalendarDay.today()");
        this.f6254a = d2;
        Context context = this.c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "calendar.context");
        this.b = context.getResources().getDrawable(R.drawable.circle_calendar_today, (Resources.Theme) null);
    }

    public boolean a(b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "day");
        return Intrinsics.areEqual((Object) bVar, (Object) this.f6254a) && (Intrinsics.areEqual((Object) bVar, (Object) this.c.getSelectedDate()) ^ true);
    }

    public void a(j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "view");
        jVar.a(this.b);
    }
}
