package p289hu.ekreta.ellenorzo.configSettings;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppActivity */
/* compiled from: NotSupportedAppActivity.kt */
public final class NotSupportedAppActivity extends C4457a {

    /* renamed from: x */
    public NotSupportedAppViewModel f11906x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_not_supported_app);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…t_supported_app\n        )");
        ActivityNotSupportedAppBindingImpl activityNotSupportedAppBindingImpl = (ActivityNotSupportedAppBindingImpl) a;
        NotSupportedAppViewModel notSupportedAppViewModel = this.f11906x;
        String str = "viewModel";
        if (notSupportedAppViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityNotSupportedAppBindingImpl.mo12365a(notSupportedAppViewModel);
        NotSupportedAppViewModel notSupportedAppViewModel2 = this.f11906x;
        if (notSupportedAppViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14883a((C3737d) this, notSupportedAppViewModel2.getUiCommand());
    }
}
