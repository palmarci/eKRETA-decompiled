package p289hu.ekreta.ellenorzo.timetable;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JT\u0010\u0013\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0014*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r \u0014*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0014*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r\u0018\u00010\f0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepositoryImpl;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "timeTableItemDao", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "timeTableItemService", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;)V", "getTimeTableItemDao", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "getTimeTableItemService", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "fetchTimeTableItems", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getTimeTableItems", "kotlin.jvm.PlatformType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl */
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl implements TimeTableItemRepository {

    /* renamed from: a */
    public final TimeTableItemDao f15175a;

    /* renamed from: b */
    public final TimeTableItemService f15176b;

    public TimeTableItemRepositoryImpl(TimeTableItemDao timeTableItemDao, TimeTableItemService timeTableItemService) {
        Intrinsics.checkParameterIsNotNull(timeTableItemDao, "timeTableItemDao");
        Intrinsics.checkParameterIsNotNull(timeTableItemService, "timeTableItemService");
        this.f15175a = timeTableItemDao;
        this.f15176b = timeTableItemService;
    }

    /* renamed from: a */
    public final TimeTableItemDao mo16112a() {
        return this.f15175a;
    }

    /* renamed from: b */
    public C5027n<List<TimeTableItem>> mo16111b(C2682b bVar, Profile profile) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Calendar a = C3984v.m10190a(bVar);
        Calendar a2 = C3984v.m10190a(bVar);
        a2.add(5, -7);
        Calendar a3 = C3984v.m10190a(bVar);
        a3.add(5, 7);
        C5027n<List<TimeTableItem>> g = C5027n.m16892a((C5030q<? extends T1>) this.f15176b.mo16122a(profile, UtilsKt.m14839c(a2), UtilsKt.m14839c(a3)), (C5030q<? extends T2>) this.f15176b.mo16121a(profile), (C4670c<? super T1, ? super T2, ? extends R>) TimeTableItemRepositoryImpl$fetchTimeTableItems$1.INSTANCE).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new TimeTableItemRepositoryImpl$fetchTimeTableItems$2<Object,Object>(this, profile, a2, a3)).mo17246g(new TimeTableItemRepositoryImpl$fetchTimeTableItems$3(a)).mo17246g(TimeTableItemRepositoryImpl$fetchTimeTableItems$4.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "Observable.zip(\n        …}\n            .map { it }");
        return g;
    }

    /* renamed from: a */
    public C5027n<List<TimeTableItem>> mo16110a(C2682b bVar, Profile profile) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f15175a.mo16029a(C3984v.m10190a(bVar), profile.mo14054m()).mo17252k(new TimeTableItemRepositoryImpl$getTimeTableItems$1(this, bVar, profile));
    }
}
