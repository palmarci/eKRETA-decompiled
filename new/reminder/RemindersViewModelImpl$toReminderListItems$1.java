package hu.ekreta.ellenorzo.reminder;

import android.content.res.Resources;
import hu.ekreta.ellenorzo.reminder.ReminderItem;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "list", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl$toReminderListItems$1<T, R> implements h<T, R> {
    public final /* synthetic */ RemindersViewModelImpl c;

    public RemindersViewModelImpl$toReminderListItems$1(RemindersViewModelImpl remindersViewModelImpl) {
        this.c = remindersViewModelImpl;
    }

    /* renamed from: a */
    public final List<ReminderItem> apply(List<? extends Reminder> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Reminder a2 : list) {
            ReminderItem.Companion companion = ReminderItem.Companion;
            Resources resources = this.c.v.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            arrayList.add(companion.a(a2, resources));
        }
        return arrayList;
    }
}
