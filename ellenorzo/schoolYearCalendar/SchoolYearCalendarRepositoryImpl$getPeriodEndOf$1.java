package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "list", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1 */
/* compiled from: SchoolYearCalendarRepositoryImpl.kt */
public final class SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ Type f14757c;

    public SchoolYearCalendarRepositoryImpl$getPeriodEndOf$1(Type type) {
        this.f14757c = type;
    }

    /* renamed from: a */
    public final C5027n<Calendar> apply(List<SchoolYearCalendarEntry> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!list.isEmpty()) {
            for (SchoolYearCalendarEntry schoolYearCalendarEntry : list) {
                if (schoolYearCalendarEntry.mo15596j() == SchoolYearCalendarEntry.Type.Companion.mo15608a(this.f14757c)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return C5027n.m16898d(schoolYearCalendarEntry.mo15591f());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new NoSuchElementException();
    }
}
