package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.authentication.LoggedIn;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import k.b.n;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "state", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$retry$1 extends Lambda implements Function1<AuthenticationState, n<? extends Object>> {
    public final /* synthetic */ AppModule$createAuthenticatedProxy$1 c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Method f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object[] f5319g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppModule$createAuthenticatedProxy$1$retry$1(AppModule$createAuthenticatedProxy$1 appModule$createAuthenticatedProxy$1, Object obj, Method method, Object[] objArr) {
        super(1);
        this.c = appModule$createAuthenticatedProxy$1;
        this.e = obj;
        this.f = method;
        this.f5319g = objArr;
    }

    /* renamed from: a */
    public final n<? extends Object> invoke(AuthenticationState authenticationState) {
        InvocationHandler invocationHandler;
        Intrinsics.checkParameterIsNotNull(authenticationState, "state");
        if (authenticationState instanceof LoggedIn) {
            invocationHandler = MobileApiV3Kt.replaceAccessToken(this.c.f5318a, (LoggedIn) authenticationState);
        } else {
            invocationHandler = this.c.f5318a;
        }
        Object invoke = invocationHandler.invoke(this.e, this.f, this.f5319g);
        if (invoke != null) {
            return (n) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<out kotlin.Any>");
    }
}
