package p289hu.ekreta.ellenorzo.timetable.detail;

import android.content.Intent;
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
import p289hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailActivity */
/* compiled from: TimeTableItemDetailActivity.kt */
public final class TimeTableItemDetailActivity extends C4457a {

    /* renamed from: x */
    public TimeTableItemDetailViewModel f15211x;

    /* renamed from: y */
    public HashMap f15212y;

    /* renamed from: c */
    public View mo16138c(int i) {
        if (this.f15212y == null) {
            this.f15212y = new HashMap();
        }
        View view = (View) this.f15212y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15212y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_lesson_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…y_lesson_detail\n        )");
        ActivityLessonDetailBinding activityLessonDetailBinding = (ActivityLessonDetailBinding) a;
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.f15211x;
        String str = "viewModel";
        if (timeTableItemDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityLessonDetailBinding.mo12355a(timeTableItemDetailViewModel);
        TimeTableItemDetailViewModel timeTableItemDetailViewModel2 = this.f15211x;
        if (timeTableItemDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        timeTableItemDetailViewModel2.mo16149a(ExtensionsKt.m14680q(intent));
        TimeTableItemDetailViewModel timeTableItemDetailViewModel3 = this.f15211x;
        if (timeTableItemDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, timeTableItemDetailViewModel3.getUiCommand());
        mo8719a((Toolbar) mo16138c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
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
}
