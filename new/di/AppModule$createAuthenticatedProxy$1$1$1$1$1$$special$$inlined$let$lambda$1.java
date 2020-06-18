package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.authentication.LoggedIn;
import hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedProxy$1$1$1;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "kotlin.jvm.PlatformType", "T", "", "it", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "apply", "hu/ekreta/ellenorzo/di/AppModule$createAuthenticatedProxy$1$1$1$1$1$1$2"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$1$1$1$1$$special$$inlined$let$lambda$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AppModule$createAuthenticatedProxy$1$1$1.AnonymousClass1.AnonymousClass1 c;

    public AppModule$createAuthenticatedProxy$1$1$1$1$1$$special$$inlined$let$lambda$1(AppModule$createAuthenticatedProxy$1$1$1.AnonymousClass1.AnonymousClass1 r1) {
        this.c = r1;
    }

    /* renamed from: a */
    public final n<LoggedIn> apply(AuthenticationState authenticationState) {
        Intrinsics.checkParameterIsNotNull(authenticationState, "it");
        if (authenticationState instanceof LoggedIn) {
            return n.d(authenticationState);
        }
        return n.b(r4);
    }
}
