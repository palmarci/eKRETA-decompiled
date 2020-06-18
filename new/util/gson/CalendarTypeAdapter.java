package hu.ekreta.ellenorzo.util.gson;

import a.h.c.c0.a;
import a.h.c.c0.c;
import a.h.c.k;
import a.h.c.l;
import a.h.c.x;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/util/gson/CalendarTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Calendar;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CalendarTypeAdapter.kt */
public final class CalendarTypeAdapter extends x<Calendar> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public static final k f6317a = new l().a();
    public static final x<String> b = f6317a.a(String.class);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/util/gson/CalendarTypeAdapter$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "stringTypeAdapter", "Lcom/google/gson/TypeAdapter;", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CalendarTypeAdapter.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: a */
    public void write(c cVar, Calendar calendar) {
        x<String> xVar;
        if (calendar != null && (xVar = b) != null) {
            TimeZone timeZone = UtilsKt.f6309a;
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
            Date time = calendar.getTime();
            Intrinsics.checkParameterIsNotNull(timeZone, "$this$format");
            String format = time != null ? UtilsKt.a(timeZone).format(time) : null;
            if (format == null) {
                Intrinsics.throwNpe();
            }
            xVar.write(cVar, format);
        }
    }

    public Calendar read(a aVar) {
        x<String> xVar = b;
        String read = xVar != null ? xVar.read(aVar) : null;
        TimeZone timeZone = UtilsKt.f6309a;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
        return UtilsKt.a(read, timeZone);
    }
}
