package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "response", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarRepositoryImpl.kt */
public final class SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$1<T, R> implements h<T, R> {
    public final /* synthetic */ SchoolYearCalendarRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$1(SchoolYearCalendarRepositoryImpl schoolYearCalendarRepositoryImpl, Profile profile) {
        this.c = schoolYearCalendarRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final List<SchoolYearCalendarEntry> apply(List<SchoolYearCalendarEntryDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SchoolYearCalendarEntryDto access$toSchoolYearCalendarItem : list) {
            arrayList.add(this.c.a(access$toSchoolYearCalendarItem, this.e));
        }
        return arrayList;
    }
}
