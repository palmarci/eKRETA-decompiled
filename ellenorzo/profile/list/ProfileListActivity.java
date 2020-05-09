package p289hu.ekreta.ellenorzo.profile.list;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.tenclouds.swipeablerecyclerviewcell.swipereveal.SwipeRevealLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p185p.p186a.p188f.p189f.C2759c;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityProfileBinding;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "ProfileViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivity */
/* compiled from: ProfileListActivity.kt */
public final class ProfileListActivity extends C4457a {

    /* renamed from: x */
    public ProfileListViewModel f14600x;

    /* renamed from: y */
    public HashMap f14601y;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R/\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity$ProfileViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/profile/Profile;", "Landroid/view/View$OnClickListener;", "Lcom/tenclouds/swipeablerecyclerviewcell/swipereveal/interfaces/OnIconClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setModel", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "onLeftIconClick", "onRightIconClick", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListActivity$ProfileViewHolder */
    /* compiled from: ProfileListActivity.kt */
    public final class ProfileViewHolder extends MVVMViewHolder<Profile> implements OnClickListener, C2759c {

        /* renamed from: z */
        public static final /* synthetic */ KProperty[] f14602z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ProfileViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/profile/Profile;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14603w;

        /* renamed from: x */
        public final View f14604x;

        /* renamed from: y */
        public final /* synthetic */ ProfileListActivity f14605y;

        public ProfileViewHolder(ProfileListActivity profileListActivity, View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f14605y = profileListActivity;
            super(view);
            this.f14604x = view;
            ((ConstraintLayout) this.f14604x.findViewById(C4014R.C4016id.profile_item_cell)).setOnClickListener(this);
            View view2 = this.f14604x;
            if (view2 != null) {
                SwipeRevealLayout.m7711a((SwipeRevealLayout) view2, this, 0, 2);
                Delegates delegates = Delegates.INSTANCE;
                this.f14603w = new C4319x83c796b6(null, null, this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tenclouds.swipeablerecyclerviewcell.swipereveal.SwipeRevealLayout");
        }

        /* renamed from: a */
        public void mo5199a() {
            ProfileListViewModel q = this.f14605y.mo14248q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q.mo14259a(model);
        }

        /* renamed from: a */
        public void setModel(Profile profile) {
            this.f14603w.setValue(this, f14602z[0], profile);
        }

        /* renamed from: b */
        public void mo5200b() {
            ProfileListViewModel q = this.f14605y.mo14248q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q.mo14261d(model);
        }

        public Profile getModel() {
            return (Profile) this.f14603w.getValue(this, f14602z[0]);
        }

        public void onClick(View view) {
            ProfileListViewModel q = this.f14605y.mo14248q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q.mo14260b(model);
        }
    }

    /* renamed from: c */
    public View mo14245c(int i) {
        if (this.f14601y == null) {
            this.f14601y = new HashMap();
        }
        View view = (View) this.f14601y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14601y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_profile);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…ctivity_profile\n        )");
        ActivityProfileBinding activityProfileBinding = (ActivityProfileBinding) a;
        ProfileListViewModel profileListViewModel = this.f14600x;
        String str = "viewModel";
        if (profileListViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityProfileBinding.mo12372a(profileListViewModel);
        mo8719a((Toolbar) mo14245c(C4014R.C4016id.profile_toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
        RecyclerView recyclerView = (RecyclerView) mo14245c(C4014R.C4016id.profiles_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "profiles_recyclerview");
        ProfileListViewModel profileListViewModel2 = this.f14600x;
        if (profileListViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14654a(recyclerView, (C3818m) this, profileListViewModel2.getProfiles(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new ProfileListActivity$onCreate$2<Object,Object,Object>(this));
        ProfileListViewModel profileListViewModel3 = this.f14600x;
        if (profileListViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, profileListViewModel3.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(C4014R.C4017menu.profile_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != C4014R.C4016id.action_add_profile) {
            onBackPressed();
        } else {
            ProfileListViewModel profileListViewModel = this.f14600x;
            if (profileListViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            profileListViewModel.mo14257T0();
        }
        return true;
    }

    /* renamed from: q */
    public final ProfileListViewModel mo14248q() {
        ProfileListViewModel profileListViewModel = this.f14600x;
        if (profileListViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return profileListViewModel;
    }
}
