package p289hu.ekreta.ellenorzo.timetable;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H&J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "", "addTimeTableItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "lessons", "timeTableDayList", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "getTimeTableDayByCalendar", "calendar", "Ljava/util/Calendar;", "profileId", "", "getTimeTableItemsByCalendar", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDao */
/* compiled from: TimeTableItemDao.kt */
public interface TimeTableItemDao {
    /* renamed from: a */
    C5027n<List<TimeTableDay>> mo16029a(Calendar calendar, String str);

    /* renamed from: a */
    C5027n<List<TimeTableItem>> mo16030a(List<TimeTableItem> list, List<TimeTableDay> list2);

    /* renamed from: b */
    C5027n<List<TimeTableItem>> mo16031b(Calendar calendar, String str);
}
