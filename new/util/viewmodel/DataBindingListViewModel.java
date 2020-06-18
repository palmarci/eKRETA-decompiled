package hu.ekreta.ellenorzo.util.viewmodel;

import androidx.lifecycle.LiveData;
import h.l.i;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "T", "Landroidx/databinding/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/LiveData;", "", "getItems", "()Landroidx/lifecycle/LiveData;", "listViewVisible", "getListViewVisible", "progressVisible", "getProgressVisible", "onRefresh", "", "onSelect", "item", "(Ljava/lang/Object;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DataBindingListViewModel.kt */
public interface DataBindingListViewModel<T> extends i, UiCommandSource {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: DataBindingListViewModel.kt */
    public static final class DefaultImpls {
    }

    boolean d();

    void e();

    boolean f();

    boolean g();

    LiveData<List<T>> getItems();

    void onSelect(T t);
}
