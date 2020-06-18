package hu.ekreta.ellenorzo.login;

import android.content.Intent;
import hu.ekreta.ellenorzo.R;
import k.b.b0.h;
import k.b.u;
import k.b.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "appIntent", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$checkPowerSaverMode$1<T, R> implements h<T, y<? extends R>> {
    public final /* synthetic */ LoginViewModelImpl c;

    public LoginViewModelImpl$checkPowerSaverMode$1(LoginViewModelImpl loginViewModelImpl) {
        this.c = loginViewModelImpl;
    }

    /* renamed from: a */
    public final u<Pair<Integer, Intent>> apply(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "appIntent");
        return this.c.a(Integer.valueOf(R.string.attention), Integer.valueOf(R.string.power_saver_message), Integer.valueOf(R.string.power_saver_dialog_setting_button_text), Integer.valueOf(R.string.power_saver_dialog_later_button_text)).a(u.b(intent), AnonymousClass1.INSTANCE);
    }
}
