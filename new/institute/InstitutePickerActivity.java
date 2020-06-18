package hu.ekreta.ellenorzo.institute;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBinding;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "InstituteViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstitutePickerActivity.kt */
public final class InstitutePickerActivity extends a {
    public InstitutePickerViewModel x;
    public HashMap y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity$InstituteViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "setModel", "(Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: InstitutePickerActivity.kt */
    public final class InstituteViewHolder extends MVVMViewHolder<InstituteDto> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstituteViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;"))};
        public final ReadWriteProperty w = new InstitutePickerActivity$InstituteViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final View x;
        public final /* synthetic */ InstitutePickerActivity y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InstituteViewHolder(InstitutePickerActivity institutePickerActivity, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.y = institutePickerActivity;
            this.x = view;
            this.x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(InstituteDto instituteDto) {
            this.w.setValue(this, z[0], instituteDto);
        }

        public InstituteDto getModel() {
            return (InstituteDto) this.w.getValue(this, z[0]);
        }

        public void onClick(View view) {
            InstitutePickerViewModel q2 = this.y.q();
            InstituteDto model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q2.a(model);
            this.y.q().s();
        }
    }

    public View c(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_insitute_picker);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…insitute_picker\n        )");
        ActivityInsitutePickerBinding activityInsitutePickerBinding = (ActivityInsitutePickerBinding) a2;
        InstitutePickerViewModel institutePickerViewModel = this.x;
        if (institutePickerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityInsitutePickerBinding.a(institutePickerViewModel);
        RecyclerView recyclerView = (RecyclerView) c(R.id.institutes_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "institutes_recyclerview");
        InstitutePickerViewModel institutePickerViewModel2 = this.x;
        if (institutePickerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, institutePickerViewModel2.getInstitutes(), new InstitutePickerActivity$onCreate$1(this));
        InstitutePickerViewModel institutePickerViewModel3 = this.x;
        if (institutePickerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, institutePickerViewModel3.getUiCommand());
    }

    public final InstitutePickerViewModel q() {
        InstitutePickerViewModel institutePickerViewModel = this.x;
        if (institutePickerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return institutePickerViewModel;
    }
}
