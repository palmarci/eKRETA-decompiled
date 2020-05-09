package p289hu.ekreta.ellenorzo.timetable;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "", "fetchLessonsAsTimeTableItem", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fromDate", "", "toDate", "fetchSchoolYearCalendarEntryAsTimeTableItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemService */
/* compiled from: TimeTableItemService.kt */
public interface TimeTableItemService {
    /* renamed from: a */
    C5027n<List<TimeTableItem>> mo16121a(Profile profile);

    /* renamed from: a */
    C5027n<List<TimeTableItem>> mo16122a(Profile profile, String str, String str2);
}
