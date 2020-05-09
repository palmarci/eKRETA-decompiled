package p289hu.ekreta.ellenorzo.reminder;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl$onSelect$1 */
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ ReminderListItem f14672c;

    public RemindersViewModelImpl$onSelect$1(ReminderListItem reminderListItem) {
        this.f14672c = reminderListItem;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        return this.f14672c.mo14291a(activity);
    }
}
