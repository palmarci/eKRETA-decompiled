package hu.ekreta.ellenorzo.timetable.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import h.l.g;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailActivity.kt */
public final class TimeTableItemDetailActivity extends a {
    public TimeTableItemDetailViewModel x;
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
        ViewDataBinding a2 = g.a(this, R.layout.activity_lesson_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…y_lesson_detail\n        )");
        ActivityLessonDetailBinding activityLessonDetailBinding = (ActivityLessonDetailBinding) a2;
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.x;
        if (timeTableItemDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityLessonDetailBinding.a(timeTableItemDetailViewModel);
        TimeTableItemDetailViewModel timeTableItemDetailViewModel2 = this.x;
        if (timeTableItemDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        timeTableItemDetailViewModel2.a(ExtensionsKt.s(intent));
        TimeTableItemDetailViewModel timeTableItemDetailViewModel3 = this.x;
        if (timeTableItemDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, timeTableItemDetailViewModel3.getUiCommand());
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
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
