package p289hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p211h.p258l.C3703g;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.subject.SubjectsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentSubjectsBinding */
public abstract class FragmentSubjectsBinding extends ViewDataBinding {

    /* renamed from: A */
    public SubjectsViewModel f12368A;

    /* renamed from: z */
    public final TabLayout f12369z;

    public FragmentSubjectsBinding(Object obj, View view, int i, ViewPager viewPager, TabLayout tabLayout) {
        super(obj, view, i);
        this.f12369z = tabLayout;
    }

    /* renamed from: a */
    public static FragmentSubjectsBinding m11801a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return (FragmentSubjectsBinding) ViewDataBinding.m6042a(layoutInflater, (int) C4014R.layout.fragment_subjects, viewGroup, z, (Object) C3703g.f10169b);
    }

    /* renamed from: a */
    public abstract void mo12410a(SubjectsViewModel subjectsViewModel);
}
