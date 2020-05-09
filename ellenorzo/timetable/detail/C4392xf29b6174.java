package p289hu.ekreta.ellenorzo.timetable.detail;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$refreshTimeTableItem$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$1 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class C4392xf29b6174<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItem f15241c;

    /* renamed from: e */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15242e;

    public C4392xf29b6174(TimeTableItem timeTableItem, TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15241c = timeTableItem;
        this.f15242e = timeTableItemDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<List<TimeTableItem>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.f15242e;
        TimeTableItemRepository access$getTimeTableItemRepository$p = timeTableItemDetailViewModelImpl.f15222A;
        Calendar h = this.f15241c.mo16005h();
        Intrinsics.checkParameterIsNotNull(h, "$this$toCalendarDay");
        C2682b bVar = new C2682b(h.get(1), h.get(2) + 1, h.get(5));
        Intrinsics.checkExpressionValueIsNotNull(bVar, "CalendarDay.from(get(YEA…) + 1, get(DAY_OF_MONTH))");
        return timeTableItemDetailViewModelImpl.mo11505a(access$getTimeTableItemRepository$p.mo16111b(bVar, profile));
    }
}
