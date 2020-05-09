package p289hu.ekreta.ellenorzo.login;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "ignore", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$userId$2 */
/* compiled from: LoginViewModelImpl.kt */
public final /* synthetic */ class LoginViewModelImpl$userId$2 extends FunctionReference implements Function1<Object, Unit> {
    public LoginViewModelImpl$userId$2(LoginViewModelImpl loginViewModelImpl) {
        super(1, loginViewModelImpl);
    }

    public final String getName() {
        return "updateLoginEnabled";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(LoginViewModelImpl.class);
    }

    public final String getSignature() {
        return "updateLoginEnabled(Ljava/lang/Object;)V";
    }

    public final void invoke(Object obj) {
        ((LoginViewModelImpl) this.receiver).mo13133Q1();
    }
}
