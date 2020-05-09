package p289hu.ekreta.ellenorzo.subject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3770p;
import p211h.p271p.C3825s;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentSubjectsBinding;
import p289hu.ekreta.ellenorzo.subject.SubjectsViewModel.Tab;
import p289hu.ekreta.ellenorzo.subject.averages.AveragesFragment;
import p289hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment;
import p289hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment;
import p289hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyFragment;
import p289hu.ekreta.ellenorzo.util.adapter.ConfigurableFragmentPagerAdapter;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "PagerAdapter", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsFragment */
/* compiled from: SubjectsFragment.kt */
public final class SubjectsFragment extends C4459c {

    /* renamed from: a0 */
    public SubjectsViewModel f14849a0;

    /* renamed from: b0 */
    public HashMap f14850b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsFragment$PagerAdapter;", "Lhu/ekreta/ellenorzo/util/adapter/ConfigurableFragmentPagerAdapter;", "Landroidx/lifecycle/Observer;", "", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lhu/ekreta/ellenorzo/subject/SubjectsFragment;Landroidx/fragment/app/FragmentManager;)V", "addPage", "", "titleResId", "", "fragment", "Landroidx/fragment/app/Fragment;", "onChanged", "tabs", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.SubjectsFragment$PagerAdapter */
    /* compiled from: SubjectsFragment.kt */
    public final class PagerAdapter extends ConfigurableFragmentPagerAdapter implements C3825s<List<? extends Tab>> {

        /* renamed from: i */
        public final /* synthetic */ SubjectsFragment f14851i;

        @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.subject.SubjectsFragment$PagerAdapter$WhenMappings */
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a */
            public static final /* synthetic */ int[] f14852a = new int[Tab.values().length];

            static {
                f14852a[Tab.Averages.ordinal()] = 1;
                f14852a[Tab.Quarterly.ordinal()] = 2;
                f14852a[Tab.HalfYear.ordinal()] = 3;
                f14852a[Tab.EndOfYear.ordinal()] = 4;
            }
        }

        public PagerAdapter(SubjectsFragment subjectsFragment, C3770p pVar) {
            Intrinsics.checkParameterIsNotNull(pVar, "fragmentManager");
            this.f14851i = subjectsFragment;
            super(pVar);
        }

        /* renamed from: a */
        public void onChanged(List<? extends Tab> list) {
            mo16298h();
            if (list != null) {
                for (Tab ordinal : list) {
                    int i = WhenMappings.f14852a[ordinal.ordinal()];
                    if (i == 1) {
                        mo15737a(C4014R.string.EvaluationsAverage_TabPage_Title, new AveragesFragment());
                    } else if (i == 2) {
                        mo15737a(C4014R.string.EvaluationsQuarterYear_TabPage_Title, new QuarterlyFragment());
                    } else if (i == 3) {
                        mo15737a(C4014R.string.EvaluationsHalfYear_TabPage_Title, new HalfYearFragment());
                    } else if (i == 4) {
                        mo15737a(C4014R.string.EvaluationsEndYear_TabPage_Title, new EndOfYearFragment());
                    }
                }
            }
            mo11292d();
        }

        /* renamed from: a */
        public final void mo15737a(int i, Fragment fragment) {
            String a = this.f14851i.mo6148a(i);
            Intrinsics.checkExpressionValueIsNotNull(a, "getString(titleResId)");
            mo16297a(a, fragment);
        }
    }

    /* renamed from: B0 */
    public void mo15735B0() {
        HashMap hashMap = this.f14850b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentSubjectsBinding a = FragmentSubjectsBinding.m11801a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        SubjectsViewModel subjectsViewModel = this.f14849a0;
        if (subjectsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12410a(subjectsViewModel);
        return a.mo6093P1();
    }

    /* renamed from: e */
    public View mo15736e(int i) {
        if (this.f14850b0 == null) {
            this.f14850b0 = new HashMap();
        }
        View view = (View) this.f14850b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14850b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo15735B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        C3770p m = mo6207m();
        Intrinsics.checkExpressionValueIsNotNull(m, "childFragmentManager");
        PagerAdapter pagerAdapter = new PagerAdapter(this, m);
        ViewPager viewPager = (ViewPager) mo15736e(C4014R.C4016id.pager);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(10);
        ((TabLayout) mo15736e(C4014R.C4016id.tab_layout)).setupWithViewPager(viewPager);
        SubjectsViewModel subjectsViewModel = this.f14849a0;
        if (subjectsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        subjectsViewModel.getItems().mo6265a(this, pagerAdapter);
    }
}
