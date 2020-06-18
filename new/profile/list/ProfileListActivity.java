package hu.ekreta.ellenorzo.profile.list;

import a.p.a.f.f.c;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.tenclouds.swipeablerecyclerviewcell.swipereveal.SwipeRevealLayout;
import h.l.g;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.ActivityProfileBinding;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "menuItemClicked", "", "viewModel", "Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "ProfileViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileListActivity.kt */
public final class ProfileListActivity extends a {
    public ProfileListViewModel x;
    public boolean y;
    public HashMap z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R/\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity$ProfileViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/profile/Profile;", "Landroid/view/View$OnClickListener;", "Lcom/tenclouds/swipeablerecyclerviewcell/swipereveal/interfaces/OnIconClickListener;", "view", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/profile/list/ProfileListActivity;Landroid/view/View;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setModel", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Landroid/view/View;", "onClick", "", "v", "onLeftIconClick", "onRightIconClick", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ProfileListActivity.kt */
    public final class ProfileViewHolder extends MVVMViewHolder<Profile> implements View.OnClickListener, c {
        public static final /* synthetic */ KProperty[] z = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ProfileViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/profile/Profile;"))};
        public final ReadWriteProperty w;
        public final View x;
        public final /* synthetic */ ProfileListActivity y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProfileViewHolder(ProfileListActivity profileListActivity, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.y = profileListActivity;
            this.x = view;
            ((ConstraintLayout) this.x.findViewById(R.id.profile_item_cell)).setOnClickListener(this);
            View view2 = this.x;
            if (view2 != null) {
                SwipeRevealLayout.a((SwipeRevealLayout) view2, this, 0, 2);
                Delegates delegates = Delegates.INSTANCE;
                this.w = new ProfileListActivity$ProfileViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tenclouds.swipeablerecyclerviewcell.swipereveal.SwipeRevealLayout");
        }

        public void a() {
            ProfileListViewModel q2 = this.y.q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q2.a(model);
        }

        /* renamed from: a */
        public void setModel(Profile profile) {
            this.w.setValue(this, z[0], profile);
        }

        public void b() {
            ProfileListViewModel q2 = this.y.q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q2.d(model);
        }

        public Profile getModel() {
            return (Profile) this.w.getValue(this, z[0]);
        }

        public void onClick(View view) {
            ProfileListViewModel q2 = this.y.q();
            Profile model = getModel();
            if (model == null) {
                Intrinsics.throwNpe();
            }
            q2.b(model);
        }
    }

    public View c(int i2) {
        if (this.z == null) {
            this.z = new HashMap();
        }
        View view = (View) this.z.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.z.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_profile);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…ctivity_profile\n        )");
        ActivityProfileBinding activityProfileBinding = (ActivityProfileBinding) a2;
        ProfileListViewModel profileListViewModel = this.x;
        if (profileListViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityProfileBinding.a(profileListViewModel);
        a((Toolbar) c(R.id.profile_toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.profiles_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "profiles_recyclerview");
        ProfileListViewModel profileListViewModel2 = this.x;
        if (profileListViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, profileListViewModel2.getProfiles(), new ProfileListActivity$onCreate$2(this));
        ProfileListViewModel profileListViewModel3 = this.x;
        if (profileListViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, profileListViewModel3.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_add_profile) {
            onBackPressed();
        } else if (!this.y) {
            this.y = true;
            ProfileListViewModel profileListViewModel = this.x;
            if (profileListViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            profileListViewModel.W0();
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        this.y = false;
    }

    public final ProfileListViewModel q() {
        ProfileListViewModel profileListViewModel = this.x;
        if (profileListViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return profileListViewModel;
    }
}
