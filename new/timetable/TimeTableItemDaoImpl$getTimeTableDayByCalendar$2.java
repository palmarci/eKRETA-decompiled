package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableDayByCalendar$2<T, R> implements h<T, R> {
    public static final TimeTableItemDaoImpl$getTimeTableDayByCalendar$2 INSTANCE = new TimeTableItemDaoImpl$getTimeTableDayByCalendar$2();

    /* renamed from: a */
    public final List<TimeTableDay> apply(List<? extends TimeTableDayRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TimeTableDayRealm timeTableDayRealm : list) {
            Intrinsics.checkParameterIsNotNull(timeTableDayRealm, "$this$toTimeTableDay");
            try {
                Calendar b = UtilsKt.b(timeTableDayRealm.e2());
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                boolean f2 = timeTableDayRealm.f2();
                String g2 = timeTableDayRealm.g2();
                if (g2 == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(new TimeTableDay(b, f2, g2));
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return arrayList;
    }
}
