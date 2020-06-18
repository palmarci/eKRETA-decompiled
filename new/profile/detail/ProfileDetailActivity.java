package hu.ekreta.ellenorzo.profile.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBinding;
import hu.ekreta.ellenorzo.profile.Guardian;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "ViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileDetailActivity.kt */
public final class ProfileDetailActivity extends a {
    public ProfileDetailViewModel x;
    public HashMap y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/profile/Guardian;", "setModel", "(Lhu/ekreta/ellenorzo/profile/Guardian;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "viewEmail", "Landroid/widget/TextView;", "viewName", "viewPhoneNumber", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ProfileDetailActivity.kt */
    public static final class ViewHolder extends MVVMViewHolder<Guardian> {
        public static final /* synthetic */ KProperty[] B = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/profile/Guardian;"))};
        public final View A;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final ReadWriteProperty z = new ProfileDetailActivity$ViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.A = view;
            View findViewById = this.A.findViewById(R.id.data_tutor_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.data_tutor_name)");
            this.w = (TextView) findViewById;
            View findViewById2 = this.A.findViewById(R.id.data_tutor_email);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.data_tutor_email)");
            this.x = (TextView) findViewById2;
            View findViewById3 = this.A.findViewById(R.id.data_tutor_phone_number);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.data_tutor_phone_number)");
            this.y = (TextView) findViewById3;
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(Guardian guardian) {
            this.z.setValue(this, B[0], guardian);
        }

        public Guardian getModel() {
            return (Guardian) this.z.getValue(this, B[0]);
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
        ViewDataBinding a2 = g.a(this, R.layout.activity_profile_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…_profile_detail\n        )");
        ActivityProfileDetailBinding activityProfileDetailBinding = (ActivityProfileDetailBinding) a2;
        ProfileDetailViewModel profileDetailViewModel = this.x;
        if (profileDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityProfileDetailBinding.a(profileDetailViewModel);
        ProfileDetailViewModel profileDetailViewModel2 = this.x;
        if (profileDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        profileDetailViewModel2.c(ExtensionsKt.p(intent));
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.recyclerview_tutor_details);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerview_tutor_details");
        ProfileDetailViewModel profileDetailViewModel3 = this.x;
        if (profileDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, profileDetailViewModel3.getGuardianList(), ProfileDetailActivity$onCreate$2.INSTANCE);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
