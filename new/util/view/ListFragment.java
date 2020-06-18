package hu.ekreta.ellenorzo.util.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/util/view/ListFragment;", "T", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ListFragment.kt */
public abstract class ListFragment<T> extends c {
    public DataBindingListViewModel<T> a0;
    public HashMap b0;

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        DataBindingListViewModel<T> dataBindingListViewModel = this.a0;
        if (dataBindingListViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, dataBindingListViewModel.getUiCommand());
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }
}
