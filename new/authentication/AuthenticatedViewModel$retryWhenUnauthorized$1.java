package hu.ekreta.ellenorzo.authentication;

import h.w.v;
import hu.ekreta.ellenorzo.util.DebugHelpersKt;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "errors", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticatedViewModel.kt */
public final class AuthenticatedViewModel$retryWhenUnauthorized$1<T, R> implements h<n<Throwable>, q<?>> {
    public final /* synthetic */ AuthenticatedViewModel c;

    public AuthenticatedViewModel$retryWhenUnauthorized$1(AuthenticatedViewModel authenticatedViewModel) {
        this.c = authenticatedViewModel;
    }

    /* renamed from: a */
    public final n<Object> apply(n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "errors");
        return nVar.k(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ AuthenticatedViewModel$retryWhenUnauthorized$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<? extends Object> apply(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                DebugHelpersKt.debugPrint$default("AuthenticatedViewModel::retryWhenUnauthorized: " + th + ", " + v.c(th), (String) null, (Integer) null, 6, (Object) null);
                if (v.c(th)) {
                    return this.c.c.f5057k.m().d(1).c(AnonymousClass1.INSTANCE);
                }
                return n.b(th);
            }
        });
    }
}
