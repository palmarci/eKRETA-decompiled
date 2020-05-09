package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl$fetchTimeTableItems$2 */
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$fetchTimeTableItems$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemRepositoryImpl f15177c;

    /* renamed from: e */
    public final /* synthetic */ Profile f15178e;

    /* renamed from: f */
    public final /* synthetic */ Calendar f15179f;

    /* renamed from: g */
    public final /* synthetic */ Calendar f15180g;

    public TimeTableItemRepositoryImpl$fetchTimeTableItems$2(TimeTableItemRepositoryImpl timeTableItemRepositoryImpl, Profile profile, Calendar calendar, Calendar calendar2) {
        this.f15177c = timeTableItemRepositoryImpl;
        this.f15178e = profile;
        this.f15179f = calendar;
        this.f15180g = calendar2;
    }

    /* renamed from: a */
    public final C5027n<List<TimeTableItem>> apply(List<TimeTableItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        TimeTableItemDao a = this.f15177c.mo16112a();
        String m = this.f15178e.mo14054m();
        Intrinsics.checkParameterIsNotNull(list, "$this$getTimeTableDays");
        String str = "profileId";
        Intrinsics.checkParameterIsNotNull(m, str);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (hashSet.add(((TimeTableItem) next).mo16005h())) {
                arrayList.add(next);
            }
        }
        List<TimeTableItem> sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new TimeTableItemKt$getTimeTableDays$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
        for (TimeTableItem h : sortedWith) {
            arrayList2.add(new TimeTableDay(h.mo16005h(), true, m));
        }
        Calendar calendar = this.f15179f;
        Calendar calendar2 = this.f15180g;
        String m2 = this.f15178e.mo14054m();
        Intrinsics.checkParameterIsNotNull(arrayList2, "$this$addMissingDays");
        Intrinsics.checkParameterIsNotNull(calendar, "fromCalendar");
        Intrinsics.checkParameterIsNotNull(calendar2, "toCalendar");
        Intrinsics.checkParameterIsNotNull(m2, str);
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection<? extends T>) arrayList2);
        Iterator it = ExtensionsKt.m14627a(calendar, calendar2).iterator();
        while (it.hasNext()) {
            Calendar calendar3 = (Calendar) it.next();
            boolean z = !mutableList.contains(new TimeTableDay(calendar3, true, m2));
            if ((!mutableList.contains(new TimeTableDay(calendar3, false, m2))) && z) {
                mutableList.add(new TimeTableDay(calendar3, false, m2));
            }
        }
        return a.mo16030a(list, mutableList);
    }
}
