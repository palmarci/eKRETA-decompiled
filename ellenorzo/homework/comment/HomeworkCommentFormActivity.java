package p289hu.ekreta.ellenorzo.homework.comment;

import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityHomeworkCommentBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity */
/* compiled from: HomeworkCommentFormActivity.kt */
public final class HomeworkCommentFormActivity extends C4457a {

    /* renamed from: x */
    public HomeworkCommentFormViewModel f13546x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_homework_comment);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…omework_comment\n        )");
        ActivityHomeworkCommentBinding activityHomeworkCommentBinding = (ActivityHomeworkCommentBinding) a;
        HomeworkCommentFormViewModel homeworkCommentFormViewModel = this.f13546x;
        String str = "viewModel";
        if (homeworkCommentFormViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityHomeworkCommentBinding.mo12348a(homeworkCommentFormViewModel);
        HomeworkCommentFormViewModel homeworkCommentFormViewModel2 = this.f13546x;
        if (homeworkCommentFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        String str2 = "intent";
        Intrinsics.checkExpressionValueIsNotNull(intent, str2);
        homeworkCommentFormViewModel2.mo13048a(ExtensionsKt.m14668e(intent));
        HomeworkCommentFormViewModel homeworkCommentFormViewModel3 = this.f13546x;
        if (homeworkCommentFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, str2);
        Intrinsics.checkParameterIsNotNull(intent2, "$this$timeTableItemUid");
        homeworkCommentFormViewModel3.mo13049h((String) ExtensionsKt.f15281e.getValue(intent2, ExtensionsKt.f15277a[3]));
        HomeworkCommentFormViewModel homeworkCommentFormViewModel4 = this.f13546x;
        if (homeworkCommentFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, homeworkCommentFormViewModel4.getUiCommand());
    }
}
