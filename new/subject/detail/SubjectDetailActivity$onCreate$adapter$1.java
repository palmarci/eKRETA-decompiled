package hu.ekreta.ellenorzo.subject.detail;

import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"hu/ekreta/ellenorzo/subject/detail/SubjectDetailActivity$onCreate$adapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "getItemViewType", "", "position", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDetailActivity.kt */
public final class SubjectDetailActivity$onCreate$adapter$1 extends MVVMRecyclerViewAdapter<SubjectDetailViewModel.ListItem, MVVMViewHolder<? super SubjectDetailViewModel.ListItem>> {
    public SubjectDetailActivity$onCreate$adapter$1(SubjectDetailActivity subjectDetailActivity, Function2 function2) {
        super(function2);
    }

    public int b(int i2) {
        SubjectDetailViewModel.ListItem listItem = (SubjectDetailViewModel.ListItem) d(i2);
        if (listItem instanceof SubjectDetailViewModel.ListItem.TableHeader) {
            return 0;
        }
        return listItem instanceof SubjectDetailViewModel.ListItem.SectionHeader ? 1 : 2;
    }
}
