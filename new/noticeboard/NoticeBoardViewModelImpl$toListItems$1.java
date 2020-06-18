package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "notes", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NoticeBoardViewModelImpl.kt */
public final class NoticeBoardViewModelImpl$toListItems$1<T, R> implements h<T, R> {
    public static final NoticeBoardViewModelImpl$toListItems$1 INSTANCE = new NoticeBoardViewModelImpl$toListItems$1();

    /* renamed from: a */
    public final List<NoticeBoardViewModel.ListItem> apply(List<NoticeBoardItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "notes");
        Calendar instance = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((NoticeBoardItem) next).g().after(instance)) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new NoticeBoardViewModelImpl$toListItems$1$$special$$inlined$sortedByDescending$1());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : sortedWith) {
            d dVar = k.b.a0.d.a(((NoticeBoardItem) next2).h()).c.c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            List<NoticeBoardItem> list2 = (List) value.getValue();
            arrayList2.add(new NoticeBoardViewModel.ListItem.SectionHeader(UtilsKt.a(((NoticeBoardItem) CollectionsKt___CollectionsKt.first(list2)).h())));
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (NoticeBoardItem noticeBoardItem : list2) {
                arrayList3.add(new NoticeBoardViewModel.ListItem.NoticeBoardItem(noticeBoardItem));
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }
}
