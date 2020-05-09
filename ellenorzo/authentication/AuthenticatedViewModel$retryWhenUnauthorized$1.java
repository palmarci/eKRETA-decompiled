package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.DebugHelpersKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "errors", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel$retryWhenUnauthorized$1 */
/* compiled from: AuthenticatedViewModel.kt */
public final class AuthenticatedViewModel$retryWhenUnauthorized$1<T, R> implements C4675h<C5027n<Throwable>, C5030q<?>> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedViewModel f11205c;

    public AuthenticatedViewModel$retryWhenUnauthorized$1(AuthenticatedViewModel authenticatedViewModel) {
        this.f11205c = authenticatedViewModel;
    }

    /* renamed from: a */
    public final C5027n<Object> apply(C5027n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "errors");
        return nVar.mo17252k(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ AuthenticatedViewModel$retryWhenUnauthorized$1 f11206c;

            {
                this.f11206c = r1;
            }

            /* renamed from: a */
            public final C5027n<? extends Object> apply(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                StringBuilder sb = new StringBuilder();
                sb.append("AuthenticatedViewModel::retryWhenUnauthorized: ");
                sb.append(th);
                sb.append(", ");
                sb.append(C3984v.m10316c(th));
                DebugHelpersKt.debugPrint$default(sb.toString(), null, null, 6, null);
                if (C3984v.m10316c(th)) {
                    return this.f11206c.f11205c.f11203j.mo11516m().mo17237d(1).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) C40371.INSTANCE);
                }
                return C5027n.m16896b(th);
            }
        });
    }
}
