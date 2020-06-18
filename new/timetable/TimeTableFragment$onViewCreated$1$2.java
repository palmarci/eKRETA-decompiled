package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import a.l.a.b0.e;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "format"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$1$2 implements e {
    public static final TimeTableFragment$onViewCreated$1$2 INSTANCE = new TimeTableFragment$onViewCreated$1$2();

    public final String format(b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "it");
        d dVar = bVar.c;
        Intrinsics.checkExpressionValueIsNotNull(dVar, "it.date");
        return UtilsKt.c(dVar);
    }
}
