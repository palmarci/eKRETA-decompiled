package p289hu.ekreta.ellenorzo.cases;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.leinardi.android.speeddial.SpeedDialView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentCasesBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CasesFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/cases/CasesViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/cases/CasesViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CasesFragment */
/* compiled from: CasesFragment.kt */
public final class CasesFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public CasesViewModel f11330a0;

    /* renamed from: b0 */
    public HashMap f11331b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CasesFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/view/View$OnClickListener;", "layout", "", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/cases/CasesFragment;ILandroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/cases/BaseCase;", "setModel", "(Lhu/ekreta/ellenorzo/cases/BaseCase;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "onClick", "", "v", "Landroid/view/View;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.CasesFragment$ViewHolder */
    /* compiled from: CasesFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<BaseCase> implements OnClickListener {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f11332y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/cases/BaseCase;"))};

        /* renamed from: w */
        public final ReadWriteProperty f11333w = new CasesFragment$ViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ CasesFragment f11334x;

        public ViewHolder(CasesFragment casesFragment, int i, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f11334x = casesFragment;
            super(i, viewGroup);
            this.f7113c.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(BaseCase baseCase) {
            this.f11333w.setValue(this, f11332y[0], baseCase);
        }

        public BaseCase getModel() {
            return (BaseCase) this.f11333w.getValue(this, f11332y[0]);
        }

        public void onClick(View view) {
            BaseCase model = getModel();
            if (model != null) {
                this.f11334x.mo11680C0().onSelect(model);
            }
        }
    }

    /* renamed from: B0 */
    public void mo11679B0() {
        HashMap hashMap = this.f11331b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final CasesViewModel mo11680C0() {
        CasesViewModel casesViewModel = this.f11330a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return casesViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentCasesBinding a = FragmentCasesBinding.m11688a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        CasesViewModel casesViewModel = this.f11330a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12385a(casesViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        CasesViewModel casesViewModel = this.f11330a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, casesViewModel.getUiCommand());
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo11681e(int i) {
        if (this.f11331b0 == null) {
            this.f11331b0 = new HashMap();
        }
        View view = (View) this.f11331b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f11331b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo11679B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo11681e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        CasesViewModel casesViewModel = this.f11330a0;
        if (casesViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14654a(recyclerView, (C3818m) this, casesViewModel.getItems(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new CasesFragment$onViewCreated$1<Object,Object,Object>(this));
        ((SpeedDialView) mo11681e(C4014R.C4016id.add_certificate_speedDialView)).mo8390b((int) C4014R.C4017menu.certificate_types);
        ((SpeedDialView) mo11681e(C4014R.C4016id.add_certificate_speedDialView)).setOnActionSelectedListener(new CasesFragment$onViewCreated$2(this));
    }
}
