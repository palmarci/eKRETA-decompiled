package hu.ekreta.ellenorzo.home;

import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem;", "it", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$observeLocalData$2<T, R> implements h<T, R> {
    public static final HomeViewModelImpl$observeLocalData$2 INSTANCE = new HomeViewModelImpl$observeLocalData$2();

    /* renamed from: a */
    public final List<ListItem> apply(List<? extends ListItem.DashboardItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        List<T> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new HomeViewModelImpl$observeLocalData$2$$special$$inlined$sortedByDescending$1());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : sortedWith) {
            d dVar = k.b.a0.d.a(((ListItem.DashboardItem) next).b()).c.c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new ListItem.SectionHeader(UtilsKt.b(((ListItem.DashboardItem) CollectionsKt___CollectionsKt.first((List) entry.getValue())).b())));
            arrayList.addAll((Collection) entry.getValue());
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }
}
