package p289hu.ekreta.ellenorzo.splash;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.configSettings.Configuration;
import p289hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction.NavigateToGooglePlayStore;
import p289hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction.NavigateToNotSupportedActivity;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "kotlin.jvm.PlatformType", "configuration", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl$navigationActionSingle$1 */
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$navigationActionSingle$1<T, R> implements C4675h<T, C5040y<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ SplashViewModelImpl f14813c;

    public SplashViewModelImpl$navigationActionSingle$1(SplashViewModelImpl splashViewModelImpl) {
        this.f14813c = splashViewModelImpl;
    }

    /* renamed from: a */
    public final C5036u<? extends SplashScreenNavigationAction> apply(final Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        if (configuration.mo12310b()) {
            C5036u<? extends SplashScreenNavigationAction> b = C5036u.m16978b(NavigateToNotSupportedActivity.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(NavigateToNotSupportedActivity)");
            return b;
        } else if (configuration.mo12311c()) {
            C5036u<? extends SplashScreenNavigationAction> a = this.f14813c.mo16365a(Integer.valueOf(C4014R.string.newer_version_info_title), Integer.valueOf(C4014R.string.newer_version_info_message), Integer.valueOf(C4014R.string.newer_version_update_title), Integer.valueOf(C4014R.string.Common_Delete_Cancel)).mo17259a((C4675h<? super T, ? extends C5040y<? extends R>>) new C4675h<T, C5040y<? extends R>>() {
                /* renamed from: a */
                public final C5036u<NavigateToGooglePlayStore> apply(Integer num) {
                    Intrinsics.checkParameterIsNotNull(num, "it");
                    if (num.intValue() == -1) {
                        return C5036u.m16978b(new NavigateToGooglePlayStore(configuration.mo12309a()));
                    }
                    return C5036u.m16976a((Throwable) new Exception("Use the old version"));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(a, "showRxDialog(\n          …                        }");
            return a;
        } else {
            C5036u<? extends SplashScreenNavigationAction> a2 = C5036u.m16976a((Throwable) new Exception("No action needed"));
            Intrinsics.checkExpressionValueIsNotNull(a2, "Single.error(Exception(\"No action needed\"))");
            return a2;
        }
    }
}
