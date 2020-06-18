package hu.ekreta.ellenorzo.configSettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotSupportedAppViewModelImpl.kt */
public final class NotSupportedAppViewModelImpl$exitNotSupportedApp$1 extends Lambda implements Function1<Activity, Intent> {
    public static final NotSupportedAppViewModelImpl$exitNotSupportedApp$1 INSTANCE = new NotSupportedAppViewModelImpl$exitNotSupportedApp$1();

    public NotSupportedAppViewModelImpl$exitNotSupportedApp$1() {
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        activity.finish();
        return ExtensionsKt.a((Context) activity);
    }
}
