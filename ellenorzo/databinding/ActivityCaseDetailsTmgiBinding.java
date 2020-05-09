package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsTmgiBinding */
public abstract class ActivityCaseDetailsTmgiBinding extends ViewDataBinding {

    /* renamed from: A */
    public final ProgressBar f11954A;

    /* renamed from: B */
    public CaseDetailsViewModel f11955B;

    /* renamed from: z */
    public final NestedScrollView f11956z;

    public ActivityCaseDetailsTmgiBinding(Object obj, View view, int i, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, Toolbar toolbar) {
        super(obj, view, i);
        this.f11956z = nestedScrollView;
        this.f11954A = progressBar;
    }
}
