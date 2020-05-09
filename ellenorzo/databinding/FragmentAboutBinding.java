package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentAboutBinding */
public abstract class FragmentAboutBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12259A;

    /* renamed from: B */
    public MainViewModel f12260B;

    /* renamed from: z */
    public final ConstraintLayout f12261z;

    public FragmentAboutBinding(Object obj, View view, int i, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.f12261z = constraintLayout;
        this.f12259A = textView;
    }

    /* renamed from: a */
    public static FragmentAboutBinding m11669a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentAboutBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_about, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12381a(MainViewModel mainViewModel);
}
