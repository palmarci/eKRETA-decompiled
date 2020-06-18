package hu.ekreta.ellenorzo.message;

import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/message/TabLayoutAdapterToRefreshByTabIndex;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "selectTabIndex", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getSelectTabIndex", "()Lkotlin/jvm/functions/Function1;", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TabLayoutAdapterToRefreshByTabIndex.kt */
public final class TabLayoutAdapterToRefreshByTabIndex implements TabLayout.e {

    /* renamed from: a  reason: collision with root package name */
    public final Function1<Integer, Unit> f5813a;

    public TabLayoutAdapterToRefreshByTabIndex(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "selectTabIndex");
        this.f5813a = function1;
        this.f5813a.invoke(0);
    }

    public void a(TabLayout.h hVar) {
    }

    public void b(TabLayout.h hVar) {
    }

    public void c(TabLayout.h hVar) {
        this.f5813a.invoke(hVar != null ? Integer.valueOf(hVar.f3587d) : null);
    }
}
