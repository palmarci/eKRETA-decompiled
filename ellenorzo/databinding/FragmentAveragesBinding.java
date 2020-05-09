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
import p289hu.ekreta.ellenorzo.subject.averages.AveragesViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentAveragesBinding */
public abstract class FragmentAveragesBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12265A;

    /* renamed from: B */
    public final RecyclerView f12266B;

    /* renamed from: C */
    public AveragesViewModel f12267C;

    /* renamed from: z */
    public final TextView f12268z;

    public FragmentAveragesBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12268z = textView;
        this.f12265A = swipeRefreshLayout;
        this.f12266B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentAveragesBinding m11678a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentAveragesBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_averages, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12383a(AveragesViewModel averagesViewModel);
}
