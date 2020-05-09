package p289hu.ekreta.ellenorzo.home;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.home.HomeFragment.DashboardItemViewHolder;
import p289hu.ekreta.ellenorzo.home.ListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.util.SwipeListener;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo17463d2 = {"hu/ekreta/ellenorzo/home/HomeFragment$onViewCreated$adapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/home/ListItem;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeFragment$onViewCreated$adapter$1 */
/* compiled from: HomeFragment.kt */
public final class HomeFragment$onViewCreated$adapter$1 extends MVVMRecyclerViewAdapter<ListItem, MVVMViewHolder<? super ListItem>> {

    /* renamed from: g */
    public final /* synthetic */ HomeFragment f13340g;

    public HomeFragment$onViewCreated$adapter$1(HomeFragment homeFragment, Function2 function2) {
        this.f13340g = homeFragment;
        super(function2);
    }

    /* renamed from: a */
    public void onBindViewHolder(MVVMViewHolder<? super ListItem> mVVMViewHolder, int i) {
        String str = "holder";
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, str);
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, str);
        mVVMViewHolder.setModel(this.f15381c.get(i));
        if (mVVMViewHolder instanceof DashboardItemViewHolder) {
            View view = mVVMViewHolder.f7113c;
            String str2 = "holder.itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str2);
            SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(C4014R.C4016id.dashboard_SwipeLayout);
            View view2 = mVVMViewHolder.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str2);
            SwipeLayout swipeLayout2 = (SwipeLayout) view2.findViewById(C4014R.C4016id.dashboard_SwipeLayout);
            Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "holder.itemView.dashboard_SwipeLayout");
            SwipeListener swipeListener = new SwipeListener(swipeLayout2, mo16300d(i), this.f13340g.mo12818C0().mo12833b0(), new HomeFragment$onViewCreated$adapter$1$onBindViewHolder$1(this.f13340g.mo12818C0()), null, 16, null);
            swipeLayout.setOnSwipeListener(swipeListener);
        }
    }

    /* renamed from: b */
    public int mo56b(int i) {
        return (mo16300d(i) instanceof SectionHeader) ^ true ? 1 : 0;
    }
}
