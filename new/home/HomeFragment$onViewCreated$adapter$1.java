package hu.ekreta.ellenorzo.home;

import android.view.View;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.home.HomeFragment;
import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.util.SwipeListener;
import hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"hu/ekreta/ellenorzo/home/HomeFragment$onViewCreated$adapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/home/ListItem;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$onViewCreated$adapter$1 extends MVVMRecyclerViewAdapter<ListItem, MVVMViewHolder<? super ListItem>> {
    public final /* synthetic */ HomeFragment e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$adapter$1(HomeFragment homeFragment, Function2 function2) {
        super(function2);
        this.e = homeFragment;
    }

    /* renamed from: a */
    public void onBindViewHolder(MVVMViewHolder<? super ListItem> mVVMViewHolder, int i2) {
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, "holder");
        mVVMViewHolder.setModel(this.c.get(i2));
        if (mVVMViewHolder instanceof HomeFragment.DashboardItemViewHolder) {
            View view = mVVMViewHolder.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            View view2 = mVVMViewHolder.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            SwipeLayout swipeLayout = (SwipeLayout) view2.findViewById(R.id.dashboard_SwipeLayout);
            Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "holder.itemView.dashboard_SwipeLayout");
            ((SwipeLayout) view.findViewById(R.id.dashboard_SwipeLayout)).setOnSwipeListener(new SwipeListener(swipeLayout, d(i2), this.e.C0().b0(), new HomeFragment$onViewCreated$adapter$1$onBindViewHolder$1(this.e.C0()), (Function1) null, 16, (DefaultConstructorMarker) null));
        }
    }

    public int b(int i2) {
        return (d(i2) instanceof ListItem.SectionHeader) ^ true ? 1 : 0;
    }
}
