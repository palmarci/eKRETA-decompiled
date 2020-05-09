package p289hu.ekreta.ellenorzo.timetable;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.LessonDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\u0013\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemServiceImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;)V", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchLessonsAsTimeTableItem", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fromDate", "", "toDate", "fetchSchoolYearCalendarEntryAsTimeTableItem", "toSchoolYearCalendarItem", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "toTimeTableItem", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "profileIdParam", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemServiceImpl */
/* compiled from: TimeTableItemServiceImpl.kt */
public final class TimeTableItemServiceImpl implements TimeTableItemService {

    /* renamed from: a */
    public final MobileApiV3 f15187a;

    public TimeTableItemServiceImpl(MobileApiV3 mobileApiV3) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        this.f15187a = mobileApiV3;
    }

    /* renamed from: a */
    public C5027n<List<TimeTableItem>> mo16122a(Profile profile, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(str, "fromDate");
        Intrinsics.checkParameterIsNotNull(str2, "toDate");
        MobileApiV3 mobileApiV3 = this.f15187a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/OrarendElemek");
        C5027n<List<TimeTableItem>> g = mobileApiV3.getLessons(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), str, str2).mo17246g(new TimeTableItemServiceImpl$fetchLessonsAsTimeTableItem$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "mobileApiV3.getLessons(\n…ofile.id)\n        }\n    }");
        return g;
    }

    /* renamed from: a */
    public final TimeTableItem mo16123a(LessonDto lessonDto, String str) {
        TimeTableItem timeTableItem = new TimeTableItem(lessonDto.getUid(), lessonDto.getLessonTypeName(), lessonDto.getLessonTypeDescription(), lessonDto.getDate(), lessonDto.getClassScheduleNumber(), lessonDto.getStartTime(), lessonDto.getEndTime(), lessonDto.getSubjectName(), lessonDto.getSubjectCategoryName(), lessonDto.getSubjectCategoryDescription(), lessonDto.getClassroom(), lessonDto.getGroupName(), lessonDto.getTeacher(), lessonDto.getSupplyTeacher(), lessonDto.getStateDescription(), lessonDto.getStateName(), lessonDto.getPresenceTypeDescription(), lessonDto.getPresenceTypeName(), lessonDto.getTopic(), lessonDto.getHomeworkEditedByStudentEnabled(), lessonDto.getName(), str, lessonDto.getReportedExamUids(), lessonDto.getHomeWorkUid());
        return timeTableItem;
    }

    /* renamed from: a */
    public C5027n<List<TimeTableItem>> mo16121a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f15187a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Intezmenyek/TanevRendjeElemek");
        C5027n<List<TimeTableItem>> g = mobileApiV3.getSchoolYearCalendar(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new C4387x7489d523(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "mobileApiV3.getSchoolYea…)\n            }\n        }");
        return g;
    }

    /* renamed from: a */
    public final TimeTableItem mo16124a(SchoolYearCalendarEntryDto schoolYearCalendarEntryDto, Profile profile) {
        TimeTableItem timeTableItem = new TimeTableItem(schoolYearCalendarEntryDto.getUid(), null, null, schoolYearCalendarEntryDto.getDate(), null, schoolYearCalendarEntryDto.getDate(), schoolYearCalendarEntryDto.getDate(), null, null, null, null, null, null, null, "", "TanevRendjeEsemeny", null, null, null, false, schoolYearCalendarEntryDto.getTypeDesc(), profile.mo14054m(), CollectionsKt__CollectionsKt.emptyList(), null);
        return timeTableItem;
    }
}
