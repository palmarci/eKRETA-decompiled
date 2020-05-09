package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl$getTimeTableDayByCalendar$2 */
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableDayByCalendar$2<T, R> implements C4675h<T, R> {
    public static final TimeTableItemDaoImpl$getTimeTableDayByCalendar$2 INSTANCE = new TimeTableItemDaoImpl$getTimeTableDayByCalendar$2();

    /* renamed from: a */
    public final List<TimeTableDay> apply(List<? extends TimeTableDayRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TimeTableDayRealm timeTableDayRealm : list) {
            Intrinsics.checkParameterIsNotNull(timeTableDayRealm, "$this$toTimeTableDay");
            try {
                Calendar b = UtilsKt.m14838b(timeTableDayRealm.mo15978d2());
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                boolean e2 = timeTableDayRealm.mo15981e2();
                String f2 = timeTableDayRealm.mo15982f2();
                if (f2 == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(new TimeTableDay(b, e2, f2));
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return arrayList;
    }
}
