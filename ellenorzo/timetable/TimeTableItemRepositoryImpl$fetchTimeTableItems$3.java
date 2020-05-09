package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl$fetchTimeTableItems$3 */
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$fetchTimeTableItems$3<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Calendar f15181c;

    public TimeTableItemRepositoryImpl$fetchTimeTableItems$3(Calendar calendar) {
        this.f15181c = calendar;
    }

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<TimeTableItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            TimeTableItem timeTableItem = (TimeTableItem) next;
            boolean z = true;
            if (!(timeTableItem.mo16005h().get(1) == this.f15181c.get(1) && timeTableItem.mo16005h().get(6) == this.f15181c.get(6))) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4384x8f810a51());
    }
}
