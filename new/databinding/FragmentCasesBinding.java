package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.leinardi.android.speeddial.SpeedDialView;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.CasesViewModel;

public abstract class FragmentCasesBinding extends ViewDataBinding {
    public final RecyclerView A;
    public CasesViewModel B;
    public final SwipeRefreshLayout z;

    public FragmentCasesBinding(Object obj, View view, int i2, SpeedDialView speedDialView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i2);
        this.z = swipeRefreshLayout;
        this.A = recyclerView;
    }

    public static FragmentCasesBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentCasesBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_cases, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(CasesViewModel casesViewModel);
}
