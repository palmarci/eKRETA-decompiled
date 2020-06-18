package hu.ekreta.ellenorzo.reminder;

import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.c.a.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "list", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl$toSectionedList$1<T, R> implements h<T, R> {
    public final /* synthetic */ RemindersViewModelImpl c;

    public RemindersViewModelImpl$toSectionedList$1(RemindersViewModelImpl remindersViewModelImpl) {
        this.c = remindersViewModelImpl;
    }

    /* renamed from: a */
    public final List<ReminderListItem> apply(List<? extends ReminderItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            Calendar b = ((ReminderItem) next).b();
            Calendar a2 = this.c.u.a();
            UtilsKt.g(a2);
            if (b.compareTo(a2) >= 0) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new RemindersViewModelImpl$toSectionedList$1$$special$$inlined$sortedBy$1());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : sortedWith) {
            d dVar = k.b.a0.d.a(((ReminderItem) next2).b()).c.c;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            d dVar2 = (d) entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(dVar2, "dayOfMonth");
            arrayList2.add(new ReminderSectionHeader(ExtensionsKt.a(dVar2)));
            arrayList2.addAll((List) entry.getValue());
        }
        return CollectionsKt___CollectionsKt.toList(arrayList2);
    }
}
