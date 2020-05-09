package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.message.MessagesViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentMessagesBinding */
public abstract class FragmentMessagesBinding extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f12314A;

    /* renamed from: B */
    public final TextView f12315B;

    /* renamed from: C */
    public final ProgressBar f12316C;

    /* renamed from: D */
    public final SwipeRefreshLayout f12317D;

    /* renamed from: E */
    public final RecyclerView f12318E;

    /* renamed from: F */
    public MessagesViewModel f12319F;

    /* renamed from: z */
    public final TextView f12320z;

    public FragmentMessagesBinding(Object obj, View view, int i, TabItem tabItem, TextView textView, TabItem tabItem2, TabLayout tabLayout, ConstraintLayout constraintLayout, TextView textView2, ProgressBar progressBar, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, TabItem tabItem3) {
        super(obj, view, i);
        this.f12320z = textView;
        this.f12314A = constraintLayout;
        this.f12315B = textView2;
        this.f12316C = progressBar;
        this.f12317D = swipeRefreshLayout;
        this.f12318E = recyclerView;
    }

    /* renamed from: a */
    public static FragmentMessagesBinding m11738a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentMessagesBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_messages, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12395a(MessagesViewModel messagesViewModel);
}
