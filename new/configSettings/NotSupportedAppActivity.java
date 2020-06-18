package hu.ekreta.ellenorzo.configSettings;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import h.l.g;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotSupportedAppActivity.kt */
public final class NotSupportedAppActivity extends a {
    public NotSupportedAppViewModel x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_not_supported_app);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…t_supported_app\n        )");
        ActivityNotSupportedAppBindingImpl activityNotSupportedAppBindingImpl = (ActivityNotSupportedAppBindingImpl) a2;
        NotSupportedAppViewModel notSupportedAppViewModel = this.x;
        if (notSupportedAppViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityNotSupportedAppBindingImpl.a(notSupportedAppViewModel);
        NotSupportedAppViewModel notSupportedAppViewModel2 = this.x;
        if (notSupportedAppViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((d) this, notSupportedAppViewModel2.getUiCommand());
    }
}
