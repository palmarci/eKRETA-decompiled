package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBinding */
public abstract class ActivityProfileDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12214A;

    /* renamed from: B */
    public final TextView f12215B;

    /* renamed from: C */
    public final TextView f12216C;

    /* renamed from: D */
    public final TextView f12217D;

    /* renamed from: E */
    public final TextView f12218E;

    /* renamed from: F */
    public final TextView f12219F;

    /* renamed from: G */
    public ProfileDetailViewModel f12220G;

    /* renamed from: z */
    public final TextView f12221z;

    public ActivityProfileDetailBinding(Object obj, View view, int i, TextView textView, View view2, TextView textView2, AppBarLayout appBarLayout, TextView textView3, View view3, TextView textView4, TextView textView5, TextView textView6, View view4, TextView textView7, TextView textView8, View view5, TextView textView9, NestedScrollView nestedScrollView, TextView textView10, View view6, TextView textView11, RecyclerView recyclerView, TextView textView12, View view7, TextView textView13, Toolbar toolbar) {
        super(obj, view, i);
        this.f12221z = textView2;
        this.f12214A = textView4;
        this.f12215B = textView5;
        this.f12216C = textView7;
        this.f12217D = textView9;
        this.f12218E = textView11;
        this.f12219F = textView13;
    }

    /* renamed from: a */
    public abstract void mo12374a(ProfileDetailViewModel profileDetailViewModel);
}
