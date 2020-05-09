package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "fetchSchoolYearCalendar", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getPeriodEndOf", "Lio/reactivex/Single;", "Ljava/util/Calendar;", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getSchoolYearCalendar", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository */
/* compiled from: SchoolYearCalendarRepository.kt */
public interface SchoolYearCalendarRepository extends Repository<SchoolYearCalendarEntry> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository$DefaultImpls */
    /* compiled from: SchoolYearCalendarRepository.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: a */
    C5036u<Calendar> mo15642a(Type type, Profile profile);

    /* renamed from: k */
    C5027n<List<SchoolYearCalendarEntry>> mo15643k(Profile profile);
}
