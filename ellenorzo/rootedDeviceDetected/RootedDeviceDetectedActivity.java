package p289hu.ekreta.ellenorzo.rootedDeviceDetected;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityRootedDeviceDetectedBindingImpl;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rootedDeviceDetected/RootedDeviceDetectedActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/RootedDeviceDetectedViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/rootedDeviceDetected/RootedDeviceDetectedViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/rootedDeviceDetected/RootedDeviceDetectedViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedActivity */
/* compiled from: RootedDeviceDetectedActivity.kt */
public final class RootedDeviceDetectedActivity extends C4457a {

    /* renamed from: x */
    public RootedDeviceDetectedViewModel f14703x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_rooted_device_detected);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…device_detected\n        )");
        ActivityRootedDeviceDetectedBindingImpl activityRootedDeviceDetectedBindingImpl = (ActivityRootedDeviceDetectedBindingImpl) a;
        RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel = this.f14703x;
        String str = "viewModel";
        if (rootedDeviceDetectedViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityRootedDeviceDetectedBindingImpl.mo12376a(rootedDeviceDetectedViewModel);
        RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel2 = this.f14703x;
        if (rootedDeviceDetectedViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14883a((C3737d) this, rootedDeviceDetectedViewModel2.getUiCommand());
    }
}
