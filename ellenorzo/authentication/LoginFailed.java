package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/LoginFailed;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "userName", "", "loginFailCause", "Lhu/ekreta/ellenorzo/authentication/LoginFailCause;", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/authentication/LoginFailCause;)V", "getLoginFailCause", "()Lhu/ekreta/ellenorzo/authentication/LoginFailCause;", "getUserName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.LoginFailed */
/* compiled from: AuthenticationState.kt */
public final class LoginFailed extends AuthenticationState {

    /* renamed from: c */
    public final String f11256c;

    /* renamed from: d */
    public final LoginFailCause f11257d;

    public LoginFailed(String str, LoginFailCause loginFailCause) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(loginFailCause, "loginFailCause");
        super(false, false, null);
        this.f11256c = str;
        this.f11257d = loginFailCause;
    }

    public static /* synthetic */ LoginFailed copy$default(LoginFailed loginFailed, String str, LoginFailCause loginFailCause, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginFailed.f11256c;
        }
        if ((i & 2) != 0) {
            loginFailCause = loginFailed.f11257d;
        }
        return loginFailed.mo11561a(str, loginFailCause);
    }

    /* renamed from: a */
    public final LoginFailed mo11561a(String str, LoginFailCause loginFailCause) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(loginFailCause, "loginFailCause");
        return new LoginFailed(str, loginFailCause);
    }

    /* renamed from: d */
    public final LoginFailCause mo11562d() {
        return this.f11257d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11257d, (java.lang.Object) r3.f11257d) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.authentication.LoginFailed
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.authentication.LoginFailed r3 = (p289hu.ekreta.ellenorzo.authentication.LoginFailed) r3
            java.lang.String r0 = r2.f11256c
            java.lang.String r1 = r3.f11256c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.authentication.LoginFailCause r0 = r2.f11257d
            hu.ekreta.ellenorzo.authentication.LoginFailCause r3 = r3.f11257d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.LoginFailed.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f11256c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LoginFailCause loginFailCause = this.f11257d;
        if (loginFailCause != null) {
            i = loginFailCause.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("LoginFailed(userName=");
        a.append(this.f11256c);
        a.append(", loginFailCause=");
        a.append(this.f11257d);
        a.append(")");
        return a.toString();
    }
}
