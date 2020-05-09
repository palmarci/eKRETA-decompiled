package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2 */
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2<T, R> implements C4675h<T, R> {
    public static final TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2 INSTANCE = new TimeTableItemDaoImpl$getTimeTableItemsByCalendar$2();

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<? extends TimeTableItemRealm> list) {
        List<? extends TimeTableItemRealm> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TimeTableItemRealm timeTableItemRealm = (TimeTableItemRealm) it.next();
            Intrinsics.checkParameterIsNotNull(timeTableItemRealm, "$this$toLesson");
            try {
                String d = timeTableItemRealm.mo16059d();
                if (d == null) {
                    Intrinsics.throwNpe();
                }
                String l2 = timeTableItemRealm.mo16084l2();
                String k2 = timeTableItemRealm.mo16082k2();
                Calendar b = UtilsKt.m14838b(timeTableItemRealm.mo16068g2());
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                Integer e2 = timeTableItemRealm.mo16064e2();
                Calendar b2 = UtilsKt.m14838b(timeTableItemRealm.mo16095r2());
                if (b2 == null) {
                    Intrinsics.throwNpe();
                }
                Calendar b3 = UtilsKt.m14838b(timeTableItemRealm.mo16073h2());
                if (b3 == null) {
                    Intrinsics.throwNpe();
                }
                String w2 = timeTableItemRealm.mo16105w2();
                String v2 = timeTableItemRealm.mo16103v2();
                String u2 = timeTableItemRealm.mo16101u2();
                String f2 = timeTableItemRealm.mo16065f2();
                String d2 = timeTableItemRealm.mo16063d2();
                String y2 = timeTableItemRealm.mo16107y2();
                String x2 = timeTableItemRealm.mo16106x2();
                String s2 = timeTableItemRealm.mo16096s2();
                if (s2 == null) {
                    Intrinsics.throwNpe();
                }
                String t2 = timeTableItemRealm.mo16099t2();
                if (t2 == null) {
                    Intrinsics.throwNpe();
                }
                String n2 = timeTableItemRealm.mo16089n2();
                String o2 = timeTableItemRealm.mo16091o2();
                String z2 = timeTableItemRealm.mo16109z2();
                boolean j2 = timeTableItemRealm.mo16080j2();
                String m2 = timeTableItemRealm.mo16086m2();
                String p2 = timeTableItemRealm.mo16092p2();
                if (p2 == null) {
                    Intrinsics.throwNpe();
                }
                Iterator it2 = it;
                TimeTableItem timeTableItem = new TimeTableItem(d, l2, k2, b, e2, b2, b3, w2, v2, u2, f2, d2, y2, x2, s2, t2, n2, o2, z2, j2, m2, p2, new ArrayList(timeTableItemRealm.mo16094q2()), timeTableItemRealm.mo16076i2());
                arrayList.add(timeTableItem);
                it = it2;
            } catch (NullPointerException unused) {
                throw new DaoMapperException("Some field is null");
            }
        }
        return arrayList;
    }
}
