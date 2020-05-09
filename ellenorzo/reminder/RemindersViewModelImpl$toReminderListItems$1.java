package p289hu.ekreta.ellenorzo.reminder;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.reminder.ReminderItem.Companion;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "list", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl$toReminderListItems$1 */
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl$toReminderListItems$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ RemindersViewModelImpl f14673c;

    public RemindersViewModelImpl$toReminderListItems$1(RemindersViewModelImpl remindersViewModelImpl) {
        this.f14673c = remindersViewModelImpl;
    }

    /* renamed from: a */
    public final List<ReminderItem> apply(List<? extends Reminder> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Reminder reminder : list) {
            Companion companion = ReminderItem.Companion;
            Resources resources = this.f14673c.mo14319Q1().getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            arrayList.add(companion.mo14290a(reminder, resources));
        }
        return arrayList;
    }
}