package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;

public abstract class ActivityCaseDetailsTmgiBinding extends ViewDataBinding {
    public final ProgressBar A;
    public CaseDetailsViewModel B;
    public final NestedScrollView z;

    public ActivityCaseDetailsTmgiBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = nestedScrollView;
        this.A = progressBar;
    }
}
