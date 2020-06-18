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
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayViewModel;

public abstract class FragmentOmissionPerDayBinding extends ViewDataBinding {
    public final SwipeRefreshLayout A;
    public final RecyclerView B;
    public OmissionsPerDayViewModel C;
    public final TextView z;

    public FragmentOmissionPerDayBinding(Object obj, View view, int i2, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.z = textView;
        this.A = swipeRefreshLayout;
        this.B = recyclerView;
    }

    public static FragmentOmissionPerDayBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentOmissionPerDayBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_omission_per_day, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(OmissionsPerDayViewModel omissionsPerDayViewModel);
}
