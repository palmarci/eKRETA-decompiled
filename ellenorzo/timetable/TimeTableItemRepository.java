package p289hu.ekreta.ellenorzo.timetable;

import java.util.List;
import kotlin.Metadata;
import p000a.p175l.p176a.C2682b;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "fetchTimeTableItems", "Lio/reactivex/Observable;", "", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getTimeTableItems", "NoTimeTableDayException", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepository */
/* compiled from: TimeTableItemRepository.kt */
public interface TimeTableItemRepository extends Repository<TimeTableItem> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository$NoTimeTableDayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepository$NoTimeTableDayException */
    /* compiled from: TimeTableItemRepository.kt */
    public static final class NoTimeTableDayException extends Exception {
    }

    /* renamed from: a */
    C5027n<List<TimeTableItem>> mo16110a(C2682b bVar, Profile profile);

    /* renamed from: b */
    C5027n<List<TimeTableItem>> mo16111b(C2682b bVar, Profile profile);
}
