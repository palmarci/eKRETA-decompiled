package p289hu.ekreta.ellenorzo.login;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$checkPowerSaverMode$2 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$checkPowerSaverMode$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ LoginViewModelImpl f13665c;

    public LoginViewModelImpl$checkPowerSaverMode$2(LoginViewModelImpl loginViewModelImpl) {
        this.f13665c = loginViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13149a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f13665c.mo16412M1().mo117c(th.getMessage(), th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13149a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
