package p289hu.ekreta.ellenorzo.omission;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.omission.Omission.JustificationState;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/omission/Omission$JustificationState;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.Omission$JustificationState$Companion$map$2 */
/* compiled from: Omission.kt */
public final class Omission$JustificationState$Companion$map$2 extends Lambda implements Function0<Map<String, ? extends JustificationState>> {
    public static final Omission$JustificationState$Companion$map$2 INSTANCE = new Omission$JustificationState$Companion$map$2();

    public Omission$JustificationState$Companion$map$2() {
        super(0);
    }

    public final Map<String, JustificationState> invoke() {
        JustificationState[] values = JustificationState.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (JustificationState justificationState : values) {
            linkedHashMap.put(justificationState.mo13867b(), justificationState);
        }
        return linkedHashMap;
    }
}
