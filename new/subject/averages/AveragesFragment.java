package hu.ekreta.ellenorzo.subject.averages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentAveragesBinding;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\n\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00110\u00100\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/subject/averages/AveragesFragment$createAdapter$1", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$createAdapter$1;", "createViewHolderFactory", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "AverageItemViewHolder", "SectionHeaderViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AveragesFragment.kt */
public final class AveragesFragment extends c {
    public AveragesViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$AverageItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AveragesFragment.kt */
    public final class AverageItemViewHolder extends MVVMViewHolder<AveragesListItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AverageItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;"))};
        public final ReadWriteProperty w = new AveragesFragment$AverageItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ AveragesFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AverageItemViewHolder(hu.ekreta.ellenorzo.subject.averages.AveragesFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r1.x = r2
                r0 = 2131427387(0x7f0b003b, float:1.8476389E38)
                android.view.View r2 = hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((androidx.fragment.app.Fragment) r2, (android.view.ViewGroup) r3, (int) r0)
                java.lang.String r3 = "inflate(parent, R.layout.average_item)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                android.view.View r2 = r1.c
                java.lang.String r3 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.view.View r2 = r2.getRootView()
                hu.ekreta.ellenorzo.subject.averages.AveragesFragment$AverageItemViewHolder$1 r3 = new hu.ekreta.ellenorzo.subject.averages.AveragesFragment$AverageItemViewHolder$1
                r3.<init>(r1)
                r2.setOnClickListener(r3)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.subject.averages.AveragesFragment$AverageItemViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.subject.averages.AveragesFragment$AverageItemViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.averages.AveragesFragment.AverageItemViewHolder.<init>(hu.ekreta.ellenorzo.subject.averages.AveragesFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(AveragesListItem averagesListItem) {
            this.w.setValue(this, y[0], averagesListItem);
        }

        public AveragesListItem getModel() {
            return (AveragesListItem) this.w.getValue(this, y[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AveragesFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<AveragesListItem> {
        public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;"))};
        public final ReadWriteProperty w = new AveragesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SectionHeaderViewHolder(hu.ekreta.ellenorzo.subject.averages.AveragesFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r0 = 2131427526(0x7f0b00c6, float:1.847667E38)
                android.view.View r2 = hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((androidx.fragment.app.Fragment) r2, (android.view.ViewGroup) r3, (int) r0)
                java.lang.String r3 = "inflate(parent, R.layout.section_header)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.subject.averages.AveragesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.subject.averages.AveragesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.averages.AveragesFragment.SectionHeaderViewHolder.<init>(hu.ekreta.ellenorzo.subject.averages.AveragesFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(AveragesListItem averagesListItem) {
            this.w.setValue(this, x[0], averagesListItem);
        }

        public AveragesListItem getModel() {
            return (AveragesListItem) this.w.getValue(this, x[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final AveragesViewModel C0() {
        AveragesViewModel averagesViewModel = this.a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return averagesViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentAveragesBinding a2 = FragmentAveragesBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        AveragesViewModel averagesViewModel = this.a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(averagesViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        AveragesViewModel averagesViewModel = this.a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, averagesViewModel.getUiCommand());
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
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        AveragesViewModel averagesViewModel = this.a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, averagesViewModel.getItems(), new AveragesFragment$createAdapter$1(this, new AveragesFragment$createViewHolderFactory$1(this)));
    }
}
