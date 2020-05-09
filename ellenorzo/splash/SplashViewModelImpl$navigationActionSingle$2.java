package p289hu.ekreta.ellenorzo.splash;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl$navigationActionSingle$2 */
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$navigationActionSingle$2<T, R> implements C4675h<Throwable, C5040y<? extends SplashScreenNavigationAction>> {

    /* renamed from: c */
    public final /* synthetic */ SplashViewModelImpl f14815c;

    public SplashViewModelImpl$navigationActionSingle$2(SplashViewModelImpl splashViewModelImpl) {
        this.f14815c = splashViewModelImpl;
    }

    /* renamed from: a */
    public final C5036u<SplashScreenNavigationAction> apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        return this.f14815c.f14804l.mo14196d().mo17259a((C4675h<? super T, ? extends C5040y<? extends R>>) new C4675h<T, C5040y<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ SplashViewModelImpl$navigationActionSingle$2 f14816c;

            {
                this.f14816c = r1;
            }

            /* renamed from: a */
            public final C5036u<Boolean> apply(Boolean bool) {
                Intrinsics.checkParameterIsNotNull(bool, "it");
                boolean booleanValue = bool.booleanValue();
                Boolean valueOf = Boolean.valueOf(true);
                if (!booleanValue) {
                    return this.f14816c.f14815c.f14804l.mo14187a().mo17237d(1).mo17246g(C43401.INSTANCE).mo17236d((C4675h<? super T, ? extends C4991d>) new C4675h<Profile, C4991d>(this) {

                        /* renamed from: c */
                        public final /* synthetic */ C43391 f14817c;

                        {
                            this.f14817c = r1;
                        }

                        /* renamed from: a */
                        public final C4667b apply(Profile profile) {
                            Intrinsics.checkParameterIsNotNull(profile, "it");
                            return this.f14817c.f14816c.f14815c.f14804l.mo14194d(profile);
                        }
                    }).mo16977a((C5040y<T>) C5036u.m16978b(valueOf)).mo17261a(C5036u.m16978b(Boolean.valueOf(false)));
                }
                return C5036u.m16978b(valueOf);
            }
        }).mo17269e(C43422.INSTANCE);
    }
}
