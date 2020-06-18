package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel;

public abstract class ActivityProfileDetailBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public ProfileDetailViewModel G;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityProfileDetailBinding(Object obj, View view, int i2, TextView textView, View view2, TextView textView2, AppBarLayout appBarLayout, TextView textView3, View view3, TextView textView4, TextView textView5, TextView textView6, View view4, TextView textView7, TextView textView8, View view5, TextView textView9, NestedScrollView nestedScrollView, TextView textView10, View view6, TextView textView11, RecyclerView recyclerView, TextView textView12, View view7, TextView textView13, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = textView2;
        this.A = textView4;
        this.B = textView5;
        this.C = textView7;
        this.D = textView9;
        this.E = textView11;
        this.F = textView13;
    }

    public abstract void a(ProfileDetailViewModel profileDetailViewModel);
}
