package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p296io.realm.RealmFieldType;
import p296io.realm.RealmQuery;
import p300k.p340c.C5065d0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "realm", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl$addTimeTableItems$1 */
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$addTimeTableItems$1 extends Lambda implements Function1<C5179y, List<? extends TimeTableItem>> {

    /* renamed from: c */
    public final /* synthetic */ List f15144c;

    /* renamed from: e */
    public final /* synthetic */ List f15145e;

    public TimeTableItemDaoImpl$addTimeTableItems$1(List list, List list2) {
        this.f15144c = list;
        this.f15145e = list2;
        super(1);
    }

    /* renamed from: a */
    public final List<TimeTableItem> invoke(C5179y yVar) {
        C5179y yVar2 = yVar;
        Intrinsics.checkParameterIsNotNull(yVar2, "realm");
        for (TimeTableDay timeTableDay : this.f15144c) {
            Intrinsics.checkParameterIsNotNull(timeTableDay, "$this$toTimeTableDayRealm");
            try {
                C3984v.m10246a(new TimeTableDayRealm(timeTableDay.mo15968c(), timeTableDay.mo15966a().getTime(), timeTableDay.mo15967b(), timeTableDay.mo15969d()));
            } catch (NullPointerException e) {
                throw e;
            }
        }
        yVar.mo17277c();
        RealmQuery realmQuery = new RealmQuery(yVar2, TimeTableItemRealm.class);
        List<TimeTableDay> list = this.f15144c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TimeTableDay a : list) {
            arrayList.add(a.mo15966a().getTime());
        }
        Comparable min = CollectionsKt___CollectionsKt.min((Iterable<? extends T>) arrayList);
        if (min == null) {
            Intrinsics.throwNpe();
        }
        Date date = (Date) min;
        List<TimeTableDay> list2 = this.f15144c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TimeTableDay a2 : list2) {
            arrayList2.add(a2.mo15966a().getTime());
        }
        Comparable max = CollectionsKt___CollectionsKt.max((Iterable<? extends T>) arrayList2);
        if (max == null) {
            Intrinsics.throwNpe();
        }
        Date date2 = (Date) max;
        realmQuery.f15530b.mo17277c();
        realmQuery.f15531c.mo16721a(realmQuery.f15532d.mo17342a("date", RealmFieldType.DATE).mo17397b(), date, date2);
        realmQuery.mo16478a().mo17420d();
        for (TimeTableItem timeTableItem : this.f15145e) {
            Intrinsics.checkParameterIsNotNull(timeTableItem, "$this$toLessonRealm");
            String B = timeTableItem.mo15995B();
            String m = timeTableItem.mo16011m();
            String l = timeTableItem.mo16010l();
            Date time = timeTableItem.mo16005h().getTime();
            Integer f = timeTableItem.mo16003f();
            Date time2 = timeTableItem.mo16016r().getTime();
            Date time3 = timeTableItem.mo16007i().getTime();
            String x = timeTableItem.mo16024x();
            String w = timeTableItem.mo16022w();
            String v = timeTableItem.mo16021v();
            String g = timeTableItem.mo16004g();
            String e2 = timeTableItem.mo16001e();
            String z = timeTableItem.mo16026z();
            String y = timeTableItem.mo16025y();
            String s = timeTableItem.mo16017s();
            String u = timeTableItem.mo16020u();
            String o = timeTableItem.mo16013o();
            String p = timeTableItem.mo16014p();
            String A = timeTableItem.mo15994A();
            boolean k = timeTableItem.mo16009k();
            String n = timeTableItem.mo16012n();
            String q = timeTableItem.mo16015q();
            Object[] array = timeTableItem.mo15999d().toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                C5065d0 d0Var = r4;
                C5065d0 d0Var2 = new C5065d0((String[]) Arrays.copyOf(strArr, strArr.length));
                TimeTableItemRealm timeTableItemRealm = new TimeTableItemRealm(B, m, l, time, f, time2, time3, x, w, v, g, e2, z, y, s, u, o, p, A, k, n, q, d0Var, timeTableItem.mo16008j());
                C3984v.m10246a(timeTableItemRealm);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return this.f15145e;
    }
}
