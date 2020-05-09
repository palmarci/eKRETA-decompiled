package p289hu.ekreta.ellenorzo.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentHomeBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/home/HomeViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/home/HomeViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/home/HomeViewModel;)V", "getBackNavigationTarget", "", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "DashboardItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeFragment */
/* compiled from: HomeFragment.kt */
public final class HomeFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public HomeViewModel f13329a0;

    /* renamed from: b0 */
    public HashMap f13330b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment$DashboardItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/home/ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/home/HomeFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/home/ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/home/ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder */
    /* compiled from: HomeFragment.kt */
    public final class DashboardItemViewHolder extends MVVMViewHolder<ListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f13331y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DashboardItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/home/ListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13332w = new C4194x94db4d3f(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ HomeFragment f13333x;

        public DashboardItemViewHolder(HomeFragment homeFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f13333x = homeFragment;
            View access$inflate = homeFragment.mo6225t().inflate(C4014R.layout.dashboard_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.dashboard_item)");
            super(access$inflate);
            View view = this.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ((ConstraintLayout) view.findViewById(C4014R.C4016id.itemLayout)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ DashboardItemViewHolder f13334c;

                {
                    this.f13334c = r1;
                }

                public final void onClick(View view) {
                    ListItem model = this.f13334c.getModel();
                    if (model != null) {
                        this.f13334c.f13333x.mo12818C0().onSelect(model);
                    }
                }
            });
            View view2 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            ((ImageView) view2.findViewById(C4014R.C4016id.readStateIcon)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ DashboardItemViewHolder f13335c;

                {
                    this.f13335c = r1;
                }

                public final void onClick(View view) {
                    HomeViewModel C0 = this.f13335c.f13333x.mo12818C0();
                    ListItem model = this.f13335c.getModel();
                    if (model == null) {
                        Intrinsics.throwNpe();
                    }
                    C0.mo12832a(model);
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.f13332w.setValue(this, f13331y[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.f13332w.getValue(this, f13331y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/home/HomeFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/home/ListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/home/HomeFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/home/ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/home/ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.home.HomeFragment$SectionHeaderViewHolder */
    /* compiled from: HomeFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f13336x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/home/ListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13337w = new C4195x11fef794(null, null, this);

        public SectionHeaderViewHolder(HomeFragment homeFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View access$inflate = homeFragment.mo6225t().inflate(C4014R.layout.dashboard_section_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.dashboard_section_header)");
            super(access$inflate);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ListItem listItem) {
            this.f13337w.setValue(this, f13336x[0], listItem);
        }

        public ListItem getModel() {
            return (ListItem) this.f13337w.getValue(this, f13336x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo12817B0() {
        HashMap hashMap = this.f13330b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final HomeViewModel mo12818C0() {
        HomeViewModel homeViewModel = this.f13329a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return homeViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentHomeBinding a = FragmentHomeBinding.m11728a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        HomeViewModel homeViewModel = this.f13329a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12393a(homeViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        HomeViewModel homeViewModel = this.f13329a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, homeViewModel.getUiCommand());
    }

    /* renamed from: e */
    public int mo11297e() {
        return -1;
    }

    /* renamed from: e */
    public View mo12819e(int i) {
        if (this.f13330b0 == null) {
            this.f13330b0 = new HashMap();
        }
        View view = (View) this.f13330b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f13330b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo12817B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        HomeFragment$onViewCreated$adapter$1 homeFragment$onViewCreated$adapter$1 = new HomeFragment$onViewCreated$adapter$1(this, new HomeFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo12819e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        HomeViewModel homeViewModel = this.f13329a0;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, homeViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) homeFragment$onViewCreated$adapter$1);
    }
}
