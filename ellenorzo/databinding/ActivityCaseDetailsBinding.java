package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityCaseDetailsBinding */
public abstract class ActivityCaseDetailsBinding extends ViewDataBinding {

    /* renamed from: A */
    public final ProgressBar f11934A;

    /* renamed from: B */
    public CaseDetailsViewModel f11935B;

    /* renamed from: z */
    public final NestedScrollView f11936z;

    public ActivityCaseDetailsBinding(Object obj, View view, int i, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, ProgressBar progressBar, Toolbar toolbar) {
        super(obj, view, i);
        this.f11936z = nestedScrollView;
        this.f11934A = progressBar;
    }
}
