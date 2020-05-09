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
import p289hu.ekreta.ellenorzo.home.HomeViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentHomeBinding */
public abstract class FragmentHomeBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12305A;

    /* renamed from: B */
    public final RecyclerView f12306B;

    /* renamed from: C */
    public HomeViewModel f12307C;

    /* renamed from: z */
    public final TextView f12308z;

    public FragmentHomeBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12308z = textView;
        this.f12305A = swipeRefreshLayout;
        this.f12306B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentHomeBinding m11728a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentHomeBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_home, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12393a(HomeViewModel homeViewModel);
}
