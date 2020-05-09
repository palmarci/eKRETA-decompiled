package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/LoggedOut;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.LoggedOut */
/* compiled from: AuthenticationState.kt */
public final class LoggedOut extends AuthenticationState {
    public static final LoggedOut INSTANCE = new LoggedOut();

    public LoggedOut() {
        super(false, false, null);
    }
}
