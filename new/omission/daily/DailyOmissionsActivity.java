package hu.ekreta.ellenorzo.omission.daily;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBinding;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DailyOmissionsActivity.kt */
public final class DailyOmissionsActivity extends a {
    public DailyOmissionsViewModel x;
    public HashMap y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsActivity$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "setModel", "(Lhu/ekreta/ellenorzo/omission/OmissionViewModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: DailyOmissionsActivity.kt */
    public final class ViewHolder extends MVVMViewHolder<OmissionViewModel> implements View.OnClickListener {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/omission/OmissionViewModel;"))};
        public final ReadWriteProperty w = new DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final View x;
        public final /* synthetic */ DailyOmissionsActivity y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(DailyOmissionsActivity dailyOmissionsActivity, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.y = dailyOmissionsActivity;
            this.x = view;
            this.x.setOnClickListener(this);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(OmissionViewModel omissionViewModel) {
            this.w.setValue(this, z[0], omissionViewModel);
        }

        public OmissionViewModel getModel() {
            return (OmissionViewModel) this.w.getValue(this, z[0]);
        }

        public void onClick(View view) {
            OmissionViewModel model = getModel();
            if (model != null) {
                this.y.q().onSelect(model);
            }
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
        ViewDataBinding a2 = g.a(this, R.layout.activity_daily_omissions);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…daily_omissions\n        )");
        ActivityDailyOmissionsBinding activityDailyOmissionsBinding = (ActivityDailyOmissionsBinding) a2;
        DailyOmissionsViewModel dailyOmissionsViewModel = this.x;
        if (dailyOmissionsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityDailyOmissionsBinding.a(dailyOmissionsViewModel);
        DailyOmissionsViewModel dailyOmissionsViewModel2 = this.x;
        if (dailyOmissionsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        List<Omission> m2 = ExtensionsKt.m(intent);
        if (m2 == null) {
            Intrinsics.throwNpe();
        }
        dailyOmissionsViewModel2.a(m2);
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        DailyOmissionsViewModel dailyOmissionsViewModel3 = this.x;
        if (dailyOmissionsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, dailyOmissionsViewModel3.getItems(), new DailyOmissionsActivity$onCreate$2(this));
        DailyOmissionsViewModel dailyOmissionsViewModel4 = this.x;
        if (dailyOmissionsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, dailyOmissionsViewModel4.getUiCommand());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final DailyOmissionsViewModel q() {
        DailyOmissionsViewModel dailyOmissionsViewModel = this.x;
        if (dailyOmissionsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return dailyOmissionsViewModel;
    }
}
