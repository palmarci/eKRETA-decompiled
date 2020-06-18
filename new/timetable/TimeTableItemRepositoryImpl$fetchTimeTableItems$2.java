package hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$fetchTimeTableItems$2<T, R> implements h<T, R> {
    public final /* synthetic */ Calendar c;

    public TimeTableItemRepositoryImpl$fetchTimeTableItems$2(Calendar calendar) {
        this.c = calendar;
    }

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<TimeTableItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            TimeTableItem timeTableItem = (TimeTableItem) next;
            boolean z = true;
            if (!(timeTableItem.h().get(1) == this.c.get(1) && timeTableItem.h().get(6) == this.c.get(6))) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new TimeTableItemRepositoryImpl$fetchTimeTableItems$2$$special$$inlined$sortedBy$1());
    }
}
