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
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentRemindersBinding */
public abstract class FragmentRemindersBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12359A;

    /* renamed from: B */
    public final RecyclerView f12360B;

    /* renamed from: C */
    public RemindersViewModel f12361C;

    /* renamed from: z */
    public final TextView f12362z;

    public FragmentRemindersBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12362z = textView;
        this.f12359A = swipeRefreshLayout;
        this.f12360B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentRemindersBinding m11791a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentRemindersBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_reminders, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12408a(RemindersViewModel remindersViewModel);
}
