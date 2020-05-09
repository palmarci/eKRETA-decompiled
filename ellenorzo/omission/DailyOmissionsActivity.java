package p289hu.ekreta.ellenorzo.omission;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/DailyOmissionsActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/omission/DailyOmissionsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/omission/DailyOmissionsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/omission/DailyOmissionsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsActivity */
/* compiled from: DailyOmissionsActivity.kt */
public final class DailyOmissionsActivity extends C4457a {

    /* renamed from: x */
    public DailyOmissionsViewModel f14296x;

    /* renamed from: y */
    public HashMap f14297y;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/DailyOmissionsActivity$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/omission/DailyOmissionsActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "setModel", "(Lhu/ekreta/ellenorzo/omission/OmissionViewModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsActivity$ViewHolder */
    /* compiled from: DailyOmissionsActivity.kt */
    public final class ViewHolder extends MVVMViewHolder<OmissionViewModel> implements OnClickListener {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f14298z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/omission/OmissionViewModel;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14299w = new DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final View f14300x;

        /* renamed from: y */
        public final /* synthetic */ DailyOmissionsActivity f14301y;

        public ViewHolder(DailyOmissionsActivity dailyOmissionsActivity, View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f14301y = dailyOmissionsActivity;
            super(view);
            this.f14300x = view;
            this.f14300x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(OmissionViewModel omissionViewModel) {
            this.f14299w.setValue(this, f14298z[0], omissionViewModel);
        }

        public OmissionViewModel getModel() {
            return (OmissionViewModel) this.f14299w.getValue(this, f14298z[0]);
        }

        public void onClick(View view) {
            OmissionViewModel model = getModel();
            if (model != null) {
                this.f14301y.mo13821q().onSelect(model);
            }
        }
    }

    /* renamed from: c */
    public View mo13819c(int i) {
        if (this.f14297y == null) {
            this.f14297y = new HashMap();
        }
        View view = (View) this.f14297y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14297y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_daily_omissions);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…daily_omissions\n        )");
        ActivityDailyOmissionsBinding activityDailyOmissionsBinding = (ActivityDailyOmissionsBinding) a;
        DailyOmissionsViewModel dailyOmissionsViewModel = this.f14296x;
        String str = "viewModel";
        if (dailyOmissionsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityDailyOmissionsBinding.mo12341a(dailyOmissionsViewModel);
        DailyOmissionsViewModel dailyOmissionsViewModel2 = this.f14296x;
        if (dailyOmissionsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        List l = ExtensionsKt.m14675l(intent);
        if (l == null) {
            Intrinsics.throwNpe();
        }
        dailyOmissionsViewModel2.mo13829a(l);
        mo8719a((Toolbar) mo13819c(C4014R.C4016id.toolbar));
        C3191a l2 = mo8735l();
        if (l2 != null) {
            l2.mo8688c(true);
            l2.mo8690d(true);
        }
        RecyclerView recyclerView = (RecyclerView) mo13819c(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        DailyOmissionsViewModel dailyOmissionsViewModel3 = this.f14296x;
        if (dailyOmissionsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14654a(recyclerView, (C3818m) this, dailyOmissionsViewModel3.getItems(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new DailyOmissionsActivity$onCreate$2<Object,Object,Object>(this));
        DailyOmissionsViewModel dailyOmissionsViewModel4 = this.f14296x;
        if (dailyOmissionsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, dailyOmissionsViewModel4.getUiCommand());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: q */
    public final DailyOmissionsViewModel mo13821q() {
        DailyOmissionsViewModel dailyOmissionsViewModel = this.f14296x;
        if (dailyOmissionsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return dailyOmissionsViewModel;
    }
}
