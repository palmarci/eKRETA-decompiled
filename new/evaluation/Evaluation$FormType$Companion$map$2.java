package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$FormType;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: Evaluation.kt */
public final class Evaluation$FormType$Companion$map$2 extends Lambda implements Function0<Map<String, ? extends Evaluation.FormType>> {
    public static final Evaluation$FormType$Companion$map$2 INSTANCE = new Evaluation$FormType$Companion$map$2();

    public Evaluation$FormType$Companion$map$2() {
        super(0);
    }

    public final Map<String, Evaluation.FormType> invoke() {
        Evaluation.FormType[] values = Evaluation.FormType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (Evaluation.FormType formType : values) {
            linkedHashMap.put(formType.a(), formType);
        }
        return linkedHashMap;
    }
}
