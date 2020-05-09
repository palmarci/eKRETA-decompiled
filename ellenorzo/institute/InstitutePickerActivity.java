package p289hu.ekreta.ellenorzo.institute;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
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
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "InstituteViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerActivity */
/* compiled from: InstitutePickerActivity.kt */
public final class InstitutePickerActivity extends C4457a {

    /* renamed from: x */
    public InstitutePickerViewModel f13580x;

    /* renamed from: y */
    public HashMap f13581y;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity$InstituteViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/institute/Institute;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/institute/InstitutePickerActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/institute/Institute;", "setModel", "(Lhu/ekreta/ellenorzo/institute/Institute;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerActivity$InstituteViewHolder */
    /* compiled from: InstitutePickerActivity.kt */
    public final class InstituteViewHolder extends MVVMViewHolder<Institute> implements OnClickListener {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f13582z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstituteViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/institute/Institute;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13583w = new C4210x351bf9ae(null, null, this);

        /* renamed from: x */
        public final View f13584x;

        /* renamed from: y */
        public final /* synthetic */ InstitutePickerActivity f13585y;

        public InstituteViewHolder(InstitutePickerActivity institutePickerActivity, View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f13585y = institutePickerActivity;
            super(view);
            this.f13584x = view;
            this.f13584x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(Institute institute) {
            this.f13583w.setValue(this, f13582z[0], institute);
        }

        public Institute getModel() {
            return (Institute) this.f13583w.getValue(this, f13582z[0]);
        }

        public void onClick(View view) {
            InstitutePickerViewModel q = this.f13585y.mo13074q();
            Institute model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q.mo13083a(model);
            this.f13585y.mo13074q().mo13086s();
        }
    }

    /* renamed from: c */
    public View mo13073c(int i) {
        if (this.f13581y == null) {
            this.f13581y = new HashMap();
        }
        View view = (View) this.f13581y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13581y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_insitute_picker);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…insitute_picker\n        )");
        ActivityInsitutePickerBinding activityInsitutePickerBinding = (ActivityInsitutePickerBinding) a;
        InstitutePickerViewModel institutePickerViewModel = this.f13580x;
        String str = "viewModel";
        if (institutePickerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityInsitutePickerBinding.mo12353a(institutePickerViewModel);
        RecyclerView recyclerView = (RecyclerView) mo13073c(C4014R.C4016id.institutes_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "institutes_recyclerview");
        InstitutePickerViewModel institutePickerViewModel2 = this.f13580x;
        if (institutePickerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14654a(recyclerView, (C3818m) this, institutePickerViewModel2.getInstitutes(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new InstitutePickerActivity$onCreate$1<Object,Object,Object>(this));
        InstitutePickerViewModel institutePickerViewModel3 = this.f13580x;
        if (institutePickerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, institutePickerViewModel3.getUiCommand());
    }

    /* renamed from: q */
    public final InstitutePickerViewModel mo13074q() {
        InstitutePickerViewModel institutePickerViewModel = this.f13580x;
        if (institutePickerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return institutePickerViewModel;
    }
}
