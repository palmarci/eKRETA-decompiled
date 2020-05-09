package p289hu.ekreta.ellenorzo.noticeboard;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p365o.p372c.p373a.C5639d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "notes", "", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModelImpl$toListItems$1 */
/* compiled from: NoticeBoardViewModelImpl.kt */
public final class NoticeBoardViewModelImpl$toListItems$1<T, R> implements C4675h<T, R> {
    public static final NoticeBoardViewModelImpl$toListItems$1 INSTANCE = new NoticeBoardViewModelImpl$toListItems$1();

    /* renamed from: a */
    public final List<ListItem> apply(List<NoticeBoardItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "notes");
        Calendar instance = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((NoticeBoardItem) next).mo13677g().after(instance)) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4291x219e5625());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : sortedWith) {
            C5639d dVar = C4664d.m16043a(((NoticeBoardItem) next2).mo13678h()).f18303c.f18263c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Entry value : linkedHashMap.entrySet()) {
            List<NoticeBoardItem> list2 = (List) value.getValue();
            arrayList2.add(new SectionHeader(UtilsKt.m14828a(((NoticeBoardItem) CollectionsKt___CollectionsKt.first(list2)).mo13678h())));
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (NoticeBoardItem noticeBoardItem : list2) {
                arrayList3.add(new NoticeBoardItem(noticeBoardItem));
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }
}
