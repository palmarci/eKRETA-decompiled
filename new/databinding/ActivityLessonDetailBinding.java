package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel;

public abstract class ActivityLessonDetailBinding extends ViewDataBinding {
    public final MaterialButton A;
    public final TextView B;
    public final MaterialButton C;
    public final ProgressBar D;
    public final TextView E;
    public final TextView F;
    public final Toolbar G;
    public TimeTableItemDetailViewModel H;
    public final MaterialButton z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityLessonDetailBinding(Object obj, View view, int i2, MaterialButton materialButton, MaterialButton materialButton2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, MaterialButton materialButton3, NestedScrollView nestedScrollView, ProgressBar progressBar, TextView textView3, View view2, TextView textView4, TextView textView5, View view3, TextView textView6, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = materialButton;
        this.A = materialButton2;
        this.B = textView2;
        this.C = materialButton3;
        this.D = progressBar;
        this.E = textView4;
        this.F = textView6;
        this.G = toolbar;
    }

    public abstract void a(TimeTableItemDetailViewModel timeTableItemDetailViewModel);
}
