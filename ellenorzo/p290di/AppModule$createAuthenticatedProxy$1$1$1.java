package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.authentication.WithProfile;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p315b0.C4676i;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "errors", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedProxy$1$1$1 */
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1$1$1<T, R> implements C4675h<C5027n<Throwable>, C5030q<?>> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticationService f12549c;

    public AppModule$createAuthenticatedProxy$1$1$1(AuthenticationService authenticationService) {
        this.f12549c = authenticationService;
    }

    /* renamed from: a */
    public final C5027n<Object> apply(C5027n<Throwable> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "errors");
        return nVar.mo17214a(C5041a.m16999a()).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ AppModule$createAuthenticatedProxy$1$1$1 f12550c;

            {
                this.f12550c = r1;
            }

            /* renamed from: a */
            public final C5027n<Object> apply(final Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                if (C3984v.m10316c(th)) {
                    return this.f12550c.f12549c.mo11515l().mo17237d(1).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

                        /* renamed from: c */
                        public final /* synthetic */ C41291 f12551c;

                        {
                            this.f12551c = r1;
                        }

                        /* renamed from: a */
                        public final C5027n<? extends Object> apply(AuthenticationState authenticationState) {
                            Intrinsics.checkParameterIsNotNull(authenticationState, "authenticationState");
                            if (!(authenticationState instanceof WithProfile)) {
                                authenticationState = null;
                            }
                            WithProfile withProfile = (WithProfile) authenticationState;
                            if (withProfile != null) {
                                Profile a = withProfile.mo11553a();
                                if (a != null) {
                                    this.f12551c.f12550c.f12549c.mo11513b(a);
                                    C5027n<? extends Object> c = this.f12551c.f12550c.f12549c.mo11515l().mo17211a((C4676i<? super T>) AppModule$createAuthenticatedProxy$1$1$1$1$1$1$1.INSTANCE).mo17237d(1).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4125xf63cb95c<Object,Object>(this));
                                    if (c != null) {
                                        return c;
                                    }
                                }
                            }
                            C5027n<? extends Object> b = C5027n.m16896b(th);
                            Intrinsics.checkExpressionValueIsNotNull(b, "Observable.error<Any>(throwable)");
                            return b;
                        }
                    });
                }
                return C5027n.m16896b(th);
            }
        });
    }
}
