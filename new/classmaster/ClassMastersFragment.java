package hu.ekreta.ellenorzo.classmaster;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.classmaster.ClassMaster;
import hu.ekreta.ellenorzo.databinding.FragmentClassMastersBinding;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;)V", "getBackNavigationTarget", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ClassMasterViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMastersFragment.kt */
public final class ClassMastersFragment extends c implements MainBackNavigationTarget {
    public ClassMastersViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment$ClassMasterViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "setModel", "(Lhu/ekreta/ellenorzo/classmaster/ClassMaster;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMastersFragment.kt */
    public final class ClassMasterViewHolder extends MVVMViewHolder<ClassMaster> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ClassMasterViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/classmaster/ClassMaster;"))};
        public final ReadWriteProperty w = new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final View x;
        public final /* synthetic */ ClassMastersFragment y;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5285a = new int[ClassMaster.ClassMasterType.values().length];

            static {
                f5285a[ClassMaster.ClassMasterType.ASSISTANT.ordinal()] = 1;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClassMasterViewHolder(ClassMastersFragment classMastersFragment, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.y = classMastersFragment;
            this.x = view;
            this.x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ClassMaster classMaster) {
            this.w.setValue(this, z[0], classMaster);
        }

        public ClassMaster getModel() {
            return (ClassMaster) this.w.getValue(this, z[0]);
        }

        public void onClick(View view) {
            ClassMaster model = getModel();
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

    public final ClassMastersViewModel C0() {
        ClassMastersViewModel classMastersViewModel = this.a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return classMastersViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentClassMastersBinding a2 = FragmentClassMastersBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        ClassMastersViewModel classMastersViewModel = this.a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(classMastersViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        ClassMastersViewModel classMastersViewModel = this.a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, classMastersViewModel.getUiCommand());
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
        ClassMastersViewModel classMastersViewModel = this.a0;
        if (classMastersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, classMastersViewModel.getItems(), new ClassMastersFragment$onViewCreated$1(this));
    }
}
