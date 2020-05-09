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
import p289hu.ekreta.ellenorzo.notes.NotesViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentNotesBinding */
public abstract class FragmentNotesBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12326A;

    /* renamed from: B */
    public final RecyclerView f12327B;

    /* renamed from: C */
    public NotesViewModel f12328C;

    /* renamed from: z */
    public final TextView f12329z;

    public FragmentNotesBinding(Object obj, View view, int i, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f12329z = textView;
        this.f12326A = swipeRefreshLayout;
        this.f12327B = recyclerView;
    }

    /* renamed from: a */
    public static FragmentNotesBinding m11751a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentNotesBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_notes, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12400a(NotesViewModel notesViewModel);
}
