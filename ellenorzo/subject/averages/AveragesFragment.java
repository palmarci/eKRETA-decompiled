package p289hu.ekreta.ellenorzo.subject.averages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
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
import p289hu.ekreta.ellenorzo.databinding.FragmentAveragesBinding;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\n\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00110\u00100\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/subject/averages/AveragesFragment$createAdapter$1", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$createAdapter$1;", "createViewHolderFactory", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "AverageItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesFragment */
/* compiled from: AveragesFragment.kt */
public final class AveragesFragment extends C4459c {

    /* renamed from: a0 */
    public AveragesViewModel f14898a0;

    /* renamed from: b0 */
    public HashMap f14899b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$AverageItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesFragment$AverageItemViewHolder */
    /* compiled from: AveragesFragment.kt */
    public final class AverageItemViewHolder extends MVVMViewHolder<AveragesListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f14900y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AverageItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14901w = new C4358xa32343df(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ AveragesFragment f14902x;

        public AverageItemViewHolder(AveragesFragment averagesFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f14902x = averagesFragment;
            View a = ExtensionsKt.m14878a(averagesFragment, viewGroup, C4014R.layout.average_item);
            Intrinsics.checkExpressionValueIsNotNull(a, "inflate(parent, R.layout.average_item)");
            super(a);
            View view = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getRootView().setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ AverageItemViewHolder f14903c;

                {
                    this.f14903c = r1;
                }

                public final void onClick(View view) {
                    AveragesListItem model = this.f14903c.getModel();
                    if (model != null) {
                        this.f14903c.f14902x.mo15771C0().onSelect(model);
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(AveragesListItem averagesListItem) {
            this.f14901w.setValue(this, f14900y[0], averagesListItem);
        }

        public AveragesListItem getModel() {
            return (AveragesListItem) this.f14901w.getValue(this, f14900y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesFragment$SectionHeaderViewHolder */
    /* compiled from: AveragesFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<AveragesListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f14904x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14905w = new C4359x75674f9d(null, null, this);

        public SectionHeaderViewHolder(AveragesFragment averagesFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View a = ExtensionsKt.m14878a(averagesFragment, viewGroup, C4014R.layout.section_header);
            Intrinsics.checkExpressionValueIsNotNull(a, "inflate(parent, R.layout.section_header)");
            super(a);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(AveragesListItem averagesListItem) {
            this.f14905w.setValue(this, f14904x[0], averagesListItem);
        }

        public AveragesListItem getModel() {
            return (AveragesListItem) this.f14905w.getValue(this, f14904x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo15770B0() {
        HashMap hashMap = this.f14899b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final AveragesViewModel mo15771C0() {
        AveragesViewModel averagesViewModel = this.f14898a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return averagesViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentAveragesBinding a = FragmentAveragesBinding.m11678a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        AveragesViewModel averagesViewModel = this.f14898a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12383a(averagesViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        AveragesViewModel averagesViewModel = this.f14898a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, averagesViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo15772e(int i) {
        if (this.f14899b0 == null) {
            this.f14899b0 = new HashMap();
        }
        View view = (View) this.f14899b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14899b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo15770B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo15772e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        AveragesViewModel averagesViewModel = this.f14898a0;
        if (averagesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, averagesViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) new AveragesFragment$createAdapter$1<ItemViewModel,ViewHolder>(this, new AveragesFragment$createViewHolderFactory$1(this)));
    }
}
