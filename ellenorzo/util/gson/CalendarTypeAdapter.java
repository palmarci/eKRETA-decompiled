package p289hu.ekreta.ellenorzo.util.gson;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p159c.C2559k;
import p000a.p054h.p159c.C2561l;
import p000a.p054h.p159c.C2575x;
import p000a.p054h.p159c.p165c0.C2542a;
import p000a.p054h.p159c.p165c0.C2545c;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/gson/CalendarTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Calendar;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.gson.CalendarTypeAdapter */
/* compiled from: CalendarTypeAdapter.kt */
public final class CalendarTypeAdapter extends C2575x<Calendar> {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final C2559k f15422a = new C2561l().mo4835a();

    /* renamed from: b */
    public static final C2575x<String> f15423b = f15422a.mo4827a(String.class);

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/gson/CalendarTypeAdapter$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "stringTypeAdapter", "Lcom/google/gson/TypeAdapter;", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.gson.CalendarTypeAdapter$Companion */
    /* compiled from: CalendarTypeAdapter.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: a */
    public void write(C2545c cVar, Calendar calendar) {
        if (calendar != null) {
            C2575x<String> xVar = f15423b;
            if (xVar != null) {
                TimeZone timeZone = UtilsKt.f15407a;
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
                Date time = calendar.getTime();
                Intrinsics.checkParameterIsNotNull(timeZone, "$this$format");
                String format = time != null ? UtilsKt.m14831a(timeZone).format(time) : null;
                if (format == null) {
                    Intrinsics.throwNpe();
                }
                xVar.write(cVar, format);
            }
        }
    }

    public Calendar read(C2542a aVar) {
        C2575x<String> xVar = f15423b;
        String str = xVar != null ? (String) xVar.read(aVar) : null;
        TimeZone timeZone = UtilsKt.f15407a;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZoneUtc");
        return UtilsKt.m14833a(str, timeZone);
    }
}
