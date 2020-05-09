package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.notes.NoteDetailsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNoteDetailsBinding */
public abstract class ActivityNoteDetailsBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12165A;

    /* renamed from: B */
    public final TextView f12166B;

    /* renamed from: C */
    public final TextView f12167C;

    /* renamed from: D */
    public final View f12168D;

    /* renamed from: E */
    public final TextView f12169E;

    /* renamed from: F */
    public final TextView f12170F;

    /* renamed from: G */
    public final TextView f12171G;

    /* renamed from: H */
    public final TextView f12172H;

    /* renamed from: I */
    public NoteDetailsViewModel f12173I;

    /* renamed from: z */
    public final TextView f12174z;

    public ActivityNoteDetailsBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, View view2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view3, TextView textView8, NestedScrollView nestedScrollView, View view4, TextView textView9, View view5, TextView textView10, TextView textView11, View view6, TextView textView12, Toolbar toolbar, TextView textView13, View view7, TextView textView14) {
        super(obj, view, i);
        this.f12174z = textView2;
        this.f12165A = textView4;
        this.f12166B = textView6;
        this.f12167C = textView7;
        this.f12168D = view3;
        this.f12169E = textView8;
        this.f12170F = textView10;
        this.f12171G = textView12;
        this.f12172H = textView14;
    }

    /* renamed from: a */
    public abstract void mo12366a(NoteDetailsViewModel noteDetailsViewModel);
}
