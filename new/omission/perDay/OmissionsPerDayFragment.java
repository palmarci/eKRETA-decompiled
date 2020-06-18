package hu.ekreta.ellenorzo.omission.perDay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentOmissionPerDayBinding;
import hu.ekreta.ellenorzo.omission.OmissionPerDay;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "OmissionsViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionsPerDayFragment.kt */
public final class OmissionsPerDayFragment extends c {
    public OmissionsPerDayViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayFragment$OmissionsViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayFragment;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "setModel", "(Lhu/ekreta/ellenorzo/omission/OmissionPerDay;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OmissionsPerDayFragment.kt */
    public final class OmissionsViewHolder extends MVVMViewHolder<OmissionPerDay> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(OmissionsViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/omission/OmissionPerDay;"))};
        public final ReadWriteProperty w = new OmissionsPerDayFragment$OmissionsViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final View x;
        public final /* synthetic */ OmissionsPerDayFragment y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OmissionsViewHolder(OmissionsPerDayFragment omissionsPerDayFragment, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.y = omissionsPerDayFragment;
            this.x = view;
            this.x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(OmissionPerDay omissionPerDay) {
            this.w.setValue(this, z[0], omissionPerDay);
        }

        public OmissionPerDay getModel() {
            return (OmissionPerDay) this.w.getValue(this, z[0]);
        }

        public void onClick(View view) {
            OmissionPerDay model = getModel();
            if (model != null) {
                this.y.C0().onSelect(model);
            }
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final OmissionsPerDayViewModel C0() {
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return omissionsPerDayViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentOmissionPerDayBinding a2 = FragmentOmissionPerDayBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(omissionsPerDayViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, omissionsPerDayViewModel.getUiCommand());
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
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, omissionsPerDayViewModel.getItems(), new OmissionsPerDayFragment$onViewCreated$1(this));
    }
}
