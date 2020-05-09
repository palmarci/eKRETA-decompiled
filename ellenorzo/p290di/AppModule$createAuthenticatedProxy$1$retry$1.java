package p289hu.ekreta.ellenorzo.p290di;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.authentication.LoggedIn;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "state", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedProxy$1$retry$1 */
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$retry$1 extends Lambda implements Function1<AuthenticationState, C5027n<? extends Object>> {

    /* renamed from: c */
    public final /* synthetic */ AppModule$createAuthenticatedProxy$1 f12553c;

    /* renamed from: e */
    public final /* synthetic */ Object f12554e;

    /* renamed from: f */
    public final /* synthetic */ Method f12555f;

    /* renamed from: g */
    public final /* synthetic */ Object[] f12556g;

    public AppModule$createAuthenticatedProxy$1$retry$1(AppModule$createAuthenticatedProxy$1 appModule$createAuthenticatedProxy$1, Object obj, Method method, Object[] objArr) {
        this.f12553c = appModule$createAuthenticatedProxy$1;
        this.f12554e = obj;
        this.f12555f = method;
        this.f12556g = objArr;
        super(1);
    }

    /* renamed from: a */
    public final C5027n<? extends Object> invoke(AuthenticationState authenticationState) {
        InvocationHandler invocationHandler;
        Intrinsics.checkParameterIsNotNull(authenticationState, "state");
        if (authenticationState instanceof LoggedIn) {
            invocationHandler = MobileApiV3Kt.replaceAccessToken(this.f12553c.f12547a, (LoggedIn) authenticationState);
        } else {
            invocationHandler = this.f12553c.f12547a;
        }
        Object invoke = invocationHandler.invoke(this.f12554e, this.f12555f, this.f12556g);
        if (invoke != null) {
            return (C5027n) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<out kotlin.Any>");
    }
}
