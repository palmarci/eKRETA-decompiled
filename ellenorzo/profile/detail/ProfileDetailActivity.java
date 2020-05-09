package p289hu.ekreta.ellenorzo.profile.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
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
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBinding;
import p289hu.ekreta.ellenorzo.profile.Guardian;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity */
/* compiled from: ProfileDetailActivity.kt */
public final class ProfileDetailActivity extends C4457a {

    /* renamed from: x */
    public ProfileDetailViewModel f14563x;

    /* renamed from: y */
    public HashMap f14564y;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailActivity$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/profile/Guardian;", "setModel", "(Lhu/ekreta/ellenorzo/profile/Guardian;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "viewEmail", "Landroid/widget/TextView;", "viewName", "viewPhoneNumber", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailActivity$ViewHolder */
    /* compiled from: ProfileDetailActivity.kt */
    public static final class ViewHolder extends MVVMViewHolder<Guardian> {

        /* renamed from: B */
        public static final /* synthetic */ KProperty[] f14565B = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/profile/Guardian;"))};

        /* renamed from: A */
        public final View f14566A;

        /* renamed from: w */
        public final TextView f14567w;

        /* renamed from: x */
        public final TextView f14568x;

        /* renamed from: y */
        public final TextView f14569y;

        /* renamed from: z */
        public final ReadWriteProperty f14570z = new ProfileDetailActivity$ViewHolder$$special$$inlined$observable$1(null, null, this);

        public ViewHolder(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super(view);
            this.f14566A = view;
            View findViewById = this.f14566A.findViewById(C4014R.C4016id.data_tutor_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.data_tutor_name)");
            this.f14567w = (TextView) findViewById;
            View findViewById2 = this.f14566A.findViewById(C4014R.C4016id.data_tutor_email);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.data_tutor_email)");
            this.f14568x = (TextView) findViewById2;
            View findViewById3 = this.f14566A.findViewById(C4014R.C4016id.data_tutor_phone_number);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.data_tutor_phone_number)");
            this.f14569y = (TextView) findViewById3;
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(Guardian guardian) {
            this.f14570z.setValue(this, f14565B[0], guardian);
        }

        public Guardian getModel() {
            return (Guardian) this.f14570z.getValue(this, f14565B[0]);
        }
    }

    /* renamed from: c */
    public View mo14216c(int i) {
        if (this.f14564y == null) {
            this.f14564y = new HashMap();
        }
        View view = (View) this.f14564y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14564y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_profile_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…_profile_detail\n        )");
        ActivityProfileDetailBinding activityProfileDetailBinding = (ActivityProfileDetailBinding) a;
        ProfileDetailViewModel profileDetailViewModel = this.f14563x;
        String str = "viewModel";
        if (profileDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityProfileDetailBinding.mo12374a(profileDetailViewModel);
        ProfileDetailViewModel profileDetailViewModel2 = this.f14563x;
        if (profileDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        profileDetailViewModel2.mo14226c(ExtensionsKt.m14678o(intent));
        mo8719a((Toolbar) mo14216c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
        RecyclerView recyclerView = (RecyclerView) mo14216c(C4014R.C4016id.recyclerview_tutor_details);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerview_tutor_details");
        ProfileDetailViewModel profileDetailViewModel3 = this.f14563x;
        if (profileDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14654a(recyclerView, (C3818m) this, profileDetailViewModel3.getGuardianList(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) ProfileDetailActivity$onCreate$2.INSTANCE);
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
