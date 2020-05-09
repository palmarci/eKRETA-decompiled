package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityDecisionDetailBinding */
public abstract class ActivityDecisionDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final FrameLayout f11992A;

    /* renamed from: B */
    public final Button f11993B;

    /* renamed from: C */
    public DecisionDetailViewModel f11994C;

    /* renamed from: z */
    public final NestedScrollView f11995z;

    public ActivityDecisionDetailBinding(Object obj, View view, int i, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, FrameLayout frameLayout, Button button, Toolbar toolbar) {
        super(obj, view, i);
        this.f11995z = nestedScrollView;
        this.f11992A = frameLayout;
        this.f11993B = button;
    }

    /* renamed from: a */
    public abstract void mo12343a(DecisionDetailViewModel decisionDetailViewModel);
}
