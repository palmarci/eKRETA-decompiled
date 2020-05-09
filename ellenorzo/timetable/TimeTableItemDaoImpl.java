package p289hu.ekreta.ellenorzo.timetable;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.p315b0.C4675h;
import p300k.p340c.C5061c0;
import p300k.p340c.C5074f0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemDaoImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "timeTableDayRealm", "Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "timeTableItemRealm", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "addTimeTableItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "lessons", "timeTableDayList", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "getTimeTableDayByCalendar", "calendar", "Ljava/util/Calendar;", "profileId", "", "getTimeTableItemsByCalendar", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl */
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl implements TimeTableItemDao {

    /* renamed from: a */
    public final TimeTableItemRealm f15142a;

    /* renamed from: b */
    public final TimeTableDayRealm f15143b;

    public TimeTableItemDaoImpl(C5061c0 c0Var) {
        C5061c0 c0Var2 = c0Var;
        Intrinsics.checkParameterIsNotNull(c0Var2, "config");
        TimeTableItemRealm timeTableItemRealm = new TimeTableItemRealm(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 16777215, null);
        this.f15142a = timeTableItemRealm;
        TimeTableDayRealm timeTableDayRealm = new TimeTableDayRealm(null, null, false, null, 15, null);
        this.f15143b = timeTableDayRealm;
        C2769b.f6264b.mo5214a(TimeTableItemRealm.class, c0Var2);
        C2769b.f6264b.mo5214a(TimeTableDayRealm.class, c0Var2);
    }

    /* renamed from: a */
    public C5027n<List<TimeTableItem>> mo16030a(List<TimeTableItem> list, List<TimeTableDay> list2) {
        Intrinsics.checkParameterIsNotNull(list, "lessons");
        Intrinsics.checkParameterIsNotNull(list2, "timeTableDayList");
        return ExtensionsKt.m14633a((C5074f0) this.f15142a, (Function1<? super C5179y, ? extends R>) new TimeTableItemDaoImpl$addTimeTableItems$1<Object,Object>(list2, list));
    }

    /* renamed from: b */
    public C5027n<List<TimeTableItem>> mo16031b(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        C5027n<List<TimeTableItem>> b = C3984v.m10196a((C5074f0) this.f15142a, false, (Function1) new TimeTableItemDaoImpl$getTimeTableItemsByCalendar$1(calendar, str), 1).mo17165a((C4675h<? super T, ? extends R>) TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2.INSTANCE).mo17172b();
        Intrinsics.checkExpressionValueIsNotNull(b, "timeTableItemRealm.query…\n        }.toObservable()");
        return b;
    }

    /* renamed from: a */
    public C5027n<List<TimeTableDay>> mo16029a(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        C5027n<List<TimeTableDay>> b = C3984v.m10196a((C5074f0) this.f15143b, false, (Function1) new TimeTableItemDaoImpl$getTimeTableDayByCalendar$1(calendar, str), 1).mo17165a((C4675h<? super T, ? extends R>) TimeTableItemDaoImpl$getTimeTableDayByCalendar$2.INSTANCE).mo17172b();
        Intrinsics.checkExpressionValueIsNotNull(b, "timeTableDayRealm\n      …          .toObservable()");
        return b;
    }
}
