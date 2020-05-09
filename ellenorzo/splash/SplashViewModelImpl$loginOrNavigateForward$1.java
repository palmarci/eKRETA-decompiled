package p289hu.ekreta.ellenorzo.splash;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "navigationAction", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashViewModelImpl$loginOrNavigateForward$1 */
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$loginOrNavigateForward$1 extends Lambda implements Function1<SplashScreenNavigationAction, Unit> {

    /* renamed from: c */
    public final /* synthetic */ SplashViewModelImpl f14808c;

    public SplashViewModelImpl$loginOrNavigateForward$1(SplashViewModelImpl splashViewModelImpl) {
        this.f14808c = splashViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo15673a(final SplashScreenNavigationAction splashScreenNavigationAction) {
        Intrinsics.checkParameterIsNotNull(splashScreenNavigationAction, "navigationAction");
        this.f14808c.mo16376b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>() {
            /* renamed from: a */
            public final Intent invoke(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "$receiver");
                if (splashScreenNavigationAction.mo15670a()) {
                    activity.finish();
                }
                return splashScreenNavigationAction.mo15669a(activity);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15673a((SplashScreenNavigationAction) obj);
        return Unit.INSTANCE;
    }
}
