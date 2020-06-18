package hu.ekreta.ellenorzo.splash;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b;
import k.b.b0.h;
import k.b.d;
import k.b.u;
import k.b.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$navigationActionSingle$2<T, R> implements h<Throwable, y<? extends SplashScreenNavigationAction>> {
    public final /* synthetic */ SplashViewModelImpl c;

    public SplashViewModelImpl$navigationActionSingle$2(SplashViewModelImpl splashViewModelImpl) {
        this.c = splashViewModelImpl;
    }

    /* renamed from: a */
    public final u<SplashScreenNavigationAction> apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        return this.c.f6118m.d().a(new h<T, y<? extends R>>(this) {
            public final /* synthetic */ SplashViewModelImpl$navigationActionSingle$2 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final u<Boolean> apply(Boolean bool) {
                Intrinsics.checkParameterIsNotNull(bool, "it");
                if (!bool.booleanValue()) {
                    return this.c.c.f6118m.a().d(1).g(AnonymousClass1.INSTANCE).d(new h<Profile, d>(this) {
                        public final /* synthetic */ AnonymousClass1 c;

                        {
                            this.c = r1;
                        }

                        /* renamed from: a */
                        public final b apply(Profile profile) {
                            Intrinsics.checkParameterIsNotNull(profile, "it");
                            return this.c.c.c.f6118m.d(profile);
                        }
                    }).a(u.b(true)).a(u.b(false));
                }
                return u.b(true);
            }
        }).e(AnonymousClass2.INSTANCE);
    }
}
