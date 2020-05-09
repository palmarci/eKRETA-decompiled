package p289hu.ekreta.ellenorzo.util.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C2897d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "model", "getModel", "()Ljava/lang/Object;", "setModel", "(Ljava/lang/Object;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder */
/* compiled from: MVVMRecyclerViewAdapter.kt */
public abstract class MVVMViewHolder<T> extends C2897d0 {
    public MVVMViewHolder(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        super(view);
    }

    public abstract void setModel(T t);

    public MVVMViewHolder(int i, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater\n         …te(layout, parent, false)");
        this(inflate);
    }
}
