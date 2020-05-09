package p289hu.ekreta.ellenorzo.timetable;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRepository.NoTimeTableDayException;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "kotlin.jvm.PlatformType", "calendarDay", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableViewModelImpl$observeLocalData$1 */
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl$observeLocalData$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableViewModelImpl f15199c;

    /* renamed from: e */
    public final /* synthetic */ Profile f15200e;

    public TimeTableViewModelImpl$observeLocalData$1(TimeTableViewModelImpl timeTableViewModelImpl, Profile profile) {
        this.f15199c = timeTableViewModelImpl;
        this.f15200e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<TimeTableItem>> apply(C2682b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "calendarDay");
        return this.f15199c.f15197u.mo16110a(bVar, this.f15200e).mo17250i(new C4675h<Throwable, List<? extends TimeTableItem>>(this) {

            /* renamed from: c */
            public final /* synthetic */ TimeTableViewModelImpl$observeLocalData$1 f15201c;

            {
                this.f15201c = r1;
            }

            /* renamed from: a */
            public final List<TimeTableItem> apply(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                if (th instanceof NoTimeTableDayException) {
                    this.f15201c.f15199c.mo11495e();
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                throw th;
            }
        });
    }
}
