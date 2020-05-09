package p289hu.ekreta.ellenorzo.subject.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailActivity */
/* compiled from: SubjectDetailActivity.kt */
public final class SubjectDetailActivity extends C4457a {

    /* renamed from: x */
    public SubjectDetailViewModel f15005x;

    /* renamed from: y */
    public HashMap f15006y;

    /* renamed from: c */
    public View mo15873c(int i) {
        if (this.f15006y == null) {
            this.f15006y = new HashMap();
        }
        View view = (View) this.f15006y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15006y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_subject_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…_subject_detail\n        )");
        ActivitySubjectDetailBinding activitySubjectDetailBinding = (ActivitySubjectDetailBinding) a;
        SubjectDetailViewModel subjectDetailViewModel = this.f15005x;
        String str = "viewModel";
        if (subjectDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activitySubjectDetailBinding.mo12379a(subjectDetailViewModel);
        try {
            SubjectDetailViewModel subjectDetailViewModel2 = this.f15005x;
            if (subjectDetailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            SubjectParameters p = ExtensionsKt.m14679p(intent);
            if (p == null) {
                Intrinsics.throwNpe();
            }
            subjectDetailViewModel2.mo15887a(p);
            mo8719a((Toolbar) mo15873c(C4014R.C4016id.toolbar));
            C3191a l = mo8735l();
            if (l != null) {
                l.mo8688c(true);
                l.mo8690d(true);
            }
            SubjectDetailViewModel subjectDetailViewModel3 = this.f15005x;
            if (subjectDetailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, subjectDetailViewModel3.getUiCommand());
            SubjectDetailActivity$onCreate$adapter$1 subjectDetailActivity$onCreate$adapter$1 = new SubjectDetailActivity$onCreate$adapter$1(this, new SubjectDetailActivity$onCreate$adapter$2(this));
            RecyclerView recyclerView = (RecyclerView) mo15873c(C4014R.C4016id.evaluationRecyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "evaluationRecyclerView");
            SubjectDetailViewModel subjectDetailViewModel4 = this.f15005x;
            if (subjectDetailViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            ExtensionsKt.m14653a(recyclerView, (C3818m) this, subjectDetailViewModel4.getEvaluations(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) subjectDetailActivity$onCreate$adapter$1);
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

    /* renamed from: q */
    public final SubjectDetailViewModel mo15875q() {
        SubjectDetailViewModel subjectDetailViewModel = this.f15005x;
        if (subjectDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return subjectDetailViewModel;
    }
}
