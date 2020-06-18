package hu.ekreta.ellenorzo.splash;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.configSettings.Configuration;
import hu.ekreta.ellenorzo.splash.SplashScreenNavigationAction;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import k.b.b0.h;
import k.b.u;
import k.b.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "kotlin.jvm.PlatformType", "configuration", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$navigationActionSingle$1<T, R> implements h<T, y<? extends R>> {
    public final /* synthetic */ SplashViewModelImpl c;

    public SplashViewModelImpl$navigationActionSingle$1(SplashViewModelImpl splashViewModelImpl) {
        this.c = splashViewModelImpl;
    }

    /* renamed from: a */
    public final u<? extends SplashScreenNavigationAction> apply(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        if (configuration.c()) {
            u<? extends SplashScreenNavigationAction> b = u.b(SplashScreenNavigationAction.NavigateToNotSupportedActivity.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(NavigateToNotSupportedActivity)");
            return b;
        } else if (configuration.a()) {
            u<R> a2 = this.c.a(Integer.valueOf(R.string.newer_version_info_title), Integer.valueOf(R.string.newer_version_info_message), Integer.valueOf(R.string.newer_version_update_title), Integer.valueOf(R.string.Common_Delete_Cancel)).a(new h<T, y<? extends R>>(this) {
                public final /* synthetic */ SplashViewModelImpl$navigationActionSingle$1 c;

                {
                    this.c = r1;
                }

                /* renamed from: a */
                public final u<SplashScreenNavigationAction.NavigateToIntent> apply(Integer num) {
                    Intrinsics.checkParameterIsNotNull(num, "it");
                    if (num.intValue() == -1) {
                        return u.b(new SplashScreenNavigationAction.NavigateToIntent(ExtensionsKt.a(this.c.c.f6122q)));
                    }
                    return u.a((Throwable) new Exception("Use the old version"));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(a2, "showRxDialog(\n          …                        }");
            return a2;
        } else {
            u<? extends SplashScreenNavigationAction> a3 = u.a((Throwable) new Exception("No action needed"));
            Intrinsics.checkExpressionValueIsNotNull(a3, "Single.error(Exception(\"No action needed\"))");
            return a3;
        }
    }
}
