package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.leinardi.android.speeddial.SpeedDialView;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.CasesViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentCasesBinding */
public abstract class FragmentCasesBinding extends ViewDataBinding {

    /* renamed from: A */
    public final RecyclerView f12274A;

    /* renamed from: B */
    public CasesViewModel f12275B;

    /* renamed from: z */
    public final SwipeRefreshLayout f12276z;

    public FragmentCasesBinding(Object obj, View view, int i, SpeedDialView speedDialView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12276z = swipeRefreshLayout;
        this.f12274A = recyclerView;
    }

    /* renamed from: a */
    public static FragmentCasesBinding m11688a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentCasesBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_cases, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12385a(CasesViewModel casesViewModel);
}
