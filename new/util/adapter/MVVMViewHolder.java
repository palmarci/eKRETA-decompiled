package hu.ekreta.ellenorzo.util.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "TItemViewModel", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "model", "getModel", "()Ljava/lang/Object;", "setModel", "(Ljava/lang/Object;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MVVMRecyclerViewAdapter.kt */
public abstract class MVVMViewHolder<TItemViewModel> extends RecyclerView.d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MVVMViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public abstract void setModel(TItemViewModel titemviewmodel);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MVVMViewHolder(int r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r3, r4, r1)
            java.lang.String r4 = "LayoutInflater\n         …te(layout, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder.<init>(int, android.view.ViewGroup):void");
    }
}
