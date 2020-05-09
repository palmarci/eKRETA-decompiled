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

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentEndOfYearBinding */
public abstract class FragmentEndOfYearBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12291A;

    /* renamed from: B */
    public DataBindingListViewModel f12292B;

    /* renamed from: z */
    public final TextView f12293z;

    public FragmentEndOfYearBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12293z = textView;
        this.f12291A = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static FragmentEndOfYearBinding m11708a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentEndOfYearBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_end_of_year, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12389a(DataBindingListViewModel dataBindingListViewModel);
}
