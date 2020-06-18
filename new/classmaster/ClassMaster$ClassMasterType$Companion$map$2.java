package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.classmaster.ClassMaster;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster$ClassMasterType;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ClassMaster.kt */
public final class ClassMaster$ClassMasterType$Companion$map$2 extends Lambda implements Function0<Map<Integer, ? extends ClassMaster.ClassMasterType>> {
    public static final ClassMaster$ClassMasterType$Companion$map$2 INSTANCE = new ClassMaster$ClassMasterType$Companion$map$2();

    public ClassMaster$ClassMasterType$Companion$map$2() {
        super(0);
    }

    public final Map<Integer, ClassMaster.ClassMasterType> invoke() {
        ClassMaster.ClassMasterType[] values = ClassMaster.ClassMasterType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(values.length), 16));
        for (ClassMaster.ClassMasterType classMasterType : values) {
            linkedHashMap.put(Integer.valueOf(classMasterType.a()), classMasterType);
        }
        return linkedHashMap;
    }
}
