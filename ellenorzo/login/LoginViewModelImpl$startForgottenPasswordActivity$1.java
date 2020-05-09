package p289hu.ekreta.ellenorzo.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "Landroid/app/Activity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$startForgottenPasswordActivity$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$startForgottenPasswordActivity$1 extends Lambda implements Function1<Activity, Intent> {
    public static final LoginViewModelImpl$startForgottenPasswordActivity$1 INSTANCE = new LoginViewModelImpl$startForgottenPasswordActivity$1();

    public LoginViewModelImpl$startForgottenPasswordActivity$1() {
        super(1);
    }

    /* renamed from: a */
    public final Intent invoke(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        return new Intent("android.intent.action.VIEW", Uri.parse("https://tudasbazis.ekreta.hu/pages/viewpage.action?pageId=17762329"));
    }
}
