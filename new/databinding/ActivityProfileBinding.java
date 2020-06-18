package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import hu.ekreta.ellenorzo.profile.list.ProfileListViewModel;

public abstract class ActivityProfileBinding extends ViewDataBinding {
    public final ImageButton A;
    public final TextView B;
    public final FrameLayout C;
    public final TextView D;
    public final TextView E;
    public ProfileListViewModel F;
    public final ImageButton z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityProfileBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView, NestedScrollView nestedScrollView, MaterialCardView materialCardView, Toolbar toolbar, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i2);
        this.z = imageButton;
        this.A = imageButton2;
        this.B = textView;
        this.C = frameLayout;
        this.D = textView2;
        this.E = textView5;
    }

    public abstract void a(ProfileListViewModel profileListViewModel);
}
