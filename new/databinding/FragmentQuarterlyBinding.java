package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModel;

public abstract class FragmentQuarterlyBinding extends ViewDataBinding {
    public QuarterlyViewModel A;
    public final SwipeRefreshLayout z;

    public FragmentQuarterlyBinding(Object obj, View view, int i2, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.z = swipeRefreshLayout;
    }

    public static FragmentQuarterlyBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentQuarterlyBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_quarterly, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(QuarterlyViewModel quarterlyViewModel);
}
