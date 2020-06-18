package hu.ekreta.ellenorzo.splash;

import android.os.Bundle;
import h.m.d.d;
import h.p.h;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/splash/SplashActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/splash/SplashViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/splash/SplashViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends a {
    public SplashViewModel x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        SplashViewModel splashViewModel = this.x;
        if (splashViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((d) this, splashViewModel.getUiCommand());
        h a2 = a();
        SplashViewModel splashViewModel2 = this.x;
        if (splashViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(splashViewModel2);
    }
}
