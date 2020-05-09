package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4670c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "fromLesson", "", "fromSchoolYearCalendarEntry", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl$fetchTimeTableItems$1 */
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$fetchTimeTableItems$1<T1, T2, R> implements C4670c<List<? extends TimeTableItem>, List<? extends TimeTableItem>, List<? extends TimeTableItem>> {
    public static final TimeTableItemRepositoryImpl$fetchTimeTableItems$1 INSTANCE = new TimeTableItemRepositoryImpl$fetchTimeTableItems$1();

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<TimeTableItem> list, List<TimeTableItem> list2) {
        Intrinsics.checkParameterIsNotNull(list, "fromLesson");
        Intrinsics.checkParameterIsNotNull(list2, "fromSchoolYearCalendarEntry");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
