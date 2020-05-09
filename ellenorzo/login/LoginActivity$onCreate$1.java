package p289hu.ekreta.ellenorzo.login;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "id", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginActivity$onCreate$1 */
/* compiled from: LoginActivity.kt */
public final class LoginActivity$onCreate$1 implements OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ LoginActivity f13619a;

    public LoginActivity$onCreate$1(LoginActivity loginActivity) {
        this.f13619a = loginActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 0 && i != 6) {
            return false;
        }
        this.f13619a.mo13099q().mo13113C();
        ExtensionsKt.m14879a(this.f13619a);
        return true;
    }
}
