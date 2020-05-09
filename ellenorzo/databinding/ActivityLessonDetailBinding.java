package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p289hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBinding */
public abstract class ActivityLessonDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f12073A;

    /* renamed from: B */
    public final TextView f12074B;

    /* renamed from: C */
    public final MaterialButton f12075C;

    /* renamed from: D */
    public final ProgressBar f12076D;

    /* renamed from: E */
    public final TextView f12077E;

    /* renamed from: F */
    public final TextView f12078F;

    /* renamed from: G */
    public final Toolbar f12079G;

    /* renamed from: H */
    public TimeTableItemDetailViewModel f12080H;

    /* renamed from: z */
    public final MaterialButton f12081z;

    public ActivityLessonDetailBinding(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, MaterialButton materialButton3, NestedScrollView nestedScrollView, ProgressBar progressBar, TextView textView3, View view2, TextView textView4, TextView textView5, View view3, TextView textView6, Toolbar toolbar) {
        super(obj, view, i);
        this.f12081z = materialButton;
        this.f12073A = materialButton2;
        this.f12074B = textView2;
        this.f12075C = materialButton3;
        this.f12076D = progressBar;
        this.f12077E = textView4;
        this.f12078F = textView6;
        this.f12079G = toolbar;
    }

    /* renamed from: a */
    public abstract void mo12355a(TimeTableItemDetailViewModel timeTableItemDetailViewModel);
}
