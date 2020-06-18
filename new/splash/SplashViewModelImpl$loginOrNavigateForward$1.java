package hu.ekreta.ellenorzo.splash;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "navigationAction", "Lhu/ekreta/ellenorzo/splash/SplashScreenNavigationAction;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: SplashViewModelImpl.kt */
public final class SplashViewModelImpl$loginOrNavigateForward$1 extends Lambda implements Function1<SplashScreenNavigationAction, Unit> {
    public final /* synthetic */ SplashViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashViewModelImpl$loginOrNavigateForward$1(SplashViewModelImpl splashViewModelImpl) {
        super(1);
        this.c = splashViewModelImpl;
    }

    public final void a(final SplashScreenNavigationAction splashScreenNavigationAction) {
        Intrinsics.checkParameterIsNotNull(splashScreenNavigationAction, "navigationAction");
        this.c.b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>() {
            /* renamed from: a */
            public final Intent invoke(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "$receiver");
                if (splashScreenNavigationAction.a()) {
                    activity.finish();
                }
                return splashScreenNavigationAction.a(activity);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((SplashScreenNavigationAction) obj);
        return Unit.INSTANCE;
    }
}
