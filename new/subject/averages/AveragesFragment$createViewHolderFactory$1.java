package hu.ekreta.ellenorzo.subject.averages;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragment;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AveragesFragment.kt */
public final class AveragesFragment$createViewHolderFactory$1 extends Lambda implements Function2<ViewGroup, Integer, MVVMViewHolder<? super AveragesListItem>> {
    public final /* synthetic */ AveragesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AveragesFragment$createViewHolderFactory$1(AveragesFragment averagesFragment) {
        super(2);
        this.c = averagesFragment;
    }

    public final MVVMViewHolder<? super AveragesListItem> a(ViewGroup viewGroup, int i2) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i2 != 0) {
            return new AveragesFragment.AverageItemViewHolder(this.c, viewGroup);
        }
        return new AveragesFragment.SectionHeaderViewHolder(this.c, viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
