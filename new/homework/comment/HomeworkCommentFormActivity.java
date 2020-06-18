package hu.ekreta.ellenorzo.homework.comment;

import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import h.l.g;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkCommentFormActivity.kt */
public final class HomeworkCommentFormActivity extends a {
    public HomeworkCommentFormViewModel x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_homework_comment);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…omework_comment\n        )");
        ActivityHomeworkCommentBinding activityHomeworkCommentBinding = (ActivityHomeworkCommentBinding) a2;
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.x;
        if (homeworkCommentFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityHomeworkCommentBinding.a(homeworkCommentFormViewModel);
        HomeworkCommentFormViewModel homeworkCommentFormViewModel2 = this.x;
        if (homeworkCommentFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        homeworkCommentFormViewModel2.a(ExtensionsKt.f(intent));
        HomeworkCommentFormViewModel homeworkCommentFormViewModel3 = this.x;
        if (homeworkCommentFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
        Intrinsics.checkParameterIsNotNull(intent2, "$this$timeTableItemUid");
        homeworkCommentFormViewModel3.h((String) ExtensionsKt.e.getValue(intent2, ExtensionsKt.f6270a[3]));
        HomeworkCommentFormViewModel homeworkCommentFormViewModel4 = this.x;
        if (homeworkCommentFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, homeworkCommentFormViewModel4.getUiCommand());
    }
}
