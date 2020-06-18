package hu.ekreta.ellenorzo.cases;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.leinardi.android.speeddial.SpeedDialView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentCasesBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CasesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/CasesViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CasesFragment.kt */
public final class CasesFragment extends c implements MainBackNavigationTarget {
    public CasesViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CasesFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/view/View$OnClickListener;", "layout", "", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/cases/CasesFragment;ILandroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/cases/BaseCase;", "setModel", "(Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "onClick", "", "v", "Landroid/view/View;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CasesFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<BaseCase> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/cases/BaseCase;"))};
        public final ReadWriteProperty w = new CasesFragment$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ CasesFragment x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CasesFragment casesFragment, int i2, ViewGroup viewGroup) {
            super(i2, viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.x = casesFragment;
            this.c.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(BaseCase baseCase) {
            this.w.setValue(this, y[0], baseCase);
        }

        public BaseCase getModel() {
            return (BaseCase) this.w.getValue(this, y[0]);
        }

        public void onClick(View view) {
            BaseCase model = getModel();
            if (model != null) {
                this.x.C0().onSelect(model);
            }
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final CasesViewModel C0() {
        CasesViewModel casesViewModel = this.a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return casesViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentCasesBinding a2 = FragmentCasesBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        CasesViewModel casesViewModel = this.a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(casesViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        CasesViewModel casesViewModel = this.a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, casesViewModel.getUiCommand());
    }

    public int e() {
        return 5;
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
        CasesViewModel casesViewModel = this.a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, casesViewModel.getItems(), new CasesFragment$onViewCreated$1(this));
        ((SpeedDialView) e(R.id.add_certificate_speedDialView)).b((int) R.menu.certificate_types);
        ((SpeedDialView) e(R.id.add_certificate_speedDialView)).setOnActionSelectedListener(new CasesFragment$onViewCreated$2(this));
    }
}
