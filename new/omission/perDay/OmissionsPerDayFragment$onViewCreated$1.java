package hu.ekreta.ellenorzo.omission.perDay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.omission.perDay.OmissionsPerDayFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayFragment$OmissionsViewHolder;", "Lhu/ekreta/ellenorzo/omission/perDay/OmissionsPerDayFragment;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionsPerDayFragment.kt */
public final class OmissionsPerDayFragment$onViewCreated$1 extends Lambda implements Function2<ViewGroup, Integer, OmissionsPerDayFragment.OmissionsViewHolder> {
    public final /* synthetic */ OmissionsPerDayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmissionsPerDayFragment$onViewCreated$1(OmissionsPerDayFragment omissionsPerDayFragment) {
        super(2);
        this.c = omissionsPerDayFragment;
    }

    public final OmissionsPerDayFragment.OmissionsViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        OmissionsPerDayFragment omissionsPerDayFragment = this.c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_omission_per_day, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…n_per_day, parent, false)");
        return new OmissionsPerDayFragment.OmissionsViewHolder(omissionsPerDayFragment, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
