package p289hu.ekreta.ellenorzo.login;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "isFocused", "", "onFocusChange"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$createOnFocusChangeListener$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$createOnFocusChangeListener$1 implements OnFocusChangeListener {

    /* renamed from: c */
    public final /* synthetic */ LoginViewModelImpl f13666c;

    public LoginViewModelImpl$createOnFocusChangeListener$1(LoginViewModelImpl loginViewModelImpl) {
        this.f13666c = loginViewModelImpl;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z && !this.f13666c.mo13119L()) {
            this.f13666c.mo13126c("");
            this.f13666c.mo13135c(true);
        }
    }
}
