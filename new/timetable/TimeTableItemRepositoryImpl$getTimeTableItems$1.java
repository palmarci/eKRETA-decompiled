package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import h.w.v;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "kotlin.jvm.PlatformType", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$getTimeTableItems$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ TimeTableItemRepositoryImpl c;
    public final /* synthetic */ b e;
    public final /* synthetic */ Profile f;

    public TimeTableItemRepositoryImpl$getTimeTableItems$1(TimeTableItemRepositoryImpl timeTableItemRepositoryImpl, b bVar, Profile profile) {
        this.c = timeTableItemRepositoryImpl;
        this.e = bVar;
        this.f = profile;
    }

    /* renamed from: a */
    public final n<List<TimeTableItem>> apply(List<TimeTableDay> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        if (list.isEmpty()) {
            return n.b((Throwable) new TimeTableItemRepository.NoTimeTableDayException());
        }
        return this.c.a().b(v.a(this.e), this.f.m()).g(AnonymousClass1.INSTANCE);
    }
}
