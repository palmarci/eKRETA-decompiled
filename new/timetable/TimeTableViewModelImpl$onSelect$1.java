package hu.ekreta.ellenorzo.timetable;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableViewModelImpl.kt */
public final class TimeTableViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ TimeTableItem c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableViewModelImpl$onSelect$1(TimeTableItem timeTableItem) {
        super(1);
        this.c = timeTableItem;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intent a2 = a.a(activity, "$receiver", activity, TimeTableItemDetailActivity.class);
        ExtensionsKt.a(a2, this.c);
        return a2;
    }
}
