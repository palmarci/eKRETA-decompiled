package hu.ekreta.ellenorzo.authentication;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/LoginFailed;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "userName", "", "loginFailCause", "Lhu/ekreta/ellenorzo/authentication/LoginFailCause;", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/authentication/LoginFailCause;)V", "getLoginFailCause", "()Lhu/ekreta/ellenorzo/authentication/LoginFailCause;", "getUserName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationState.kt */
public final class LoginFailed extends AuthenticationState {
    public final String b;
    public final LoginFailCause c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginFailed(String str, LoginFailCause loginFailCause) {
        super(false, false, (DefaultConstructorMarker) null);
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(loginFailCause, "loginFailCause");
        this.b = str;
        this.c = loginFailCause;
    }

    public static /* synthetic */ LoginFailed copy$default(LoginFailed loginFailed, String str, LoginFailCause loginFailCause, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = loginFailed.b;
        }
        if ((i2 & 2) != 0) {
            loginFailCause = loginFailed.c;
        }
        return loginFailed.a(str, loginFailCause);
    }

    public final LoginFailed a(String str, LoginFailCause loginFailCause) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(loginFailCause, "loginFailCause");
        return new LoginFailed(str, loginFailCause);
    }

    public final LoginFailCause c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginFailed)) {
            return false;
        }
        LoginFailed loginFailed = (LoginFailed) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) loginFailed.b) && Intrinsics.areEqual((Object) this.c, (Object) loginFailed.c);
    }

    public int hashCode() {
        String str = this.b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LoginFailCause loginFailCause = this.c;
        if (loginFailCause != null) {
            i2 = loginFailCause.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("LoginFailed(userName=");
        a2.append(this.b);
        a2.append(", loginFailCause=");
        a2.append(this.c);
        a2.append(")");
        return a2.toString();
    }
}
