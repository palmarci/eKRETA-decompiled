package hu.ekreta.ellenorzo.timetable;

import io.realm.RealmQuery;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/timetable/TimeTableDayRealm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDaoImpl.kt */
public final class TimeTableItemDaoImpl$getTimeTableDayByCalendar$1 extends Lambda implements Function1<RealmQuery<TimeTableDayRealm>, Unit> {
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ String e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDaoImpl$getTimeTableDayByCalendar$1(Calendar calendar, String str) {
        super(1);
        this.c = calendar;
        this.e = str;
    }

    public final void a(RealmQuery<TimeTableDayRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.a("date", this.c.getTime());
        realmQuery.b.c();
        realmQuery.a("profileId", this.e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
