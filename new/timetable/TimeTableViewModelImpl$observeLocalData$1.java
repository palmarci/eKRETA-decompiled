package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "kotlin.jvm.PlatformType", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl$observeLocalData$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ TimeTableViewModelImpl c;
    public final /* synthetic */ Profile e;

    public TimeTableViewModelImpl$observeLocalData$1(TimeTableViewModelImpl timeTableViewModelImpl, Profile profile) {
        this.c = timeTableViewModelImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<TimeTableItem>> apply(b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        return this.c.v.a(bVar, this.e).i(new h<Throwable, List<? extends TimeTableItem>>(this) {
            public final /* synthetic */ TimeTableViewModelImpl$observeLocalData$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final List<TimeTableItem> apply(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                if (th instanceof TimeTableItemRepository.NoTimeTableDayException) {
                    this.c.c.e();
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                throw th;
            }
        });
    }
}
