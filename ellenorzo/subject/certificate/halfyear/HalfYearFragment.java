package p289hu.ekreta.ellenorzo.subject.certificate.halfyear;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentHalfYearBinding;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00110\u00100\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001d"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearFragment$createAdapter$1", "()Lhu/ekreta/ellenorzo/subject/certificate/halfyear/HalfYearFragment$createAdapter$1;", "createViewHolderFactory", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.halfyear.HalfYearFragment */
/* compiled from: HalfYearFragment.kt */
public final class HalfYearFragment extends C4459c {

    /* renamed from: a0 */
    public HalfYearViewModel f14965a0;

    /* renamed from: b0 */
    public HashMap f14966b0;

    /* renamed from: B0 */
    public void mo15843B0() {
        HashMap hashMap = this.f14966b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final HalfYearViewModel mo15844C0() {
        HalfYearViewModel halfYearViewModel = this.f14965a0;
        if (halfYearViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return halfYearViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentHalfYearBinding a = FragmentHalfYearBinding.m11718a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        HalfYearViewModel halfYearViewModel = this.f14965a0;
        if (halfYearViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12391a(halfYearViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        HalfYearViewModel halfYearViewModel = this.f14965a0;
        if (halfYearViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, halfYearViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo15845e(int i) {
        if (this.f14966b0 == null) {
            this.f14966b0 = new HashMap();
        }
        View view = (View) this.f14966b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14966b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo15843B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo15845e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        HalfYearViewModel halfYearViewModel = this.f14965a0;
        if (halfYearViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, halfYearViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) new HalfYearFragment$createAdapter$1<ItemViewModel,ViewHolder>(this, new HalfYearFragment$createViewHolderFactory$1(this)));
    }
}
