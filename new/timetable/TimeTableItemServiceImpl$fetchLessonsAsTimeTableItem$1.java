package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "listOfLessonDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemServiceImpl.kt */
public final class TimeTableItemServiceImpl$fetchLessonsAsTimeTableItem$1<T, R> implements h<T, R> {
    public final /* synthetic */ TimeTableItemServiceImpl c;
    public final /* synthetic */ Profile e;

    public TimeTableItemServiceImpl$fetchLessonsAsTimeTableItem$1(TimeTableItemServiceImpl timeTableItemServiceImpl, Profile profile) {
        this.c = timeTableItemServiceImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<LessonDto> list) {
        TimeTableItem timeTableItem;
        Intrinsics.checkParameterIsNotNull(list, "listOfLessonDto");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (LessonDto lessonDto : list) {
            if (Intrinsics.areEqual((Object) lessonDto.getStateName(), (Object) "TanevRendjeEsemeny")) {
                timeTableItem = this.c.a(lessonDto, this.e);
            } else {
                timeTableItem = this.c.a(lessonDto, this.e.m());
            }
            arrayList.add(timeTableItem);
        }
        return arrayList;
    }
}
