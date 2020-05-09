package p289hu.ekreta.ellenorzo.omission;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p365o.p372c.p373a.C5639d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "omissions", "Lhu/ekreta/ellenorzo/omission/Omission;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayViewModelImpl$toOmissionPerDayList$1 */
/* compiled from: OmissionsPerDayViewModelImpl.kt */
public final class OmissionsPerDayViewModelImpl$toOmissionPerDayList$1<T, R> implements C4675h<T, R> {
    public static final OmissionsPerDayViewModelImpl$toOmissionPerDayList$1 INSTANCE = new OmissionsPerDayViewModelImpl$toOmissionPerDayList$1();

    /* renamed from: a */
    public final List<OmissionPerDay> apply(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C4310x3e6c91f4());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : sortedWith) {
            C5639d dVar = C4664d.m16043a(((Omission) next).mo13851n()).f18303c.f18263c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
            arrayList.add(new OmissionPerDay((C5639d) key, (List) entry.getValue()));
        }
        return arrayList;
    }
}
