package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.authentication.WithProfile;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "errors", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$1$1<T, R> implements h<n<Throwable>, q<?>> {
    public final /* synthetic */ AuthenticationService c;

    public AppModule$createAuthenticatedProxy$1$1$1(AuthenticationService authenticationService) {
        this.c = authenticationService;
    }

    /* renamed from: a */
    public final n<Object> apply(n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "errors");
        return nVar.a(a.a()).c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ AppModule$createAuthenticatedProxy$1$1$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<Object> apply(final Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                if (v.c(th)) {
                    return this.c.c.l().d(1).c(new h<T, q<? extends R>>(this) {
                        public final /* synthetic */ AnonymousClass1 c;

                        {
                            this.c = r1;
                        }

                        /* renamed from: a */
                        public final n<? extends Object> apply(AuthenticationState authenticationState) {
                            Profile a2;
                            Intrinsics.checkParameterIsNotNull(authenticationState, "authenticationState");
                            if (!(authenticationState instanceof WithProfile)) {
                                authenticationState = null;
                            }
                            WithProfile withProfile = (WithProfile) authenticationState;
                            if (!(withProfile == null || (a2 = withProfile.a()) == null)) {
                                this.c.c.c.b(a2);
                                n<R> c2 = this.c.c.c.l().a(AppModule$createAuthenticatedProxy$1$1$1$1$1$1$1.INSTANCE).d(1).c(new AppModule$createAuthenticatedProxy$1$1$1$1$1$$special$$inlined$let$lambda$1(this));
                                if (c2 != null) {
                                    return c2;
                                }
                            }
                            n<? extends Object> b = n.b(th);
                            Intrinsics.checkExpressionValueIsNotNull(b, "Observable.error<Any>(throwable)");
                            return b;
                        }
                    });
                }
                return n.b(th);
            }
        });
    }
}
