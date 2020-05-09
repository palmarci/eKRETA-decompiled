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
import p289hu.ekreta.ellenorzo.omission.OmissionsPerDayViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentOmissionPerDayBinding */
public abstract class FragmentOmissionPerDayBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12344A;

    /* renamed from: B */
    public final RecyclerView f12345B;

    /* renamed from: C */
    public OmissionsPerDayViewModel f12346C;

    /* renamed from: z */
    public final TextView f12347z;

    public FragmentOmissionPerDayBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12347z = textView;
        this.f12344A = swipeRefreshLayout;
        this.f12345B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentOmissionPerDayBinding m11771a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentOmissionPerDayBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_omission_per_day, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12404a(OmissionsPerDayViewModel omissionsPerDayViewModel);
}
