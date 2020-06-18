package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "schoolYearCalendarDao", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;)V", "adapter", "hu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl$adapter$1;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "getSchoolYearCalendarDao", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "fetchSchoolYearCalendar", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getPeriodEndOf", "Lio/reactivex/Single;", "Ljava/util/Calendar;", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getSchoolYearCalendar", "toSchoolYearCalendarItem", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarRepositoryImpl.kt */
public final class SchoolYearCalendarRepositoryImpl implements SchoolYearCalendarRepository {

    /* renamed from: a  reason: collision with root package name */
    public final SchoolYearCalendarRepositoryImpl$adapter$1 f6093a = new SchoolYearCalendarRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final SchoolYearCalendarDao c;

    public SchoolYearCalendarRepositoryImpl(MobileApiV3 mobileApiV3, SchoolYearCalendarDao schoolYearCalendarDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarDao, "schoolYearCalendarDao");
        this.b = mobileApiV3;
        this.c = schoolYearCalendarDao;
    }

    public final SchoolYearCalendarDao a() {
        return this.c;
    }

    public n<List<SchoolYearCalendarEntry>> k(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.b;
        n<R> c2 = mobileApiV3.getSchoolYearCalendar(profile.p() + "/ellenorzo/V3/Sajat/Intezmenyek/TanevRendjeElemek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(new SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$1(this, profile)).c(new SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "mobileApiV3\n        .get…olYearCalendar)\n        }");
        return c2;
    }

    public u<Calendar> a(Evaluation.Type type, Profile profile) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        u<R> d2 = this.f6093a.a(profile).c(new SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1(type)).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "adapter\n        .getScho…}\n        .firstOrError()");
        return d2;
    }

    public final SchoolYearCalendarEntry a(SchoolYearCalendarEntryDto schoolYearCalendarEntryDto, Profile profile) {
        return new SchoolYearCalendarEntry(schoolYearCalendarEntryDto.getUid(), profile.m(), schoolYearCalendarEntryDto.getDate(), SchoolYearCalendarEntry.Type.Companion.a(schoolYearCalendarEntryDto.getType()), schoolYearCalendarEntryDto.getTypeDesc(), SchoolYearCalendarEntry.IrregularDayType.Companion.a(schoolYearCalendarEntryDto.getIrregularDayType()), schoolYearCalendarEntryDto.getIrregularDayTypeDesc(), SchoolYearCalendarEntry.WeekType.Companion.a(schoolYearCalendarEntryDto.getWeekType()), schoolYearCalendarEntryDto.getWeekTypeDesc(), schoolYearCalendarEntryDto.getGroupUid());
    }
}
