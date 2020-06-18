package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModel;

public abstract class ActivityDecisionDetailBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final Button B;
    public DecisionDetailViewModel C;
    public final NestedScrollView z;

    public ActivityDecisionDetailBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, FrameLayout frameLayout, Button button, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = nestedScrollView;
        this.A = frameLayout;
        this.B = button;
    }

    public abstract void a(DecisionDetailViewModel decisionDetailViewModel);
}
