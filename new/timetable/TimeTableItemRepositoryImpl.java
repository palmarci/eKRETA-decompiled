package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import h.w.v;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JT\u0010\u0013\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0014*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r \u0014*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0014*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r\u0018\u00010\f0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepositoryImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "timeTableItemDao", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "timeTableItemService", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;)V", "getTimeTableItemDao", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "getTimeTableItemService", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "fetchTimeTableItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getTimeTableItems", "kotlin.jvm.PlatformType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl implements TimeTableItemRepository {

    /* renamed from: a  reason: collision with root package name */
    public final TimeTableItemDao f6247a;
    public final TimeTableItemService b;

    public TimeTableItemRepositoryImpl(TimeTableItemDao timeTableItemDao, TimeTableItemService timeTableItemService) {
        Intrinsics.checkParameterIsNotNull(timeTableItemDao, "timeTableItemDao");
        Intrinsics.checkParameterIsNotNull(timeTableItemService, "timeTableItemService");
        this.f6247a = timeTableItemDao;
        this.b = timeTableItemService;
    }

    public final TimeTableItemDao a() {
        return this.f6247a;
    }

    public n<List<TimeTableItem>> b(b bVar, Profile profile) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Calendar a2 = v.a(bVar);
        Object clone = a2.clone();
        if (clone != null) {
            Calendar calendar = (Calendar) clone;
            calendar.add(5, (-a2.get(7)) + 2);
            Object clone2 = calendar.clone();
            if (clone2 != null) {
                Calendar calendar2 = (Calendar) clone2;
                calendar2.add(5, 6);
                n<R> g2 = this.b.a(profile, UtilsKt.c(calendar), UtilsKt.c(calendar2)).c(new TimeTableItemRepositoryImpl$fetchTimeTableItems$1(this, profile, calendar, calendar2)).g(new TimeTableItemRepositoryImpl$fetchTimeTableItems$2(a2)).g(TimeTableItemRepositoryImpl$fetchTimeTableItems$3.INSTANCE);
                Intrinsics.checkExpressionValueIsNotNull(g2, "timeTableItemService.fet…}\n            .map { it }");
                return g2;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    public n<List<TimeTableItem>> a(b bVar, Profile profile) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f6247a.a(v.a(bVar), profile.m()).k(new TimeTableItemRepositoryImpl$getTimeTableItems$1(this, bVar, profile));
    }
}
