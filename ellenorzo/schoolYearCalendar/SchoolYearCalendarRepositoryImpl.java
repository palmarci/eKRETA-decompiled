package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.IrregularDayType;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.WeekType;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "schoolYearCalendarDao", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;)V", "adapter", "hu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl$adapter$1;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "getSchoolYearCalendarDao", "()Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "fetchSchoolYearCalendar", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getPeriodEndOf", "Lio/reactivex/Single;", "Ljava/util/Calendar;", "type", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "getSchoolYearCalendar", "toSchoolYearCalendarItem", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepositoryImpl */
/* compiled from: SchoolYearCalendarRepositoryImpl.kt */
public final class SchoolYearCalendarRepositoryImpl implements SchoolYearCalendarRepository {

    /* renamed from: a */
    public final SchoolYearCalendarRepositoryImpl$adapter$1 f14746a = new SchoolYearCalendarRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f14747b;

    /* renamed from: c */
    public final SchoolYearCalendarDao f14748c;

    public SchoolYearCalendarRepositoryImpl(MobileApiV3 mobileApiV3, SchoolYearCalendarDao schoolYearCalendarDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarDao, "schoolYearCalendarDao");
        this.f14747b = mobileApiV3;
        this.f14748c = schoolYearCalendarDao;
    }

    /* renamed from: a */
    public final SchoolYearCalendarDao mo15644a() {
        return this.f14748c;
    }

    /* renamed from: k */
    public C5027n<List<SchoolYearCalendarEntry>> mo15643k(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f14747b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Intezmenyek/TanevRendjeElemek");
        C5027n<List<SchoolYearCalendarEntry>> c = mobileApiV3.getSchoolYearCalendar(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$1(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new SchoolYearCalendarRepositoryImpl$fetchSchoolYearCalendar$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "mobileApiV3\n        .get…olYearCalendar)\n        }");
        return c;
    }

    /* renamed from: a */
    public C5036u<Calendar> mo15642a(Type type, Profile profile) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5036u<Calendar> d = this.f14746a.mo15646a(profile).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1<Object,Object>(type)).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "adapter\n        .getScho…}\n        .firstOrError()");
        return d;
    }

    /* renamed from: a */
    public final SchoolYearCalendarEntry mo15645a(SchoolYearCalendarEntryDto schoolYearCalendarEntryDto, Profile profile) {
        SchoolYearCalendarEntry schoolYearCalendarEntry = new SchoolYearCalendarEntry(schoolYearCalendarEntryDto.getUid(), profile.mo14054m(), schoolYearCalendarEntryDto.getDate(), SchoolYearCalendarEntry.Type.Companion.mo15609a(schoolYearCalendarEntryDto.getType()), schoolYearCalendarEntryDto.getTypeDesc(), IrregularDayType.Companion.mo15605a(schoolYearCalendarEntryDto.getIrregularDayType()), schoolYearCalendarEntryDto.getIrregularDayTypeDesc(), WeekType.Companion.mo15611a(schoolYearCalendarEntryDto.getWeekType()), schoolYearCalendarEntryDto.getWeekTypeDesc(), schoolYearCalendarEntryDto.getGroupUid());
        return schoolYearCalendarEntry;
    }
}
