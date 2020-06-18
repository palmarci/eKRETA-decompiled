package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$fetchTimeTableItems$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ TimeTableItemRepositoryImpl c;
    public final /* synthetic */ Profile e;
    public final /* synthetic */ Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Calendar f6248g;

    public TimeTableItemRepositoryImpl$fetchTimeTableItems$1(TimeTableItemRepositoryImpl timeTableItemRepositoryImpl, Profile profile, Calendar calendar, Calendar calendar2) {
        this.c = timeTableItemRepositoryImpl;
        this.e = profile;
        this.f = calendar;
        this.f6248g = calendar2;
    }

    /* renamed from: a */
    public final n<List<TimeTableItem>> apply(List<TimeTableItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        TimeTableItemDao a2 = this.c.a();
        String m2 = this.e.m();
        Intrinsics.checkParameterIsNotNull(list, "$this$getTimeTableDays");
        Intrinsics.checkParameterIsNotNull(m2, "profileId");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (hashSet.add(((TimeTableItem) next).h())) {
                arrayList.add(next);
            }
        }
        List<TimeTableItem> sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new TimeTableItemKt$getTimeTableDays$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        for (TimeTableItem h2 : sortedWith) {
            arrayList2.add(new TimeTableDay(h2.h(), true, m2));
        }
        Calendar calendar = this.f;
        Calendar calendar2 = this.f6248g;
        String m3 = this.e.m();
        Intrinsics.checkParameterIsNotNull(arrayList2, "$this$addMissingDays");
        Intrinsics.checkParameterIsNotNull(calendar, "fromCalendar");
        Intrinsics.checkParameterIsNotNull(calendar2, "toCalendar");
        Intrinsics.checkParameterIsNotNull(m3, "profileId");
        List mutableList = CollectionsKt___CollectionsKt.toMutableList(arrayList2);
        Iterator<Calendar> it = ExtensionsKt.a(calendar, calendar2).iterator();
        while (it.hasNext()) {
            Calendar next2 = it.next();
            boolean z = !mutableList.contains(new TimeTableDay(next2, false, m3));
            boolean z2 = !mutableList.contains(new TimeTableDay(next2, true, m3));
            if (z && z2) {
                mutableList.add(new TimeTableDay(next2, false, m3));
            }
        }
        return a2.a(list, (List<TimeTableDay>) mutableList);
    }
}
