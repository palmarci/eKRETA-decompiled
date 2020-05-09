package p289hu.ekreta.ellenorzo.timetable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRepository.NoTimeTableDayException;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "kotlin.jvm.PlatformType", "it", "Lhu/ekreta/ellenorzo/timetable/TimeTableDay;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemRepositoryImpl$getTimeTableItems$1 */
/* compiled from: TimeTableItemRepositoryImpl.kt */
public final class TimeTableItemRepositoryImpl$getTimeTableItems$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemRepositoryImpl f15182c;

    /* renamed from: e */
    public final /* synthetic */ C2682b f15183e;

    /* renamed from: f */
    public final /* synthetic */ Profile f15184f;

    public TimeTableItemRepositoryImpl$getTimeTableItems$1(TimeTableItemRepositoryImpl timeTableItemRepositoryImpl, C2682b bVar, Profile profile) {
        this.f15182c = timeTableItemRepositoryImpl;
        this.f15183e = bVar;
        this.f15184f = profile;
    }

    /* renamed from: a */
    public final C5027n<List<TimeTableItem>> apply(List<TimeTableDay> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        if (list.isEmpty()) {
            return C5027n.m16896b((Throwable) new NoTimeTableDayException());
        }
        return this.f15182c.mo16112a().mo16031b(C3984v.m10190a(this.f15183e), this.f15184f.mo14054m()).mo17246g(C43861.INSTANCE);
    }
}
