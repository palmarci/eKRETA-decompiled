package hu.ekreta.ellenorzo.timetable;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.LessonDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\u0012\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemServiceImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;)V", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchLessonsAsTimeTableItem", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fromDate", "", "toDate", "toSchoolYearCalendarItem", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/LessonDto;", "toTimeTableItem", "profileIdParam", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemServiceImpl.kt */
public final class TimeTableItemServiceImpl implements TimeTableItemService {

    /* renamed from: a  reason: collision with root package name */
    public final MobileApiV3 f6250a;

    public TimeTableItemServiceImpl(MobileApiV3 mobileApiV3) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        this.f6250a = mobileApiV3;
    }

    public n<List<TimeTableItem>> a(Profile profile, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(str, "fromDate");
        Intrinsics.checkParameterIsNotNull(str2, "toDate");
        MobileApiV3 mobileApiV3 = this.f6250a;
        n<R> g2 = mobileApiV3.getLessons(profile.p() + "/ellenorzo/V3/Sajat/OrarendElemek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), str, str2).g(new TimeTableItemServiceImpl$fetchLessonsAsTimeTableItem$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "mobileApiV3.getLessons(\n…        }\n        }\n    }");
        return g2;
    }

    public final TimeTableItem a(LessonDto lessonDto, String str) {
        return new TimeTableItem(lessonDto.getUid(), lessonDto.getLessonTypeName(), lessonDto.getLessonTypeDescription(), lessonDto.getDate(), lessonDto.getClassScheduleNumber(), lessonDto.getStartTime(), lessonDto.getEndTime(), lessonDto.getSubjectName(), lessonDto.getSubjectCategoryName(), lessonDto.getSubjectCategoryDescription(), lessonDto.getClassroom(), lessonDto.getGroupName(), lessonDto.getTeacher(), lessonDto.getSupplyTeacher(), lessonDto.getStateDescription(), lessonDto.getStateName(), lessonDto.getPresenceTypeDescription(), lessonDto.getPresenceTypeName(), lessonDto.getTopic(), lessonDto.getHomeworkEditedByStudentEnabled(), lessonDto.getName(), str, lessonDto.getReportedExamUids(), lessonDto.getHomeWorkUid());
    }

    public final TimeTableItem a(LessonDto lessonDto, Profile profile) {
        return new TimeTableItem(lessonDto.getUid(), (String) null, (String) null, lessonDto.getDate(), (Integer) null, lessonDto.getDate(), lessonDto.getDate(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "", "TanevRendjeEsemeny", (String) null, (String) null, (String) null, false, lessonDto.getName(), profile.m(), CollectionsKt__CollectionsKt.emptyList(), (String) null);
    }
}
