package p289hu.ekreta.ellenorzo.timetable;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRealm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableItemDaoImpl$getTimeTableItemsByCalendar$1 */
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableItemsByCalendar$1 extends Lambda implements Function1<RealmQuery<TimeTableItemRealm>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ Calendar f15148c;

    /* renamed from: e */
    public final /* synthetic */ String f15149e;

    public TimeTableItemDaoImpl$getTimeTableItemsByCalendar$1(Calendar calendar, String str) {
        this.f15148c = calendar;
        this.f15149e = str;
        super(1);
    }

    /* renamed from: a */
    public final void mo16035a(RealmQuery<TimeTableItemRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16477a("date", this.f15148c.getTime());
        realmQuery.f15530b.mo17277c();
        realmQuery.mo16476a("profileId", this.f15149e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16035a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
