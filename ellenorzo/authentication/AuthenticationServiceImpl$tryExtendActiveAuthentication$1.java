package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$tryExtendActiveAuthentication$1 */
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$tryExtendActiveAuthentication$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticationServiceImpl f11241c;

    /* renamed from: a */
    public final C5027n<? extends AuthenticationState> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "it");
        if (bool.booleanValue()) {
            return this.f11241c.f11213f.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                /* renamed from: c */
                public final /* synthetic */ AuthenticationServiceImpl$tryExtendActiveAuthentication$1 f11242c;

                {
                    this.f11242c = r1;
                }

                /* renamed from: a */
                public final C5027n<AuthenticationState> apply(Profile profile) {
                    Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                    this.f11242c.f11241c.mo11513b(profile);
                    return C5027n.m16899j();
                }
            });
        }
        return C5027n.m16898d(LoggedOut.INSTANCE);
    }
}
