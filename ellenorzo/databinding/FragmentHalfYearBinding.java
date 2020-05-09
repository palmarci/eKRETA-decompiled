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
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentHalfYearBinding */
public abstract class FragmentHalfYearBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12298A;

    /* renamed from: B */
    public DataBindingListViewModel f12299B;

    /* renamed from: z */
    public final TextView f12300z;

    public FragmentHalfYearBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12300z = textView;
        this.f12298A = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static FragmentHalfYearBinding m11718a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentHalfYearBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_half_year, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12391a(DataBindingListViewModel dataBindingListViewModel);
}
