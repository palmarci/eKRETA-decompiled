package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$tryExtendActiveAuthentication$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AuthenticationServiceImpl c;

    /* renamed from: a */
    public final n<? extends AuthenticationState> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "it");
        if (bool.booleanValue()) {
            return this.c.f.b().c(new h<T, q<? extends R>>(this) {
                public final /* synthetic */ AuthenticationServiceImpl$tryExtendActiveAuthentication$1 c;

                {
                    this.c = r1;
                }

                /* renamed from: a */
                public final n<AuthenticationState> apply(Profile profile) {
                    Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                    this.c.c.b(profile);
                    return n.j();
                }
            });
        }
        return n.d(LoggedOut.INSTANCE);
    }
}
