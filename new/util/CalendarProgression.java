package hu.ekreta.ellenorzo.util;

import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.ClosedRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007H\u0004R\u0014\u0010\u0005\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/util/CalendarProgression;", "", "Ljava/util/Calendar;", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "stepDays", "", "(Ljava/util/Calendar;Ljava/util/Calendar;I)V", "getEndInclusive", "()Ljava/util/Calendar;", "getStart", "getStepDays", "()I", "iterator", "", "step", "days", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class CalendarProgression implements Iterable<Calendar>, ClosedRange<Calendar>, KMappedMarker {
    public final Calendar c;
    public final Calendar e;
    public final int f;

    public /* synthetic */ CalendarProgression(Calendar calendar, Calendar calendar2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        i2 = (i3 & 4) != 0 ? 1 : i2;
        Intrinsics.checkParameterIsNotNull(calendar, "start");
        Intrinsics.checkParameterIsNotNull(calendar2, "endInclusive");
        this.c = calendar;
        this.e = calendar2;
        this.f = i2;
    }

    /* renamed from: a */
    public boolean contains(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "value");
        return ClosedRange.DefaultImpls.contains(this, calendar);
    }

    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    public Iterator<Calendar> iterator() {
        return new CalendarIterator(getStart(), getEndInclusive(), this.f);
    }

    public Calendar getEndInclusive() {
        return this.e;
    }

    public Calendar getStart() {
        return this.c;
    }
}
