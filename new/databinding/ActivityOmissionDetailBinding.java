package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModel;

public abstract class ActivityOmissionDetailBinding extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public OmissionDetailViewModel J;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOmissionDetailBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view2, TextView textView4, TextView textView5, View view3, TextView textView6, TextView textView7, View view4, TextView textView8, TextView textView9, View view5, TextView textView10, NestedScrollView nestedScrollView, TextView textView11, View view6, TextView textView12, TextView textView13, View view7, TextView textView14, Toolbar toolbar, TextView textView15, View view8, TextView textView16) {
        super(obj, view, i2);
        this.z = textView2;
        this.A = textView3;
        this.B = view2;
        this.C = textView4;
        this.D = textView6;
        this.E = textView8;
        this.F = textView10;
        this.G = textView12;
        this.H = textView14;
        this.I = textView16;
    }

    public abstract void a(OmissionDetailViewModel omissionDetailViewModel);
}
