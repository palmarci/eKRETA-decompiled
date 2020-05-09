package p289hu.ekreta.ellenorzo.util.viewmodel;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel$startChooser$1 */
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$startChooser$1 extends Lambda implements Function1<Activity, Intent> {

    /* renamed from: c */
    public final /* synthetic */ Intent f15465c;

    /* renamed from: e */
    public final /* synthetic */ int f15466e;

    public DataBindingViewModel$startChooser$1(Intent intent, int i) {
        this.f15465c = intent;
        this.f15466e = i;
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        return Intent.createChooser(this.f15465c, activity.getString(this.f15466e));
    }
}
