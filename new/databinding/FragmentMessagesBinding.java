package hu.ekreta.ellenorzo.databinding;

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
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.message.MessagesViewModel;

public abstract class FragmentMessagesBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ProgressBar C;
    public final SwipeRefreshLayout D;
    public final RecyclerView E;
    public MessagesViewModel F;
    public final TextView z;

    public FragmentMessagesBinding(Object obj, View view, int i2, TabItem tabItem, TextView textView, TabItem tabItem2, TabLayout tabLayout, ConstraintLayout constraintLayout, TextView textView2, ProgressBar progressBar, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, TabItem tabItem3) {
        super(obj, view, i2);
        this.z = textView;
        this.A = constraintLayout;
        this.B = textView2;
        this.C = progressBar;
        this.D = swipeRefreshLayout;
        this.E = recyclerView;
    }

    public static FragmentMessagesBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentMessagesBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_messages, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(MessagesViewModel messagesViewModel);
}
