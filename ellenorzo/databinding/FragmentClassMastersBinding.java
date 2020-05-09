package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.classmaster.ClassMastersViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentClassMastersBinding */
public abstract class FragmentClassMastersBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12282A;

    /* renamed from: B */
    public final RecyclerView f12283B;

    /* renamed from: C */
    public ClassMastersViewModel f12284C;

    /* renamed from: z */
    public final TextView f12285z;

    public FragmentClassMastersBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12285z = textView;
        this.f12282A = swipeRefreshLayout;
        this.f12283B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentClassMastersBinding m11698a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentClassMastersBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_class_masters, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12387a(ClassMastersViewModel classMastersViewModel);
}
