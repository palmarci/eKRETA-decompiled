package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

public abstract class FragmentEndOfYearBinding extends ViewDataBinding {
    public final SwipeRefreshLayout A;
    public DataBindingListViewModel B;
    public final TextView z;

    public FragmentEndOfYearBinding(Object obj, View view, int i2, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.z = textView;
        this.A = swipeRefreshLayout;
    }

    public static FragmentEndOfYearBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentEndOfYearBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_end_of_year, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(DataBindingListViewModel dataBindingListViewModel);
}
