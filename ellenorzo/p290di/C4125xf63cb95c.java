package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.authentication.LoggedIn;
import p289hu.ekreta.ellenorzo.p290di.AppModule$createAuthenticatedProxy$1$1$1.C41291.C41301;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "kotlin.jvm.PlatformType", "T", "", "it", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "apply", "hu/ekreta/ellenorzo/di/AppModule$createAuthenticatedProxy$1$1$1$1$1$1$2"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedProxy$1$1$1$1$1$$special$$inlined$let$lambda$1 */
/* compiled from: AppModule.kt */
public final class C4125xf63cb95c<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ C41301 f12537c;

    public C4125xf63cb95c(C41301 r1) {
        this.f12537c = r1;
    }

    /* renamed from: a */
    public final C5027n<LoggedIn> apply(AuthenticationState authenticationState) {
        Intrinsics.checkParameterIsNotNull(authenticationState, "it");
        if (authenticationState instanceof LoggedIn) {
            return C5027n.m16898d(authenticationState);
        }
        return C5027n.m16896b(r4);
    }
}
