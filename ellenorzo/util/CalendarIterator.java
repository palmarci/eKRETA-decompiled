package p289hu.ekreta.ellenorzo.util;

import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0002R\u000e\u0010\b\u001a\u00020\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/CalendarIterator;", "", "Ljava/util/Calendar;", "startDate", "endDateInclusive", "stepDays", "", "(Ljava/util/Calendar;Ljava/util/Calendar;I)V", "currentDate", "hasNext", "", "next", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.CalendarIterator */
/* compiled from: Extensions.kt */
public final class CalendarIterator implements Iterator<Calendar>, KMappedMarker {

    /* renamed from: c */
    public Calendar f15268c;

    /* renamed from: e */
    public final Calendar f15269e;

    /* renamed from: f */
    public final int f15270f;

    public /* synthetic */ CalendarIterator(Calendar calendar, Calendar calendar2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        Intrinsics.checkParameterIsNotNull(calendar, "startDate");
        Intrinsics.checkParameterIsNotNull(calendar2, "endDateInclusive");
        this.f15269e = calendar2;
        this.f15270f = i;
        this.f15268c = calendar;
    }

    public boolean hasNext() {
        return this.f15268c.compareTo(this.f15269e) <= 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Calendar next() {
        if (hasNext()) {
            Calendar calendar = this.f15268c;
            Object clone = calendar.clone();
            if (clone != null) {
                Calendar calendar2 = (Calendar) clone;
                calendar2.add(5, this.f15270f);
                this.f15268c = calendar2;
                return calendar;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        throw new NoSuchElementException();
    }

    public CalendarIterator(Calendar calendar, Calendar calendar2, int i) {
        Intrinsics.checkParameterIsNotNull(calendar, "startDate");
        Intrinsics.checkParameterIsNotNull(calendar2, "endDateInclusive");
        this.f15269e = calendar2;
        this.f15270f = i;
        this.f15268c = calendar;
    }
}
