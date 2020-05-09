package p289hu.ekreta.ellenorzo.home;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$onSelect$1 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$onSelect$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ DashboardItem f13355c;

    public HomeViewModelImpl$onSelect$1(DashboardItem dashboardItem) {
        this.f13355c = dashboardItem;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        return this.f13355c.mo12861e();
    }
}
