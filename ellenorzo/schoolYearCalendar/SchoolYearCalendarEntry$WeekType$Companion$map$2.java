package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.WeekType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry$WeekType;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry$WeekType$Companion$map$2 */
/* compiled from: SchoolYearCalendarEntry.kt */
public final class SchoolYearCalendarEntry$WeekType$Companion$map$2 extends Lambda implements Function0<Map<String, ? extends WeekType>> {
    public static final SchoolYearCalendarEntry$WeekType$Companion$map$2 INSTANCE = new SchoolYearCalendarEntry$WeekType$Companion$map$2();

    public SchoolYearCalendarEntry$WeekType$Companion$map$2() {
        super(0);
    }

    public final Map<String, WeekType> invoke() {
        WeekType[] values = WeekType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (WeekType weekType : values) {
            linkedHashMap.put(weekType.mo15610a(), weekType);
        }
        return linkedHashMap;
    }
}
