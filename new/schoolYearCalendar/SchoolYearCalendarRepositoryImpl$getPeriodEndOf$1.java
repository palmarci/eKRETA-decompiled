package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "list", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarRepositoryImpl.kt */
public final class SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ Evaluation.Type c;

    public SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1(Evaluation.Type type) {
        this.c = type;
    }

    /* renamed from: a */
    public final n<Calendar> apply(List<SchoolYearCalendarEntry> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!list.isEmpty()) {
            for (SchoolYearCalendarEntry schoolYearCalendarEntry : list) {
                if (schoolYearCalendarEntry.j() == SchoolYearCalendarEntry.Type.Companion.a(this.c)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return n.d(schoolYearCalendarEntry.f());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new NoSuchElementException();
    }
}
