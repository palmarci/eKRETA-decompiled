package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.notes.NoteDetailsViewModel;

public abstract class ActivityNoteDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public NoteDetailsViewModel I;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityNoteDetailsBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, View view2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view3, TextView textView8, NestedScrollView nestedScrollView, View view4, TextView textView9, View view5, TextView textView10, TextView textView11, View view6, TextView textView12, Toolbar toolbar, TextView textView13, View view7, TextView textView14) {
        super(obj, view, i2);
        this.z = textView2;
        this.A = textView4;
        this.B = textView6;
        this.C = textView7;
        this.D = view3;
        this.E = textView8;
        this.F = textView10;
        this.G = textView12;
        this.H = textView14;
    }

    public abstract void a(NoteDetailsViewModel noteDetailsViewModel);
}
