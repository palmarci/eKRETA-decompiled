package p289hu.ekreta.ellenorzo.message;

import com.google.android.material.tabs.TabLayout.C3053e;
import com.google.android.material.tabs.TabLayout.C3058h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/TabLayoutAdapterToRefreshByTabIndex;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "selectTabIndex", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getSelectTabIndex", "()Lkotlin/jvm/functions/Function1;", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.TabLayoutAdapterToRefreshByTabIndex */
/* compiled from: TabLayoutAdapterToRefreshByTabIndex.kt */
public final class TabLayoutAdapterToRefreshByTabIndex implements C3053e {

    /* renamed from: a */
    public final Function1<Integer, Unit> f13961a;

    public TabLayoutAdapterToRefreshByTabIndex(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "selectTabIndex");
        this.f13961a = function1;
        this.f13961a.invoke(Integer.valueOf(0));
    }

    /* renamed from: a */
    public void mo8047a(C3058h hVar) {
    }

    /* renamed from: b */
    public void mo8048b(C3058h hVar) {
    }

    /* renamed from: c */
    public void mo8049c(C3058h hVar) {
        this.f13961a.invoke(hVar != null ? Integer.valueOf(hVar.f7923d) : null);
    }
}
