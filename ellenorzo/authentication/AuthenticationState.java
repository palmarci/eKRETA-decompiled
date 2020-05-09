package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "", "authenticated", "", "transient", "(ZZ)V", "getAuthenticated", "()Z", "getTransient", "Lhu/ekreta/ellenorzo/authentication/LoggedOut;", "Lhu/ekreta/ellenorzo/authentication/LoggingIn;", "Lhu/ekreta/ellenorzo/authentication/ExtendingToken;", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "Lhu/ekreta/ellenorzo/authentication/TokenExpired;", "Lhu/ekreta/ellenorzo/authentication/LoginFailed;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationState */
/* compiled from: AuthenticationState.kt */
public abstract class AuthenticationState {

    /* renamed from: a */
    public final boolean f11251a;

    /* renamed from: b */
    public final boolean f11252b;

    public /* synthetic */ AuthenticationState(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11251a = z;
        this.f11252b = z2;
    }

    /* renamed from: b */
    public final boolean mo11550b() {
        return this.f11251a;
    }

    /* renamed from: c */
    public final boolean mo11551c() {
        return this.f11252b;
    }
}
