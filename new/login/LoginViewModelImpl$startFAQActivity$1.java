package hu.ekreta.ellenorzo.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$startFAQActivity$1 extends Lambda implements Function1<Activity, Intent> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$startFAQActivity$1(LoginViewModelImpl loginViewModelImpl) {
        super(1);
        this.c = loginViewModelImpl;
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        return new Intent("android.intent.action.VIEW", Uri.parse(this.c.u.getString(R.string.urlFAQ)));
    }
}
