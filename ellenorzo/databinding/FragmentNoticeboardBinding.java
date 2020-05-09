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
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentNoticeboardBinding */
public abstract class FragmentNoticeboardBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12335A;

    /* renamed from: B */
    public final RecyclerView f12336B;

    /* renamed from: C */
    public NoticeBoardViewModel f12337C;

    /* renamed from: z */
    public final TextView f12338z;

    public FragmentNoticeboardBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12338z = textView;
        this.f12335A = swipeRefreshLayout;
        this.f12336B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentNoticeboardBinding m11761a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentNoticeboardBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_noticeboard, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12402a(NoticeBoardViewModel noticeBoardViewModel);
}
