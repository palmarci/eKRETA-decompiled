package p289hu.ekreta.ellenorzo.timetable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "response", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemServiceImpl$fetchSchoolYearCalendarEntryAsTimeTableItem$1 */
/* compiled from: TimeTableItemServiceImpl.kt */
public final class C4387x7489d523<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemServiceImpl f15190c;

    /* renamed from: e */
    public final /* synthetic */ Profile f15191e;

    public C4387x7489d523(TimeTableItemServiceImpl timeTableItemServiceImpl, Profile profile) {
        this.f15190c = timeTableItemServiceImpl;
        this.f15191e = profile;
    }

    /* renamed from: a */
    public final List<TimeTableItem> apply(List<SchoolYearCalendarEntryDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SchoolYearCalendarEntryDto access$toSchoolYearCalendarItem : list) {
            arrayList.add(this.f15190c.mo16124a(access$toSchoolYearCalendarItem, this.f15191e));
        }
        return arrayList;
    }
}
