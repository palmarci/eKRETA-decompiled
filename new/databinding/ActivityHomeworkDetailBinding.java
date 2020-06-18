package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel;

public abstract class ActivityHomeworkDetailBinding extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final SwitchMaterial G;
    public final WebView H;
    public final SwipeRefreshLayout I;
    public final TextView J;
    public final TextView K;
    public HomeworkDetailViewModel L;
    public final MaterialButton z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityHomeworkDetailBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, MaterialButton materialButton, RecyclerView recyclerView, TextView textView, View view2, TextView textView2, TextView textView3, View view3, TextView textView4, TextView textView5, TextView textView6, SwitchMaterial switchMaterial, WebView webView, NestedScrollView nestedScrollView, SwipeRefreshLayout swipeRefreshLayout, TextView textView7, View view4, TextView textView8, TextView textView9, View view5, TextView textView10, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = materialButton;
        this.A = recyclerView;
        this.B = textView2;
        this.C = textView3;
        this.D = view3;
        this.E = textView4;
        this.F = textView6;
        this.G = switchMaterial;
        this.H = webView;
        this.I = swipeRefreshLayout;
        this.J = textView8;
        this.K = textView10;
    }

    public abstract void a(HomeworkDetailViewModel homeworkDetailViewModel);
}
