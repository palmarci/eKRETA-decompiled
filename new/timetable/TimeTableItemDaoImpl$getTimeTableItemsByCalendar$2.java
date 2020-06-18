package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2<T, R> implements h<T, R> {
    public static final TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2 INSTANCE = new TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2();

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<? extends TimeTableItemRealm> list) {
        List<? extends TimeTableItemRealm> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TimeTableItemRealm timeTableItemRealm = (TimeTableItemRealm) it.next();
            Intrinsics.checkParameterIsNotNull(timeTableItemRealm, "$this$toLesson");
            try {
                String d2 = timeTableItemRealm.d();
                if (d2 == null) {
                    Intrinsics.throwNpe();
                }
                String m2 = timeTableItemRealm.m2();
                String l2 = timeTableItemRealm.l2();
                Calendar b = UtilsKt.b(timeTableItemRealm.h2());
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                Integer f2 = timeTableItemRealm.f2();
                Calendar b2 = UtilsKt.b(timeTableItemRealm.s2());
                if (b2 == null) {
                    Intrinsics.throwNpe();
                }
                Calendar b3 = UtilsKt.b(timeTableItemRealm.i2());
                if (b3 == null) {
                    Intrinsics.throwNpe();
                }
                String x2 = timeTableItemRealm.x2();
                String w2 = timeTableItemRealm.w2();
                String v2 = timeTableItemRealm.v2();
                String g2 = timeTableItemRealm.g2();
                String e2 = timeTableItemRealm.e2();
                String z2 = timeTableItemRealm.z2();
                String y2 = timeTableItemRealm.y2();
                String t2 = timeTableItemRealm.t2();
                if (t2 == null) {
                    Intrinsics.throwNpe();
                }
                String u2 = timeTableItemRealm.u2();
                if (u2 == null) {
                    Intrinsics.throwNpe();
                }
                String o2 = timeTableItemRealm.o2();
                String p2 = timeTableItemRealm.p2();
                String A2 = timeTableItemRealm.A2();
                boolean k2 = timeTableItemRealm.k2();
                String n2 = timeTableItemRealm.n2();
                String q2 = timeTableItemRealm.q2();
                if (q2 == null) {
                    Intrinsics.throwNpe();
                }
                Iterator<T> it2 = it;
                arrayList.add(new TimeTableItem(d2, m2, l2, b, f2, b2, b3, x2, w2, v2, g2, e2, z2, y2, t2, u2, o2, p2, A2, k2, n2, q2, new ArrayList(timeTableItemRealm.r2()), timeTableItemRealm.j2()));
                it = it2;
            } catch (NullPointerException unused) {
                throw new DaoMapperException("Some field is null");
            }
        }
        return arrayList;
    }
}
