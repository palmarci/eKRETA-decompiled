package hu.ekreta.ellenorzo.login;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.TextView;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "id", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$onCreate$1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginActivity f5710a;

    public LoginActivity$onCreate$1(LoginActivity loginActivity) {
        this.f5710a = loginActivity;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 0 && i2 != 6) {
            return false;
        }
        this.f5710a.q().C();
        ExtensionsKt.a((Activity) this.f5710a);
        return true;
    }
}
