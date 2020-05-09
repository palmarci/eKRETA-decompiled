package p289hu.ekreta.ellenorzo.util.adapter;

import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout.C3053e;
import com.google.android.material.tabs.TabLayout.C3058h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3770p;
import p211h.p262m.p263d.C3791x;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/adapter/TabLayoutAdapter;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentContainerId", "", "getFragment", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V", "getFragmentContainerId", "()I", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getGetFragment", "()Lkotlin/jvm/functions/Function1;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "showTab", "position", "(Ljava/lang/Integer;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.adapter.TabLayoutAdapter */
/* compiled from: TabLayoutAdapter.kt */
public final class TabLayoutAdapter implements C3053e {

    /* renamed from: a */
    public final C3770p f15384a;

    /* renamed from: b */
    public final int f15385b;

    /* renamed from: c */
    public final Function1<Integer, Fragment> f15386c;

    public TabLayoutAdapter(C3770p pVar, int i, Function1<? super Integer, ? extends Fragment> function1) {
        Intrinsics.checkParameterIsNotNull(pVar, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(function1, "getFragment");
        this.f15384a = pVar;
        this.f15385b = i;
        this.f15386c = function1;
        mo16302a(Integer.valueOf(0));
    }

    /* renamed from: a */
    public void mo8047a(C3058h hVar) {
    }

    /* renamed from: a */
    public final void mo16302a(Integer num) {
        C3791x a = this.f15384a.mo10673a();
        int i = this.f15385b;
        Fragment fragment = (Fragment) this.f15386c.invoke(num);
        if (i != 0) {
            a.mo10551a(i, fragment, null, 2);
            a.mo10547a();
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public void mo8048b(C3058h hVar) {
    }

    /* renamed from: c */
    public void mo8049c(C3058h hVar) {
        mo16302a(hVar != null ? Integer.valueOf(hVar.f7923d) : null);
    }
}
