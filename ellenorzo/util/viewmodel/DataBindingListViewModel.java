package p289hu.ekreta.ellenorzo.util.viewmodel;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "T", "Landroidx/databinding/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/LiveData;", "", "getItems", "()Landroidx/lifecycle/LiveData;", "listViewVisible", "getListViewVisible", "progressVisible", "getProgressVisible", "onRefresh", "", "onSelect", "item", "(Ljava/lang/Object;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel */
/* compiled from: DataBindingListViewModel.kt */
public interface DataBindingListViewModel<T> extends C3705i, UiCommandSource {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel$DefaultImpls */
    /* compiled from: DataBindingListViewModel.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: d */
    boolean mo11494d();

    /* renamed from: e */
    void mo11495e();

    /* renamed from: f */
    boolean mo11496f();

    /* renamed from: g */
    boolean mo11497g();

    LiveData<List<T>> getItems();

    void onSelect(T t);
}
