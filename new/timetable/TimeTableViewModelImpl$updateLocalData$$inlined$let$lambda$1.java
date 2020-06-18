package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.b0.f;
import k.b.h0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/timetable/TimeTableViewModelImpl$updateLocalData$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl$updateLocalData$$inlined$let$lambda$1<T> implements f<List<? extends TimeTableItem>> {
    public final /* synthetic */ TimeTableViewModelImpl c;

    public TimeTableViewModelImpl$updateLocalData$$inlined$let$lambda$1(TimeTableViewModelImpl timeTableViewModelImpl, Profile profile) {
        this.c = timeTableViewModelImpl;
    }

    public final void a() {
        a access$getCalendarDaySubject$p = this.c.t;
        b u0 = this.c.u0();
        if (u0 == null) {
            Intrinsics.throwNpe();
        }
        access$getCalendarDaySubject$p.a(u0);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        List list = (List) obj;
        a();
    }
}
