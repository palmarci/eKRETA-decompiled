package p289hu.ekreta.ellenorzo.databinding;

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
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBinding */
public abstract class ActivityHomeworkDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final RecyclerView f12048A;

    /* renamed from: B */
    public final TextView f12049B;

    /* renamed from: C */
    public final TextView f12050C;

    /* renamed from: D */
    public final View f12051D;

    /* renamed from: E */
    public final TextView f12052E;

    /* renamed from: F */
    public final WebView f12053F;

    /* renamed from: G */
    public final SwipeRefreshLayout f12054G;

    /* renamed from: H */
    public final TextView f12055H;

    /* renamed from: I */
    public final TextView f12056I;

    /* renamed from: J */
    public HomeworkDetailViewModel f12057J;

    /* renamed from: z */
    public final MaterialButton f12058z;

    public ActivityHomeworkDetailBinding(Object obj, View view, int i, AppBarLayout appBarLayout, MaterialButton materialButton, RecyclerView recyclerView, TextView textView, View view2, TextView textView2, TextView textView3, View view3, TextView textView4, TextView textView5, WebView webView, NestedScrollView nestedScrollView, SwipeRefreshLayout swipeRefreshLayout, TextView textView6, View view4, TextView textView7, TextView textView8, View view5, TextView textView9, Toolbar toolbar) {
        super(obj, view, i);
        this.f12058z = materialButton;
        this.f12048A = recyclerView;
        this.f12049B = textView2;
        this.f12050C = textView3;
        this.f12051D = view3;
        this.f12052E = textView4;
        this.f12053F = webView;
        this.f12054G = swipeRefreshLayout;
        this.f12055H = textView7;
        this.f12056I = textView9;
    }

    /* renamed from: a */
    public abstract void mo12350a(HomeworkDetailViewModel homeworkDetailViewModel);
}
