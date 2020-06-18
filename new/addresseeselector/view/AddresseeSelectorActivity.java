package hu.ekreta.ellenorzo.addresseeselector.view;

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
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel;
import hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/view/AddresseeSelectorActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/addresseeselector/view/AddresseeSelectorActivity$createAdapter$1", "()Lhu/ekreta/ellenorzo/addresseeselector/view/AddresseeSelectorActivity$createAdapter$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorActivity.kt */
public final class AddresseeSelectorActivity extends a {
    public AddresseeSelectorViewModel x;
    public HashMap y;

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
        ViewDataBinding a2 = g.a(this, R.layout.activity_addressee_selector);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…ivity_addressee_selector)");
        ActivityAddresseeSelectorBinding activityAddresseeSelectorBinding = (ActivityAddresseeSelectorBinding) a2;
        AddresseeSelectorViewModel addresseeSelectorViewModel = this.x;
        if (addresseeSelectorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityAddresseeSelectorBinding.a(addresseeSelectorViewModel);
        RecyclerView recyclerView = (RecyclerView) c(R.id.addresseeSelector_recycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "addresseeSelector_recycleView");
        AddresseeSelectorViewModel addresseeSelectorViewModel2 = this.x;
        if (addresseeSelectorViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, addresseeSelectorViewModel2.L1(), new AddresseeSelectorActivity$createAdapter$1(AddresseeSelectorActivity$createAdapter$2.INSTANCE));
        a((Toolbar) c(R.id.addresseeSelector_toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        AddresseeSelectorViewModel addresseeSelectorViewModel3 = this.x;
        if (addresseeSelectorViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, addresseeSelectorViewModel3.getUiCommand());
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
