package p289hu.ekreta.ellenorzo.timetable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C3053e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3770p;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.adapter.TabLayoutAdapter;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableRootFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableRootFragment */
/* compiled from: TimeTableRootFragment.kt */
public final class TimeTableRootFragment extends Fragment {

    /* renamed from: Z */
    public HashMap f15193Z;

    /* renamed from: B0 */
    public void mo16127B0() {
        HashMap hashMap = this.f15193Z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(C4014R.layout.fragment_lessons, viewGroup, false);
    }

    /* renamed from: e */
    public View mo16128e(int i) {
        if (this.f15193Z == null) {
            this.f15193Z = new HashMap();
        }
        View view = (View) this.f15193Z.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f15193Z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo16127B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        TabLayout tabLayout = (TabLayout) mo16128e(C4014R.C4016id.lessons_tab_layout);
        C3770p m = mo6207m();
        Intrinsics.checkExpressionValueIsNotNull(m, "childFragmentManager");
        tabLayout.mo7987a((C3053e) new TabLayoutAdapter(m, C4014R.C4016id.lessons_fragment_container, TimeTableRootFragment$onViewCreated$1.INSTANCE));
    }
}
