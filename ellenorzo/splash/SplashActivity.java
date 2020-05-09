package p289hu.ekreta.ellenorzo.splash;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3810h;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/splash/SplashActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/splash/SplashViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.splash.SplashActivity */
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends C4457a {

    /* renamed from: x */
    public SplashViewModel f14793x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C4014R.layout.activity_splash);
        SplashViewModel splashViewModel = this.f14793x;
        String str = "viewModel";
        if (splashViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14883a((C3737d) this, splashViewModel.getUiCommand());
        C3810h a = mo5280a();
        SplashViewModel splashViewModel2 = this.f14793x;
        if (splashViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        a.mo10806a(splashViewModel2);
    }
}
