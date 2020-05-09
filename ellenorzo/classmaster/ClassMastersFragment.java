package p289hu.ekreta.ellenorzo.classmaster;

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
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType;
import p289hu.ekreta.ellenorzo.databinding.FragmentClassMastersBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ClassMasterViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment */
/* compiled from: ClassMastersFragment.kt */
public final class ClassMastersFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public ClassMastersViewModel f11846a0;

    /* renamed from: b0 */
    public HashMap f11847b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment$ClassMasterViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "setModel", "(Lhu/ekreta/ellenorzo/classmaster/ClassMaster;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment$ClassMasterViewHolder */
    /* compiled from: ClassMastersFragment.kt */
    public final class ClassMasterViewHolder extends MVVMViewHolder<ClassMaster> implements OnClickListener {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f11848z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ClassMasterViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/classmaster/ClassMaster;"))};

        /* renamed from: w */
        public final ReadWriteProperty f11849w = new C4101x39cf6f12(null, null, this);

        /* renamed from: x */
        public final View f11850x;

        /* renamed from: y */
        public final /* synthetic */ ClassMastersFragment f11851y;

        @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment$ClassMasterViewHolder$WhenMappings */
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11852a = new int[ClassMasterType.values().length];

            static {
                f11852a[ClassMasterType.ASSISTANT.ordinal()] = 1;
            }
        }

        public ClassMasterViewHolder(ClassMastersFragment classMastersFragment, View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f11851y = classMastersFragment;
            super(view);
            this.f11850x = view;
            this.f11850x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ClassMaster classMaster) {
            this.f11849w.setValue(this, f11848z[0], classMaster);
        }

        public ClassMaster getModel() {
            return (ClassMaster) this.f11849w.getValue(this, f11848z[0]);
        }

        public void onClick(View view) {
            ClassMaster model = getModel();
            if (model != null) {
                this.f11851y.mo12283C0().onSelect(model);
            }
        }
    }

    /* renamed from: B0 */
    public void mo12282B0() {
        HashMap hashMap = this.f11847b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final ClassMastersViewModel mo12283C0() {
        ClassMastersViewModel classMastersViewModel = this.f11846a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return classMastersViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentClassMastersBinding a = FragmentClassMastersBinding.m11698a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        ClassMastersViewModel classMastersViewModel = this.f11846a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12387a(classMastersViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        ClassMastersViewModel classMastersViewModel = this.f11846a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, classMastersViewModel.getUiCommand());
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo12284e(int i) {
        if (this.f11847b0 == null) {
            this.f11847b0 = new HashMap();
        }
        View view = (View) this.f11847b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f11847b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo12282B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo12284e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        ClassMastersViewModel classMastersViewModel = this.f11846a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14654a(recyclerView, (C3818m) this, classMastersViewModel.getItems(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new ClassMastersFragment$onViewCreated$1<Object,Object,Object>(this));
    }
}
