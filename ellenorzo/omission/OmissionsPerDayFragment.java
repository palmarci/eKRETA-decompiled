package p289hu.ekreta.ellenorzo.omission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
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
import p289hu.ekreta.ellenorzo.databinding.FragmentOmissionPerDayBinding;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionsPerDayFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/omission/OmissionsPerDayViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/omission/OmissionsPerDayViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/omission/OmissionsPerDayViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "OmissionsViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayFragment */
/* compiled from: OmissionsPerDayFragment.kt */
public final class OmissionsPerDayFragment extends C4459c {

    /* renamed from: a0 */
    public OmissionsPerDayViewModel f14433a0;

    /* renamed from: b0 */
    public HashMap f14434b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionsPerDayFragment$OmissionsViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/omission/OmissionsPerDayFragment;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/omission/OmissionPerDay;", "setModel", "(Lhu/ekreta/ellenorzo/omission/OmissionPerDay;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.OmissionsPerDayFragment$OmissionsViewHolder */
    /* compiled from: OmissionsPerDayFragment.kt */
    public final class OmissionsViewHolder extends MVVMViewHolder<OmissionPerDay> implements OnClickListener {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f14435z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(OmissionsViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/omission/OmissionPerDay;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14436w = new C4307x9c50d73a(null, null, this);

        /* renamed from: x */
        public final View f14437x;

        /* renamed from: y */
        public final /* synthetic */ OmissionsPerDayFragment f14438y;

        public OmissionsViewHolder(OmissionsPerDayFragment omissionsPerDayFragment, View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f14438y = omissionsPerDayFragment;
            super(view);
            this.f14437x = view;
            this.f14437x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(OmissionPerDay omissionPerDay) {
            this.f14436w.setValue(this, f14435z[0], omissionPerDay);
        }

        public OmissionPerDay getModel() {
            return (OmissionPerDay) this.f14436w.getValue(this, f14435z[0]);
        }

        public void onClick(View view) {
            OmissionPerDay model = getModel();
            if (model != null) {
                this.f14438y.mo13992C0().onSelect(model);
            }
        }
    }

    /* renamed from: B0 */
    public void mo13991B0() {
        HashMap hashMap = this.f14434b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final OmissionsPerDayViewModel mo13992C0() {
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.f14433a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return omissionsPerDayViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentOmissionPerDayBinding a = FragmentOmissionPerDayBinding.m11771a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.f14433a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12404a(omissionsPerDayViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.f14433a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, omissionsPerDayViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo13993e(int i) {
        if (this.f14434b0 == null) {
            this.f14434b0 = new HashMap();
        }
        View view = (View) this.f14434b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14434b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo13991B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo13993e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        OmissionsPerDayViewModel omissionsPerDayViewModel = this.f14433a0;
        if (omissionsPerDayViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14654a(recyclerView, (C3818m) this, omissionsPerDayViewModel.getItems(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new OmissionsPerDayFragment$onViewCreated$1<Object,Object,Object>(this));
    }
}
