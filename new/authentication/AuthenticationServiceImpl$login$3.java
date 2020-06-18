package hu.ekreta.ellenorzo.authentication;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl;
import hu.ekreta.ellenorzo.login.LoginRequest;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/authentication/LoginFailed;", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$login$3<T, R> implements h<Throwable, AuthenticationState> {
    public final /* synthetic */ LoginRequest c;

    public AuthenticationServiceImpl$login$3(LoginRequest loginRequest) {
        this.c = loginRequest;
    }

    /* renamed from: a */
    public final LoginFailed apply(Throwable th) {
        LoginFailCause loginFailCause;
        Intrinsics.checkParameterIsNotNull(th, "it");
        String c2 = this.c.c();
        Intrinsics.checkParameterIsNotNull(th, "$this$forbidden");
        boolean z = th instanceof HttpException;
        boolean z2 = false;
        if (z && ((HttpException) th).a() == 403) {
            loginFailCause = LoginFailCause.NotEnoughPermission;
        } else if (v.b(th)) {
            loginFailCause = LoginFailCause.NetworkError;
        } else if (th instanceof RoleIsNotSupportedException) {
            loginFailCause = LoginFailCause.NotSupportedRole;
        } else if (th instanceof RoleIsNotAuthenticatedException) {
            int i2 = AuthenticationServiceImpl.WhenMappings.f5066a[((RoleIsNotAuthenticatedException) th).a().ordinal()];
            if (i2 == 1) {
                loginFailCause = LoginFailCause.GuardianIsNotAuthenticated;
            } else if (i2 != 2) {
                loginFailCause = LoginFailCause.NotEnoughPermission;
            } else {
                loginFailCause = LoginFailCause.StudentIsNotAuthenticated;
            }
        } else if (v.c(th)) {
            loginFailCause = LoginFailCause.Unauthorised;
        } else {
            Intrinsics.checkParameterIsNotNull(th, "$this$clientError");
            if (z) {
                HttpException httpException = (HttpException) th;
                if (400 <= httpException.a() && httpException.a() <= 499) {
                    z2 = true;
                }
            }
            if (z2) {
                loginFailCause = LoginFailCause.BadCredentials;
            } else {
                loginFailCause = LoginFailCause.UnknownError;
            }
        }
        return new LoginFailed(c2, loginFailCause);
    }
}
