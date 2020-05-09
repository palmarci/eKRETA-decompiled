package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.WhenMappings;
import p289hu.ekreta.ellenorzo.login.LoginRequest;
import p300k.p313b.p315b0.C4675h;
import retrofit2.HttpException;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/authentication/LoginFailed;", "it", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$login$3 */
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$login$3<T, R> implements C4675h<Throwable, AuthenticationState> {

    /* renamed from: c */
    public final /* synthetic */ LoginRequest f11236c;

    public AuthenticationServiceImpl$login$3(LoginRequest loginRequest) {
        this.f11236c = loginRequest;
    }

    /* renamed from: a */
    public final LoginFailed apply(Throwable th) {
        LoginFailCause loginFailCause;
        Intrinsics.checkParameterIsNotNull(th, "it");
        String c = this.f11236c.mo13108c();
        Intrinsics.checkParameterIsNotNull(th, "$this$forbidden");
        if ((th instanceof HttpException) && ((HttpException) th).mo22391a() == 403) {
            loginFailCause = LoginFailCause.NoRightToUseApp;
        } else if (C3984v.m10292b(th)) {
            loginFailCause = LoginFailCause.NetworkError;
        } else if (th instanceof RoleIsNotSupportedException) {
            loginFailCause = LoginFailCause.NotSupportedRole;
        } else if (th instanceof RoleIsNotAuthenticatedException) {
            int i = WhenMappings.f11227a[((RoleIsNotAuthenticatedException) th).mo11566a().ordinal()];
            if (i == 1) {
                loginFailCause = LoginFailCause.TutelaryIsNotAuthenticated;
            } else if (i != 2) {
                loginFailCause = LoginFailCause.NoRightToUseApp;
            } else {
                loginFailCause = LoginFailCause.StudentIsNotAuthenticated;
            }
        } else if (C3984v.m10316c(th)) {
            loginFailCause = LoginFailCause.BadCredentials;
        } else {
            loginFailCause = LoginFailCause.UnknownError;
        }
        return new LoginFailed(c, loginFailCause);
    }
}
