package hu.ekreta.ellenorzo.subject.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDetailActivity.kt */
public final class SubjectDetailActivity extends a {
    public SubjectDetailViewModel x;
    public HashMap y;

    public View c(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_subject_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…_subject_detail\n        )");
        ActivitySubjectDetailBinding activitySubjectDetailBinding = (ActivitySubjectDetailBinding) a2;
        SubjectDetailViewModel subjectDetailViewModel = this.x;
        if (subjectDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activitySubjectDetailBinding.a(subjectDetailViewModel);
        try {
            SubjectDetailViewModel subjectDetailViewModel2 = this.x;
            if (subjectDetailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            SubjectParameters r = ExtensionsKt.r(intent);
            if (r == null) {
                Intrinsics.throwNpe();
            }
            subjectDetailViewModel2.a(r);
            a((Toolbar) c(R.id.toolbar));
            h.b.k.a l2 = l();
            if (l2 != null) {
                l2.c(true);
                l2.d(true);
            }
            SubjectDetailViewModel subjectDetailViewModel3 = this.x;
            if (subjectDetailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, subjectDetailViewModel3.getUiCommand());
            SubjectDetailActivity$onCreate$adapter$1 subjectDetailActivity$onCreate$adapter$1 = new SubjectDetailActivity$onCreate$adapter$1(this, new SubjectDetailActivity$onCreate$adapter$2(this));
            RecyclerView recyclerView = (RecyclerView) c(R.id.evaluationRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "evaluationRecyclerView");
            SubjectDetailViewModel subjectDetailViewModel4 = this.x;
            if (subjectDetailViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            ExtensionsKt.a(recyclerView, (m) this, subjectDetailViewModel4.getEvaluations(), subjectDetailActivity$onCreate$adapter$1);
        } catch (NullPointerException unused) {
            throw new RuntimeException("SubjectDetailActivity cannot display without SubjectDetailObject");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final SubjectDetailViewModel q() {
        SubjectDetailViewModel subjectDetailViewModel = this.x;
        if (subjectDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return subjectDetailViewModel;
    }
}
