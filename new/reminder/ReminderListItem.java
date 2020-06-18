package hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "", "()V", "viewType", "", "getViewType", "()I", "getDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Lhu/ekreta/ellenorzo/reminder/ReminderSectionHeader;", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReminderListItem.kt */
public abstract class ReminderListItem {
    public ReminderListItem() {
    }

    public abstract int a();

    public abstract Intent a(Context context);

    public /* synthetic */ ReminderListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
