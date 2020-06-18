package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"hu/ekreta/ellenorzo/noticeboard/NoticeBoardFragment$onViewCreated$adapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel$ListItem;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "getItemViewType", "", "position", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardFragment.kt */
public final class NoticeBoardFragment$onViewCreated$adapter$1 extends MVVMRecyclerViewAdapter<NoticeBoardViewModel.ListItem, MVVMViewHolder<? super NoticeBoardViewModel.ListItem>> {
    public NoticeBoardFragment$onViewCreated$adapter$1(NoticeBoardFragment noticeBoardFragment, Function2 function2) {
        super(function2);
    }

    public int b(int i2) {
        return (d(i2) instanceof NoticeBoardViewModel.ListItem.SectionHeader) ^ true ? 1 : 0;
    }
}
