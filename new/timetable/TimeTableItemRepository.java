package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "fetchTimeTableItems", "Lio/reactivex/Observable;", "", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getTimeTableItems", "NoTimeTableDayException", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemRepository.kt */
public interface TimeTableItemRepository extends Repository<TimeTableItem> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository$NoTimeTableDayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TimeTableItemRepository.kt */
    public static final class NoTimeTableDayException extends Exception {
    }

    n<List<TimeTableItem>> a(b bVar, Profile profile);

    n<List<TimeTableItem>> b(b bVar, Profile profile);
}
