package hu.ekreta.ellenorzo.omission.perDay;

import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionPerDay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "omissions", "Lhu/ekreta/ellenorzo/omission/Omission;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionsPerDayViewModelImpl.kt */
public final class OmissionsPerDayViewModelImpl$toOmissionPerDayList$1<T, R> implements h<T, R> {
    public static final OmissionsPerDayViewModelImpl$toOmissionPerDayList$1 INSTANCE = new OmissionsPerDayViewModelImpl$toOmissionPerDayList$1();

    /* renamed from: a */
    public final List<OmissionPerDay> apply(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        List<T> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new OmissionsPerDayViewModelImpl$toOmissionPerDayList$1$$special$$inlined$sortedByDescending$1());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : sortedWith) {
            d dVar = k.b.a0.d.a(((Omission) next).n()).c.c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
            arrayList.add(new OmissionPerDay((d) key, (List) entry.getValue()));
        }
        return arrayList;
    }
}
