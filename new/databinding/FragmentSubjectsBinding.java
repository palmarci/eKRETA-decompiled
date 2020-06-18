package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.SubjectsViewModel;

public abstract class FragmentSubjectsBinding extends ViewDataBinding {
    public SubjectsViewModel A;
    public final TabLayout z;

    public FragmentSubjectsBinding(Object obj, View view, int i2, ViewPager viewPager, TabLayout tabLayout) {
        super(obj, view, i2);
        this.z = tabLayout;
    }

    public static FragmentSubjectsBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentSubjectsBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_subjects, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(SubjectsViewModel subjectsViewModel);
}
