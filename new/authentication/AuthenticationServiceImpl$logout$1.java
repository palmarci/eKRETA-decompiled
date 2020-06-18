package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$logout$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AuthenticationServiceImpl c;

    /* renamed from: a */
    public final n<Profile> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "it");
        if (bool.booleanValue()) {
            return this.c.f.b().c(new h<T, q<? extends R>>(this) {
                public final /* synthetic */ AuthenticationServiceImpl$logout$1 c;

                {
                    this.c = r1;
                }

                /* renamed from: a */
                public final n<Profile> apply(Profile profile) {
                    Intrinsics.checkParameterIsNotNull(profile, "it");
                    return this.c.c.f.c(Profile.copy$default(profile, (String) null, (String) null, false, (String) null, (String) null, 0, (String) null, (String) null, (SupportedRole) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Calendar) null, (String) null, (String) null, (List) null, (Calendar) null, (String) null, (String) null, false, 16777211, (Object) null));
                }
            });
        }
        return n.j();
    }
}
