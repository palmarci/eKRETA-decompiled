package hu.ekreta.ellenorzo.timetable;

import h.w.v;
import io.realm.RealmFieldType;
import io.realm.RealmQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import k.c.d0;
import k.c.m1.t.c;
import k.c.y;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "realm", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$addTimeTableItems$1 extends Lambda implements Function1<y, List<? extends TimeTableItem>> {
    public final /* synthetic */ List c;
    public final /* synthetic */ List e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDaoImpl$addTimeTableItems$1(List list, List list2) {
        super(1);
        this.c = list;
        this.e = list2;
    }

    /* renamed from: a */
    public final List<TimeTableItem> invoke(y yVar) {
        y yVar2 = yVar;
        Intrinsics.checkParameterIsNotNull(yVar2, "realm");
        for (TimeTableDay timeTableDay : this.c) {
            Intrinsics.checkParameterIsNotNull(timeTableDay, "$this$toTimeTableDayRealm");
            try {
                v.a(new TimeTableDayRealm(timeTableDay.c(), timeTableDay.a().getTime(), timeTableDay.b(), timeTableDay.d()));
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        yVar.c();
        RealmQuery realmQuery = new RealmQuery(yVar2, TimeTableItemRealm.class);
        List<TimeTableDay> list = this.c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TimeTableDay a2 : list) {
            arrayList.add(a2.a().getTime());
        }
        Comparable min = CollectionsKt___CollectionsKt.min(arrayList);
        if (min == null) {
            Intrinsics.throwNpe();
        }
        Date date = (Date) min;
        List<TimeTableDay> list2 = this.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TimeTableDay a3 : list2) {
            arrayList2.add(a3.a().getTime());
        }
        Comparable max = CollectionsKt___CollectionsKt.max(arrayList2);
        if (max == null) {
            Intrinsics.throwNpe();
        }
        realmQuery.b.c();
        c a4 = realmQuery.f6361d.a("date", RealmFieldType.DATE);
        realmQuery.c.a(a4.b(), date, (Date) max);
        realmQuery.a().d();
        for (TimeTableItem timeTableItem : this.e) {
            Intrinsics.checkParameterIsNotNull(timeTableItem, "$this$toLessonRealm");
            String B = timeTableItem.B();
            String m2 = timeTableItem.m();
            String l2 = timeTableItem.l();
            Date time = timeTableItem.h().getTime();
            Integer f = timeTableItem.f();
            Date time2 = timeTableItem.r().getTime();
            Date time3 = timeTableItem.i().getTime();
            String x = timeTableItem.x();
            String w = timeTableItem.w();
            String v = timeTableItem.v();
            String g2 = timeTableItem.g();
            String e3 = timeTableItem.e();
            String z = timeTableItem.z();
            String y = timeTableItem.y();
            String s = timeTableItem.s();
            String u = timeTableItem.u();
            String o2 = timeTableItem.o();
            String p2 = timeTableItem.p();
            String A = timeTableItem.A();
            boolean k2 = timeTableItem.k();
            String n2 = timeTableItem.n();
            String q2 = timeTableItem.q();
            Object[] array = timeTableItem.d().toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                d0 d0Var = r4;
                d0 d0Var2 = new d0((String[]) Arrays.copyOf(strArr, strArr.length));
                v.a(new TimeTableItemRealm(B, m2, l2, time, f, time2, time3, x, w, v, g2, e3, z, y, s, u, o2, p2, A, k2, n2, q2, d0Var, timeTableItem.j()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return this.e;
    }
}
