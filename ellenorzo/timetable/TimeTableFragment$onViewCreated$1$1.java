package p289hu.ekreta.ellenorzo.timetable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p175l.p176a.C2682b;
import p000a.p175l.p176a.p177b0.C2690g;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p365o.p372c.p373a.C5639d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lcom/prolificinteractive/materialcalendarview/CalendarDay;", "kotlin.jvm.PlatformType", "format"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$onViewCreated$1$1 */
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$1$1 implements C2690g {
    public static final TimeTableFragment$onViewCreated$1$1 INSTANCE = new TimeTableFragment$onViewCreated$1$1();

    public final String format(C2682b bVar) {
        Intrinsics.checkExpressionValueIsNotNull(bVar, "it");
        C5639d dVar = bVar.f6083c;
        Intrinsics.checkExpressionValueIsNotNull(dVar, "it.date");
        return UtilsKt.m14830a(dVar);
    }
}
