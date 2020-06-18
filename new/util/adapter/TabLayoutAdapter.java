package hu.ekreta.ellenorzo.util.adapter;

import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import h.m.d.p;
import h.m.d.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/util/adapter/TabLayoutAdapter;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentContainerId", "", "getFragment", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function1;)V", "getFragmentContainerId", "()I", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getGetFragment", "()Lkotlin/jvm/functions/Function1;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "showTab", "position", "(Ljava/lang/Integer;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TabLayoutAdapter.kt */
public final class TabLayoutAdapter implements TabLayout.e {

    /* renamed from: a  reason: collision with root package name */
    public final p f6305a;
    public final int b;
    public final Function1<Integer, Fragment> c;

    public TabLayoutAdapter(p pVar, int i2, Function1<? super Integer, ? extends Fragment> function1) {
        Intrinsics.checkParameterIsNotNull(pVar, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(function1, "getFragment");
        this.f6305a = pVar;
        this.b = i2;
        this.c = function1;
        a((Integer) 0);
    }

    public void a(TabLayout.h hVar) {
    }

    public final void a(Integer num) {
        x a2 = this.f6305a.a();
        int i2 = this.b;
        Fragment invoke = this.c.invoke(num);
        if (i2 != 0) {
            a2.a(i2, invoke, (String) null, 2);
            a2.a();
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void b(TabLayout.h hVar) {
    }

    public void c(TabLayout.h hVar) {
        a(hVar != null ? Integer.valueOf(hVar.f3587d) : null);
    }
}
