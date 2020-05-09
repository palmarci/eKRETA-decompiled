package p289hu.ekreta.ellenorzo.classmaster;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityClassMasterBinding;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterActivity */
/* compiled from: ClassMasterActivity.kt */
public final class ClassMasterActivity extends C4457a {

    /* renamed from: x */
    public ClassMasterViewModel f11798x;

    /* renamed from: y */
    public HashMap f11799y;

    /* renamed from: c */
    public View mo12229c(int i) {
        if (this.f11799y == null) {
            this.f11799y = new HashMap();
        }
        View view = (View) this.f11799y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11799y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_class_master);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…ty_class_master\n        )");
        ActivityClassMasterBinding activityClassMasterBinding = (ActivityClassMasterBinding) a;
        ClassMasterViewModel classMasterViewModel = this.f11798x;
        String str = "viewModel";
        if (classMasterViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityClassMasterBinding.mo12339a(classMasterViewModel);
        mo8719a((Toolbar) mo12229c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
        ClassMasterViewModel classMasterViewModel2 = this.f11798x;
        if (classMasterViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14883a((C3737d) this, classMasterViewModel2.getUiCommand());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
