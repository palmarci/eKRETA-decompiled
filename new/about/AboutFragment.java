package hu.ekreta.ellenorzo.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentAboutBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import hu.ekreta.ellenorzo.main.MainMenuItem;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/about/AboutFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "aboutMenuItems", "", "Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "getAboutMenuItems", "()Ljava/util/List;", "setAboutMenuItems", "(Ljava/util/List;)V", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "getBackNavigationTarget", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AboutFragment.kt */
public final class AboutFragment extends c implements MainBackNavigationTarget {
    public MainViewModel a0;
    public List<AboutMenuItem> b0 = new ArrayList();
    public HashMap c0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/about/AboutFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/about/AboutFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "setModel", "(Lhu/ekreta/ellenorzo/about/AboutMenuItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AboutFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<AboutMenuItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/about/AboutMenuItem;"))};
        public final ReadWriteProperty w = new AboutFragment$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ AboutFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewHolder(hu.ekreta.ellenorzo.about.AboutFragment r3, android.view.ViewGroup r4) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                r2.x = r3
                android.view.LayoutInflater r3 = r3.t()
                r0 = 2131427356(0x7f0b001c, float:1.8476326E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                java.lang.String r4 = "layoutInflater.inflate(R…bout_item, parent, false)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r2.<init>(r3)
                android.view.View r3 = r2.c
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                int r4 = hu.ekreta.ellenorzo.R.id.about_item_constraintlayout
                android.view.View r3 = r3.findViewById(r4)
                androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
                hu.ekreta.ellenorzo.about.AboutFragment$ViewHolder$1 r4 = new hu.ekreta.ellenorzo.about.AboutFragment$ViewHolder$1
                r4.<init>(r2)
                r3.setOnClickListener(r4)
                kotlin.properties.Delegates r3 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.about.AboutFragment$ViewHolder$$special$$inlined$observable$1 r3 = new hu.ekreta.ellenorzo.about.AboutFragment$ViewHolder$$special$$inlined$observable$1
                r4 = 0
                r3.<init>(r4, r4, r2)
                r2.w = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.about.AboutFragment.ViewHolder.<init>(hu.ekreta.ellenorzo.about.AboutFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(AboutMenuItem aboutMenuItem) {
            this.w.setValue(this, y[0], aboutMenuItem);
        }

        public AboutMenuItem getModel() {
            return (AboutMenuItem) this.w.getValue(this, y[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.c0;
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

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentAboutBinding a2 = FragmentAboutBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        MainViewModel mainViewModel = this.a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(mainViewModel);
        return a2.Y1();
    }

    public int e() {
        return 5;
    }

    public View e(int i2) {
        if (this.c0 == null) {
            this.c0 = new HashMap();
        }
        View view = (View) this.c0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.c0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void j0() {
        this.H = true;
        this.b0 = CollectionsKt__CollectionsKt.mutableListOf(new AboutMenuItem(MainMenuItem.FAQ, R.drawable.menu_faq_24dp, R.string.FAQ), new AboutMenuItem(MainMenuItem.PRIVACY_POLICY, R.drawable.menu_about_24dp, R.string.Privacy_policy));
        RecyclerView recyclerView = (RecyclerView) e(R.id.about_items_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "about_items_recyclerview");
        ExtensionsKt.a(recyclerView, this.b0, new AboutFragment$onResume$1(this));
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }
}
