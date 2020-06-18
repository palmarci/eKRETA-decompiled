package hu.ekreta.ellenorzo.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentHomeBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/home/HomeViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/home/HomeViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/home/HomeViewModel;)V", "getBackNavigationTarget", "", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "DashboardItemViewHolder", "SectionHeaderViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeFragment.kt */
public final class HomeFragment extends c implements MainBackNavigationTarget {
    public HomeViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment$DashboardItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/home/ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/home/HomeFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/home/ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/home/ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeFragment.kt */
    public final class DashboardItemViewHolder extends MVVMViewHolder<ListItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DashboardItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/home/ListItem;"))};
        public final ReadWriteProperty w = new HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ HomeFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DashboardItemViewHolder(hu.ekreta.ellenorzo.home.HomeFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r1.x = r2
                r0 = 2131427395(0x7f0b0043, float:1.8476405E38)
                android.view.View r2 = r2.t().inflate(r0, r3, false)
                java.lang.String r3 = "inflate(parent, R.layout.dashboard_item)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                android.view.View r2 = r1.c
                java.lang.String r3 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r0 = hu.ekreta.ellenorzo.R.id.itemLayout
                android.view.View r2 = r2.findViewById(r0)
                androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
                hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$1 r0 = new hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$1
                r0.<init>(r1)
                r2.setOnClickListener(r0)
                android.view.View r2 = r1.c
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                int r3 = hu.ekreta.ellenorzo.R.id.readStateIcon
                android.view.View r2 = r2.findViewById(r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$2 r3 = new hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$2
                r3.<init>(r1)
                r2.setOnClickListener(r3)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.home.HomeFragment.DashboardItemViewHolder.<init>(hu.ekreta.ellenorzo.home.HomeFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.w.setValue(this, y[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.w.getValue(this, y[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/home/ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/home/HomeFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/home/ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/home/ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ListItem> {
        public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/home/ListItem;"))};
        public final ReadWriteProperty w = new HomeFragment$SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SectionHeaderViewHolder(hu.ekreta.ellenorzo.home.HomeFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r0 = 2131427396(0x7f0b0044, float:1.8476407E38)
                android.view.View r2 = r2.t().inflate(r0, r3, false)
                java.lang.String r3 = "inflate(parent, R.layout.dashboard_section_header)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.home.HomeFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.home.HomeFragment$SectionHeaderViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.home.HomeFragment.SectionHeaderViewHolder.<init>(hu.ekreta.ellenorzo.home.HomeFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.w.setValue(this, x[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.w.getValue(this, x[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final HomeViewModel C0() {
        HomeViewModel homeViewModel = this.a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return homeViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentHomeBinding a2 = FragmentHomeBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        HomeViewModel homeViewModel = this.a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(homeViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        HomeViewModel homeViewModel = this.a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, homeViewModel.getUiCommand());
    }

    public int e() {
        return -1;
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
        HomeFragment$onViewCreated$adapter$1 homeFragment$onViewCreated$adapter$1 = new HomeFragment$onViewCreated$adapter$1(this, new HomeFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        HomeViewModel homeViewModel = this.a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, homeViewModel.getItems(), homeFragment$onViewCreated$adapter$1);
    }
}
