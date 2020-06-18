package hu.ekreta.ellenorzo.timetable.detail;

import a.l.a.b;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$refreshTimeTableItem$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ TimeTableItem c;
    public final /* synthetic */ TimeTableItemDetailViewModelImpl e;

    public TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$1(TimeTableItem timeTableItem, TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.c = timeTableItem;
        this.e = timeTableItemDetailViewModelImpl;
    }

    /* renamed from: a */
    public final n<List<TimeTableItem>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.e;
        TimeTableItemRepository access$getTimeTableItemRepository$p = timeTableItemDetailViewModelImpl.B;
        Calendar h2 = this.c.h();
        Intrinsics.checkParameterIsNotNull(h2, "$this$toCalendarDay");
        b bVar = new b(h2.get(1), h2.get(2) + 1, h2.get(5));
        Intrinsics.checkExpressionValueIsNotNull(bVar, "CalendarDay.from(get(YEA…) + 1, get(DAY_OF_MONTH))");
        return timeTableItemDetailViewModelImpl.a(access$getTimeTableItemRepository$p.b(bVar, profile));
    }
}
