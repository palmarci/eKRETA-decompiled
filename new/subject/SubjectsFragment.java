package hu.ekreta.ellenorzo.subject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import h.m.d.p;
import h.p.s;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentSubjectsBinding;
import hu.ekreta.ellenorzo.subject.SubjectsViewModel;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragment;
import hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment;
import hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragment;
import hu.ekreta.ellenorzo.util.adapter.ConfigurableFragmentPagerAdapter;
import i.c.h.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "PagerAdapter", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectsFragment.kt */
public final class SubjectsFragment extends c {
    public SubjectsViewModel a0;
    public HashMap b0;

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentSubjectsBinding a2 = FragmentSubjectsBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        SubjectsViewModel subjectsViewModel = this.a0;
        if (subjectsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(subjectsViewModel);
        return a2.Y1();
    }

    public View e(int i2) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.b0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }

    public void a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        p m2 = m();
        Intrinsics.checkExpressionValueIsNotNull(m2, "childFragmentManager");
        PagerAdapter pagerAdapter = new PagerAdapter(this, m2);
        ViewPager viewPager = (ViewPager) e(R.id.pager);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(10);
        ((TabLayout) e(R.id.tab_layout)).setupWithViewPager(viewPager);
        SubjectsViewModel subjectsViewModel = this.a0;
        if (subjectsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        subjectsViewModel.getItems().a(this, pagerAdapter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsFragment$PagerAdapter;", "Lhu/ekreta/ellenorzo/util/adapter/ConfigurableFragmentPagerAdapter;", "Landroidx/lifecycle/Observer;", "", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lhu/ekreta/ellenorzo/subject/SubjectsFragment;Landroidx/fragment/app/FragmentManager;)V", "addPage", "", "titleResId", "", "fragment", "Landroidx/fragment/app/Fragment;", "onChanged", "tabs", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectsFragment.kt */
    public final class PagerAdapter extends ConfigurableFragmentPagerAdapter implements s<List<? extends SubjectsViewModel.Tab>> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ SubjectsFragment f6145i;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f6146a = new int[SubjectsViewModel.Tab.values().length];

            static {
                f6146a[SubjectsViewModel.Tab.Averages.ordinal()] = 1;
                f6146a[SubjectsViewModel.Tab.Quarterly.ordinal()] = 2;
                f6146a[SubjectsViewModel.Tab.HalfYear.ordinal()] = 3;
                f6146a[SubjectsViewModel.Tab.EndOfYear.ordinal()] = 4;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PagerAdapter(SubjectsFragment subjectsFragment, p pVar) {
            super(pVar);
            Intrinsics.checkParameterIsNotNull(pVar, "fragmentManager");
            this.f6145i = subjectsFragment;
        }

        /* renamed from: a */
        public void onChanged(List<? extends SubjectsViewModel.Tab> list) {
            h();
            if (list != null) {
                for (SubjectsViewModel.Tab ordinal : list) {
                    int i2 = WhenMappings.f6146a[ordinal.ordinal()];
                    if (i2 == 1) {
                        a(R.string.EvaluationsAverage_TabPage_Title, new AveragesFragment());
                    } else if (i2 == 2) {
                        a(R.string.EvaluationsQuarterYear_TabPage_Title, new QuarterlyFragment());
                    } else if (i2 == 3) {
                        a(R.string.EvaluationsHalfYear_TabPage_Title, new HalfYearFragment());
                    } else if (i2 == 4) {
                        a(R.string.EvaluationsEndYear_TabPage_Title, new EndOfYearFragment());
                    }
                }
            }
            d();
        }

        public final void a(int i2, Fragment fragment) {
            String a2 = this.f6145i.a(i2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "getString(titleResId)");
            a(a2, fragment);
        }
    }
}
