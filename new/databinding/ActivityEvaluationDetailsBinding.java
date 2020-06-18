package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModel;

public abstract class ActivityEvaluationDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final View L;
    public final TextView M;
    public final TextView N;
    public final View O;
    public final TextView P;
    public final TextView Q;
    public final View R;
    public final TextView S;
    public EvaluationDetailsViewModel T;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityEvaluationDetailsBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2, TextView textView6, TextView textView7, View view3, TextView textView8, NestedScrollView nestedScrollView, View view4, TextView textView9, View view5, TextView textView10, TextView textView11, View view6, TextView textView12, TextView textView13, View view7, TextView textView14, Toolbar toolbar, TextView textView15, View view8, TextView textView16, TextView textView17, View view9, TextView textView18) {
        super(obj, view, i2);
        this.z = textView;
        this.A = textView2;
        this.B = textView4;
        this.C = textView5;
        this.D = view2;
        this.E = textView6;
        this.F = textView7;
        this.G = view3;
        this.H = textView8;
        this.I = textView10;
        this.J = textView12;
        this.K = textView13;
        this.L = view7;
        this.M = textView14;
        this.N = textView15;
        this.O = view8;
        this.P = textView16;
        this.Q = textView17;
        this.R = view9;
        this.S = textView18;
    }

    public abstract void a(EvaluationDetailsViewModel evaluationDetailsViewModel);
}
