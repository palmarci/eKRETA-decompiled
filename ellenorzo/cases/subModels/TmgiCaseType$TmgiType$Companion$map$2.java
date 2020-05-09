package p289hu.ekreta.ellenorzo.cases.subModels;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType.TmgiType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/TmgiCaseType$TmgiType;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType$TmgiType$Companion$map$2 */
/* compiled from: TmgiCaseType.kt */
public final class TmgiCaseType$TmgiType$Companion$map$2 extends Lambda implements Function0<Map<String, ? extends TmgiType>> {
    public static final TmgiCaseType$TmgiType$Companion$map$2 INSTANCE = new TmgiCaseType$TmgiType$Companion$map$2();

    public TmgiCaseType$TmgiType$Companion$map$2() {
        super(0);
    }

    public final Map<String, TmgiType> invoke() {
        TmgiType[] values = TmgiType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (TmgiType tmgiType : values) {
            linkedHashMap.put(tmgiType.mo12029a(), tmgiType);
        }
        return linkedHashMap;
    }
}
