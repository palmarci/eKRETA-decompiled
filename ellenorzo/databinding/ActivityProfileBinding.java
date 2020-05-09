package p289hu.ekreta.ellenorzo.databinding;

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
import p289hu.ekreta.ellenorzo.profile.list.ProfileListViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityProfileBinding */
public abstract class ActivityProfileBinding extends ViewDataBinding {

    /* renamed from: A */
    public final ImageButton f12201A;

    /* renamed from: B */
    public final TextView f12202B;

    /* renamed from: C */
    public final FrameLayout f12203C;

    /* renamed from: D */
    public final TextView f12204D;

    /* renamed from: E */
    public final TextView f12205E;

    /* renamed from: F */
    public ProfileListViewModel f12206F;

    /* renamed from: z */
    public final ImageButton f12207z;

    public ActivityProfileBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView, NestedScrollView nestedScrollView, MaterialCardView materialCardView, Toolbar toolbar, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.f12207z = imageButton;
        this.f12201A = imageButton2;
        this.f12202B = textView;
        this.f12203C = frameLayout;
        this.f12204D = textView2;
        this.f12205E = textView5;
    }

    /* renamed from: a */
    public abstract void mo12372a(ProfileListViewModel profileListViewModel);
}
