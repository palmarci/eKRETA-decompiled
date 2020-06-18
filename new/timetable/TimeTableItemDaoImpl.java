package hu.ekreta.ellenorzo.timetable;

import a.q.a.b;
import h.w.v;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import k.b.n;
import k.c.c0;
import k.c.d0;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemDaoImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "timeTableDayRealm", "Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "timeTableItemRealm", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "addTimeTableItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "lessons", "timeTableDayList", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "getTimeTableDayByCalendar", "calendar", "Ljava/util/Calendar;", "profileId", "", "getTimeTableItemsByCalendar", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl implements TimeTableItemDao {

    /* renamed from: a  reason: collision with root package name */
    public final TimeTableItemRealm f6234a = new TimeTableItemRealm((String) null, (String) null, (String) null, (Date) null, (Integer) null, (Date) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (d0) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    public final TimeTableDayRealm b = new TimeTableDayRealm((String) null, (Date) null, false, (String) null, 15, (DefaultConstructorMarker) null);

    public TimeTableItemDaoImpl(c0 c0Var) {
        c0 c0Var2 = c0Var;
        Intrinsics.checkParameterIsNotNull(c0Var2, "config");
        b.b.a(TimeTableItemRealm.class, c0Var2);
        b.b.a(TimeTableDayRealm.class, c0Var2);
    }

    public n<List<TimeTableItem>> a(List<TimeTableItem> list, List<TimeTableDay> list2) {
        Intrinsics.checkParameterIsNotNull(list, "lessons");
        Intrinsics.checkParameterIsNotNull(list2, "timeTableDayList");
        return ExtensionsKt.a((f0) this.f6234a, new TimeTableItemDaoImpl$addTimeTableItems$1(list2, list));
    }

    public n<List<TimeTableItem>> b(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        n<List<TimeTableItem>> b2 = v.a((f0) this.f6234a, false, (Function1) new TimeTableItemDaoImpl$getTimeTableItemsByCalendar$1(calendar, str), 1).a(TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2.INSTANCE).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "timeTableItemRealm.query…\n        }.toObservable()");
        return b2;
    }

    public n<List<TimeTableDay>> a(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        n<List<TimeTableDay>> b2 = v.a((f0) this.b, false, (Function1) new TimeTableItemDaoImpl$getTimeTableDayByCalendar$1(calendar, str), 1).a(TimeTableItemDaoImpl$getTimeTableDayByCalendar$2.INSTANCE).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "timeTableDayRealm\n      …          .toObservable()");
        return b2;
    }
}
