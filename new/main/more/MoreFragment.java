package hu.ekreta.ellenorzo.main.more;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainMenuItem;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.b.a0.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "moreMenuItems", "", "Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "calculateBadgeText", "", "count", "", "isTutelary", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onResume", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MoreFragment.kt */
public final class MoreFragment extends c {
    public MainViewModel a0;
    public b b0 = new b();
    public List<MoreMenuItem> c0 = new ArrayList();
    public HashMap d0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/main/more/MoreFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "setModel", "(Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: MoreFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<MoreMenuItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;"))};
        public final ReadWriteProperty w = new MoreFragment$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ MoreFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewHolder(hu.ekreta.ellenorzo.main.more.MoreFragment r3, android.view.ViewGroup r4) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                r2.x = r3
                android.view.LayoutInflater r3 = r3.t()
                r0 = 2131427475(0x7f0b0093, float:1.8476567E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                java.lang.String r4 = "layoutInflater.inflate(R…more_item, parent, false)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r2.<init>(r3)
                android.view.View r3 = r2.c
                hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder$1 r4 = new hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder$1
                r4.<init>(r2)
                r3.setOnClickListener(r4)
                kotlin.properties.Delegates r3 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder$$special$$inlined$observable$1 r3 = new hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder$$special$$inlined$observable$1
                r4 = 0
                r3.<init>(r4, r4, r2)
                r2.w = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.main.more.MoreFragment.ViewHolder.<init>(hu.ekreta.ellenorzo.main.more.MoreFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(MoreMenuItem moreMenuItem) {
            this.w.setValue(this, y[0], moreMenuItem);
        }

        public MoreMenuItem getModel() {
            return (MoreMenuItem) this.w.getValue(this, y[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final MainViewModel C0() {
        MainViewModel mainViewModel = this.a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return mainViewModel;
    }

    public void Y() {
        this.b0.b();
        super.Y();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_more, viewGroup, false);
    }

    public View e(int i2) {
        if (this.d0 == null) {
            this.d0 = new HashMap();
        }
        View view = (View) this.d0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.d0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String f(int i2) {
        return i2 > 0 ? String.valueOf(i2) : "";
    }

    public void j0() {
        this.H = true;
        MainViewModel mainViewModel = this.a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        String str = null;
        ExtensionsKt.a(k.b.f0.b.a(mainViewModel.n1(), MoreFragment$onResume$2.INSTANCE, (Function0) null, new MoreFragment$onResume$1(this), 2), this.b0);
        this.c0 = CollectionsKt__CollectionsKt.mutableListOf(new MoreMenuItem(MainMenuItem.MESSAGES, R.drawable.menu_messages_24dp, R.string.MenuItem_Messages_Title, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.NOTES, R.mipmap.menu_notes_24dp, R.string.MenuItem_Notes_Title, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.HOMEWORKS, R.mipmap.menu_homeworks_24dp, R.string.MenuItem_Homeworks_Title, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.ANNOUNCED_TESTS, R.mipmap.menu_announcedtest_24dp, R.string.MenuItem_Tests_Title, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.CLASS_MASTERS, R.mipmap.menu_classmaster_24dp, R.string.MenuItem_NotifyClassMaster_Title, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.NOTICE_BOARD, R.drawable.ic_noticeboard_40dp, R.string.MenuItem_Notice_Board, (String) null, 8, (DefaultConstructorMarker) null), new MoreMenuItem(MainMenuItem.ABOUT, R.drawable.menu_about_24dp, R.string.MenuItem_About_Title, (String) null, 8, (DefaultConstructorMarker) null));
        MainViewModel mainViewModel2 = this.a0;
        if (mainViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        String N0 = mainViewModel2.N0();
        Context n2 = n();
        if (n2 != null) {
            str = n2.getString(R.string.ActiveProfile_Role_Tutelary);
        }
        if (Intrinsics.areEqual((Object) N0, (Object) str)) {
            this.c0.add(1, new MoreMenuItem(MainMenuItem.POST_TMGI, R.mipmap.menu_sendtmgi_24dp, R.string.MenuItem_Tmgi_Post_Title, (String) null, 8, (DefaultConstructorMarker) null));
            this.c0.add(5, new MoreMenuItem(MainMenuItem.CASES, R.mipmap.menu_cases_24dp, R.string.MenuItem_Cases_Title, (String) null, 8, (DefaultConstructorMarker) null));
        }
        RecyclerView recyclerView = (RecyclerView) e(R.id.more_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "more_recyclerview");
        ExtensionsKt.a(recyclerView, this.c0, new MoreFragment$onResume$3(this));
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }
}
