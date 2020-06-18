package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainViewModel;

public abstract class FragmentAboutBinding extends ViewDataBinding {
    public final TextView A;
    public MainViewModel B;
    public final ConstraintLayout z;

    public FragmentAboutBinding(Object obj, View view, int i2, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i2);
        this.z = constraintLayout;
        this.A = textView;
    }

    public static FragmentAboutBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentAboutBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_about, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(MainViewModel mainViewModel);
}
