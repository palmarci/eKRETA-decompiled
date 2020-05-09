package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentQuarterlyBinding */
public abstract class FragmentQuarterlyBinding extends ViewDataBinding {

    /* renamed from: A */
    public QuarterlyViewModel f12353A;

    /* renamed from: z */
    public final SwipeRefreshLayout f12354z;

    public FragmentQuarterlyBinding(Object obj, View view, int i, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12354z = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static FragmentQuarterlyBinding m11781a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentQuarterlyBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_quarterly, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12406a(QuarterlyViewModel quarterlyViewModel);
}
