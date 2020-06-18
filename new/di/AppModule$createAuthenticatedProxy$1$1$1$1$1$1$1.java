package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import k.b.b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "test"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$1$1$1$1$1$1<T> implements i<AuthenticationState> {
    public static final AppModule$createAuthenticatedProxy$1$1$1$1$1$1$1 INSTANCE = new AppModule$createAuthenticatedProxy$1$1$1$1$1$1$1();

    /* renamed from: a */
    public final boolean test(AuthenticationState authenticationState) {
        Intrinsics.checkParameterIsNotNull(authenticationState, "it");
        return !authenticationState.b();
    }
}
